package com.example.danielmbedobe.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit;
    int correctAnswers = 0;
    final View.OnClickListener submitButtonOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            checkAllQuestions();
            Toast.makeText(MainActivity.this, "Correct Answers: " + correctAnswers + "/7",
                    Toast.LENGTH_LONG).show();
            resetCorrectAnswersCounter();


        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //submit button onclick listener
        submit = findViewById(R.id.submitButton);
        submit.setOnClickListener(submitButtonOnClickListener);


    }

    private void checkQuestionOneAnswers() {
        CheckBox q1answer1 = findViewById(R.id.qOneAnswer1);
        CheckBox q1answer2 = findViewById(R.id.qOneAnswer2);
        CheckBox q1answer3 = findViewById(R.id.qOneAnswer3);
        boolean isQ1Answer1Checked = q1answer1.isChecked();
        boolean isQ1Answer2Checked = q1answer2.isChecked();
        boolean isQ1Answer3Checked = q1answer3.isChecked();

        if (isQ1Answer3Checked) {
            correctAnswers += 1;
        }
    }

    private void checkQuestionTwoAnswers() {
        CheckBox q9answer1 = findViewById(R.id.qNineAnswer1);
        CheckBox q9answer2 = findViewById(R.id.qNineAnswer2);
        CheckBox q9answer3 = findViewById(R.id.qNineAnswer3);
        boolean isQ2Answer1Checked = q9answer1.isChecked();
        boolean isQ2Answer2Checked = q9answer2.isChecked();
        boolean isQ2Answer3Checked = q9answer3.isChecked();

        if (isQ2Answer2Checked) {
            correctAnswers += 1;
        }
    }

    private void checkQuestionThreeAnswers() {
        RadioButton radioButton3_2 = findViewById(R.id.radio_3_2);
        boolean isQuestionThree2Checked = radioButton3_2.isChecked();
        if (isQuestionThree2Checked) {
            correctAnswers += 1;
        }
    }

    private void checkQuestionFourAnswers() {
        RadioButton radioButton4_3 = findViewById(R.id.radio_4_3);
        boolean isQuestionFour3Checked = radioButton4_3.isChecked();
        if (isQuestionFour3Checked) {
            correctAnswers += 1;
        }
    }

    private void checkQuestionFiveAnswers() {
        CheckBox q5answer1 = findViewById(R.id.qFiveAnswer1);
        CheckBox q5answer2 = findViewById(R.id.qFiveAnswer2);
        CheckBox q5answer3 = findViewById(R.id.qFiveAnswer3);
        boolean isQ5Answer1Checked = q5answer1.isChecked();
        boolean isQ5Answer2Checked = q5answer2.isChecked();
        boolean isQ5Answer3Checked = q5answer3.isChecked();

        if (isQ5Answer2Checked) {
            correctAnswers += 1;
        }

    }

    private void checkQuestionSixAnswers() {
        RadioButton radioButton6_3 = findViewById(R.id.radio_6_3);
        boolean isQuestionSix3Checked = radioButton6_3.isChecked();
        if (isQuestionSix3Checked) {
            correctAnswers += 1;
        }
    }

    private String getQuestionSevenName() {
        EditText languageName = findViewById(R.id.name);
        String name = languageName.getText().toString();
        return name;
    }

    private void checkQuestionSevenAnswer() {
        String name = getQuestionSevenName();
        if (name.trim().equalsIgnoreCase("Wolof")) {
            correctAnswers += 1;
        }
    }

    private void checkAllQuestions() {
        checkQuestionOneAnswers();
        checkQuestionTwoAnswers();
        checkQuestionThreeAnswers();
        checkQuestionFourAnswers();
        checkQuestionFiveAnswers();
        checkQuestionSixAnswers();
        checkQuestionSevenAnswer();
    }

    private void resetCorrectAnswersCounter() {
        correctAnswers = 0;
    }


}
