package com.example.stevenmacdonald.cardgameproject;

import android.content.Intent;
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
//        player1 = game.player1;
//        computer = game.computer;
//        String result = game.whoWins(player1,computer);
//        answerTextview.setText(result);
        String[] array = new String[3];
        array[0] = "metapod";
        array[1] = "metapod";
        array[2] = "charmander";

//        array = game.getPlayersCardNames(game.player1.hand);
        Intent intent = new Intent(this, BattleActivity.class);
        intent.putExtra("image1",array[0]);
        intent.putExtra("image2",array[1]);
        intent.putExtra("image3",array[2]);
        startActivity(intent);
    }
}
