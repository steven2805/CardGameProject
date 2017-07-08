package com.example.stevenmacdonald.cardgameproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class BattleActivity extends AppCompatActivity {


    private ImageButton image1Button, image2Button, image3Button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);
        image1Button = (ImageButton) findViewById(R.id.PlayerCard1);
        image2Button = (ImageButton) findViewById(R.id.PlayerCard2);
        image3Button = (ImageButton) findViewById(R.id.PlayerCard3);

        int card1Value = Game.getInstance().player1.hand[0];
        int card1Resource = Game.getInstance().deck.getCard(card1Value).getResource();
        image1Button.setImageResource(card1Resource);
        int card2Value = Game.getInstance().player1.hand[1];
        int card2Resource = Game.getInstance().deck.getCard(card2Value).getResource();
        image2Button.setImageResource(card2Resource);
        int card3Value = Game.getInstance().player1.hand[2];
        int card3Resource = Game.getInstance().deck.getCard(card3Value).getResource();
        image3Button.setImageResource(card3Resource);

        /*String image1 = getIntent().getStringExtra("image1");
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
        image3Button.setImageDrawable(resources.getDrawable(resource2Id));*/
    }



    public void onbuttonclick1(View view){
        Log.d(getClass().toString(), "Testing the button 1 is working");
//        int computercard = 0;
//        int computercard = game.computerPickACard();
//        selecting this means the player has selected the first deck in the array
        int player1CardValue = Game.getInstance().deck.getCard(Game.getInstance().player1.hand[0]).getValue();
        int computerCardValue = Game.getInstance().deck.getCard(Game.getInstance().computer.hand[0]).getValue();
        String result = Game.getInstance().whoWins(player1CardValue, computerCardValue);
        Toast.makeText(this, result, Toast.LENGTH_LONG).show();
        Player winner = Game.getInstance().whoWinsTheGame();
        if(winner != null){
            finish();
            Toast.makeText(this, winner.name + " is the winner", Toast.LENGTH_LONG).show();
        }
//        String placeholder = "placeholderball";
//        Resources resources = getApplicationContext().getResources();
//        final int resource99Id = resources.getIdentifier(placeholder, "drawable",
//                getApplicationContext().getPackageName());
//        image1Button.setImageDrawable(resources.getDrawable(resource99Id));
//        view.setVisibility(View.GONE);





    }


}
