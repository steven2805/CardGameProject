package com.example.stevenmacdonald.cardgameproject;

import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



public class BattleActivity extends AppCompatActivity {


    private ImageButton image1Button, image2Button, image3Button;
    private int playerCard1Resource, playerCard2Resource, playerCard3Resource,playerCard1Value,playerCard2Value,playerCard3Value;
    private int computerCard1Value,computerCard2Value,computerCard3Value;
    private int computerCard1Resource,computerCard2Resource,computerCard3Resource;
    private TextView card1TextView, card2TextView, card3TextView, playerBattleScore,computerBattleScore;
    private ImageView ToolTip,playerBattleImg,computerBattleImg,guideimage,guide2img,tutorialpt1img,tutorialpt2Img;




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
        playerBattleScore = (TextView) findViewById(R.id.playerBattleScore) ;
        computerBattleScore = (TextView) findViewById(R.id.computerBattleScore);
        playerBattleImg = (ImageView) findViewById(R.id.playerBattleImg);
        computerBattleImg = (ImageView) findViewById(R.id.computerBattleImg);
        ToolTip = (ImageView) findViewById(R.id.ToolTip);
        guideimage = (ImageView) findViewById(R.id.guideimg1);
        guide2img = (ImageView) findViewById(R.id.guide2img);
        tutorialpt1img = (ImageView) findViewById(R.id.tutorialpt1img);
        tutorialpt2Img = (ImageView) findViewById(R.id.tutorialpt2img);
        checkIfTutorialIsOnOrOff();
        shouldDisplayRuleChangeCheckBox();

// Player getting the card information for card 1
        int playerCardID = Game.getInstance().player1.hand[0];
        playerCard1Resource = Game.getInstance().deck.getCard(playerCardID).getResource();
        playerCard1Value = Game.getInstance().deck.getCard(playerCardID).getValue();
        card1TextView.setText(Integer.toString(playerCard1Value));
        image1Button.setImageResource(playerCard1Resource);

// Computer getting the card information for card 1
        int computerCardID = Game.getInstance().computer.hand[0];
        computerCard1Resource = Game.getInstance().deck.getCard(computerCardID).getResource();
        computerCard1Value = Game.getInstance().deck.getCard(computerCardID).getValue();

// Player getting the card information for card 2
        int playerCard2ID = Game.getInstance().player1.hand[1];
        playerCard2Resource = Game.getInstance().deck.getCard(playerCard2ID).getResource();
        playerCard2Value = Game.getInstance().deck.getCard(playerCard2ID).getValue();
        card2TextView.setText(Integer.toString(playerCard2Value));
        image2Button.setImageResource(playerCard2Resource);

//  Computer getting the card information for card 2
        int computerCard2ID = Game.getInstance().computer.hand[1];
        computerCard2Resource = Game.getInstance().deck.getCard(computerCard2ID).getResource();
        computerCard2Value = Game.getInstance().deck.getCard(computerCard2ID).getValue();

// Player getting the card information for card 3
        int playerCard3ID = Game.getInstance().player1.hand[2];
        playerCard3Resource = Game.getInstance().deck.getCard(playerCard3ID).getResource();
        playerCard3Value = Game.getInstance().deck.getCard(playerCard3ID).getValue();
        card3TextView.setText(Integer.toString(playerCard3Value));
        image3Button.setImageResource(playerCard3Resource);

// Computer getting the card information for card 3
        int computerCard3ID = Game.getInstance().computer.hand[2];
        computerCard3Resource = Game.getInstance().deck.getCard(computerCard3ID).getResource();
        computerCard3Value = Game.getInstance().deck.getCard(computerCard3ID).getValue();
    }


    // This is settind up the changes from the first button click
    public void onButtonClick1(View view){
        setupBattleScene(playerCard1Resource,computerCard1Resource, playerCard1Value,computerCard1Value);
        Log.d(getClass().toString(), "Testing the button 1 is working");
        int player1CardValue = Game.getInstance().deck.getCard(Game.getInstance().player1.hand[0]).getValue();
        int computerCardValue = Game.getInstance().deck.getCard(Game.getInstance().computer.hand[0]).getValue();
        boolean checkBoxStatues = checkRuleChange();
        String result = Game.getInstance().whoWins(player1CardValue, computerCardValue,checkBoxStatues);
        shouldDisplayRuleChangeCheckBox();
        if(result == "You lose play again"){
            image1Button.setImageResource(R.drawable.losing);
        } else if (result == "draw"){
            image1Button.setImageResource(R.drawable.draw);
        } else {
            image1Button.setImageResource(R.drawable.winning);
        }

        image1Button.setClickable(false);

        Toast.makeText(this, result, Toast.LENGTH_LONG).show();
        Player winner = Game.getInstance().whoWinsTheGame();
        if(winner != null){
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    BattleActivity.this.finish();
                }
            }, 3000);
            Toast.makeText(this, winner.name + " is the winner", Toast.LENGTH_LONG).show();
        }

    }
    // this is setting up the options for the 2nd button click
    public void onButtonClick2(View view){
        setupBattleScene(playerCard2Resource,computerCard2Resource,playerCard2Value,computerCard2Value);
        Log.d(getClass().toString(), "Testing the button 2 is working");
        int player1CardValue = Game.getInstance().deck.getCard(Game.getInstance().player1.hand[1]).getValue();
        int computerCardValue = Game.getInstance().deck.getCard(Game.getInstance().computer.hand[1]).getValue();
        boolean checkBoxStatues = checkRuleChange();
        String result = Game.getInstance().whoWins(player1CardValue, computerCardValue,checkBoxStatues);
        shouldDisplayRuleChangeCheckBox();
        if(result == "You lose play again"){
            image2Button.setImageResource(R.drawable.losing);
        } else if (result == "draw"){
            image2Button.setImageResource(R.drawable.draw);
        } else {
            image2Button.setImageResource(R.drawable.winning);
        }

        image2Button.setClickable(false);

        Toast.makeText(this, result, Toast.LENGTH_LONG).show();
        Player winner = Game.getInstance().whoWinsTheGame();
        if(winner != null){
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    BattleActivity.this.finish();
                }
            }, 3000);
            Toast.makeText(this, winner.name + " is the winner", Toast.LENGTH_LONG).show();
        }

    }
    // this is setting uo the optinos for the 3rd button click
    public void onButtonClick3(View view){
        setupBattleScene(playerCard3Resource,computerCard3Resource,playerCard3Value,computerCard3Value);
        Log.d(getClass().toString(), "Testing the button 3 is working");
        int player1CardValue = Game.getInstance().deck.getCard(Game.getInstance().player1.hand[2]).getValue();
        int computerCardValue = Game.getInstance().deck.getCard(Game.getInstance().computer.hand[2]).getValue();
        boolean checkBoxStatues = checkRuleChange();
        String result = Game.getInstance().whoWins(player1CardValue, computerCardValue,checkBoxStatues);
        shouldDisplayRuleChangeCheckBox();
        if(result == "You lose play again"){
            image3Button.setImageResource(R.drawable.losing);
        } else if (result == "draw"){
            image3Button.setImageResource(R.drawable.draw);
        } else {
            image3Button.setImageResource(R.drawable.winning);
        }

        image3Button.setClickable(false);

        Toast.makeText(this, result, Toast.LENGTH_LONG).show();
        Player winner = Game.getInstance().whoWinsTheGame();
        if(winner != null){
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    BattleActivity.this.finish();
                }
            }, 3000);
            Toast.makeText(this, winner.name + " is the winner", Toast.LENGTH_LONG).show();
        }

    }
    // Basic setup information for the battleScreen(removing the tut tooltip)
    public void setupBattleScene(int player, int computer, int plyCardValue,int cmpCardValue){
        ToolTip.setVisibility(View.GONE);
        playerBattleImg.setImageResource(player);
        playerBattleImg.setVisibility(View.VISIBLE);
        computerBattleImg.setImageResource(computer);
        computerBattleImg.setVisibility(View.VISIBLE);
        playerBattleScore.setText(Integer.toString(plyCardValue));
        computerBattleScore.setText(Integer.toString(cmpCardValue));
    }

    // used in checking whether the switch for the tut is on or off
    public void checkIfTutorialIsOnOrOff(){
        boolean tutValue = Game.getInstance().getTutorialStatues();
        if(tutValue == false){
            ToolTip.setVisibility(View.GONE);
            guideimage.setVisibility(View.GONE);
            tutorialpt1img.setVisibility(View.GONE);
            tutorialpt2Img.setVisibility(View.GONE);
            guide2img.setVisibility(View.GONE);
        }else {
            ToolTip.setVisibility(View.VISIBLE);
            image1Button.setVisibility(View.INVISIBLE);
            image2Button.setVisibility(View.INVISIBLE);
            image3Button.setVisibility(View.INVISIBLE);
            tutorialpt2Img.setVisibility(View.INVISIBLE);
            guide2img.setVisibility(View.INVISIBLE);

        }
    }

    // used for the tutorial mode
    public void tutorialImgDisappearOnClick(View view) {
        tutorialpt1img.setVisibility(View.GONE);
        guideimage.setVisibility(View.GONE);
        tutorialpt2Img.setVisibility(View.VISIBLE);
        guide2img.setVisibility(View.VISIBLE);
    }

    public void tutorialImg2DisappearOnClick(View view){
        tutorialpt2Img.setVisibility(View.GONE);
        guide2img.setVisibility(View.GONE);
        image1Button.setVisibility(View.VISIBLE);
        image2Button.setVisibility(View.VISIBLE);
        image3Button.setVisibility(View.VISIBLE);
    }

    //checks whether the change rules/powerups has been selected
    public void shouldDisplayRuleChangeCheckBox(){
        CheckBox ruleswap = (CheckBox) findViewById(R.id.ruleSwapCheck);
        if (Game.getInstance().player1.powerup > 0){
            ruleswap.setVisibility(View.VISIBLE);}
        else {
            ruleswap.setVisibility(View.GONE);
        }
    }

    public boolean checkRuleChange() {
        CheckBox ruleswap = (CheckBox) findViewById(R.id.ruleSwapCheck);
        setActivityBackgroundColor(ruleswap.isChecked());
        return ruleswap.isChecked();
    }

    public void setActivityBackgroundColor(boolean switchbackground) {
        ConstraintLayout ll = (ConstraintLayout) findViewById(R.id.battleactivity);
        if(switchbackground == true) {
            Game.getInstance().player1.powerup = 0;
            ll.setBackgroundResource(R.drawable.redbackground);
        }else {
            ll.setBackgroundResource(R.drawable.backgroundbattle);
        }
    }
}
