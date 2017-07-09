package com.example.stevenmacdonald.cardgameproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class StartGameActivity extends AppCompatActivity {

    TextView answerTextview;
    ImageButton StartGameButton;
//    Switch tutorialSwitch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game);

        answerTextview = (TextView) findViewById(R.id.answerTextView);
        StartGameButton = (ImageButton) findViewById(R.id.StartGameButton);
//        tutorialSwitch = (Switch) findViewById(R.id,tutorialSwitch);

//        if (tutorialSwitch != null) {
//            tutorialSwitch.setOnCheckedChangeListener(this);
        }
//    }

//    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//        Toast.makeText(this, "The Switch is " + (isChecked ? "on" : "off"),
//                Toast.LENGTH_SHORT).show();
//        if(isChecked) {
//            //do stuff when Switch is ON
//        } else {
//            //do stuff when Switch if OFF
//        }
//    }

    public void buttonClicked(View button){
        Log.d(getClass().toString(), "Button is working");
        Game.getInstance().setupGame();
        Intent intent = new Intent(this, BattleActivity.class);
        startActivity(intent);
    }
}
