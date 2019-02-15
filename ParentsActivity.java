package com.example.papadakis.demo_thesis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ParentsActivity extends AppCompatActivity {

    private Button button;
    private Button button3;
    private Button button4;
    private Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parents);

        //koumpi gia fai
        button = (Button) findViewById(R.id.Next);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openparents_eatActivity();
            }
        });

        //koumpi gia drasthriothtes
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openparents_todoActivity();
            }
        });

        //koumpi gia topika epirrhmata
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openparents_localActivity();
            }
        });

        //koumpi gia idiothtes
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openparents_attributesActivity();
            }
        });

    }

    //Dhmiourgoume thn activity tou faghtou
    public void openparents_eatActivity(){
        Intent intent = new Intent(this, parents_eatActivity.class);
        startActivity(intent);
    }

    //Dhmiourgoume thn activity twn drasthriothtwn
    public void openparents_todoActivity(){
        Intent intent = new Intent(this, parents_todoActivity.class);
        startActivity(intent);
    }

    //Dhmiourgoume thn activity twn topikwn epirrhmatwn
    public void openparents_localActivity(){
        Intent intent = new Intent(this, parents_localActivity.class);
        startActivity(intent);
    }

    //Dhmiourgoume thn activity twn idiothtwn
    public void openparents_attributesActivity(){
        Intent intent = new Intent(this, parents_attributesActivity.class);
        startActivity(intent);
    }
}
