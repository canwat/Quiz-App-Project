package com.example.android.robert;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class QuizPage extends AppCompatActivity {
int points=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page);
        final CheckBox chkbox2=(CheckBox)findViewById(R.id.dry);
        chkbox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if(chkbox2.isChecked()){
                  points=points+1;
              }

            }
        });
        final CheckBox checkBox=(CheckBox)findViewById(R.id.diet);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox.isChecked()){
                    points=points+1;

                }
            }
        });
        final CheckBox checkBox1=(CheckBox)findViewById(R.id.hormone);
        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox1.isChecked()){
                    points=points+1;
                }
            }
        });
        CheckBox checkBox2=(CheckBox)findViewById(R.id.non);
        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        final RadioGroup radioGroup=(RadioGroup)findViewById(R.id.rg);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton=(RadioButton) radioGroup.findViewById(checkedId);
                switch (checkedId){
                    case R.id.twice:
                        points=points+1;
                        break;
                    case R.id.when:
                        break;
                    case R.id.each:
                        break;
                    case R.id.ip:
                        break;
                }
            }
        });
        final RadioGroup radioGroup1=(RadioGroup)findViewById(R.id.rg2);
        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId2) {
                switch(checkedId2){
                    case  R.id.tt:
                    case R.id.self:
                        points=points+1;
                        break;
                    case R.id.eat:
                        break;
                    case R.id.smoke:
                        break;


                }
            }
        });
        RadioGroup radioGroup2=(RadioGroup)findViewById(R.id.rg4);
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId3) {
                switch(checkedId3){
                    case R.id.tT:
                        break;
                    case R.id.ts:
                        break;
                    case R.id.Ts:
                        break;
                    case R.id.correct:
                        points=points+1;
                        break;
                }
            }
        });
    }
    public void submitAnswer(View view) {
        if (points>5){
            points=5;
        }
        Toast.makeText(getApplicationContext(),"You have scored " + points + " out of 5\n " +"Thanks for finishing" ,
                Toast.LENGTH_SHORT).show();
    }
}
