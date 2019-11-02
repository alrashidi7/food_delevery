package com.example.app1;


import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;






public class menuActivity extends AppCompatActivity {



//setup intent
    public static String EXTRA_PHONE = "com.example.app1.EXTRA_PHONE";
    public static String EXTRA_NAME = "com.example.app1.EXTRA_NAME";
    //setup items1
    public static String EXTRA_TOTAL_ITEM1 = "com.example.app1.EXTRA_TOTAL_ITEM1";
    public static String EXTRA_TYPE_ITEM1 = "com.example.app1.EXTRA_TYPE_ITEM1";
    public static String EXTRA_QUANTITY_ITEM1 = "com.example.app1.EXTRA_QUANTITY_ITEM1";
    //setup items2
    public static String EXTRA_TOTAL_ITEM2 = "com.example.app1.EXTRA_TOTAL_ITEM2";
    public static String EXTRA_TYPE_ITEM2 = "com.example.app1.EXTRA_TYPE_ITEM2";
    public static String EXTRA_QUANTITY_ITEM2 = "com.example.app1.EXTRA_QUANTITY_ITEM2";
    //setup items3
    public static String EXTRA_TOTAL_ITEM3 = "com.example.app1.EXTRA_TOTAL_ITEM3";
    public static String EXTRA_TYPE_ITEM3 = "com.example.app1.EXTRA_TYPE_ITEM3";
    public static String EXTRA_QUANTITY_ITEM3 = "com.example.app1.EXTRA_QUANTITY_ITEM3";
    //setup items4
    public static String EXTRA_TOTAL_ITEM4 = "com.example.app1.EXTRA_TOTAL_ITEM4";
    public static String EXTRA_TYPE_ITEM4 = "com.example.app1.EXTRA_TYPE_ITEM4";
    public static String EXTRA_QUANTITY_ITEM4 = "com.example.app1.EXTRA_QUANTITY_ITEM4";
    //setup items5
    public static String EXTRA_TOTAL_ITEM5 = "com.example.app1.EXTRA_TOTAL_ITEM5";
    public static String EXTRA_TYPE_ITEM5 = "com.example.app1.EXTRA_TYPE_ITEM5";
    public static String EXTRA_QUANTITY_ITEM5 = "com.example.app1.EXTRA_QUANTITY_ITEM5";
    //setup items6
    public static String EXTRA_TOTAL_ITEM6 = "com.example.app1.EXTRA_TOTAL_ITEM6";
    public static String EXTRA_TYPE_ITEM6 = "com.example.app1.EXTRA_TYPE_ITEM6";
    public static String EXTRA_QUANTITY_ITEM6 = "com.example.app1.EXTRA_QUANTITY_ITEM6";
    //setup items7
    public static String EXTRA_TOTAL_ITEM7 = "com.example.app1.EXTRA_TOTAL_ITEM7";
    public static String EXTRA_TYPE_ITEM7 = "com.example.app1.EXTRA_TYPE_ITEM7";
    public static String EXTRA_QUANTITY_ITEM7 = "com.example.app1.EXTRA_QUANTITY_ITEM7";
    //setup items8
    public static String EXTRA_TOTAL_ITEM8 = "com.example.app1.EXTRA_TOTAL_ITEM8";
    public static String EXTRA_TYPE_ITEM8 = "com.example.app1.EXTRA_TYPE_ITEM8";
    public static String EXTRA_QUANTITY_ITEM8 = "com.example.app1.EXTRA_QUANTITY_ITEM8";
    //setup items9
    public static String EXTRA_TOTAL_ITEM9 = "com.example.app1.EXTRA_TOTAL_ITEM9";
    public static String EXTRA_TYPE_ITEM9 = "com.example.app1.EXTRA_TYPE_ITEM9";
    public static String EXTRA_QUANTITY_ITEM9 = "com.example.app1.EXTRA_QUANTITY_ITEM9";
    //setup items10
    public static String EXTRA_TOTAL_ITEM10 = "com.example.app1.EXTRA_TOTAL_ITEM10";
    public static String EXTRA_TYPE_ITEM10 = "com.example.app1.EXTRA_TYPE_ITEM10";
    public static String EXTRA_QUANTITY_ITEM10 = "com.example.app1.EXTRA_QUANTITY_ITEM10";
    //setup items11
    public static String EXTRA_TOTAL_ITEM11 = "com.example.app1.EXTRA_TOTAL_ITEM11";
    public static String EXTRA_TYPE_ITEM11 = "com.example.app1.EXTRA_TYPE_ITEM11";
    public static String EXTRA_QUANTITY_ITEM11 = "com.example.app1.EXTRA_QUANTITY_ITEM11";
    //setup items12
    public static String EXTRA_TOTAL_ITEM12 = "com.example.app1.EXTRA_TOTAL_ITEM12";
    public static String EXTRA_TYPE_ITEM12 = "com.example.app1.EXTRA_TYPE_ITEM12";
    public static String EXTRA_QUANTITY_ITEM12 = "com.example.app1.EXTRA_QUANTITY_ITEM12";
    //setup items13
    public static String EXTRA_TOTAL_ITEM13 = "com.example.app1.EXTRA_TOTAL_ITEM13";
    public static String EXTRA_TYPE_ITEM13 = "com.example.app1.EXTRA_TYPE_ITEM13";
    public static String EXTRA_QUANTITY_ITEM13 = "com.example.app1.EXTRA_QUANTITY_ITEM13";
    //setup items14
    public static String EXTRA_TOTAL_ITEM14 = "com.example.app1.EXTRA_TOTAL_ITEM14";
    public static String EXTRA_TYPE_ITEM14 = "com.example.app1.EXTRA_TYPE_ITEM14";
    public static String EXTRA_QUANTITY_ITEM14 = "com.example.app1.EXTRA_QUANTITY_ITEM14";
    //setup items15
    public static String EXTRA_TOTAL_ITEM15 = "com.example.app1.EXTRA_TOTAL_ITEM15";
    public static String EXTRA_TYPE_ITEM15 = "com.example.app1.EXTRA_TYPE_ITEM15";
    public static String EXTRA_QUANTITY_ITEM15 = "com.example.app1.EXTRA_QUANTITY_ITEM15";
    //setup items16
    public static String EXTRA_TOTAL_ITEM16 = "com.example.app1.EXTRA_TOTAL_ITEM16";
    public static String EXTRA_TYPE_ITEM16 = "com.example.app1.EXTRA_TYPE_ITEM16";
    public static String EXTRA_QUANTITY_ITEM16 = "com.example.app1.EXTRA_QUANTITY_ITEM16";
    //setup items17
    public static String EXTRA_TOTAL_ITEM17 = "com.example.app1.EXTRA_TOTAL_ITEM17";
    public static String EXTRA_TYPE_ITEM17 = "com.example.app1.EXTRA_TYPE_ITEM17";
    public static String EXTRA_QUANTITY_ITEM17 = "com.example.app1.EXTRA_QUANTITY_ITEM17";
    //setup items18
    public static String EXTRA_TOTAL_ITEM18 = "com.example.app1.EXTRA_TOTAL_ITEM18";
    public static String EXTRA_TYPE_ITEM18 = "com.example.app1.EXTRA_TYPE_ITEM18";
    public static String EXTRA_QUANTITY_ITEM18 = "com.example.app1.EXTRA_QUANTITY_ITEM18";
    //end setup items chiken
    //start setup items burger
    //setup item1
    public static String EXTRA_TOTAL_ITEM_B_1 = "com.example.app1.EXTRA_TOTAL_ITEM_B_1";
    public static String EXTRA_TYPE_ITEM_B_1 = "com.example.app1.EXTRA_TYPE_ITEM_B_1";
    public static String EXTRA_QUANTITY_ITEM_B_1 = "com.example.app1.EXTRA_QUANTITY_ITEM_B_1";
    //setup items2
    public static String EXTRA_TOTAL_ITEM_B_2 = "com.example.app1.EXTRA_TOTAL_ITEM_B_2";
    public static String EXTRA_TYPE_ITEM_B_2 = "com.example.app1.EXTRA_TYPE_ITEM_B_2";
    public static String EXTRA_QUANTITY_ITEM_B_2 = "com.example.app1.EXTRA_QUANTITY_ITEM_B_2";
    //setup items3
    public static String EXTRA_TOTAL_ITEM_B_3 = "com.example.app1.EXTRA_TOTAL_ITEM_B_3";
    public static String EXTRA_TYPE_ITEM_B_3 = "com.example.app1.EXTRA_TYPE_ITEM_B_3";
    public static String EXTRA_QUANTITY_ITEM_B_3 = "com.example.app1.EXTRA_QUANTITY_ITEM_B_3";
    //setup items4
    public static String EXTRA_TOTAL_ITEM_B_4 = "com.example.app1.EXTRA_TOTAL_ITEM_B_4";
    public static String EXTRA_TYPE_ITEM_B_4 = "com.example.app1.EXTRA_TYPE_ITEM_B_4";
    public static String EXTRA_QUANTITY_ITEM_B_4 = "com.example.app1.EXTRA_QUANTITY_ITEM_B_4";
    //setup items5
    public static String EXTRA_TOTAL_ITEM_B_5 = "com.example.app1.EXTRA_TOTAL_ITEM_B_5";
    public static String EXTRA_TYPE_ITEM_B_5 = "com.example.app1.EXTRA_TYPE_ITEM_B_5";
    public static String EXTRA_QUANTITY_ITEM_B_5 = "com.example.app1.EXTRA_QUANTITY_ITEM_B_5";
    //setup items6
    public static String EXTRA_TOTAL_ITEM_B_6 = "com.example.app1.EXTRA_TOTAL_ITEM_B_6";
    public static String EXTRA_TYPE_ITEM_B_6 = "com.example.app1.EXTRA_TYPE_ITEM_B_6";
    public static String EXTRA_QUANTITY_ITEM_B_6 = "com.example.app1.EXTRA_QUANTITY_ITEM_B_6";
    //setup items7
    public static String EXTRA_TOTAL_ITEM_B_7 = "com.example.app1.EXTRA_TOTAL_ITEM_B_7";
    public static String EXTRA_TYPE_ITEM_B_7 = "com.example.app1.EXTRA_TYPE_ITEM_B_7";
    public static String EXTRA_QUANTITY_ITEM_B_7 = "com.example.app1.EXTRA_QUANTITY_ITEM_B_7";
    //setup items8
    public static String EXTRA_TOTAL_ITEM_B_8 = "com.example.app1.EXTRA_TOTAL_ITEM_B_8";
    public static String EXTRA_TYPE_ITEM_B_8 = "com.example.app1.EXTRA_TYPE_ITEM_B_8";
    public static String EXTRA_QUANTITY_ITEM_B_8 = "com.example.app1.EXTRA_QUANTITY_ITEM_B_8";
    //setup items9
    public static String EXTRA_TOTAL_ITEM_B_9 = "com.example.app1.EXTRA_TOTAL_ITEM_B_9";
    public static String EXTRA_TYPE_ITEM_B_9 = "com.example.app1.EXTRA_TYPE_ITEM_B_9";
    public static String EXTRA_QUANTITY_ITEM_B_9 = "com.example.app1.EXTRA_QUANTITY_ITEM_B_9";
    //setup items10
    public static String EXTRA_TOTAL_ITEM_B_10 = "com.example.app1.EXTRA_TOTAL_ITEM_B_10";
    public static String EXTRA_TYPE_ITEM_B_10 = "com.example.app1.EXTRA_TYPE_ITEM_B_10";
    public static String EXTRA_QUANTITY_ITEM_B_10 = "com.example.app1.EXTRA_QUANTITY_ITEM_B_10";
    //setup items11
    public static String EXTRA_TOTAL_ITEM_B_11 = "com.example.app1.EXTRA_TOTAL_ITEM_B_11";
    public static String EXTRA_TYPE_ITEM_B_11 = "com.example.app1.EXTRA_TYPE_ITEM_B_11";
    public static String EXTRA_QUANTITY_ITEM_B_11 = "com.example.app1.EXTRA_QUANTITY_ITEM_B_11";
    //setup items12
    public static String EXTRA_TOTAL_ITEM_B_12 = "com.example.app1.EXTRA_TOTAL_ITEM_B_12";
    public static String EXTRA_TYPE_ITEM_B_12 = "com.example.app1.EXTRA_TYPE_ITEM_B_12";
    public static String EXTRA_QUANTITY_ITEM_B_12 = "com.example.app1.EXTRA_QUANTITY_ITEM_B_12";




    String name, phone;


   //srting items1
     String item1_total,item1_type,item1_quantity;

    //srting items2
    String item2_total,item2_type,item2_quantity;

    //srting items3
    String item3_total,item3_type,item3_quantity;

    //srting items4
    String item4_total,item4_type,item4_quantity;

    //srting items5
    String item5_total,item5_type,item5_quantity;

    //srting items6
    String item6_total,item6_type,item6_quantity;

    //srting items7
    String item7_total,item7_type,item7_quantity;

    //srting items8
    String item8_total,item8_type,item8_quantity;

    //srting items9
    String item9_total,item9_type,item9_quantity;

    //srting items10
    String item10_total,item10_type,item10_quantity;

    //srting items11
    String item11_total,item11_type,item11_quantity;

    //srting items12
    String item12_total,item12_type,item12_quantity;

    //srting items13
    String item13_total,item13_type,item13_quantity;

    //srting items14
    String item14_total,item14_type,item14_quantity;

    //srting items15
    String item15_total,item15_type,item15_quantity;

    //srting items16
    String item16_total,item16_type,item16_quantity;

    //srting items17
    String item17_total,item17_type,item17_quantity;

    //srting items18
    String item18_total,item18_type,item18_quantity;
    //end items chiken
    //start items burger
    //srting items1
    String item_B_1_total,item_B_1_type,item_B_1_quantity;

    //srting items2
    String item_B_2_total,item_B_2_type,item_B_2_quantity;

    //srting items3
    String item_B_3_total,item_B_3_type,item_B_3_quantity;

    //srting items4
    String item_B_4_total,item_B_4_type,item_B_4_quantity;

    //srting items5
    String item_B_5_total,item_B_5_type,item_B_5_quantity;

    //srting items6
    String item_B_6_total,item_B_6_type,item_B_6_quantity;

    //srting items7
    String item_B_7_total,item_B_7_type,item_B_7_quantity;

    //srting items8
    String item_B_8_total,item_B_8_type,item_B_8_quantity;

    //srting items9
    String item_B_9_total,item_B_9_type,item_B_9_quantity;

    //srting items10
    String item_B_10_total,item_B_10_type,item_B_10_quantity;

    //srting items11
    String item_B_11_total,item_B_11_type,item_B_11_quantity;

    //srting items12
    String item_B_12_total,item_B_12_type,item_B_12_quantity;
    //end items burger




    /*********************************************************************************************************************************************************************/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);







        scrollToChiken();
        scrollToBurger();



        Intent intent = getIntent();
        name = intent.getStringExtra(EXTRA_NAME);
        phone = intent.getStringExtra(EXTRA_PHONE);


        item1();
        item2();
        item3();
        item4();
        item5();

        item6();
        item7();
        item8();
        item9();
        item10();
        item11();
        item12();
        item13();
        item14();
        item15();
        item16();
        item17();
        item18();
        //end items chiken
        //start items burger
        item_B_1();
        item_B_2();
        item_B_3();
        item_B_4();
        item_B_5();
        item_B_6();
        item_B_7();
        item_B_8();
        item_B_9();
        item_B_10();
        item_B_11();
        item_B_12();
        //end items burger

        send();

    }




    //------------------------------------------start chiken--------------------------------------------------------------------//
    /******************************************************************************** start item one ************************************************************************/

    public void item1() {
        final TextView quantity, total,type;
        final Button increment, decrement, add;
        //setup first item
        type = findViewById(R.id.item1_r1_c1);
        final String Type = type.getText().toString();

        total = findViewById(R.id.item1_total);
        final String[] Total = new String[1];
        add = findViewById(R.id.item1_add);
        increment = findViewById(R.id.item1_increment);
        decrement = findViewById(R.id.item1_decrement);
        quantity = findViewById(R.id.item1_quantity);

        final int[] Quantity = {0};
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantity[0] = Quantity[0] + 1;
                quantity.setText(String.valueOf(Quantity[0]));

                total.setText(String.valueOf(Quantity[0] * 5));
                Total[0] = total.getText().toString();


            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Quantity[0] > 0) {
                    Quantity[0] = Quantity[0] - 1;
                    quantity.setText(String.valueOf(Quantity[0]));
                    total.setText(String.valueOf(Quantity[0] * 5));

                    Total[0] = total.getText().toString();


                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                item1_type = Type;
                item1_total = Total[0];
                item1_quantity = String.valueOf( Quantity[0]);
            }
        });
    }
    /******************************************************************************** start item two ************************************************************************/

    public void item2() {
        final TextView quantity, total,type;
        final Button increment, decrement, add;
        //setup first item
        type = findViewById(R.id.item2_r1_c1);
        final String Type = type.getText().toString();

        total = findViewById(R.id.item2_total);
        final String[] Total = new String[1];
        add = findViewById(R.id.item2_add);
        increment = findViewById(R.id.item2_increment);
        decrement = findViewById(R.id.item2_decrement);
        quantity = findViewById(R.id.item2_quantity);

        final int[] Quantity = {0};
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantity[0] = Quantity[0] + 1;
                quantity.setText(String.valueOf(Quantity[0]));

                total.setText(String.valueOf(Quantity[0] * 5));
                Total[0] = total.getText().toString();


            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Quantity[0] > 0) {
                    Quantity[0] = Quantity[0] - 1;
                    quantity.setText(String.valueOf(Quantity[0]));
                    total.setText(String.valueOf(Quantity[0] * 5));

                    Total[0] = total.getText().toString();


                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                item2_type = Type;
                item2_total = Total[0];
                item2_quantity = String.valueOf( Quantity[0]);
            }
        });
    }

    /******************************************************************************** start item three ************************************************************************/

    public void item3() {
        final TextView quantity, total,type;
        final Button increment, decrement, add;
        //setup first item
        type = findViewById(R.id.item3_r1_c1);
        final String Type = type.getText().toString();

        total = findViewById(R.id.item3_total);
        final String[] Total = new String[1];
        add = findViewById(R.id.item3_add);
        increment = findViewById(R.id.item3_increment);
        decrement = findViewById(R.id.item3_decrement);
        quantity = findViewById(R.id.item3_quantity);

        final int[] Quantity = {0};
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantity[0] = Quantity[0] + 1;
                quantity.setText(String.valueOf(Quantity[0]));

                total.setText(String.valueOf(Quantity[0] * 5));
                Total[0] = total.getText().toString();


            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Quantity[0] > 0) {
                    Quantity[0] = Quantity[0] - 1;
                    quantity.setText(String.valueOf(Quantity[0]));
                    total.setText(String.valueOf(Quantity[0] * 5));

                    Total[0] = total.getText().toString();


                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                item3_type = Type;
                item3_total = Total[0];
                item3_quantity = String.valueOf( Quantity[0]);
            }
        });
    }
    /******************************************************************************** start item four ************************************************************************/

    public void item4() {
        final TextView quantity, total,type;
        final Button increment, decrement, add;
        //setup first item
        type = findViewById(R.id.item4_r1_c1);
        final String Type = type.getText().toString();

        total = findViewById(R.id.item4_total);
        final String[] Total = new String[1];
        add = findViewById(R.id.item4_add);
        increment = findViewById(R.id.item4_increment);
        decrement = findViewById(R.id.item4_decrement);
        quantity = findViewById(R.id.item4_quantity);

        final int[] Quantity = {0};
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantity[0] = Quantity[0] + 1;
                quantity.setText(String.valueOf(Quantity[0]));

                total.setText(String.valueOf(Quantity[0] * 5));
                Total[0] = total.getText().toString();


            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Quantity[0] > 0) {
                    Quantity[0] = Quantity[0] - 1;
                    quantity.setText(String.valueOf(Quantity[0]));
                    total.setText(String.valueOf(Quantity[0] * 5));

                    Total[0] = total.getText().toString();


                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                item4_type = Type;
                item4_total = Total[0];
                item4_quantity = String.valueOf( Quantity[0]);
            }
        });
    }
    /******************************************************************************** start item five ************************************************************************/

    public void item5() {
        final TextView quantity, total,type;
        final Button increment, decrement,add;
        //setup first item
        type = findViewById(R.id.item5_r1_c1);
        final String Type = type.getText().toString();

        total = findViewById(R.id.item5_total);
        final String[] Total = new String[1];
        add = findViewById(R.id.item5_add);
        increment = findViewById(R.id.item5_increment);
        decrement = findViewById(R.id.item5_decrement);
        quantity = findViewById(R.id.item5_quantity);

        final int[] Quantity = {0};
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantity[0] = Quantity[0] + 1;
                quantity.setText(String.valueOf(Quantity[0]));

                total.setText(String.valueOf(Quantity[0] * 5));
                Total[0] = total.getText().toString();


            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Quantity[0] > 0) {
                    Quantity[0] = Quantity[0] - 1;
                    quantity.setText(String.valueOf(Quantity[0]));
                    total.setText(String.valueOf(Quantity[0] * 5));

                    Total[0] = total.getText().toString();


                }
            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                item5_type = Type;
                item5_total = Total[0];
                item5_quantity = String.valueOf( Quantity[0]);



            }
        });
    }
    /******************************************************************************** start item 6 ************************************************************************/

    public void item6() {
        final TextView quantity, total,type;
        final Button increment, decrement, add;
        //setup first item
        type = findViewById(R.id.item6_r1_c1);
        final String Type = type.getText().toString();

        total = findViewById(R.id.item6_total);
        final String[] Total = new String[1];
        add = findViewById(R.id.item6_add);
        increment = findViewById(R.id.item6_increment);
        decrement = findViewById(R.id.item6_decrement);
        quantity = findViewById(R.id.item6_quantity);

        final int[] Quantity = {0};
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantity[0] = Quantity[0] + 1;
                quantity.setText(String.valueOf(Quantity[0]));

                total.setText(String.valueOf(Quantity[0] * 5));
                Total[0] = total.getText().toString();


            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Quantity[0] > 0) {
                    Quantity[0] = Quantity[0] - 1;
                    quantity.setText(String.valueOf(Quantity[0]));
                    total.setText(String.valueOf(Quantity[0] * 5));

                    Total[0] = total.getText().toString();


                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                item6_type = Type;
                item6_total = Total[0];
                item6_quantity = String.valueOf( Quantity[0]);
            }
        });
    }
    /******************************************************************************** start item 7 ************************************************************************/

    public void item7() {
        final TextView quantity, total,type;
        final Button increment, decrement, add;
        //setup first item
        type = findViewById(R.id.item7_r1_c1);
        final String Type = type.getText().toString();

        total = findViewById(R.id.item7_total);
        final String[] Total = new String[1];
        add = findViewById(R.id.item7_add);
        increment = findViewById(R.id.item7_increment);
        decrement = findViewById(R.id.item7_decrement);
        quantity = findViewById(R.id.item7_quantity);

        final int[] Quantity = {0};
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantity[0] = Quantity[0] + 1;
                quantity.setText(String.valueOf(Quantity[0]));

                total.setText(String.valueOf(Quantity[0] * 5));
                Total[0] = total.getText().toString();


            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Quantity[0] > 0) {
                    Quantity[0] = Quantity[0] - 1;
                    quantity.setText(String.valueOf(Quantity[0]));
                    total.setText(String.valueOf(Quantity[0] * 5));

                    Total[0] = total.getText().toString();


                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                item7_type = Type;
                item7_total = Total[0];
                item7_quantity = String.valueOf( Quantity[0]);
            }
        });
    }

    /******************************************************************************** start item 8 ************************************************************************/

    public void item8() {
        final TextView quantity, total,type;
        final Button increment, decrement, add;
        //setup first item
        type = findViewById(R.id.item8_r1_c1);
        final String Type = type.getText().toString();

        total = findViewById(R.id.item8_total);
        final String[] Total = new String[1];
        add = findViewById(R.id.item8_add);
        increment = findViewById(R.id.item8_increment);
        decrement = findViewById(R.id.item8_decrement);
        quantity = findViewById(R.id.item8_quantity);

        final int[] Quantity = {0};
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantity[0] = Quantity[0] + 1;
                quantity.setText(String.valueOf(Quantity[0]));

                total.setText(String.valueOf(Quantity[0] * 5));
                Total[0] = total.getText().toString();


            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Quantity[0] > 0) {
                    Quantity[0] = Quantity[0] - 1;
                    quantity.setText(String.valueOf(Quantity[0]));
                    total.setText(String.valueOf(Quantity[0] * 5));

                    Total[0] = total.getText().toString();


                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                item8_type = Type;
                item8_total = Total[0];
                item8_quantity = String.valueOf( Quantity[0]);
            }
        });
    }
    /******************************************************************************** start item 9 ************************************************************************/

    public void item9() {
        final TextView quantity, total,type;
        final Button increment, decrement, add;
        //setup first item
        type = findViewById(R.id.item9_r1_c1);
        final String Type = type.getText().toString();

        total = findViewById(R.id.item9_total);
        final String[] Total = new String[1];
        add = findViewById(R.id.item9_add);
        increment = findViewById(R.id.item9_increment);
        decrement = findViewById(R.id.item9_decrement);
        quantity = findViewById(R.id.item9_quantity);

        final int[] Quantity = {0};
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantity[0] = Quantity[0] + 1;
                quantity.setText(String.valueOf(Quantity[0]));

                total.setText(String.valueOf(Quantity[0] * 5));
                Total[0] = total.getText().toString();


            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Quantity[0] > 0) {
                    Quantity[0] = Quantity[0] - 1;
                    quantity.setText(String.valueOf(Quantity[0]));
                    total.setText(String.valueOf(Quantity[0] * 5));

                    Total[0] = total.getText().toString();


                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                item9_type = Type;
                item9_total = Total[0];
                item9_quantity = String.valueOf( Quantity[0]);
            }
        });
    }
    /******************************************************************************** start item 10 ************************************************************************/

    public void item10() {
        final TextView quantity, total,type;
        final Button increment, decrement,add;
        //setup first item
        type = findViewById(R.id.item10_r1_c1);
        final String Type = type.getText().toString();

        total = findViewById(R.id.item10_total);
        final String[] Total = new String[1];
        add = findViewById(R.id.item10_add);
        increment = findViewById(R.id.item10_increment);
        decrement = findViewById(R.id.item10_decrement);
        quantity = findViewById(R.id.item10_quantity);

        final int[] Quantity = {0};
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantity[0] = Quantity[0] + 1;
                quantity.setText(String.valueOf(Quantity[0]));

                total.setText(String.valueOf(Quantity[0] * 5));
                Total[0] = total.getText().toString();


            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Quantity[0] > 0) {
                    Quantity[0] = Quantity[0] - 1;
                    quantity.setText(String.valueOf(Quantity[0]));
                    total.setText(String.valueOf(Quantity[0] * 5));

                    Total[0] = total.getText().toString();


                }
            }
        });



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                item10_type = Type;
                item10_total = Total[0];
                item10_quantity = String.valueOf( Quantity[0]);



            }
        });
    }
    /******************************************************************************** start item one ************************************************************************/

    public void item11() {
        final TextView quantity, total,type;
        final Button increment, decrement, add;
        //setup first item
        type = findViewById(R.id.item11_r1_c1);
        final String Type = type.getText().toString();

        total = findViewById(R.id.item11_total);
        final String[] Total = new String[1];
        add = findViewById(R.id.item11_add);
        increment = findViewById(R.id.item11_increment);
        decrement = findViewById(R.id.item11_decrement);
        quantity = findViewById(R.id.item11_quantity);

        final int[] Quantity = {0};
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantity[0] = Quantity[0] + 1;
                quantity.setText(String.valueOf(Quantity[0]));

                total.setText(String.valueOf(Quantity[0] * 5));
                Total[0] = total.getText().toString();


            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Quantity[0] > 0) {
                    Quantity[0] = Quantity[0] - 1;
                    quantity.setText(String.valueOf(Quantity[0]));
                    total.setText(String.valueOf(Quantity[0] * 5));

                    Total[0] = total.getText().toString();


                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                item11_type = Type;
                item11_total = Total[0];
                item11_quantity = String.valueOf( Quantity[0]);
            }
        });
    }
    /******************************************************************************** start item 12 ************************************************************************/

    public void item12() {
        final TextView quantity, total,type;
        final Button increment, decrement, add;
        //setup first item
        type = findViewById(R.id.item12_r1_c1);
        final String Type = type.getText().toString();

        total = findViewById(R.id.item12_total);
        final String[] Total = new String[1];
        add = findViewById(R.id.item12_add);
        increment = findViewById(R.id.item12_increment);
        decrement = findViewById(R.id.item12_decrement);
        quantity = findViewById(R.id.item12_quantity);

        final int[] Quantity = {0};
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantity[0] = Quantity[0] + 1;
                quantity.setText(String.valueOf(Quantity[0]));

                total.setText(String.valueOf(Quantity[0] * 5));
                Total[0] = total.getText().toString();


            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Quantity[0] > 0) {
                    Quantity[0] = Quantity[0] - 1;
                    quantity.setText(String.valueOf(Quantity[0]));
                    total.setText(String.valueOf(Quantity[0] * 5));

                    Total[0] = total.getText().toString();


                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                item12_type = Type;
                item12_total = Total[0];
                item12_quantity = String.valueOf( Quantity[0]);
            }
        });
    }

    /******************************************************************************** start item three ************************************************************************/

    public void item13() {
        final TextView quantity, total,type;
        final Button increment, decrement, add;
        //setup first item
        type = findViewById(R.id.item13_r1_c1);
        final String Type = type.getText().toString();

        total = findViewById(R.id.item13_total);
        final String[] Total = new String[1];
        add = findViewById(R.id.item13_add);
        increment = findViewById(R.id.item13_increment);
        decrement = findViewById(R.id.item13_decrement);
        quantity = findViewById(R.id.item13_quantity);

        final int[] Quantity = {0};
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantity[0] = Quantity[0] + 1;
                quantity.setText(String.valueOf(Quantity[0]));

                total.setText(String.valueOf(Quantity[0] * 5));
                Total[0] = total.getText().toString();


            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Quantity[0] > 0) {
                    Quantity[0] = Quantity[0] - 1;
                    quantity.setText(String.valueOf(Quantity[0]));
                    total.setText(String.valueOf(Quantity[0] * 5));

                    Total[0] = total.getText().toString();


                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                item13_type = Type;
                item13_total = Total[0];
                item13_quantity = String.valueOf( Quantity[0]);
            }
        });
    }
    /******************************************************************************** start item four ************************************************************************/

    public void item14() {
        final TextView quantity, total,type;
        final Button increment, decrement, add;
        //setup first item
        type = findViewById(R.id.item14_r1_c1);
        final String Type = type.getText().toString();

        total = findViewById(R.id.item14_total);
        final String[] Total = new String[1];
        add = findViewById(R.id.item14_add);
        increment = findViewById(R.id.item14_increment);
        decrement = findViewById(R.id.item14_decrement);
        quantity = findViewById(R.id.item14_quantity);

        final int[] Quantity = {0};
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantity[0] = Quantity[0] + 1;
                quantity.setText(String.valueOf(Quantity[0]));

                total.setText(String.valueOf(Quantity[0] * 5));
                Total[0] = total.getText().toString();


            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Quantity[0] > 0) {
                    Quantity[0] = Quantity[0] - 1;
                    quantity.setText(String.valueOf(Quantity[0]));
                    total.setText(String.valueOf(Quantity[0] * 5));

                    Total[0] = total.getText().toString();


                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                item14_type = Type;
                item14_total = Total[0];
                item14_quantity = String.valueOf( Quantity[0]);
            }
        });
    }
    /******************************************************************************** start item five ************************************************************************/

    public void item15() {
        final TextView quantity, total,type;
        final Button increment, decrement,add;
        //setup first item
        type = findViewById(R.id.item15_r1_c1);
        final String Type = type.getText().toString();

        total = findViewById(R.id.item15_total);
        final String[] Total = new String[1];
        add = findViewById(R.id.item15_add);
        increment = findViewById(R.id.item15_increment);
        decrement = findViewById(R.id.item15_decrement);
        quantity = findViewById(R.id.item15_quantity);

        final int[] Quantity = {0};
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantity[0] = Quantity[0] + 1;
                quantity.setText(String.valueOf(Quantity[0]));

                total.setText(String.valueOf(Quantity[0] * 5));
                Total[0] = total.getText().toString();


            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Quantity[0] > 0) {
                    Quantity[0] = Quantity[0] - 1;
                    quantity.setText(String.valueOf(Quantity[0]));
                    total.setText(String.valueOf(Quantity[0] * 5));

                    Total[0] = total.getText().toString();


                }
            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                item15_type = Type;
                item15_total = Total[0];
                item15_quantity = String.valueOf( Quantity[0]);



            }
        });
    }
    /******************************************************************************** start item 6 ************************************************************************/

    public void item16() {
        final TextView quantity, total,type;
        final Button increment, decrement, add;
        //setup first item
        type = findViewById(R.id.item16_r1_c1);
        final String Type = type.getText().toString();

        total = findViewById(R.id.item16_total);
        final String[] Total = new String[1];
        add = findViewById(R.id.item16_add);
        increment = findViewById(R.id.item16_increment);
        decrement = findViewById(R.id.item16_decrement);
        quantity = findViewById(R.id.item16_quantity);

        final int[] Quantity = {0};
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantity[0] = Quantity[0] + 1;
                quantity.setText(String.valueOf(Quantity[0]));

                total.setText(String.valueOf(Quantity[0] * 5));
                Total[0] = total.getText().toString();


            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Quantity[0] > 0) {
                    Quantity[0] = Quantity[0] - 1;
                    quantity.setText(String.valueOf(Quantity[0]));
                    total.setText(String.valueOf(Quantity[0] * 5));

                    Total[0] = total.getText().toString();


                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                item16_type = Type;
                item16_total = Total[0];
                item16_quantity = String.valueOf( Quantity[0]);
            }
        });
    }
    /******************************************************************************** start item 7 ************************************************************************/

    public void item17() {
        final TextView quantity, total,type;
        final Button increment, decrement, add;
        //setup first item
        type = findViewById(R.id.item17_r1_c1);
        final String Type = type.getText().toString();

        total = findViewById(R.id.item17_total);
        final String[] Total = new String[1];
        add = findViewById(R.id.item17_add);
        increment = findViewById(R.id.item17_increment);
        decrement = findViewById(R.id.item17_decrement);
        quantity = findViewById(R.id.item17_quantity);

        final int[] Quantity = {0};
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantity[0] = Quantity[0] + 1;
                quantity.setText(String.valueOf(Quantity[0]));

                total.setText(String.valueOf(Quantity[0] * 5));
                Total[0] = total.getText().toString();


            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Quantity[0] > 0) {
                    Quantity[0] = Quantity[0] - 1;
                    quantity.setText(String.valueOf(Quantity[0]));
                    total.setText(String.valueOf(Quantity[0] * 5));

                    Total[0] = total.getText().toString();


                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                item17_type = Type;
                item17_total = Total[0];
                item17_quantity = String.valueOf( Quantity[0]);
            }
        });
    }

    /******************************************************************************** start item 8 ************************************************************************/

    public void item18() {
        final TextView quantity, total,type;
        final Button increment, decrement, add;
        //setup first item
        type = findViewById(R.id.item18_r1_c1);
        final String Type = type.getText().toString();

        total = findViewById(R.id.item18_total);
        final String[] Total = new String[1];
        add = findViewById(R.id.item18_add);
        increment = findViewById(R.id.item18_increment);
        decrement = findViewById(R.id.item18_decrement);
        quantity = findViewById(R.id.item18_quantity);

        final int[] Quantity = {0};
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantity[0] = Quantity[0] + 1;
                quantity.setText(String.valueOf(Quantity[0]));

                total.setText(String.valueOf(Quantity[0] * 5));
                Total[0] = total.getText().toString();


            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Quantity[0] > 0) {
                    Quantity[0] = Quantity[0] - 1;
                    quantity.setText(String.valueOf(Quantity[0]));
                    total.setText(String.valueOf(Quantity[0] * 5));

                    Total[0] = total.getText().toString();


                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                item18_type = Type;
                item18_total = Total[0];
                item18_quantity = String.valueOf( Quantity[0]);
            }
        });
    }


    //------------------------------------------start burger--------------------------------------------------------------------//
    /******************************************************************************** start item one ************************************************************************/

    public void item_B_1() {
        final TextView quantity, total,type;
        final Button increment, decrement, add;
        //setup first item
        type = findViewById(R.id.item_B_1_r1_c1);
        final String Type = type.getText().toString();

        total = findViewById(R.id.item_B_1_total);
        final String[] Total = new String[1];
        add = findViewById(R.id.item_B_1_add);
        increment = findViewById(R.id.item_B_1_increment);
        decrement = findViewById(R.id.item_B_1_decrement);
        quantity = findViewById(R.id.item_B_1_quantity);

        final int[] Quantity = {0};
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantity[0] = Quantity[0] + 1;
                quantity.setText(String.valueOf(Quantity[0]));

                total.setText(String.valueOf(Quantity[0] * 5));
                Total[0] = total.getText().toString();


            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Quantity[0] > 0) {
                    Quantity[0] = Quantity[0] - 1;
                    quantity.setText(String.valueOf(Quantity[0]));
                    total.setText(String.valueOf(Quantity[0] * 5));

                    Total[0] = total.getText().toString();


                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                item_B_1_type = Type;
                item_B_1_total = Total[0];
                item_B_1_quantity = String.valueOf( Quantity[0]);
            }
        });
    }
    /******************************************************************************** start item two ************************************************************************/

    public void item_B_2() {
        final TextView quantity, total,type;
        final Button increment, decrement, add;
        //setup first item
        type = findViewById(R.id.item_B_2_r1_c1);
        final String Type = type.getText().toString();

        total = findViewById(R.id.item_B_2_total);
        final String[] Total = new String[1];
        add = findViewById(R.id.item_B_2_add);
        increment = findViewById(R.id.item_B_2_increment);
        decrement = findViewById(R.id.item_B_2_decrement);
        quantity = findViewById(R.id.item_B_2_quantity);

        final int[] Quantity = {0};
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantity[0] = Quantity[0] + 1;
                quantity.setText(String.valueOf(Quantity[0]));

                total.setText(String.valueOf(Quantity[0] * 5));
                Total[0] = total.getText().toString();


            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Quantity[0] > 0) {
                    Quantity[0] = Quantity[0] - 1;
                    quantity.setText(String.valueOf(Quantity[0]));
                    total.setText(String.valueOf(Quantity[0] * 5));

                    Total[0] = total.getText().toString();


                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                item_B_2_type = Type;
                item_B_2_total = Total[0];
                item_B_2_quantity = String.valueOf( Quantity[0]);
            }
        });
    }

    /******************************************************************************** start item three ************************************************************************/

    public void item_B_3() {
        final TextView quantity, total,type;
        final Button increment, decrement, add;
        //setup first item
        type = findViewById(R.id.item_B_3_r1_c1);
        final String Type = type.getText().toString();

        total = findViewById(R.id.item_B_3_total);
        final String[] Total = new String[1];
        add = findViewById(R.id.item_B_3_add);
        increment = findViewById(R.id.item_B_3_increment);
        decrement = findViewById(R.id.item_B_3_decrement);
        quantity = findViewById(R.id.item_B_3_quantity);

        final int[] Quantity = {0};
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantity[0] = Quantity[0] + 1;
                quantity.setText(String.valueOf(Quantity[0]));

                total.setText(String.valueOf(Quantity[0] * 5));
                Total[0] = total.getText().toString();


            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Quantity[0] > 0) {
                    Quantity[0] = Quantity[0] - 1;
                    quantity.setText(String.valueOf(Quantity[0]));
                    total.setText(String.valueOf(Quantity[0] * 5));

                    Total[0] = total.getText().toString();


                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                item_B_3_type = Type;
                item_B_3_total = Total[0];
                item_B_3_quantity = String.valueOf( Quantity[0]);
            }
        });
    }
    /******************************************************************************** start item four ************************************************************************/

    public void item_B_4() {
        final TextView quantity, total,type;
        final Button increment, decrement, add;
        //setup first item
        type = findViewById(R.id.item_B_4_r1_c1);
        final String Type = type.getText().toString();

        total = findViewById(R.id.item_B_4_total);
        final String[] Total = new String[1];
        add = findViewById(R.id.item_B_4_add);
        increment = findViewById(R.id.item_B_4_increment);
        decrement = findViewById(R.id.item_B_4_decrement);
        quantity = findViewById(R.id.item_B_4_quantity);

        final int[] Quantity = {0};
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantity[0] = Quantity[0] + 1;
                quantity.setText(String.valueOf(Quantity[0]));

                total.setText(String.valueOf(Quantity[0] * 5));
                Total[0] = total.getText().toString();


            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Quantity[0] > 0) {
                    Quantity[0] = Quantity[0] - 1;
                    quantity.setText(String.valueOf(Quantity[0]));
                    total.setText(String.valueOf(Quantity[0] * 5));

                    Total[0] = total.getText().toString();


                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                item_B_4_type = Type;
                item_B_4_total = Total[0];
                item_B_4_quantity = String.valueOf( Quantity[0]);
            }
        });
    }
    /******************************************************************************** start item five ************************************************************************/

    public void item_B_5() {
        final TextView quantity, total,type;
        final Button increment, decrement,add;
        //setup first item
        type = findViewById(R.id.item_B_5_r1_c1);
        final String Type = type.getText().toString();

        total = findViewById(R.id.item_B_5_total);
        final String[] Total = new String[1];
        add = findViewById(R.id.item_B_5_add);
        increment = findViewById(R.id.item_B_5_increment);
        decrement = findViewById(R.id.item_B_5_decrement);
        quantity = findViewById(R.id.item_B_5_quantity);

        final int[] Quantity = {0};
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantity[0] = Quantity[0] + 1;
                quantity.setText(String.valueOf(Quantity[0]));

                total.setText(String.valueOf(Quantity[0] * 5));
                Total[0] = total.getText().toString();


            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Quantity[0] > 0) {
                    Quantity[0] = Quantity[0] - 1;
                    quantity.setText(String.valueOf(Quantity[0]));
                    total.setText(String.valueOf(Quantity[0] * 5));

                    Total[0] = total.getText().toString();


                }
            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                item_B_5_type = Type;
                item_B_5_total = Total[0];
                item_B_5_quantity = String.valueOf( Quantity[0]);
            }
        });
    }
    /******************************************************************************** start item 6 ************************************************************************/

    public void item_B_6() {
        final TextView quantity, total,type;
        final Button increment, decrement, add;
        //setup first item
        type = findViewById(R.id.item_B_6_r1_c1);
        final String Type = type.getText().toString();

        total = findViewById(R.id.item_B_6_total);
        final String[] Total = new String[1];
        add = findViewById(R.id.item_B_6_add);
        increment = findViewById(R.id.item_B_6_increment);
        decrement = findViewById(R.id.item_B_6_decrement);
        quantity = findViewById(R.id.item_B_6_quantity);

        final int[] Quantity = {0};
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantity[0] = Quantity[0] + 1;
                quantity.setText(String.valueOf(Quantity[0]));

                total.setText(String.valueOf(Quantity[0] * 5));
                Total[0] = total.getText().toString();


            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Quantity[0] > 0) {
                    Quantity[0] = Quantity[0] - 1;
                    quantity.setText(String.valueOf(Quantity[0]));
                    total.setText(String.valueOf(Quantity[0] * 5));

                    Total[0] = total.getText().toString();


                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                item_B_6_type = Type;
                item_B_6_total = Total[0];
                item_B_6_quantity = String.valueOf( Quantity[0]);
            }
        });
    }
    /******************************************************************************** start item 7 ************************************************************************/

    public void item_B_7() {
        final TextView quantity, total,type;
        final Button increment, decrement, add;
        //setup first item
        type = findViewById(R.id.item_B_7_r1_c1);
        final String Type = type.getText().toString();

        total = findViewById(R.id.item_B_7_total);
        final String[] Total = new String[1];
        add = findViewById(R.id.item_B_7_add);
        increment = findViewById(R.id.item_B_7_increment);
        decrement = findViewById(R.id.item_B_7_decrement);
        quantity = findViewById(R.id.item_B_7_quantity);

        final int[] Quantity = {0};
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantity[0] = Quantity[0] + 1;
                quantity.setText(String.valueOf(Quantity[0]));

                total.setText(String.valueOf(Quantity[0] * 5));
                Total[0] = total.getText().toString();


            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Quantity[0] > 0) {
                    Quantity[0] = Quantity[0] - 1;
                    quantity.setText(String.valueOf(Quantity[0]));
                    total.setText(String.valueOf(Quantity[0] * 5));

                    Total[0] = total.getText().toString();


                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                item_B_7_type = Type;
                item_B_7_total = Total[0];
                item_B_7_quantity = String.valueOf( Quantity[0]);
            }
        });
    }

    /******************************************************************************** start item 8 ************************************************************************/

    public void item_B_8() {
        final TextView quantity, total,type;
        final Button increment, decrement, add;
        //setup first item
        type = findViewById(R.id.item_B_8_r1_c1);
        final String Type = type.getText().toString();

        total = findViewById(R.id.item_B_8_total);
        final String[] Total = new String[1];
        add = findViewById(R.id.item_B_8_add);
        increment = findViewById(R.id.item_B_8_increment);
        decrement = findViewById(R.id.item_B_8_decrement);
        quantity = findViewById(R.id.item_B_8_quantity);

        final int[] Quantity = {0};
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantity[0] = Quantity[0] + 1;
                quantity.setText(String.valueOf(Quantity[0]));

                total.setText(String.valueOf(Quantity[0] * 5));
                Total[0] = total.getText().toString();


            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Quantity[0] > 0) {
                    Quantity[0] = Quantity[0] - 1;
                    quantity.setText(String.valueOf(Quantity[0]));
                    total.setText(String.valueOf(Quantity[0] * 5));

                    Total[0] = total.getText().toString();


                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                item_B_8_type = Type;
                item_B_8_total = Total[0];
                item_B_8_quantity = String.valueOf( Quantity[0]);
            }
        });
    }
    /******************************************************************************** start item 9 ************************************************************************/

    public void item_B_9() {
        final TextView quantity, total,type;
        final Button increment, decrement, add;
        //setup first item
        type = findViewById(R.id.item_B_9_r1_c1);
        final String Type = type.getText().toString();

        total = findViewById(R.id.item_B_9_total);
        final String[] Total = new String[1];
        add = findViewById(R.id.item_B_9_add);
        increment = findViewById(R.id.item_B_9_increment);
        decrement = findViewById(R.id.item_B_9_decrement);
        quantity = findViewById(R.id.item_B_9_quantity);

        final int[] Quantity = {0};
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantity[0] = Quantity[0] + 1;
                quantity.setText(String.valueOf(Quantity[0]));

                total.setText(String.valueOf(Quantity[0] * 5));
                Total[0] = total.getText().toString();


            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Quantity[0] > 0) {
                    Quantity[0] = Quantity[0] - 1;
                    quantity.setText(String.valueOf(Quantity[0]));
                    total.setText(String.valueOf(Quantity[0] * 5));

                    Total[0] = total.getText().toString();


                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                item_B_9_type = Type;
                item_B_9_total = Total[0];
                item_B_9_quantity = String.valueOf( Quantity[0]);
            }
        });
    }
    /******************************************************************************** start item 10 ************************************************************************/

    public void item_B_10() {
        final TextView quantity, total,type;
        final Button increment, decrement,add;
        //setup first item
        type = findViewById(R.id.item_B_10_r1_c1);
        final String Type = type.getText().toString();

        total = findViewById(R.id.item_B_10_total);
        final String[] Total = new String[1];
        add = findViewById(R.id.item_B_10_add);
        increment = findViewById(R.id.item_B_10_increment);
        decrement = findViewById(R.id.item_B_10_decrement);
        quantity = findViewById(R.id.item_B_10_quantity);

        final int[] Quantity = {0};
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantity[0] = Quantity[0] + 1;
                quantity.setText(String.valueOf(Quantity[0]));

                total.setText(String.valueOf(Quantity[0] * 5));
                Total[0] = total.getText().toString();


            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Quantity[0] > 0) {
                    Quantity[0] = Quantity[0] - 1;
                    quantity.setText(String.valueOf(Quantity[0]));
                    total.setText(String.valueOf(Quantity[0] * 5));

                    Total[0] = total.getText().toString();


                }
            }
        });



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                item_B_10_type = Type;
                item_B_10_total = Total[0];
                item_B_10_quantity = String.valueOf( Quantity[0]);



            }
        });
    }
    /******************************************************************************** start item one ************************************************************************/

    public void item_B_11() {
        final TextView quantity, total,type;
        final Button increment, decrement, add;
        //setup first item
        type = findViewById(R.id.item_B_11_r1_c1);
        final String Type = type.getText().toString();

        total = findViewById(R.id.item_B_11_total);
        final String[] Total = new String[1];
        add = findViewById(R.id.item_B_11_add);
        increment = findViewById(R.id.item_B_11_increment);
        decrement = findViewById(R.id.item_B_11_decrement);
        quantity = findViewById(R.id.item_B_11_quantity);

        final int[] Quantity = {0};
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantity[0] = Quantity[0] + 1;
                quantity.setText(String.valueOf(Quantity[0]));

                total.setText(String.valueOf(Quantity[0] * 5));
                Total[0] = total.getText().toString();


            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Quantity[0] > 0) {
                    Quantity[0] = Quantity[0] - 1;
                    quantity.setText(String.valueOf(Quantity[0]));
                    total.setText(String.valueOf(Quantity[0] * 5));

                    Total[0] = total.getText().toString();


                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                item_B_11_type = Type;
                item_B_11_total = Total[0];
                item_B_11_quantity = String.valueOf( Quantity[0]);
            }
        });
    }
    /******************************************************************************** start item 12 ************************************************************************/

    public void item_B_12() {
        final TextView quantity, total,type;
        final Button increment, decrement, add;
        //setup first item
        type = findViewById(R.id.item_B_12_r1_c1);
        final String Type = type.getText().toString();

        total = findViewById(R.id.item_B_12_total);
        final String[] Total = new String[1];
        add = findViewById(R.id.item_B_12_add);
        increment = findViewById(R.id.item_B_12_increment);
        decrement = findViewById(R.id.item_B_12_decrement);
        quantity = findViewById(R.id.item_B_12_quantity);

        final int[] Quantity = {0};
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quantity[0] = Quantity[0] + 1;
                quantity.setText(String.valueOf(Quantity[0]));

                total.setText(String.valueOf(Quantity[0] * 5));
                Total[0] = total.getText().toString();


            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Quantity[0] > 0) {
                    Quantity[0] = Quantity[0] - 1;
                    quantity.setText(String.valueOf(Quantity[0]));
                    total.setText(String.valueOf(Quantity[0] * 5));

                    Total[0] = total.getText().toString();


                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                item_B_12_type = Type;
                item_B_12_total = Total[0];
                item_B_12_quantity = String.valueOf( Quantity[0]);
            }
        });
    }



    /*****************************************************************************************************************************************************************************/
public void send(){
        ImageView  send;
        send = findViewById(R.id.backage);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menuActivity.this,packageOrderActivity.class);
                intent.putExtra(EXTRA_NAME,name);
                intent.putExtra(EXTRA_PHONE,phone);
                //setup item1
                intent.putExtra(EXTRA_TYPE_ITEM1,item1_type);
                intent.putExtra(EXTRA_TOTAL_ITEM1,item1_total);
                intent.putExtra(EXTRA_QUANTITY_ITEM1,item1_quantity);
                //setup item2

                intent.putExtra(EXTRA_TYPE_ITEM2,item2_type);
                intent.putExtra(EXTRA_TOTAL_ITEM2,item2_total);
                intent.putExtra(EXTRA_QUANTITY_ITEM2,item2_quantity);
                //setup item3
                intent.putExtra(EXTRA_TYPE_ITEM3,item3_type);
                intent.putExtra(EXTRA_TOTAL_ITEM3,item3_total);
                intent.putExtra(EXTRA_QUANTITY_ITEM3,item3_quantity);
                //setup item4
                intent.putExtra(EXTRA_TYPE_ITEM4,item4_type);
                intent.putExtra(EXTRA_TOTAL_ITEM4,item4_total);
                intent.putExtra(EXTRA_QUANTITY_ITEM4,item4_quantity);
                //setup item5
                    intent.putExtra(EXTRA_TYPE_ITEM5,item5_type);
                    intent.putExtra(EXTRA_TOTAL_ITEM5,item5_total);
                    intent.putExtra(EXTRA_QUANTITY_ITEM5,item5_quantity);
                //setup item6
                intent.putExtra(EXTRA_TYPE_ITEM6,item6_type);
                intent.putExtra(EXTRA_TOTAL_ITEM6,item6_total);
                intent.putExtra(EXTRA_QUANTITY_ITEM6,item6_quantity);
                //setup item7
                intent.putExtra(EXTRA_TYPE_ITEM7,item7_type);
                intent.putExtra(EXTRA_TOTAL_ITEM7,item7_total);
                intent.putExtra(EXTRA_QUANTITY_ITEM7,item7_quantity);
                //setup item8
                intent.putExtra(EXTRA_TYPE_ITEM8,item8_type);
                intent.putExtra(EXTRA_TOTAL_ITEM8,item8_total);
                intent.putExtra(EXTRA_QUANTITY_ITEM8,item8_quantity);
                //setup item9
                intent.putExtra(EXTRA_TYPE_ITEM9,item9_type);
                intent.putExtra(EXTRA_TOTAL_ITEM9,item9_total);
                intent.putExtra(EXTRA_QUANTITY_ITEM9,item9_quantity);
                //setup item10
                intent.putExtra(EXTRA_TYPE_ITEM10,item10_type);
                intent.putExtra(EXTRA_TOTAL_ITEM10,item10_total);
                intent.putExtra(EXTRA_QUANTITY_ITEM10,item10_quantity);
                //setup item11
                intent.putExtra(EXTRA_TYPE_ITEM11,item11_type);
                intent.putExtra(EXTRA_TOTAL_ITEM11,item11_total);
                intent.putExtra(EXTRA_QUANTITY_ITEM11,item11_quantity);
                //setup item12
                intent.putExtra(EXTRA_TYPE_ITEM12,item12_type);
                intent.putExtra(EXTRA_TOTAL_ITEM12,item12_total);
                intent.putExtra(EXTRA_QUANTITY_ITEM12,item12_quantity);
                //setup item13
                intent.putExtra(EXTRA_TYPE_ITEM13,item13_type);
                intent.putExtra(EXTRA_TOTAL_ITEM13,item13_total);
                intent.putExtra(EXTRA_QUANTITY_ITEM13,item13_quantity);
                //setup item14
                intent.putExtra(EXTRA_TYPE_ITEM14,item14_type);
                intent.putExtra(EXTRA_TOTAL_ITEM14,item14_total);
                intent.putExtra(EXTRA_QUANTITY_ITEM14,item14_quantity);
                //setup item15
                intent.putExtra(EXTRA_TYPE_ITEM15,item15_type);
                intent.putExtra(EXTRA_TOTAL_ITEM15,item15_total);
                intent.putExtra(EXTRA_QUANTITY_ITEM15,item15_quantity);
                //setup item6
                intent.putExtra(EXTRA_TYPE_ITEM16,item16_type);
                intent.putExtra(EXTRA_TOTAL_ITEM16,item16_total);
                intent.putExtra(EXTRA_QUANTITY_ITEM16,item16_quantity);
                //setup item7
                intent.putExtra(EXTRA_TYPE_ITEM17,item17_type);
                intent.putExtra(EXTRA_TOTAL_ITEM17,item17_total);
                intent.putExtra(EXTRA_QUANTITY_ITEM17,item17_quantity);
                //setup item8
                intent.putExtra(EXTRA_TYPE_ITEM18,item18_type);
                intent.putExtra(EXTRA_TOTAL_ITEM18,item18_total);
                intent.putExtra(EXTRA_QUANTITY_ITEM18,item18_quantity);
               //end items chiken
               // start items burger
                //setup item1
                intent.putExtra(EXTRA_TYPE_ITEM_B_1,item_B_1_type);
                intent.putExtra(EXTRA_TOTAL_ITEM_B_1,item_B_1_total);
                intent.putExtra(EXTRA_QUANTITY_ITEM_B_1,item_B_1_quantity);
                //setup item2

                intent.putExtra(EXTRA_TYPE_ITEM_B_2,item_B_2_type);
                intent.putExtra(EXTRA_TOTAL_ITEM_B_2,item_B_2_total);
                intent.putExtra(EXTRA_QUANTITY_ITEM_B_2,item_B_2_quantity);
                //setup item3
                intent.putExtra(EXTRA_TYPE_ITEM_B_3,item_B_3_type);
                intent.putExtra(EXTRA_TOTAL_ITEM_B_3,item_B_3_total);
                intent.putExtra(EXTRA_QUANTITY_ITEM_B_3,item_B_3_quantity);
                //setup item4
                intent.putExtra(EXTRA_TYPE_ITEM_B_4,item_B_4_type);
                intent.putExtra(EXTRA_TOTAL_ITEM_B_4,item_B_4_total);
                intent.putExtra(EXTRA_QUANTITY_ITEM_B_4,item_B_4_quantity);
                //setup item5
                intent.putExtra(EXTRA_TYPE_ITEM_B_5,item_B_5_type);
                intent.putExtra(EXTRA_TOTAL_ITEM_B_5,item_B_5_total);
                intent.putExtra(EXTRA_QUANTITY_ITEM_B_5,item_B_5_quantity);
                //setup item6
                intent.putExtra(EXTRA_TYPE_ITEM_B_6,item_B_6_type);
                intent.putExtra(EXTRA_TOTAL_ITEM_B_6,item_B_6_total);
                intent.putExtra(EXTRA_QUANTITY_ITEM_B_6,item_B_6_quantity);
                //setup item7
                intent.putExtra(EXTRA_TYPE_ITEM_B_7,item_B_7_type);
                intent.putExtra(EXTRA_TOTAL_ITEM_B_7,item_B_7_total);
                intent.putExtra(EXTRA_QUANTITY_ITEM_B_7,item_B_7_quantity);
                //setup item8
                intent.putExtra(EXTRA_TYPE_ITEM_B_8,item_B_8_type);
                intent.putExtra(EXTRA_TOTAL_ITEM_B_8,item_B_8_total);
                intent.putExtra(EXTRA_QUANTITY_ITEM_B_8,item_B_8_quantity);
                //setup item9
                intent.putExtra(EXTRA_TYPE_ITEM_B_9,item_B_9_type);
                intent.putExtra(EXTRA_TOTAL_ITEM_B_9,item_B_9_total);
                intent.putExtra(EXTRA_QUANTITY_ITEM_B_9,item_B_9_quantity);
                //setup item10
                intent.putExtra(EXTRA_TYPE_ITEM_B_10,item_B_10_type);
                intent.putExtra(EXTRA_TOTAL_ITEM_B_10,item_B_10_total);
                intent.putExtra(EXTRA_QUANTITY_ITEM_B_10,item_B_10_quantity);
                //setup item11
                intent.putExtra(EXTRA_TYPE_ITEM_B_11,item_B_11_type);
                intent.putExtra(EXTRA_TOTAL_ITEM_B_11,item_B_11_total);
                intent.putExtra(EXTRA_QUANTITY_ITEM_B_11,item_B_11_quantity);
                //setup item12
                intent.putExtra(EXTRA_TYPE_ITEM_B_12,item_B_12_type);
                intent.putExtra(EXTRA_TOTAL_ITEM_B_12,item_B_12_total);
                intent.putExtra(EXTRA_QUANTITY_ITEM_B_12,item_B_12_quantity);
                //end items burger
                startActivity(intent);
                overridePendingTransition(R.anim.slide_id_right,R.anim.slide_out_left);



            }
        });


}

public  void scrollToChiken(){

    final RelativeLayout chiken = findViewById(R.id.chikekn);
    Button scrolChiken  = findViewById(R.id.scrolToCheken);
    final ScrollView scrollView = findViewById(R.id.scrollView);

    scrolChiken.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            new Handler().post(new Runnable() {
                @Override
                public void run() {
                   ObjectAnimator.ofInt(scrollView, "scrollY",  chiken.getTop()).setDuration(4000).start();

                }
            });
        }
    });
}
public void scrollToBurger(){
    Button scrollBurger = findViewById(R.id.scrolToBurger);
    final ScrollView scrollView = findViewById(R.id.scrollView);
    final RelativeLayout burger = findViewById(R.id.burger);

    scrollBurger.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            new Handler().post(new Runnable() {
                @Override
                public void run() {
                    ObjectAnimator.ofInt(scrollView, "scrollY",  burger.getTop()).setDuration(4000).start();

                }
            });
        }
    });
}

}