package com.example.rasid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        ImageView imageView = findViewById(R.id.nextactivitybutton);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNextActivity();
            }
        });

    }

    private void openNextActivity() {
        Intent nextActivity = new Intent(NextActivity.this, WelcomeActivity2.class);
        startActivity(nextActivity);
    }
}