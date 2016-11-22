package com.android.curso.layouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonFrame = (Button)findViewById(R.id.frameLayout);
        Button buttonLinear = (Button)findViewById(R.id.linearLayout);
        Button buttonRelative = (Button)findViewById(R.id.relativeLayour);
        Button buttonTable = (Button)findViewById(R.id.tableLayout);
        Button buttonGrid = (Button)findViewById(R.id.gridLayout);

        buttonFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FrameActivity.class);
                startActivity(intent);
            }
        });

        buttonLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,LinearActivity.class);
                startActivity(intent);
            }
        });

        buttonTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,TableActivity.class);
                startActivity(intent);
            }
        });

        buttonRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RelativeActivity.class);
                startActivity(intent);
            }
        });

        buttonGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,GridActivity.class);
                startActivity(intent);
            }
        });
    }
}
