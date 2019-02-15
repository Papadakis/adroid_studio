package com.example.papadakis.demo_thesis;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HelpMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_main);

        //mple koumpi
        final MediaPlayer blueSoundMediaPlayer = MediaPlayer.create(this, R.raw.blue_rec);

        ImageButton imageButton2 = (ImageButton) this.findViewById(R.id.LastImage);

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blueSoundMediaPlayer.start();
            }
        });

        //prasino koumpi
        final MediaPlayer greenSoundMediaPlayer = MediaPlayer.create(this, R.raw.green_rec);

        ImageButton imageButton3 = (ImageButton) this.findViewById(R.id.FirstSound);

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                greenSoundMediaPlayer.start();
            }
        });

        //mwv koumpi
        final MediaPlayer purpleSoundMediaPlayer = MediaPlayer.create(this, R.raw.purple_rec);

        ImageButton imageButton5 = (ImageButton) this.findViewById(R.id.LastSound);

        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                purpleSoundMediaPlayer.start();
            }
        });

        //portokali koumpi
        final MediaPlayer orangeSoundMediaPlayer = MediaPlayer.create(this, R.raw.orange_rec);

        ImageButton imageButton6 = (ImageButton) this.findViewById(R.id.imageButton6);

        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orangeSoundMediaPlayer.start();
            }
        });

        //kokkino koumpi
        final MediaPlayer redSoundMediaPlayer = MediaPlayer.create(this, R.raw.red_rec);

        ImageButton imageButton4 = (ImageButton) this.findViewById(R.id.SecondSound);

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redSoundMediaPlayer.start();
            }
        });
    }
}
