package com.dsi31g5.coronavirus2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class information extends AppCompatActivity {
    TextView myText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        myText = findViewById(R.id.menu_message);
    }

    public void envoyer(View view) {
        Intent intent = new Intent(this, questionnaire.class);
        startActivity(intent);
    }
    @SuppressLint("ResourceType")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.layout.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                myText.setText(getString(R.string.action_settings));
                return true;

            case R.id.action_home:
                myText.setText(getString(R.string.action_home));
                return true;

            case R.id.action_search:
                myText.setText(getString(R.string.action_search));
                return true;

            case R.id.action_item_a:
                myText.setText(getString(R.string.action_item_a));
                return true;

            case R.id.action_item_b:
                myText.setText(getString(R.string.action_item_b));
                return true;

            default:

                return super.onOptionsItemSelected(item);
        }
    }
}

