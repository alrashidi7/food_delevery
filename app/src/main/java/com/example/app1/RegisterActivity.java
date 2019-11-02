package com.example.app1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class RegisterActivity extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference reference = database.getReference("Users");
    //----------
    EditText name,phone,pass,conPass;
    Button register;
    //----------
    String Name,Phone,Pass,ConPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        conPass = findViewById(R.id.ConfirmUserPass_ET);
        name = findViewById(R.id.newUserName_ET);
        phone = findViewById(R.id.newUserPhone_ET);
        pass = findViewById(R.id.newUserPass_ET);
        register = findViewById(R.id.register_btn);
        //------------------------

        //-------------------------
        // setup register button
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkInputs();

               }
        });



    }
    // sign the new number in database
    //start setup signNumber() method
    public void signNumber(){

        Name = name.getText().toString();
        Pass = pass.getText().toString();
        Phone = phone.getText().toString();
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (!(dataSnapshot.child(Phone).exists())){


                    HashMap<String,Object>  hashMap = new HashMap<>();
                    hashMap.put("name",Name);
                    hashMap.put("phone",Phone);
                    hashMap.put("password",Pass);
                    reference.child(Phone).updateChildren(hashMap);
                    Toast.makeText(RegisterActivity.this, "Wellcome" + Name, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_id_right,R.anim.slide_out_left);

                }else {
                    Toast.makeText(RegisterActivity.this, "this number is exists" , Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
    //end setup signNumber() method
    // end sign the new number in database
    //start checkInputes() method
    public void checkInputs(){
        Name = name.getText().toString();
        Pass = pass.getText().toString();
        Phone = phone.getText().toString();
        ConPass = conPass.getText().toString();
        if (TextUtils.isEmpty(Name)){
            Toast.makeText(this, "please enter your name", Toast.LENGTH_SHORT).show();
        } else if (TextUtils.isEmpty(Phone)){
            Toast.makeText(this, "please inter your phone", Toast.LENGTH_SHORT).show();
        } else if (Phone.length() < 11){
            Toast.makeText(this, "please inter correct phone", Toast.LENGTH_SHORT).show();
        } else if (TextUtils.isEmpty(Pass)){
            Toast.makeText(this, "please inter your Pass", Toast.LENGTH_SHORT).show();
        } else if (TextUtils.isEmpty(ConPass)){
            Toast.makeText(this, "please inter your confirm Pass", Toast.LENGTH_SHORT).show();
        } else if (!(Pass.equals(ConPass))){
            Toast.makeText(this, "your confirm pass not equal pass", Toast.LENGTH_SHORT).show();
        } else { signNumber(); }
    }
    //end checkInouts() method

}
