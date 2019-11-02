package com.example.app1;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;

import android.content.Intent;
import android.os.Bundle;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class packageOrderActivity extends AppCompatActivity {
    Button oredered;
    EditText notes,adrees;
    TextView myOrder,mtTotalOrder,order_rest;
     String never,neverTotal ;
     String total;
     int total1,total2,total3, otal,total4,total5,total6,total7,total8,total9,total10,total11,total12,total13,total14,total15,total16,total17,total18;
    int total_B_1,total_B_2,total_B_3,total_B_4,total_B_5,total_B_6,total_B_7,total_B_8,total_B_9,total_B_10,total_B_11,total_B_12;
     int delivery ;




/*******************************************************string intent **************************************************************************************/

    public static String EXTRA_PHONE = "com.example.app1.EXTRA_PHONE";
    public static String EXTRA_NAME = "com.example.app1.EXTRA_NAME";
    public static String EXTRA_TOTAL = "com.example.app1.EXTRA_TOTAL";


    //setup items1
    String TOTAL1;
    public static String EXTRA_TOTAL_ITEM1 = "com.example.app1.EXTRA_TOTAL_ITEM1";
    public static String EXTRA_TYPE_ITEM1 = "com.example.app1.EXTRA_TYPE_ITEM1";
    public static String EXTRA_QUANTITY_ITEM1 = "com.example.app1.EXTRA_QUANTITY_ITEM1";
    LinearLayout item1;
    //setup items2
    String TOTAL2;
    public static String EXTRA_TOTAL_ITEM2 = "com.example.app1.EXTRA_TOTAL_ITEM2";
    public static String EXTRA_TYPE_ITEM2 = "com.example.app1.EXTRA_TYPE_ITEM2";
    public static String EXTRA_QUANTITY_ITEM2 = "com.example.app1.EXTRA_QUANTITY_ITEM2";
    LinearLayout item2;
    //setup items3
    String TOTAL3;
    public static String EXTRA_TOTAL_ITEM3 = "com.example.app1.EXTRA_TOTAL_ITEM3";
    public static String EXTRA_TYPE_ITEM3 = "com.example.app1.EXTRA_TYPE_ITEM3";
    public static String EXTRA_QUANTITY_ITEM3 = "com.example.app1.EXTRA_QUANTITY_ITEM3";
    LinearLayout item3;
    //setup items4
    String TOTAL4;
    public static String EXTRA_TOTAL_ITEM4 = "com.example.app1.EXTRA_TOTAL_ITEM4";
    public static String EXTRA_TYPE_ITEM4 = "com.example.app1.EXTRA_TYPE_ITEM4";
    public static String EXTRA_QUANTITY_ITEM4 = "com.example.app1.EXTRA_QUANTITY_ITEM4";
    LinearLayout item4;
    //setup items5
    String TOTAL5;
    public static String EXTRA_TOTAL_ITEM5 = "com.example.app1.EXTRA_TOTAL_ITEM5";
    public static String EXTRA_TYPE_ITEM5 = "com.example.app1.EXTRA_TYPE_ITEM5";
    public static String EXTRA_QUANTITY_ITEM5 = "com.example.app1.EXTRA_QUANTITY_ITEM5";
    LinearLayout item5;
    //setup items6
    String TOTAL6;
    public static String EXTRA_TOTAL_ITEM6 = "com.example.app1.EXTRA_TOTAL_ITEM6";
    public static String EXTRA_TYPE_ITEM6 = "com.example.app1.EXTRA_TYPE_ITEM6";
    public static String EXTRA_QUANTITY_ITEM6 = "com.example.app1.EXTRA_QUANTITY_ITEM6";
    LinearLayout item6;
    //setup items7
    String TOTAL7;
    public static String EXTRA_TOTAL_ITEM7 = "com.example.app1.EXTRA_TOTAL_ITEM7";
    public static String EXTRA_TYPE_ITEM7 = "com.example.app1.EXTRA_TYPE_ITEM7";
    public static String EXTRA_QUANTITY_ITEM7 = "com.example.app1.EXTRA_QUANTITY_ITEM7";
    LinearLayout item7;
    //setup items8
    String TOTAL8;
    public static String EXTRA_TOTAL_ITEM8 = "com.example.app1.EXTRA_TOTAL_ITEM8";
    public static String EXTRA_TYPE_ITEM8 = "com.example.app1.EXTRA_TYPE_ITEM8";
    public static String EXTRA_QUANTITY_ITEM8 = "com.example.app1.EXTRA_QUANTITY_ITEM8";
    LinearLayout item8;
    //setup items9
    String TOTAL9;
    public static String EXTRA_TOTAL_ITEM9 = "com.example.app1.EXTRA_TOTAL_ITEM9";
    public static String EXTRA_TYPE_ITEM9 = "com.example.app1.EXTRA_TYPE_ITEM9";
    public static String EXTRA_QUANTITY_ITEM9 = "com.example.app1.EXTRA_QUANTITY_ITEM9";
    LinearLayout item9;
    //setup items10
    String TOTAL10;
    public static String EXTRA_TOTAL_ITEM10 = "com.example.app1.EXTRA_TOTAL_ITEM10";
    public static String EXTRA_TYPE_ITEM10 = "com.example.app1.EXTRA_TYPE_ITEM10";
    public static String EXTRA_QUANTITY_ITEM10 = "com.example.app1.EXTRA_QUANTITY_ITEM10";
    LinearLayout item10;

    //setup items1
    String TOTAL11;
    public static String EXTRA_TOTAL_ITEM11 = "com.example.app1.EXTRA_TOTAL_ITEM11";
    public static String EXTRA_TYPE_ITEM11 = "com.example.app1.EXTRA_TYPE_ITEM11";
    public static String EXTRA_QUANTITY_ITEM11 = "com.example.app1.EXTRA_QUANTITY_ITEM11";
    LinearLayout item11;
    //setup items12
    String TOTAL12;
    public static String EXTRA_TOTAL_ITEM12 = "com.example.app1.EXTRA_TOTAL_ITEM12";
    public static String EXTRA_TYPE_ITEM12 = "com.example.app1.EXTRA_TYPE_ITEM12";
    public static String EXTRA_QUANTITY_ITEM12 = "com.example.app1.EXTRA_QUANTITY_ITEM12";
    LinearLayout item12;
    //setup items13
    String TOTAL13;
    public static String EXTRA_TOTAL_ITEM13 = "com.example.app1.EXTRA_TOTAL_ITEM13";
    public static String EXTRA_TYPE_ITEM13 = "com.example.app1.EXTRA_TYPE_ITEM13";
    public static String EXTRA_QUANTITY_ITEM13 = "com.example.app1.EXTRA_QUANTITY_ITEM13";
    LinearLayout item13;
    //setup items14
    String TOTAL14;
    public static String EXTRA_TOTAL_ITEM14 = "com.example.app1.EXTRA_TOTAL_ITEM14";
    public static String EXTRA_TYPE_ITEM14 = "com.example.app1.EXTRA_TYPE_ITEM14";
    public static String EXTRA_QUANTITY_ITEM14 = "com.example.app1.EXTRA_QUANTITY_ITEM14";
    LinearLayout item14;
    //setup items15
    String TOTAL15;
    public static String EXTRA_TOTAL_ITEM15 = "com.example.app1.EXTRA_TOTAL_ITEM15";
    public static String EXTRA_TYPE_ITEM15 = "com.example.app1.EXTRA_TYPE_ITEM15";
    public static String EXTRA_QUANTITY_ITEM15 = "com.example.app1.EXTRA_QUANTITY_ITEM15";
    LinearLayout item15;
    //setup items16
    String TOTAL16;
    public static String EXTRA_TOTAL_ITEM16 = "com.example.app1.EXTRA_TOTAL_ITEM16";
    public static String EXTRA_TYPE_ITEM16 = "com.example.app1.EXTRA_TYPE_ITEM16";
    public static String EXTRA_QUANTITY_ITEM16 = "com.example.app1.EXTRA_QUANTITY_ITEM16";
    LinearLayout item16;
    //setup items17
    String TOTAL17;
    public static String EXTRA_TOTAL_ITEM17 = "com.example.app1.EXTRA_TOTAL_ITEM17";
    public static String EXTRA_TYPE_ITEM17 = "com.example.app1.EXTRA_TYPE_ITEM17";
    public static String EXTRA_QUANTITY_ITEM17 = "com.example.app1.EXTRA_QUANTITY_ITEM17";
    LinearLayout item17;
    //setup items18
    String TOTAL18;
    public static String EXTRA_TOTAL_ITEM18 = "com.example.app1.EXTRA_TOTAL_ITEM18";
    public static String EXTRA_TYPE_ITEM18 = "com.example.app1.EXTRA_TYPE_ITEM18";
    public static String EXTRA_QUANTITY_ITEM18 = "com.example.app1.EXTRA_QUANTITY_ITEM18";
    LinearLayout item18;
    //start setup items burger
    //setup item1
    String TOTAL_B_1;
    LinearLayout item_B_1;
    public static String EXTRA_TOTAL_ITEM_B_1 = "com.example.app1.EXTRA_TOTAL_ITEM_B_1";
    public static String EXTRA_TYPE_ITEM_B_1 = "com.example.app1.EXTRA_TYPE_ITEM_B_1";
    public static String EXTRA_QUANTITY_ITEM_B_1 = "com.example.app1.EXTRA_QUANTITY_ITEM_B_1";
    //setup items2
    String TOTAL_B_2;
    LinearLayout item_B_2;
    public static String EXTRA_TOTAL_ITEM_B_2 = "com.example.app1.EXTRA_TOTAL_ITEM_B_2";
    public static String EXTRA_TYPE_ITEM_B_2 = "com.example.app1.EXTRA_TYPE_ITEM_B_2";
    public static String EXTRA_QUANTITY_ITEM_B_2 = "com.example.app1.EXTRA_QUANTITY_ITEM_B_2";
    //setup items3
    String TOTAL_B_3;
    LinearLayout item_B_3;
    public static String EXTRA_TOTAL_ITEM_B_3 = "com.example.app1.EXTRA_TOTAL_ITEM_B_3";
    public static String EXTRA_TYPE_ITEM_B_3 = "com.example.app1.EXTRA_TYPE_ITEM_B_3";
    public static String EXTRA_QUANTITY_ITEM_B_3 = "com.example.app1.EXTRA_QUANTITY_ITEM_B_3";
    //setup items4
    String TOTAL_B_4;
    LinearLayout item_B_4;
    public static String EXTRA_TOTAL_ITEM_B_4 = "com.example.app1.EXTRA_TOTAL_ITEM_B_4";
    public static String EXTRA_TYPE_ITEM_B_4 = "com.example.app1.EXTRA_TYPE_ITEM_B_4";
    public static String EXTRA_QUANTITY_ITEM_B_4 = "com.example.app1.EXTRA_QUANTITY_ITEM_B_4";
    //setup items5
    String TOTAL_B_5;
    LinearLayout item_B_5;
    public static String EXTRA_TOTAL_ITEM_B_5 = "com.example.app1.EXTRA_TOTAL_ITEM_B_5";
    public static String EXTRA_TYPE_ITEM_B_5 = "com.example.app1.EXTRA_TYPE_ITEM_B_5";
    public static String EXTRA_QUANTITY_ITEM_B_5 = "com.example.app1.EXTRA_QUANTITY_ITEM_B_5";
    //setup items6
    String TOTAL_B_6;
    LinearLayout item_B_6;
    public static String EXTRA_TOTAL_ITEM_B_6 = "com.example.app1.EXTRA_TOTAL_ITEM_B_6";
    public static String EXTRA_TYPE_ITEM_B_6 = "com.example.app1.EXTRA_TYPE_ITEM_B_6";
    public static String EXTRA_QUANTITY_ITEM_B_6 = "com.example.app1.EXTRA_QUANTITY_ITEM_B_6";
    //setup items7
    String TOTAL_B_7;
    LinearLayout item_B_7;
    public static String EXTRA_TOTAL_ITEM_B_7 = "com.example.app1.EXTRA_TOTAL_ITEM_B_7";
    public static String EXTRA_TYPE_ITEM_B_7 = "com.example.app1.EXTRA_TYPE_ITEM_B_7";
    public static String EXTRA_QUANTITY_ITEM_B_7 = "com.example.app1.EXTRA_QUANTITY_ITEM_B_7";
    //setup items8
    String TOTAL_B_8;
    LinearLayout item_B_8;
    public static String EXTRA_TOTAL_ITEM_B_8 = "com.example.app1.EXTRA_TOTAL_ITEM_B_8";
    public static String EXTRA_TYPE_ITEM_B_8 = "com.example.app1.EXTRA_TYPE_ITEM_B_8";
    public static String EXTRA_QUANTITY_ITEM_B_8 = "com.example.app1.EXTRA_QUANTITY_ITEM_B_8";
    //setup items9
    String TOTAL_B_9;
    LinearLayout item_B_9;
    public static String EXTRA_TOTAL_ITEM_B_9 = "com.example.app1.EXTRA_TOTAL_ITEM_B_9";
    public static String EXTRA_TYPE_ITEM_B_9 = "com.example.app1.EXTRA_TYPE_ITEM_B_9";
    public static String EXTRA_QUANTITY_ITEM_B_9 = "com.example.app1.EXTRA_QUANTITY_ITEM_B_9";
    //setup items10
    String TOTAL_B_10;
    LinearLayout item_B_10;
    public static String EXTRA_TOTAL_ITEM_B_10 = "com.example.app1.EXTRA_TOTAL_ITEM_B_10";
    public static String EXTRA_TYPE_ITEM_B_10 = "com.example.app1.EXTRA_TYPE_ITEM_B_10";
    public static String EXTRA_QUANTITY_ITEM_B_10 = "com.example.app1.EXTRA_QUANTITY_ITEM_B_10";
    //setup items11
    String TOTAL_B_11;
    LinearLayout item_B_11;
    public static String EXTRA_TOTAL_ITEM_B_11 = "com.example.app1.EXTRA_TOTAL_ITEM_B_11";
    public static String EXTRA_TYPE_ITEM_B_11 = "com.example.app1.EXTRA_TYPE_ITEM_B_11";
    public static String EXTRA_QUANTITY_ITEM_B_11 = "com.example.app1.EXTRA_QUANTITY_ITEM_B_11";
    //setup items12
    String TOTAL_B_12;
    LinearLayout item_B_12;
    public static String EXTRA_TOTAL_ITEM_B_12 = "com.example.app1.EXTRA_TOTAL_ITEM_B_12";
    public static String EXTRA_TYPE_ITEM_B_12 = "com.example.app1.EXTRA_TYPE_ITEM_B_12";
    public static String EXTRA_QUANTITY_ITEM_B_12 = "com.example.app1.EXTRA_QUANTITY_ITEM_B_12";





    FirebaseDatabase database= FirebaseDatabase.getInstance();
    DatabaseReference reference= database.getReference();
    String Delivery ;



/*************************************************************************** string  ***********************************************************/
    String Name,Phone;
    //setup items1
    String  Total_item1,Type_item1,Quantity_item1;

    //setup items2
    String Total_item2,Type_item2,Quantity_item2;

    //setup items3
    String Total_item3,Type_item3,Quantity_item3;

    //setup items4
    String Total_item4,Type_item4,Quantity_item4;
    //setup items5
    String Total_item5,Type_item5,Quantity_item5;
    //setup items6
    String  Total_item6,Type_item6,Quantity_item6;
    //setup items7
    String Total_item7,Type_item7,Quantity_item7;
    //setup items8
    String Total_item8,Type_item8,Quantity_item8;
    //setup items9
    String Total_item9,Type_item9,Quantity_item9;
    //setup items10
    String Total_item10,Type_item10,Quantity_item10;
    //setup items11
    String  Total_item11,Type_item11,Quantity_item11;

    //setup items12
    String Total_item12,Type_item12,Quantity_item12;

    //setup items13
    String Total_item13,Type_item13,Quantity_item13;

    //setup items14
    String Total_item14,Type_item14,Quantity_item14;
    //setup items15
    String Total_item15,Type_item15,Quantity_item15;
    //setup items16
    String  Total_item16,Type_item16,Quantity_item16;
    //setup items17
    String Total_item17,Type_item17,Quantity_item17;
    //setup items18
    String Total_item18,Type_item18,Quantity_item18;
    //end items chiken
    //start items burger
    //setup items1
    String  Total_item_B_1,Type_item_B_1,Quantity_item_B_1;

    //setup items2
    String Total_item_B_2,Type_item_B_2,Quantity_item_B_2;

    //setup items3
    String Total_item_B_3,Type_item_B_3,Quantity_item_B_3;

    //setup items4
    String Total_item_B_4,Type_item_B_4,Quantity_item_B_4;
    //setup items5
    String Total_item_B_5,Type_item_B_5,Quantity_item_B_5;
    //setup items6
    String  Total_item_B_6,Type_item_B_6,Quantity_item_B_6;
    //setup items7
    String Total_item_B_7,Type_item_B_7,Quantity_item_B_7;
    //setup items8
    String Total_item_B_8,Type_item_B_8,Quantity_item_B_8;
    //setup items9
    String Total_item_B_9,Type_item_B_9,Quantity_item_B_9;
    //setup items10
    String Total_item_B_10,Type_item_B_10,Quantity_item_B_10;
    //setup items11
    String  Total_item_B_11,Type_item_B_11,Quantity_item_B_11;

    //setup items12
    String Total_item_B_12,Type_item_B_12,Quantity_item_B_12;








    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_package_order);

        myOrder = findViewById(R.id.myOrder);
        mtTotalOrder =findViewById(R.id.myTotalOrder);
        oredered = findViewById(R.id.ordered);
        order_rest = findViewById(R.id.orders_restorant);






        Intent intent = getIntent();
      Name =  intent.getStringExtra(EXTRA_NAME);
      Phone = intent.getStringExtra(EXTRA_PHONE);




     reference.child("deleviry").addValueEventListener(new ValueEventListener() {
          @Override
          public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
              Delivery = dataSnapshot.getValue(String.class);
          }

          @Override
          public void onCancelled(@NonNull DatabaseError databaseError) {

          }
      });





      Total_item1 = intent.getStringExtra(EXTRA_TOTAL_ITEM1);
        Type_item1 = intent.getStringExtra(EXTRA_TYPE_ITEM1);
        Quantity_item1= intent.getStringExtra(EXTRA_QUANTITY_ITEM1);
        item1 = findViewById(R.id.item1);
      //setup items2
        Total_item2 = intent.getStringExtra(EXTRA_TOTAL_ITEM2);
        Type_item2 = intent.getStringExtra(EXTRA_TYPE_ITEM2);
        Quantity_item2= intent.getStringExtra(EXTRA_QUANTITY_ITEM2);


        item2 = findViewById(R.id.item2);
        //setup items3
        Total_item3 = intent.getStringExtra(EXTRA_TOTAL_ITEM3);
        Type_item3 = intent.getStringExtra(EXTRA_TYPE_ITEM3);
        Quantity_item3= intent.getStringExtra(EXTRA_QUANTITY_ITEM3);


        item3 = findViewById(R.id.item3);
        //setup items4
        Total_item4 = intent.getStringExtra(EXTRA_TOTAL_ITEM4);
        Type_item4 = intent.getStringExtra(EXTRA_TYPE_ITEM4);
        Quantity_item4= intent.getStringExtra(EXTRA_QUANTITY_ITEM4);


        item4 = findViewById(R.id.item4);
        //setup items5
        Total_item5 = intent.getStringExtra(EXTRA_TOTAL_ITEM5);
        Type_item5 = intent.getStringExtra(EXTRA_TYPE_ITEM5);
        Quantity_item5= intent.getStringExtra(EXTRA_QUANTITY_ITEM5);

        item5 = findViewById(R.id.item5);
        //setupitem6

        Total_item6 = intent.getStringExtra(EXTRA_TOTAL_ITEM6);
        Type_item6 = intent.getStringExtra(EXTRA_TYPE_ITEM6);
        Quantity_item6= intent.getStringExtra(EXTRA_QUANTITY_ITEM6);
        item6 = findViewById(R.id.item6);
        //setup item7
        Total_item7 = intent.getStringExtra(EXTRA_TOTAL_ITEM7);
        Type_item7 = intent.getStringExtra(EXTRA_TYPE_ITEM7);
        Quantity_item7= intent.getStringExtra(EXTRA_QUANTITY_ITEM7);
        item7 = findViewById(R.id.item7);
        //setup items8
        Total_item8 = intent.getStringExtra(EXTRA_TOTAL_ITEM8);
        Type_item8 = intent.getStringExtra(EXTRA_TYPE_ITEM8);
        Quantity_item8= intent.getStringExtra(EXTRA_QUANTITY_ITEM8);
        item8 = findViewById(R.id.item8);
        //setup items9
        Total_item9 = intent.getStringExtra(EXTRA_TOTAL_ITEM9);
        Type_item9 = intent.getStringExtra(EXTRA_TYPE_ITEM9);
        Quantity_item9= intent.getStringExtra(EXTRA_QUANTITY_ITEM9);

        item9 = findViewById(R.id.item9);
        //setup items10
        Total_item10 = intent.getStringExtra(EXTRA_TOTAL_ITEM10);
        Type_item10 = intent.getStringExtra(EXTRA_TYPE_ITEM10);
        Quantity_item10= intent.getStringExtra(EXTRA_QUANTITY_ITEM10);


        item10 = findViewById(R.id.item10);


        Total_item11 = intent.getStringExtra(EXTRA_TOTAL_ITEM11);
        Type_item11 = intent.getStringExtra(EXTRA_TYPE_ITEM11);
        Quantity_item11= intent.getStringExtra(EXTRA_QUANTITY_ITEM11);
        item11 = findViewById(R.id.item11);
        //setup items12
        Total_item12 = intent.getStringExtra(EXTRA_TOTAL_ITEM12);
        Type_item12 = intent.getStringExtra(EXTRA_TYPE_ITEM12);
        Quantity_item12= intent.getStringExtra(EXTRA_QUANTITY_ITEM12);


        item12 = findViewById(R.id.item12);
        //setup items13
        Total_item13 = intent.getStringExtra(EXTRA_TOTAL_ITEM13);
        Type_item13 = intent.getStringExtra(EXTRA_TYPE_ITEM13);
        Quantity_item13= intent.getStringExtra(EXTRA_QUANTITY_ITEM13);


        item13 = findViewById(R.id.item13);
        //setup items14
        Total_item14 = intent.getStringExtra(EXTRA_TOTAL_ITEM14);
        Type_item14 = intent.getStringExtra(EXTRA_TYPE_ITEM14);
        Quantity_item14= intent.getStringExtra(EXTRA_QUANTITY_ITEM14);


        item14 = findViewById(R.id.item14);
        //setup items15
        Total_item15 = intent.getStringExtra(EXTRA_TOTAL_ITEM15);
        Type_item15 = intent.getStringExtra(EXTRA_TYPE_ITEM15);
        Quantity_item15= intent.getStringExtra(EXTRA_QUANTITY_ITEM15);

        item15 = findViewById(R.id.item15);
        //setupitem16

        Total_item16 = intent.getStringExtra(EXTRA_TOTAL_ITEM16);
        Type_item16 = intent.getStringExtra(EXTRA_TYPE_ITEM16);
        Quantity_item16= intent.getStringExtra(EXTRA_QUANTITY_ITEM16);
        item16 = findViewById(R.id.item16);
        //setup item17
        Total_item17 = intent.getStringExtra(EXTRA_TOTAL_ITEM17);
        Type_item17 = intent.getStringExtra(EXTRA_TYPE_ITEM17);
        Quantity_item17= intent.getStringExtra(EXTRA_QUANTITY_ITEM17);
        item17 = findViewById(R.id.item17);
        //setup items18
        Total_item18 = intent.getStringExtra(EXTRA_TOTAL_ITEM18);
        Type_item18 = intent.getStringExtra(EXTRA_TYPE_ITEM18);
        Quantity_item18= intent.getStringExtra(EXTRA_QUANTITY_ITEM18);
        item18 = findViewById(R.id.item18);
        //end item chiken
        //start item burger

        Total_item_B_1 = intent.getStringExtra(EXTRA_TOTAL_ITEM_B_1);
        Type_item_B_1 = intent.getStringExtra(EXTRA_TYPE_ITEM_B_1);
        Quantity_item_B_1= intent.getStringExtra(EXTRA_QUANTITY_ITEM_B_1);
        item_B_1 = findViewById(R.id.item_B_1);
        //setup items2
        Total_item_B_2 = intent.getStringExtra(EXTRA_TOTAL_ITEM_B_2);
        Type_item_B_2 = intent.getStringExtra(EXTRA_TYPE_ITEM_B_2);
        Quantity_item_B_2= intent.getStringExtra(EXTRA_QUANTITY_ITEM_B_2);


        item_B_2 = findViewById(R.id.item_B_2);
        //setup items3
        Total_item_B_3 = intent.getStringExtra(EXTRA_TOTAL_ITEM_B_3);
        Type_item_B_3 = intent.getStringExtra(EXTRA_TYPE_ITEM_B_3);
        Quantity_item_B_3= intent.getStringExtra(EXTRA_QUANTITY_ITEM_B_3);


        item_B_3 = findViewById(R.id.item_B_3);
        //setup items4
        Total_item_B_4 = intent.getStringExtra(EXTRA_TOTAL_ITEM_B_4);
        Type_item_B_4 = intent.getStringExtra(EXTRA_TYPE_ITEM_B_4);
        Quantity_item_B_4= intent.getStringExtra(EXTRA_QUANTITY_ITEM_B_4);


        item_B_4 = findViewById(R.id.item_B_4);
        //setup items5
        Total_item_B_5 = intent.getStringExtra(EXTRA_TOTAL_ITEM_B_5);
        Type_item_B_5 = intent.getStringExtra(EXTRA_TYPE_ITEM_B_5);
        Quantity_item_B_5= intent.getStringExtra(EXTRA_QUANTITY_ITEM_B_5);

        item_B_5 = findViewById(R.id.item_B_5);
        //setupitem6

        Total_item_B_6 = intent.getStringExtra(EXTRA_TOTAL_ITEM_B_6);
        Type_item_B_6 = intent.getStringExtra(EXTRA_TYPE_ITEM_B_6);
        Quantity_item_B_6= intent.getStringExtra(EXTRA_QUANTITY_ITEM_B_6);
        item_B_6 = findViewById(R.id.item_B_6);
        //setup item7
        Total_item_B_7 = intent.getStringExtra(EXTRA_TOTAL_ITEM_B_7);
        Type_item_B_7 = intent.getStringExtra(EXTRA_TYPE_ITEM_B_7);
        Quantity_item_B_7= intent.getStringExtra(EXTRA_QUANTITY_ITEM_B_7);
        item_B_7 = findViewById(R.id.item_B_7);
        //setup items8
        Total_item_B_8 = intent.getStringExtra(EXTRA_TOTAL_ITEM_B_8);
        Type_item_B_8 = intent.getStringExtra(EXTRA_TYPE_ITEM_B_8);
        Quantity_item_B_8= intent.getStringExtra(EXTRA_QUANTITY_ITEM_B_8);
        item_B_8 = findViewById(R.id.item_B_8);
        //setup items9
        Total_item_B_9 = intent.getStringExtra(EXTRA_TOTAL_ITEM_B_9);
        Type_item_B_9 = intent.getStringExtra(EXTRA_TYPE_ITEM_B_9);
        Quantity_item_B_9= intent.getStringExtra(EXTRA_QUANTITY_ITEM_B_9);

        item_B_9 = findViewById(R.id.item_B_9);
        //setup items10
        Total_item_B_10 = intent.getStringExtra(EXTRA_TOTAL_ITEM_B_10);
        Type_item_B_10 = intent.getStringExtra(EXTRA_TYPE_ITEM_B_10);
        Quantity_item_B_10= intent.getStringExtra(EXTRA_QUANTITY_ITEM_B_10);


        item_B_10 = findViewById(R.id.item_B_10);


        Total_item_B_11 = intent.getStringExtra(EXTRA_TOTAL_ITEM_B_11);
        Type_item_B_11 = intent.getStringExtra(EXTRA_TYPE_ITEM_B_11);
        Quantity_item_B_11= intent.getStringExtra(EXTRA_QUANTITY_ITEM_B_11);
        item_B_11 = findViewById(R.id.item_B_11);
        //setup items12
        Total_item_B_12 = intent.getStringExtra(EXTRA_TOTAL_ITEM_B_12);
        Type_item_B_12 = intent.getStringExtra(EXTRA_TYPE_ITEM_B_12);
        Quantity_item_B_12= intent.getStringExtra(EXTRA_QUANTITY_ITEM_B_12);


        item_B_12 = findViewById(R.id.item_B_12);





otal = 0;

        if (Quantity_item1 != null){
            total1 = Integer.parseInt(Total_item1);
            otal = otal + total1;
            total = String.valueOf(otal);
            mtTotalOrder.setText(  "اجمال تكلفة الاورد: "+ total+"جنيه" );
            neverTotal = mtTotalOrder.getText().toString();

            TOTAL1 = "\n النوع: " + Type_item1 + "\n الكمية: " + Quantity_item1 + "\n اجمالي: " +Total_item1 +"جنيه"  + "\n" ;
            myOrder.setText(TOTAL1);
            never = myOrder.getText().toString();

        }if (Quantity_item2 != null){
          total2 = Integer.parseInt(Total_item2);
          otal = otal + total2;
          total = String.valueOf(otal);
            mtTotalOrder.setText("اجمال تكلفة الاورد: "+total+"جنيه" );
            neverTotal = mtTotalOrder.getText().toString();

            TOTAL2 = "\n النوع: " + Type_item2 + "\nالكمية: " + Quantity_item2 + "\nاجمالي: " +Total_item2 +"جنيه" + "\n" ;
            myOrder.append(TOTAL2);
            never = myOrder.getText().toString();

        }if (Quantity_item3 != null){
            total3 = Integer.parseInt(Total_item3);
            otal = otal + total3;
            total = String.valueOf(otal);
            mtTotalOrder.setText("اجمال تكلفة الاورد: "+total+"جنيه" );
            neverTotal = mtTotalOrder.getText().toString();

            TOTAL3 = "\nالنوع: " + Type_item3 + "\nالكمية:  " + Quantity_item3 + "\n اجمالي: " +Total_item3 +"جنيه"  + "\n" ;
            myOrder.append(TOTAL3);
            never = myOrder.getText().toString();

        }if (Quantity_item4 != null){
            total4 = Integer.parseInt(Total_item4);
            otal = otal + total4;
            total = String.valueOf(otal);
            mtTotalOrder.setText("اجمال تكلفة الاورد: "+total+"جنيه" );
            neverTotal = mtTotalOrder.getText().toString();
            TOTAL4 = "\n النوع: " + Type_item4 + "\n الكمية: " + Quantity_item4 + "\n اجمالي: " +Total_item4+"جنيه"  + "\n" ;
            myOrder.append(TOTAL4);
            never = myOrder.getText().toString();

        }if (Quantity_item5 != null){
            total5 = Integer.parseInt(Total_item5);
            otal = otal + total5;
            total = String.valueOf(otal);
            mtTotalOrder.setText("اجمال تكلفة الاورد: "+total+"جنيه" );
            neverTotal = mtTotalOrder.getText().toString();
            TOTAL5 = "\n النوع: " + Type_item5 + "\nالكمية: " + Quantity_item5 + "\nاجمالي: " +Total_item5 +"جنيه"  + "\n" ;
            myOrder.append(TOTAL5);
            never = myOrder.getText().toString();

        }if (Quantity_item6 != null){
            total6 = Integer.parseInt(Total_item6);
            otal = otal + total6;
            total = String.valueOf(otal);
            mtTotalOrder.setText("اجمال تكلفة الاورد: "+total+"جنيه" );
            neverTotal = mtTotalOrder.getText().toString();
            TOTAL6 = "\nالنوع: " + Type_item6 + "\nالكمية:  " + Quantity_item6 + "\n اجمالي: " +Total_item6+"جنيه"  + "\n" ;
            myOrder.append(TOTAL6);
            never = myOrder.getText().toString();

        }if (Quantity_item7 != null){
            total7 = Integer.parseInt(Total_item7);
            otal = otal + total7;
            total = String.valueOf(otal);
            mtTotalOrder.setText("اجمال تكلفة الاورد: "+total+"جنيه" );
            neverTotal = mtTotalOrder.getText().toString();
            TOTAL7 = "\n النوع: " + Type_item7 + "\nالكمية: " + Quantity_item7 + "\nاجمالي: " +Total_item7+"جنيه"  + "\n" ;
            myOrder.append(TOTAL7);
            never = myOrder.getText().toString();

        }if (Quantity_item8 != null){
            total8 = Integer.parseInt(Total_item8);
            otal = otal + total8;
            total = String.valueOf(otal);
            mtTotalOrder.setText("اجمال تكلفة الاورد: "+total+"جنيه" );
            neverTotal = mtTotalOrder.getText().toString();
            TOTAL8 = "\nالنوع: " + Type_item8 + "\nالكمية:  " + Quantity_item8 + "\n اجمالي: " +Total_item8+"جنيه"  + "\n" ;
            myOrder.append(TOTAL8);
            never = myOrder.getText().toString();

        }if (Quantity_item9 != null){
            total9 = Integer.parseInt(Total_item9);
            otal = otal + total9;
            total = String.valueOf(otal);
            mtTotalOrder.setText("اجمال تكلفة الاورد: "+total+"جنيه" );
            neverTotal = mtTotalOrder.getText().toString();
            TOTAL9 = "\n النوع: " + Type_item9 + "\n الكمية: " + Quantity_item9 + "\n اجمالي: " +Total_item9+"جنيه"  + "\n" ;
            myOrder.append(TOTAL9);
            never = myOrder.getText().toString();

        }if (Quantity_item10 != null){
            total10 = Integer.parseInt(Total_item10);
            otal = otal + total10;
            total = String.valueOf(otal);
            mtTotalOrder.setText("اجمال تكلفة الاورد: "+total+"جنيه" );
            neverTotal = mtTotalOrder.getText().toString();
            TOTAL10 = "\n النوع: " + Type_item10 + "\nالكمية: " + Quantity_item10 + "\nاجمالي: " +Total_item10+"جنيه"  + "\n" ;
            myOrder.append(TOTAL10);
            never = myOrder.getText().toString();
        }if (Quantity_item11 != null){
            total11 = Integer.parseInt(Total_item11);
            otal = otal + total11;
            total = String.valueOf(otal);
            mtTotalOrder.setText(  "اجمال تكلفة الاورد: "+ total+"جنيه" );
            neverTotal = mtTotalOrder.getText().toString();

            TOTAL11 = "\n النوع: " + Type_item11 + "\n الكمية: " + Quantity_item11 + "\n اجمالي: " +Total_item11 +"جنيه"  + "\n" ;
            myOrder.setText(TOTAL11);
            never = myOrder.getText().toString();

        }if (Quantity_item12 != null){
            total12 = Integer.parseInt(Total_item12);
            otal = otal + total12;
            total = String.valueOf(otal);
            mtTotalOrder.setText("اجمال تكلفة الاورد: "+total+"جنيه" );
            neverTotal = mtTotalOrder.getText().toString();

            TOTAL12 = "\n النوع: " + Type_item12 + "\nالكمية: " + Quantity_item12 + "\nاجمالي: " +Total_item12 +"جنيه" + "\n" ;
            myOrder.append(TOTAL12);
            never = myOrder.getText().toString();

        }if (Quantity_item13 != null){
            total13 = Integer.parseInt(Total_item13);
            otal = otal + total13;
            total = String.valueOf(otal);
            mtTotalOrder.setText("اجمال تكلفة الاورد: "+total+"جنيه" );
            neverTotal = mtTotalOrder.getText().toString();

            TOTAL13 = "\nالنوع: " + Type_item13 + "\nالكمية:  " + Quantity_item13 + "\n اجمالي: " +Total_item13 +"جنيه"  + "\n" ;
            myOrder.append(TOTAL13);
            never = myOrder.getText().toString();

        }if (Quantity_item14 != null){
            total14 = Integer.parseInt(Total_item14);
            otal = otal + total14;
            total = String.valueOf(otal);
            mtTotalOrder.setText("اجمال تكلفة الاورد: "+total+"جنيه" );
            neverTotal = mtTotalOrder.getText().toString();
            TOTAL14 = "\n النوع: " + Type_item14 + "\n الكمية: " + Quantity_item14 + "\n اجمالي: " +Total_item14+"جنيه"  + "\n" ;
            myOrder.append(TOTAL14);
            never = myOrder.getText().toString();

        }if (Quantity_item15 != null){
            total15 = Integer.parseInt(Total_item15);
            otal = otal + total15;
            total = String.valueOf(otal);
            mtTotalOrder.setText("اجمال تكلفة الاورد: "+total+"جنيه" );
            neverTotal = mtTotalOrder.getText().toString();
            TOTAL15 = "\n النوع: " + Type_item15 + "\nالكمية: " + Quantity_item15 + "\nاجمالي: " +Total_item15 +"جنيه"  + "\n" ;
            myOrder.append(TOTAL15);
            never = myOrder.getText().toString();

        }if (Quantity_item16 != null){
            total16 = Integer.parseInt(Total_item16);
            otal = otal + total16;
            total = String.valueOf(otal);
            mtTotalOrder.setText("اجمال تكلفة الاورد: "+total+"جنيه" );
            neverTotal = mtTotalOrder.getText().toString();
            TOTAL16 = "\nالنوع: " + Type_item16 + "\nالكمية:  " + Quantity_item16 + "\n اجمالي: " +Total_item16+"جنيه"  + "\n" ;
            myOrder.append(TOTAL16);
            never = myOrder.getText().toString();

        }if (Quantity_item17 != null){
            total17 = Integer.parseInt(Total_item17);
            otal = otal + total17;
            total = String.valueOf(otal);
            mtTotalOrder.setText("اجمال تكلفة الاورد: "+total+"جنيه" );
            neverTotal = mtTotalOrder.getText().toString();
            TOTAL17 = "\n النوع: " + Type_item17 + "\nالكمية: " + Quantity_item17 + "\nاجمالي: " +Total_item17+"جنيه"  + "\n" ;
            myOrder.append(TOTAL17);
            never = myOrder.getText().toString();

        }if (Quantity_item18 != null){
            total18 = Integer.parseInt(Total_item18);
            otal = otal + total18;
            total = String.valueOf(otal);
            mtTotalOrder.setText("اجمال تكلفة الاورد: "+total+"جنيه" );
            neverTotal = mtTotalOrder.getText().toString();
            TOTAL18 = "\nالنوع: " + Type_item18 + "\nالكمية:  " + Quantity_item18 + "\n اجمالي: " +Total_item18+"جنيه"  + "\n" ;
            myOrder.append(TOTAL18);
            never = myOrder.getText().toString();

        }if (Quantity_item_B_1 != null){
            total_B_1 = Integer.parseInt(Total_item_B_1);
            otal = otal + total_B_1;
            total = String.valueOf(otal);
            mtTotalOrder.setText(  "اجمال تكلفة الاورد: "+ total+"جنيه" );
            neverTotal = mtTotalOrder.getText().toString();

            TOTAL_B_1 = "\n النوع: " + Type_item_B_1 + "\n الكمية: " + Quantity_item_B_1 + "\n اجمالي: " +Total_item_B_1 +"جنيه"  + "\n" ;
            myOrder.append(TOTAL_B_1);
            never = myOrder.getText().toString();

        }if (Quantity_item_B_2 != null){
            total_B_2 = Integer.parseInt(Total_item_B_2);
            otal = otal + total_B_2;
            total = String.valueOf(otal);
            mtTotalOrder.setText("اجمال تكلفة الاورد: "+total+"جنيه" );
            neverTotal = mtTotalOrder.getText().toString();

            TOTAL_B_2 = "\n النوع: " + Type_item_B_2 + "\nالكمية: " + Quantity_item_B_2 + "\nاجمالي: " +Total_item_B_2 +"جنيه" + "\n" ;
            myOrder.append(TOTAL_B_2);
            never = myOrder.getText().toString();

        }if (Quantity_item_B_3 != null){
            total_B_3 = Integer.parseInt(Total_item_B_3);
            otal = otal + total_B_3;
            total = String.valueOf(otal);
            mtTotalOrder.setText("اجمال تكلفة الاورد: "+total+"جنيه" );
            neverTotal = mtTotalOrder.getText().toString();

            TOTAL_B_3 = "\nالنوع: " + Type_item_B_3 + "\nالكمية:  " + Quantity_item_B_3 + "\n اجمالي: " +Total_item_B_3 +"جنيه"  + "\n" ;
            myOrder.append(TOTAL_B_3);
            never = myOrder.getText().toString();

        }if (Quantity_item_B_4 != null){
            total_B_4 = Integer.parseInt(Total_item_B_4);
            otal = otal + total_B_4;
            total = String.valueOf(otal);
            mtTotalOrder.setText("اجمال تكلفة الاورد: "+total+"جنيه" );
            neverTotal = mtTotalOrder.getText().toString();
            TOTAL_B_4 = "\n النوع: " + Type_item_B_4 + "\n الكمية: " + Quantity_item_B_4 + "\n اجمالي: " +Total_item_B_4+"جنيه"  + "\n" ;
            myOrder.append(TOTAL_B_4);
            never = myOrder.getText().toString();

        }if (Quantity_item_B_5 != null){
            total_B_5 = Integer.parseInt(Total_item_B_5);
            otal = otal + total_B_5;
            total = String.valueOf(otal);
            mtTotalOrder.setText("اجمال تكلفة الاورد: "+total+"جنيه" );
            neverTotal = mtTotalOrder.getText().toString();
            TOTAL_B_5 = "\n النوع: " + Type_item_B_5 + "\nالكمية: " + Quantity_item_B_5 + "\nاجمالي: " +Total_item_B_5 +"جنيه"  + "\n" ;
            myOrder.append(TOTAL_B_5);
            never = myOrder.getText().toString();

        }if (Quantity_item_B_6 != null){
            total_B_6 = Integer.parseInt(Total_item_B_6);
            otal = otal + total_B_6;
            total = String.valueOf(otal);
            mtTotalOrder.setText("اجمال تكلفة الاورد: "+total+"جنيه" );
            neverTotal = mtTotalOrder.getText().toString();
            TOTAL_B_6 = "\nالنوع: " + Type_item_B_6 + "\nالكمية:  " + Quantity_item_B_6 + "\n اجمالي: " +Total_item_B_6+"جنيه"  + "\n" ;
            myOrder.append(TOTAL_B_6);
            never = myOrder.getText().toString();

        }if (Quantity_item_B_7 != null){
            total_B_7 = Integer.parseInt(Total_item_B_7);
            otal = otal + total_B_7;
            total = String.valueOf(otal);
            mtTotalOrder.setText("اجمال تكلفة الاورد: "+total+"جنيه" );
            neverTotal = mtTotalOrder.getText().toString();
            TOTAL_B_7 = "\n النوع: " + Type_item_B_7 + "\nالكمية: " + Quantity_item_B_7 + "\nاجمالي: " +Total_item_B_7+"جنيه"  + "\n" ;
            myOrder.append(TOTAL_B_7);
            never = myOrder.getText().toString();

        }if (Quantity_item_B_8 != null){
            total_B_8 = Integer.parseInt(Total_item_B_8);
            otal = otal + total_B_8;
            total = String.valueOf(otal);
            mtTotalOrder.setText("اجمال تكلفة الاورد: "+total+"جنيه" );
            neverTotal = mtTotalOrder.getText().toString();
            TOTAL_B_8 = "\nالنوع: " + Type_item_B_8 + "\nالكمية:  " + Quantity_item_B_8 + "\n اجمالي: " +Total_item_B_8+"جنيه"  + "\n" ;
            myOrder.append(TOTAL_B_8);
            never = myOrder.getText().toString();

        }if (Quantity_item_B_9 != null){
            total_B_9 = Integer.parseInt(Total_item_B_9);
            otal = otal + total_B_9;
            total = String.valueOf(otal);
            mtTotalOrder.setText("اجمال تكلفة الاورد: "+total+"جنيه" );
            neverTotal = mtTotalOrder.getText().toString();
            TOTAL_B_9 = "\n النوع: " + Type_item_B_9 + "\n الكمية: " + Quantity_item_B_9 + "\n اجمالي: " +Total_item_B_9+"جنيه"  + "\n" ;
            myOrder.append(TOTAL_B_9);
            never = myOrder.getText().toString();

        }if (Quantity_item_B_10 != null){
            total_B_10 = Integer.parseInt(Total_item_B_10);
            otal = otal + total_B_10;
            total = String.valueOf(otal);
            mtTotalOrder.setText("اجمال تكلفة الاورد: "+total+"جنيه" );
            neverTotal = mtTotalOrder.getText().toString();
            TOTAL_B_10 = "\n النوع: " + Type_item_B_10 + "\nالكمية: " + Quantity_item_B_10 + "\nاجمالي: " +Total_item_B_10+"جنيه"  + "\n" ;
            myOrder.append(TOTAL_B_10);
            never = myOrder.getText().toString();
        }if (Quantity_item_B_11 != null){
            total_B_11 = Integer.parseInt(Total_item_B_11);
            otal = otal + total_B_11;
            total = String.valueOf(otal);
            mtTotalOrder.setText(  "اجمال تكلفة الاورد: "+ total+"جنيه" );
            neverTotal = mtTotalOrder.getText().toString();

            TOTAL_B_11 = "\n النوع: " + Type_item_B_11 + "\n الكمية: " + Quantity_item_B_11 + "\n اجمالي: " +Total_item_B_11 +"جنيه"  + "\n" ;
            myOrder.setText(TOTAL_B_11);
            never = myOrder.getText().toString();

        }if (Quantity_item_B_12 != null){
            total_B_12 = Integer.parseInt(Total_item_B_12);
            otal = otal + total_B_12;
            total = String.valueOf(otal);
            mtTotalOrder.setText("اجمال تكلفة الاورد: "+total+"جنيه" );
            neverTotal = mtTotalOrder.getText().toString();

            TOTAL_B_12 = "\n النوع: " + Type_item_B_12 + "\nالكمية: " + Quantity_item_B_12 + "\nاجمالي: " +Total_item_B_12 +"جنيه" + "\n" ;
            myOrder.append(TOTAL_B_12);
            never = myOrder.getText().toString();

        }






        oredered.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                adrees = findViewById(R.id.adrress);
                String adreees = adrees.getText().toString();
                if (!(TextUtils.isEmpty(adreees))){

                    delivery = Integer.parseInt(Delivery);
                    otal = otal + delivery;
                    total = String.valueOf(otal);
                    mtTotalOrder.setText("اجمال تكلفة الاورد: " + total +"جنيه" );
                    neverTotal = mtTotalOrder.getText().toString();
                    myOrder.append("\n تكلفة التوصيل: " + delivery +"جنيه" );
                    never = myOrder.getText().toString();






                    reference.child("totel").push().setValue(total);
                Calendar cal = Calendar.getInstance();
                @SuppressLint("SimpleDateFormat") SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

               String date =  sdf.format(cal.getTime());
               notes = findViewById(R.id.notes);

               String note = notes.getText().toString();
                String all_total = "\n"+Name+"\n"+Phone+"\n"+date+"\n الاوردر: " + never + "\nالتكلفة الكلية: " + total +"\n ملاحظات: "+note
                        + "\n العنوان: " + adreees ;



             reference.child("3mashi").push().child("order").setValue(all_total);

             Intent intent1 = new Intent(packageOrderActivity.this,RestourantActivity.class);
             intent1.putExtra(EXTRA_TOTAL,all_total);
             startActivity(intent1);
                    overridePendingTransition(R.anim.slide_id_right,R.anim.slide_out_left);


                    oredered.setVisibility(View.INVISIBLE);
                Toast.makeText(packageOrderActivity.this, "your order send to restorant....thank you for used this servies", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(packageOrderActivity.this, "enter the adreess", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }


    }



