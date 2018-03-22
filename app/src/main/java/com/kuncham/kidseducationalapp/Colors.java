package com.kuncham.kidseducationalapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
        carouselView = (CarouselView) findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);

        carouselView.setImageListener(imageListener);
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


