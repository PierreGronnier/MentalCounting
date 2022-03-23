package com.jger.groupe5v2.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.jger.groupe5v2.R;

public class AproposActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_propos);
        Button boutonApropos = findViewById(R.id.button_retour_apropos);
        boutonApropos.setOnClickListener(view -> lancerActivityMain());
    }

    private void lancerActivityMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}
