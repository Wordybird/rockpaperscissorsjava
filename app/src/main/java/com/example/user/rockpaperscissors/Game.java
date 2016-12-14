package com.example.user.rockpaperscissors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Game extends AppCompatActivity {

    TextView exampleText;
    Button rockButton;
    Button paperButton;
    Button scissorsButton;
    Button spockButtton;
    Button lizardButton;
    RockPaperScissors choice;
    TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("RockPaperScissors", "onCreateCalled");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exampleText=(TextView)findViewById(R.id.example_text);
        rockButton=(Button)findViewById(R.id.rock_button);
        paperButton=(Button)findViewById(R.id.paper_button);
        scissorsButton=(Button)findViewById(R.id.scissors_button);
        spockButtton=(Button)findViewById(R.id.spock_button);
        lizardButton=(Button)findViewById(R.id.lizard_button);

        rockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                choice = new RockPaperScissors("rock");
                String result = choice.winCheck();
//                Log.d("RockPaperScissors", result);
                answerText = (TextView)findViewById(R.id.answer_text);
                answerText.setText(result);
            }
        });

        paperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                choice = new RockPaperScissors("paper");
                String result = choice.winCheck();
//                Log.d("RockPaperScissors", result);
                answerText = (TextView)findViewById(R.id.answer_text);
                answerText.setText(result);
            }
        });

        scissorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                choice = new RockPaperScissors("scissors");
                String result = choice.winCheck();
//                Log.d("RockPaperScissors", result);
                answerText = (TextView)findViewById(R.id.answer_text);
                answerText.setText(result);
            }
        });

        spockButtton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                choice = new RockPaperScissors("spock");
                String result = choice.winCheck();
//                Log.d("RockPaperScissors", result);
                answerText = (TextView)findViewById(R.id.answer_text);
                answerText.setText(result);
            }
        });

        lizardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                choice = new RockPaperScissors("lizard");
                String result = choice.winCheck();
//                Log.d("RockPaperScissors", result);
                answerText = (TextView)findViewById(R.id.answer_text);
                answerText.setText(result);
            }
        });
    }

}
