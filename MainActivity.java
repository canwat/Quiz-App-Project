package com.example.android.robert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startPage(View view) {
        EditText userName=(EditText)findViewById(R.id.User);

        if (userName.getText().toString().length() == 0) {
            userName.setError("Name is required!");
        }else {
        Intent start=new Intent(MainActivity.this, StartPage.class);
        startActivity(start);
        }

    }
}
