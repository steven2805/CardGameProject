package com.example.stevenmacdonald.cardgameproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class StartGameActivity extends AppCompatActivity {

    TextView answerTextview;
    ImageButton StartGameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game);

        answerTextview = (TextView) findViewById(R.id.answerTextView);
        StartGameButton = (ImageButton) findViewById(R.id.StartGameButton);
    }

    public void buttonClicked(View button){
        Log.d(getClass().toString(), "Button is working");
        Game.getInstance().setupGame();

        Intent intent = new Intent(this, BattleActivity.class);
        startActivity(intent);
    }
}
