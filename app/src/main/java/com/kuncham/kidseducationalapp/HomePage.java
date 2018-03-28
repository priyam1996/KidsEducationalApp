package com.kuncham.kidseducationalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    Button bt_alpha,bt_bird,bt_colors,bt_bodyparts,bt_nums,bt_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        //getSupportActionBar().hide();

        bt_alpha=(Button)findViewById(R.id.btn_alphabet);
        bt_bird=(Button)findViewById(R.id.btn_birds);
        bt_colors=(Button)findViewById(R.id.btn_colors);
        bt_bodyparts=(Button)findViewById(R.id.btn_body);
        bt_nums=(Button)findViewById(R.id.btn_numbers);
        bt_info=(Button)findViewById(R.id.btn_information);


        bt_alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alphabetIntent=new Intent(HomePage.this,Alphabets.class);
                startActivity(alphabetIntent);
            }
        });
        bt_bird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent birdsIntent=new Intent(HomePage.this,Birds.class);
                startActivity(birdsIntent);
            }
        });
        bt_colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colorsIntent=new Intent(HomePage.this,Colors.class);
                startActivity(colorsIntent);
            }
        });
        bt_bodyparts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bodypartsIntent=new Intent(HomePage.this,BodyParts.class);
                startActivity(bodypartsIntent);
            }
        });
        bt_nums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbersIntent=new Intent(HomePage.this,Numbers.class);
                startActivity(numbersIntent);
            }
        });
        bt_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent infoIntent=new Intent(HomePage.this,Information.class);
                startActivity(infoIntent);
            }
        });


    }

}
