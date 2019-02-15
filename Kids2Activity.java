package com.example.papadakis.demo_thesis;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Kids2Activity extends AppCompatActivity {

    private Button button, Home;
    private ImageButton SecondImage, LastImage, FirstImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids2);

        //koumpi gia kids3
        button = (Button) findViewById(R.id.Next);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openKids3Activity();
            }
        });

        //koumpi gia paixnidi,eikona 1
        LastImage = (ImageButton) findViewById(R.id.FirstSound);
        LastImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Kids2Activity.this, "Αυτό θα γίνει τελευταίο!", Toast.LENGTH_LONG).show();
            }
        });

        //koumpi gia paixnidi,eikona 2
        FirstImage = (ImageButton) findViewById(R.id.SecondSound);
        FirstImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Kids2Activity.this, "Αυτό θα γίνει πρώτο!", Toast.LENGTH_LONG).show();
            }
        });

        //koumpi gia paixnidi,eikona 3
        SecondImage = (ImageButton) findViewById(R.id.LastSound);
        SecondImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Kids2Activity.this, "Αυτό θα γίνει δεύτερο!", Toast.LENGTH_LONG).show();
            }
        });

        //koumpi gia arxikh
        Home = (Button) findViewById(R.id.Home);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openUserActivity();
            }
        });

        //8etoume enan media player pou 8a paixei tous hxous
        final MediaPlayer secondSoundMediaPlayer = MediaPlayer.create(this, R.raw.second);

        ImageButton SecondSound = (ImageButton) this.findViewById(R.id.LastImage);

        SecondSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondSoundMediaPlayer.start();
            }
        });

        //8etoume antistoixa gia to prasino koumpi
        final MediaPlayer lastSoundMediaPlayer = MediaPlayer.create(this, R.raw.last);

        ImageButton LastSound = (ImageButton) this.findViewById(R.id.SecondImage);

        LastSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lastSoundMediaPlayer.start();
            }
        });

        //8etoume antistoixa gia to mwv koumpi
        final MediaPlayer firstSoundMediaPlayer = MediaPlayer.create(this, R.raw.first);

        ImageButton FirstSound = (ImageButton) this.findViewById(R.id.FirstImage);

        FirstSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstSoundMediaPlayer.start();
            }
        });

    }

    //Dhmiourgoume thn activity twn kids3
    public void openKids3Activity(){
        Intent intent = new Intent(this, Kids3Activity.class);
        startActivity(intent);
    }

    //Epistrefoume sthn arxikh
    public void openUserActivity(){
        Intent intent = new Intent(this, UserActivity.class);
        startActivity(intent);
    }
}
