package com.dsi31g5.coronavirus2;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class resultatnegatif extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultatnegatif);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id =item.getItemId();
        if (id== R.id.info){
            startActivity(new Intent(getApplicationContext(), information.class));
        }else if (id== R.id.quest){
            startActivity(new Intent(getApplicationContext(), questionnaire.class));
        }
        return true;
    }
    public void envoyer(View view) {
        Intent intent = new Intent(this, fin.class);
        startActivity(intent);
    }
}