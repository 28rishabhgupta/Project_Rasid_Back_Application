package com.example.rasid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class WelcomeActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome2);
        ImageView imageView = findViewById(R.id.welcomeactivity2button);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWelcomeActivity();
            }
        });
    }

    private void openWelcomeActivity() {
        Intent welcomeActivity2 = new Intent(WelcomeActivity2.this, StartUpActivity2.class);
        startActivity(welcomeActivity2);


    }
}