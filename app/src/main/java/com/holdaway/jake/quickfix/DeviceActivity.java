package com.holdaway.jake.quickfix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DeviceActivity extends AppCompatActivity {


    ImageButton devicemanagerbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device);


        devicemanagerbtn = (ImageButton) findViewById(R.id.devicemanagerbtn);
        devicemanagerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(DeviceActivity.this, DevicemanagerActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}


