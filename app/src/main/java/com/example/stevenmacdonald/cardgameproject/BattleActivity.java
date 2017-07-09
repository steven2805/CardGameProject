package com.example.stevenmacdonald.cardgameproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



public class BattleActivity extends AppCompatActivity {


    private ImageButton image1Button, image2Button, image3Button;
    private int playerCard1Resource,card2Resource,card3Resource;
    private TextView card1TextView, card2TextView, card3TextView;
    private ImageView ToolTip,playerBattleImg,computerBattleImg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);
        image1Button = (ImageButton) findViewById(R.id.PlayerCard1);
        image2Button = (ImageButton) findViewById(R.id.PlayerCard2);
        image3Button = (ImageButton) findViewById(R.id.PlayerCard3);
        card1TextView = (TextView) findViewById(R.id.Card1TextView);
        card2TextView = (TextView) findViewById(R.id.card2TextView);
        card3TextView = (TextView) findViewById(R.id.card3TextView);
        playerBattleImg = (ImageView) findViewById(R.id.playerBattleImg);
        computerBattleImg = (ImageView) findViewById(R.id.computerBattleImg);
        ToolTip = (ImageView) findViewById(R.id.ToolTip);

// Player getting the card information for card 1
        int playerCardID = Game.getInstance().player1.hand[0];
        playerCard1Resource = Game.getInstance().deck.getCard(playerCardID).getResource();
        int playerCard1Value = Game.getInstance().deck.getCard(playerCardID).getValue();
        card1TextView.setText(Integer.toString(playerCard1Value));
        image1Button.setImageResource(playerCard1Resource);



// Player getting the card information for card 2
        int card2ID = Game.getInstance().player1.hand[1];
        card2Resource = Game.getInstance().deck.getCard(card2ID).getResource();
        int card2Value = Game.getInstance().deck.getCard(card2ID).getValue();
        card2TextView.setText(Integer.toString(card2Value));
        image2Button.setImageResource(card2Resource);

// Player getting the card information for card 3
        int card3ID = Game.getInstance().player1.hand[2];
        card3Resource = Game.getInstance().deck.getCard(card3ID).getResource();
        int card3Value = Game.getInstance().deck.getCard(card3ID).getValue();
        card3TextView.setText(Integer.toString(card3Value));
        image3Button.setImageResource(card3Resource);

    }



    public void onButtonClick1(View view){
        ToolTip.setVisibility(View.GONE);
        playerBattleImg.setImageResource(playerCard1Resource);
        playerBattleImg.setVisibility(View.VISIBLE);
        Log.d(getClass().toString(), "Testing the button 1 is working");
        int player1CardValue = Game.getInstance().deck.getCard(Game.getInstance().player1.hand[0]).getValue();
        int computerCardValue = Game.getInstance().deck.getCard(Game.getInstance().computer.hand[0]).getValue();
        String result = Game.getInstance().whoWins(player1CardValue, computerCardValue);
        Toast.makeText(this, result, Toast.LENGTH_LONG).show();
        Player winner = Game.getInstance().whoWinsTheGame();
        if(winner != null){
            finish();
            Toast.makeText(this, winner.name + " is the winner", Toast.LENGTH_LONG).show();
        }
//
//        Resources resources = getApplicationContext().getResources();
//        final int resource99Id = resources.getIdentifier(placeholder, "drawable",
//                getApplicationContext().getPackageName());
//        image1Button.setImageDrawable(resources.getDrawable(resource99Id));
//        view.setVisibility(View.GONE);

    }

    public void onButtonClick2(View view){
        ToolTip.setVisibility(View.GONE);
        Log.d(getClass().toString(), "Testing the button 2 is working");
        int player1CardValue = Game.getInstance().deck.getCard(Game.getInstance().player1.hand[1]).getValue();
        int computerCardValue = Game.getInstance().deck.getCard(Game.getInstance().computer.hand[1]).getValue();
        String result = Game.getInstance().whoWins(player1CardValue, computerCardValue);
        Toast.makeText(this, result, Toast.LENGTH_LONG).show();
        Player winner = Game.getInstance().whoWinsTheGame();
        if(winner != null){
            finish();
            Toast.makeText(this, winner.name + " is the winner", Toast.LENGTH_LONG).show();
        }
//
//        Resources resources = getApplicationContext().getResources();
//        final int resource99Id = resources.getIdentifier(placeholder, "drawable",
//                getApplicationContext().getPackageName());
//        image1Button.setImageDrawable(resources.getDrawable(resource99Id));
//        view.setVisibility(View.GONE);

    }

    public void onButtonClick3(View view){
        ToolTip.setVisibility(View.GONE);
        Log.d(getClass().toString(), "Testing the button 3 is working");
        int player1CardValue = Game.getInstance().deck.getCard(Game.getInstance().player1.hand[2]).getValue();
        int computerCardValue = Game.getInstance().deck.getCard(Game.getInstance().computer.hand[2]).getValue();
        String result = Game.getInstance().whoWins(player1CardValue, computerCardValue);
        Toast.makeText(this, result, Toast.LENGTH_LONG).show();
        Player winner = Game.getInstance().whoWinsTheGame();
        if(winner != null){
            finish();
            Toast.makeText(this, winner.name + " is the winner", Toast.LENGTH_LONG).show();
        }
//
//        Resources resources = getApplicationContext().getResources();
//        final int resource99Id = resources.getIdentifier(placeholder, "drawable",
//                getApplicationContext().getPackageName());
//        image1Button.setImageDrawable(resources.getDrawable(resource99Id));
//        view.setVisibility(View.GONE);

    }





}
