package com.example.stevenmacdonald.cardgameproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class StartGameActivity extends AppCompatActivity {

    ImageButton StartGameButton;
    CheckBox tutorialCheckBox;
    public boolean checkBoxStatues;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game);

        StartGameButton = (ImageButton) findViewById(R.id.StartGameButton);
//        CheckBox tutorialCheckBox = (CheckBox) findViewById(R.id.tutorialCheckBox);

    }




    public void buttonClicked(View button){
        CheckBox tutorialCheckBox = (CheckBox) findViewById(R.id.tutorialCheckBox);
        boolean checkBoxStatues = tutorialCheckBox.isChecked();
        Game.getInstance().setTutorial(checkBoxStatues);
        Log.d(getClass().toString(), "Button is working");
        Game.getInstance().setupGame();
        Intent intent = new Intent(this, BattleActivity.class);
        startActivity(intent);
    }
}
