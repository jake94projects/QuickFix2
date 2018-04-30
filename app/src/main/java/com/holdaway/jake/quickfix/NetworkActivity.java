package com.holdaway.jake.quickfix;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class NetworkActivity extends AppCompatActivity {

    ImageButton adapterbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network);



        adapterbtn = (ImageButton) findViewById(R.id.adapterbtn);
        adapterbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(NetworkActivity.this, NetworkadapterActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}
