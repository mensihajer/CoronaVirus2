package com.dsi31g5.coronavirus2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
    }
    public void envoyer(View view) {
        Intent intent = new Intent(this, questionnaire.class);
        startActivity(intent);
    }
}