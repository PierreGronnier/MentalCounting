package com.jger.groupe5v2.view;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.jger.groupe5v2.R;
import com.jger.groupe5v2.controller.CalculBaseHelper;
import com.jger.groupe5v2.controller.CalculDao;
import com.jger.groupe5v2.controller.CalculService;

public class ScoreActivity extends AppCompatActivity {
    private CalculService calculService;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        calculService = new CalculService(new CalculDao(new CalculBaseHelper(this)));
        TextView nombreCalcul = findViewById(R.id.lastCompute_nombreCalcul);
        nombreCalcul.setText("Il y a "+calculService.getComputeCount()+" calculs dans ma base");
        Button boutonPrecedent = findViewById(R.id.boutonPrecedent);
        TextView textViewCalcul = findViewById(R.id.lastCompute_textViewCalcul);
        boutonPrecedent.setOnClickListener(view -> finish());
        Intent intent = getIntent();
        if(intent.getStringExtra("symbol")!=null){
            textViewCalcul.setText(intent
                    .getIntExtra("premierElement", 0)
                    + " " +
                    intent.getStringExtra("symbol")
                    + " " +
                    intent.getIntExtra("deuxiemeElement", 0)
                    + " = " +
                    intent.getIntExtra("resultat",0)
            );
        }else{
            textViewCalcul.setText("");
        }


    }
}