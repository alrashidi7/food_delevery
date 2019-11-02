package com.example.app1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class secandActivity extends AppCompatActivity {
    public static String EXTRA_PHONE = "com.example.app1.EXTRA_PHONE";
    public static String EXTRA_NAME = "com.example.app1.EXTRA_NAME";
    String name,phone,opened;
   ImageView mashi;
   RatingBar ratingBar;

   TextView rate,opening;
     FirebaseDatabase database = FirebaseDatabase.getInstance();
     DatabaseReference reference = database.getReference();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secand);

        Intent intent = getIntent();
        name = intent.getStringExtra(EXTRA_NAME);
        phone = intent.getStringExtra(EXTRA_PHONE);

        ratingBar = findViewById(R.id.rating);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(secandActivity.this, "thank you for rating" + rating, Toast.LENGTH_SHORT).show();
                reference.child("rating").child("mashi").child(name).setValue(rating);
            }
        });

        reference.child("rating").child("mashi").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
              long rated = dataSnapshot.getChildrenCount();
              rated = rated + 100;
              String raTed = Long.toString(rated);
              rate = findViewById(R.id.rating_tx);
              rate.setText("("+ raTed +")");

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        opening = findViewById(R.id.opening);


        reference.child("open").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                opened = dataSnapshot.getValue(String.class);
                opening.setText(opened);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        final String opn = "opened";

        mashi = findViewById(R.id.mashi);



        mashi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (opened.equals(opn)) {

                    Intent intent = new Intent(secandActivity.this, menuActivity.class);
                    intent.putExtra(EXTRA_NAME, name);
                    intent.putExtra(EXTRA_PHONE, phone);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_id_right,R.anim.slide_out_left);

                }
                else {
                    Toast.makeText(secandActivity.this, "sorry we are colsed", Toast.LENGTH_SHORT).show();
                }


}
        });
        }
    }

