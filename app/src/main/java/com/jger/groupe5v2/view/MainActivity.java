package com.jger.groupe5v2.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.jger.groupe5v2.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boutonCalculer = findViewById(R.id.button_nouvelle_partie);
        Button boutonDernierCalcul = findViewById(R.id.button_Score);
        boutonCalculer.setOnClickListener(view -> lancerActivityCalcul());
        boutonDernierCalcul.setOnClickListener(view -> lancerActivityDernierCalcul());

    }

    private void lancerActivityDernierCalcul() {
        Intent intent = new Intent(this, ScoreActivity.class);
        startActivity(intent);
    }

    private void lancerActivityCalcul() {
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }
}