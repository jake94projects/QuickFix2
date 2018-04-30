package com.holdaway.jake.quickfix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SoundActivity extends AppCompatActivity {

    ImageButton playbackbtn;
    ImageButton troubleaudiobtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound);


        playbackbtn = (ImageButton) findViewById(R.id.playbackbtn);
        playbackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(SoundActivity.this, PlaybackActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });



    }
}



