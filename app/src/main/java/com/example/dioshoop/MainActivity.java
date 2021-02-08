package com.example.dioshoop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void chat(View view){
        Intent intent=new Intent(MainActivity.this,ChatActivity.class);
        startActivity(intent);

    }

    public void history(View view){
        Intent intent=new Intent(MainActivity.this,HistoryActivity.class);
        startActivity(intent);

    }

    public void home(View view){
        Intent intent=new Intent(MainActivity.this,HomeActivity.class);
        startActivity(intent);

    }

    public void checklist(View view){
        Intent intent=new Intent(MainActivity.this,ChecklistActivity.class);
        startActivity(intent);

    }

    public void settings(View view){
        Intent intent=new Intent(MainActivity.this,SettingsActivity.class);
        startActivity(intent);

    }

    public void shopping(View view){
        Intent intent=new Intent(MainActivity.this,ShoppingActivity.class);
        startActivity(intent);

    }

}