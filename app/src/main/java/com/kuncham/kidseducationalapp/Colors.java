package com.kuncham.kidseducationalapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Colors extends AppCompatActivity implements View.OnClickListener{

    ViewFlipper viewFlipper;
    ImageView prev,next;
   // ImageView red,orange,yellow,green,blue,purple,pink,brown,white,black,grey;
    ImageView audio;
    MediaPlayer red,orange,yellow,green,blue,purple,pink,brown,white,black,grey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
       // getSupportActionBar().hide();

        viewFlipper = (ViewFlipper)findViewById(R.id.viewFlipper);
        prev = (ImageView)findViewById(R.id.prev_button);
        next = (ImageView)findViewById(R.id.next_button);

        audio=(ImageView)findViewById(R.id.sound);


        audio.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if(v.getId()==R.id.red_image){

                    red=MediaPlayer.create(Colors.this,R.raw.red);
                    red.start();
                    }
                if(v.getId()==R.id.orange_image){

                    orange=MediaPlayer.create(Colors.this,R.raw.orange);
                    orange.start();
                }

            }
        });







     /*   red=(ImageView)findViewById(R.id.red_image);
        orange=(ImageView)findViewById(R.id.orange_image);
        yellow=(ImageView)findViewById(R.id.yellow_image);
        green=(ImageView)findViewById(R.id.green_image);
        blue=(ImageView)findViewById(R.id.blue_image);
        purple=(ImageView)findViewById(R.id.purple_image);
        pink=(ImageView)findViewById(R.id.pink_image);
        brown=(ImageView)findViewById(R.id.brown_image);
        white=(ImageView)findViewById(R.id.white_image);
        black=(ImageView)findViewById(R.id.black_image);
        grey=(ImageView)findViewById(R.id.grey_image);

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });         */













        prev.setOnClickListener(this);
        next.setOnClickListener(this);

        ImageView home_image = (ImageView)findViewById(R.id.gohome_image);
        home_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(Colors.this,HomePage.class);
                startActivity(homeIntent);
            }
        });
    }

    @Override
    public void onClick(View view) {

        if (view == next)
        {
            viewFlipper.showNext();
        }
        else if (view == prev)
        {
            viewFlipper.showPrevious();
        }
    }
}


