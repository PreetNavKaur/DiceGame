package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv=findViewById(R.id.messagefield);
        ImageView di1=findViewById(R.id.upperdice);
        ImageView di2=findViewById(R.id.lowerdice);
        Button hbtn=findViewById(R.id.btnhigher);
        Button lbtn=findViewById(R.id.btnlower);
        int intdi1=R.id.upperdice;
        int intdi2=R.id.lowerdice;

        int [] diceArray={R.drawable.dice1,
                        R.drawable.dice2,
                        R.drawable.dice3,
                        R.drawable.dice4,
                        R.drawable.dice5,
                        R.drawable.dice6};
        hbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String tag="hello";
                Log.d(tag,"higher button clicked");

                Random rand=new Random();
                int udice= rand.nextInt(6);
                int ldice=rand.nextInt( 6);

                di1.setImageResource(diceArray[udice]);
                di2.setImageResource(diceArray[ldice]);

                    if(udice<ldice){
                        tv.setText("Computer is winner");
                        //System.out.println("Computer is Winner!!");
                    }
                    else if(udice>ldice){
                        tv.setText("User is Winner");
                        //System.out.println("user is winner!!");
                    }
                    else{
                        tv.setText("It's a tie");
                        //System.out.println("It's a tie!!");
                    }
            }
        });

        lbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String tag="hello";
                Log.d(tag,"higher button clicked");

                Random rand=new Random();
                int udice= rand.nextInt(6);
                int ldice=rand.nextInt( 6);

                di1.setImageResource(diceArray[udice]);
                di2.setImageResource(diceArray[ldice]);

                    if(udice<ldice){
                        tv.setText("User is Winner");
                        //System.out.println("User is Winner!!");
                    }
                    else if(udice>ldice){
                        tv.setText("Computer is Winner");
                        //System.out.println("Computer is winner!!");
                    }
                    else {
                        tv.setText("It's a tie");
                        //System.out.println("It's a tie!!");
                    }
            }
        });

    }
}