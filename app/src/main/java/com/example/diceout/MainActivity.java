package com.example.diceout;

import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Field to hold the roll result text
    TextView rollResult;
    //Field to hold the roll button
    FloatingActionButton rollButton;
    //hold the images as variables
    ImageView DiceONE;
    ImageView DiceTWO;
    ImageView DiceTHREE;
    //Field to hold the score
    int score;
    //Field to hold random number generator
    Random rand1;
    Random rand2;
    Random rand3;
    //Fields to hold the dice value
    int die1;
    int die2;
    int die3;
    //array list to hold all three values, initializing it
    ArrayList<Integer> dice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

      // FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
      /*  fab.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
           }
        });*/
        //Set initial score
        score=0;

        //link instances to wiedgets in the activity view
        rollResult= (TextView)findViewById(R.id.rollResult);
        rollButton =(FloatingActionButton) findViewById(R.id.fab);

        //initialize the random number generator
        rand1=new Random();
        rand2=new Random();
        rand3=new Random();
        //create Arraylist container for the dice values
        dice = new ArrayList<Integer>();
        //image resolution
        DiceONE=(ImageView)findViewById(R.id.die1Image);
        DiceTWO=(ImageView)findViewById(R.id.die2Image);
        DiceTHREE=(ImageView)findViewById(R.id.die3Image);
   }

   public void rollDice(View v){

       //Roll dice
        die1=rand1.nextInt(6)+1;
       die2=rand2.nextInt(6)+1;
       die3=rand3.nextInt(6)+1;
       //clear our arry
       dice.clear();
       //  putting values into our array list
       dice.add(0,die1);
       dice.add(1,die2);
       dice.add(2,die3);
       //DICE1 Algorithm
       switch (die1) {
           case 1:  DiceONE.setImageResource(R.drawable.dice1);
               break;
           case 2:  DiceONE.setImageResource(R.drawable.dice2);
               break;
           case 3:  DiceONE.setImageResource(R.drawable.dice3);
               break;
           case 4:  DiceONE.setImageResource(R.drawable.dice4);
               break;
           case 5:  DiceONE.setImageResource(R.drawable.dice5);
               break;
           case 6:  DiceONE.setImageResource(R.drawable.dice6);
               break;
           default: DiceONE.setImageResource(R.drawable.image);
               break;
       }
       //DICE2 Algorithm
       switch (die2) {
           case 1:  DiceTWO.setImageResource(R.drawable.dice1);
               break;
           case 2:  DiceTWO.setImageResource(R.drawable.dice2);
               break;
           case 3:  DiceTWO.setImageResource(R.drawable.dice3);
               break;
           case 4:  DiceTWO.setImageResource(R.drawable.dice4);
               break;
           case 5:  DiceTWO.setImageResource(R.drawable.dice5);
               break;
           case 6:  DiceTWO.setImageResource(R.drawable.dice6);
               break;
           default: DiceTWO.setImageResource(R.drawable.image);
               break;
       }
       //DICE3 Algorithm
       switch (die3) {
           case 1:  DiceTHREE.setImageResource(R.drawable.dice1);
               break;
           case 2:  DiceTHREE.setImageResource(R.drawable.dice2);
               break;
           case 3:  DiceTHREE.setImageResource(R.drawable.dice3);
               break;
           case 4:  DiceTHREE.setImageResource(R.drawable.dice4);
               break;
           case 5:  DiceTHREE.setImageResource(R.drawable.dice5);
               break;
           case 6:  DiceTHREE.setImageResource(R.drawable.dice6);
               break;
           default: DiceTHREE.setImageResource(R.drawable.image);
               break;
       }
       //Build message with result
       String msg = "You rolled a  " +die1+ " ,a  " + die2 + " and a  " + die3;
       rollResult.setText(msg);
   }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
