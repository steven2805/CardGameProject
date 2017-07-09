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
    private int playerCard1Resource, playerCard2Resource, playerCard3Resource;
    private int computerCard1Resource,computerCard2Resource,computerCard3Resource;
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
        checkIfTutorialIsOnOrOff();

// Player getting the card information for card 1
        int playerCardID = Game.getInstance().player1.hand[0];
        playerCard1Resource = Game.getInstance().deck.getCard(playerCardID).getResource();
        int playerCard1Value = Game.getInstance().deck.getCard(playerCardID).getValue();
        card1TextView.setText(Integer.toString(playerCard1Value));
        image1Button.setImageResource(playerCard1Resource);

// Computer getting the card information for card 1
        int computerCardID = Game.getInstance().computer.hand[0];
        computerCard1Resource = Game.getInstance().deck.getCard(computerCardID).getResource();
        int computerCard1Value = Game.getInstance().deck.getCard(computerCardID).getValue();

// Player getting the card information for card 2
        int playerCard2ID = Game.getInstance().player1.hand[1];
        playerCard2Resource = Game.getInstance().deck.getCard(playerCard2ID).getResource();
        int playerCard2Value = Game.getInstance().deck.getCard(playerCard2ID).getValue();
        card2TextView.setText(Integer.toString(playerCard2Value));
        image2Button.setImageResource(playerCard2Resource);

//  Computer getting the card information for card 2
        int computerCard2ID = Game.getInstance().computer.hand[1];
        computerCard2Resource = Game.getInstance().deck.getCard(computerCard2ID).getResource();
        int computerCard2Value = Game.getInstance().deck.getCard(computerCard2ID).getResource();


// Player getting the card information for card 3
        int playerCard3ID = Game.getInstance().player1.hand[2];
        playerCard3Resource = Game.getInstance().deck.getCard(playerCard3ID).getResource();
        int playerCard3Value = Game.getInstance().deck.getCard(playerCard3ID).getValue();
        card3TextView.setText(Integer.toString(playerCard3Value));
        image3Button.setImageResource(playerCard3Resource);

        int computerCard3ID = Game.getInstance().computer.hand[2];
        computerCard3Resource = Game.getInstance().deck.getCard(computerCard3ID).getResource();
        int computerCard3Value = Game.getInstance().deck.getCard(computerCard3ID).getResource();

    }



    public void onButtonClick1(View view){
        setupBattleScene(playerCard1Resource,computerCard1Resource);
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
        setupBattleScene(playerCard2Resource,computerCard2Resource);
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
        setupBattleScene(playerCard3Resource,computerCard3Resource);
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

    public void setupBattleScene(int player, int computer){
        ToolTip.setVisibility(View.GONE);
        playerBattleImg.setImageResource(player);
        playerBattleImg.setVisibility(View.VISIBLE);
        computerBattleImg.setImageResource(computer);
        computerBattleImg.setVisibility(View.VISIBLE);

    }

    public void checkIfTutorialIsOnOrOff(){
        boolean tutValue = Game.getInstance().getTutorialStatues();
        if(tutValue == false){
            ToolTip.setVisibility(View.GONE);
        }else ToolTip.setVisibility(View.VISIBLE);
    }





}
