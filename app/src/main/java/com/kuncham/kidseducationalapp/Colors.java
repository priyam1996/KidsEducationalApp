package com.kuncham.kidseducationalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class Colors extends AppCompatActivity {

    CarouselView carouselView;
    int NUMBER_OF_PAGES = 11;

    int[] sampleImages = {R.drawable.red, R.drawable.orange, R.drawable.yellow, R.drawable.green, R.drawable.blue,R.drawable.purple,R.drawable.pink,R.drawable.brown,R.drawable.white,R.drawable.black,R.drawable.grey};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
       // getSupportActionBar().hide();

        carouselView = (CarouselView) findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);

        carouselView.setImageListener(imageListener);

        ImageView home_image = (ImageView)findViewById(R.id.gohome_image);
        home_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(Colors.this,HomePage.class);
                startActivity(homeIntent);
            }
        });
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };
   /* ViewListener viewListener = new ViewListener() {

        @Override
        public View setViewForPosition(int position) {
            View customView = getLayoutInflater().inflate(R.layout.view_custom, null);
            //set view attributes here

            return customView;
        }
    };*/



    }


