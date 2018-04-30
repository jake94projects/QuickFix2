package com.holdaway.jake.quickfix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class OsActivity extends AppCompatActivity {


    ImageButton windowsimgbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os);


        windowsimgbtn = (ImageButton) findViewById(R.id.windowsimgbtn);
        windowsimgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(OsActivity.this, WindowsActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });

    }
}
