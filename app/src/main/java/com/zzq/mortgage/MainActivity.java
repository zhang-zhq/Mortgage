package com.zzq.mortgage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mortgageButton = (Button) findViewById(R.id.btn_mortgage);
        Button mortgageButton2 = (Button) findViewById(R.id.btn_mortgage2);
        mortgageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MortgageActivity.class);
                startActivity(intent);
            }
        });
        mortgageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MoreActivitySim.class);
                startActivity(intent);
            }
        });
    }
}