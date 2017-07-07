package com.example.stevenmacdonald.cardgameproject;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

import java.io.File;

public class BattleActivity extends AppCompatActivity {

    private ImageButton image1Button, image2Button, image3Button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);
        image1Button = (ImageButton) findViewById(R.id.imageButton);
        image2Button = (ImageButton) findViewById(R.id.imageButton2);
        image3Button = (ImageButton) findViewById(R.id.imageButton3);
        String image1 = getIntent().getStringExtra("image1");
        String image2 = getIntent().getStringExtra("image2");
        String image3 = getIntent().getStringExtra("image3");

        Resources resources = getApplicationContext().getResources();
        final int resourceId = resources.getIdentifier(image1, "drawable",
                getApplicationContext().getPackageName());

        Resources resources1 = getApplicationContext().getResources();
        final int resource1Id = resources.getIdentifier(image2, "drawable",
                getApplicationContext().getPackageName());

        Resources resources2 = getApplicationContext().getResources();
        final int resource2Id = resources.getIdentifier(image3, "drawable",
                getApplicationContext().getPackageName());

        image1Button.setImageDrawable(resources.getDrawable(resourceId));
        image2Button.setImageDrawable(resources.getDrawable(resource1Id));
        image3Button.setImageDrawable(resources.getDrawable(resource2Id));


    }
}
