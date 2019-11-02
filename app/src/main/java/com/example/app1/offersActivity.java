package com.example.app1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class offersActivity extends AppCompatActivity {

    public static final String CHANNEL_1 = "channel_1";
    NotificationManagerCompat managerCompat;

    RecyclerView recyclerView;
    Context mContext;



    private FirebaseRecyclerOptions<Offers> options;
    private FirebaseRecyclerAdapter<Offers, viewHolder> adapter;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference reference = database.getReference();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offers);


        managerCompat = NotificationManagerCompat.from(this);

        reference.child("offers").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                dataSnapshot.child("offer").getChildren();
                String order = dataSnapshot.child("order").getValue(String.class);
                Intent intent =new Intent(offersActivity.this,offersActivity.class);
                PendingIntent pendingIntent = PendingIntent.getActivity(offersActivity.this,
                        1,intent,PendingIntent.FLAG_UPDATE_CURRENT);
                Notification notification = new NotificationCompat.Builder(offersActivity.this, CHANNEL_1).setSmallIcon(R.drawable.main_background)
                        .setContentIntent(pendingIntent)
                        .setAutoCancel(true)
                        .setContentTitle("YOU HAVE NEW OFFER").setContentText(order).setPriority(NotificationCompat.PRIORITY_HIGH).setCategory(NotificationCompat.CATEGORY_MESSAGE)
                        .build();
                managerCompat.notify(0, notification);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });




        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        options = new FirebaseRecyclerOptions.Builder<Offers>().setQuery(reference.child("offers"), Offers.class).build();
        adapter = new FirebaseRecyclerAdapter<Offers, viewHolder>(options) {

            @Override
            protected void onBindViewHolder(@NonNull viewHolder viewHolder, int i, @NonNull Offers offers) {
                viewHolder.offer.setAnimation(AnimationUtils.loadAnimation(mContext,R.anim.offer));
                viewHolder.offer.setText(offers.getOffer());


            }

            @NonNull
            @Override
            public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                mContext = parent.getContext();
                View v = LayoutInflater.from(mContext).inflate(R.layout.offers, parent, false);

                return new viewHolder(v);
            }
        };
        recyclerView.setAdapter(adapter);
        createNotificationChannels();



    }
    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }

    public void createNotificationChannels(){

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            NotificationChannel channel = new NotificationChannel(CHANNEL_1, "channel 1", NotificationManager.IMPORTANCE_HIGH);
            channel.setDescription("this is channel 1");
            NotificationManager manager = getSystemService(NotificationManager.class);


            assert manager != null;
            manager.createNotificationChannel(channel);
        }

    }

}
