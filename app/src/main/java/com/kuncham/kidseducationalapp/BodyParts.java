package com.kuncham.kidseducationalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class BodyParts extends AppCompatActivity implements View.OnClickListener{

    ViewFlipper viewFlipper;
    ImageView prev,next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_parts);

        viewFlipper = (ViewFlipper)findViewById(R.id.viewFlipperBody);
        prev = (ImageView)findViewById(R.id.prev_button);
        next = (ImageView)findViewById(R.id.next_button);

        prev.setOnClickListener(this);
        next.setOnClickListener(this);

        ImageView home_image = (ImageView)findViewById(R.id.gohome_image);
        home_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(BodyParts.this,HomePage.class);
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
