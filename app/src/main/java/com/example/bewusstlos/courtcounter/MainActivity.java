package com.example.bewusstlos.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_a_1point).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA++;
                diplayForTeamA(scoreTeamA);
            }
        });
        findViewById(R.id.btn_a_2point).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA +=2;
                diplayForTeamA(scoreTeamA);
            }
        });
        findViewById(R.id.btn_a_3point).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA +=3;
                diplayForTeamA(scoreTeamA);
            }
        });
        findViewById(R.id.btn_b_1point).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB++;
                displayForTeamB(scoreTeamB);
            }
        });
        findViewById(R.id.btn_b_2point).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB+=2;
                displayForTeamB(scoreTeamB);
            }
        });
        findViewById(R.id.btn_b_3point).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB+=3;
                displayForTeamB(scoreTeamB);
            }
        });
        findViewById(R.id.reset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA = 0;
                scoreTeamB = 0;
                diplayForTeamA(scoreTeamA);
                displayForTeamB(scoreTeamB);
            }
        });
    }

    public void diplayForTeamA(int score){
        TextView scoreView = (TextView)findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score){
        TextView scoreView = (TextView)findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
