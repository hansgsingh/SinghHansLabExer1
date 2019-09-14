package com.example.singhhanslabexer1;

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

    public void viewLog(View v)
    {
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    public void activityTwo(View v)
    {
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }
}
