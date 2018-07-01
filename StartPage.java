package com.example.android.robert;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class StartPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
        TextView quiz=(TextView)findViewById(R.id.qsection);
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quiz=new Intent(StartPage.this, QuizPage.class);
                startActivity(quiz);
            }
        });
        TextView Tips= (TextView)findViewById(R.id.tips);
        Tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tips=new Intent(StartPage.this, Tips.class);
                startActivity(tips);
            }
        });
        TextView Foods=(TextView)findViewById(R.id.foods);
        Foods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Foods=new Intent(StartPage.this, FoodsRequired.class);
                startActivity(Foods);
            }
        });
        /** TextView brush=(TextView)findViewById(R.id.brush);
        brush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Brush=new Intent(StartPage.this, ProperBrush.class);
                startActivity(Brush);
            }
        });**/
    }
}
