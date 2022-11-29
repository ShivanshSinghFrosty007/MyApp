package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText number = findViewById(R.id.number);
        EditText username = findViewById(R.id.username);
        Button go = findViewById(R.id.go);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!number.getText().toString().equals("") && !username.getText().toString().equals("")){
                    Intent intent = new Intent(getApplicationContext(), VerifyActivity.class);
                    intent.putExtra("number", number.getText().toString());
                    intent.putExtra("username", username.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }
}