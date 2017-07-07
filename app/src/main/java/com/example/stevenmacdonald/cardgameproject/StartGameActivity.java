package com.example.stevenmacdonald.cardgameproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StartGameActivity extends AppCompatActivity {

    TextView answerTextview;
    Button StartGameButton;
    Game game;
    Player player1;
    Player computer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game);


        answerTextview = (TextView) findViewById(R.id.answerTextView);
        StartGameButton = (Button) findViewById(R.id.StartGameButton);

    }


    public void buttonClicked(View button){
        Log.d(getClass().toString(), "Button is working");
        game = new Game();
        game.setupHands();
        player1 = game.player1;
        computer = game.computer;
        String result = game.whoWins(player1,computer);
        answerTextview.setText(result);

    }



}
