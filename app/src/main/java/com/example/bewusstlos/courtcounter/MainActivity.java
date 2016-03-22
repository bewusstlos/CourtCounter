package com.example.bewusstlos.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add3Points(View view){
        score +=3;
        diplayForTeamA(score);
    }

    public void add2Points(View view){
        score +=2;
        diplayForTeamA(score);
    }
    public void add1Point(View view){
        score ++;
        diplayForTeamA(score);
    }
    public void diplayForTeamA(int score){
        TextView scoreView = (TextView)findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}
