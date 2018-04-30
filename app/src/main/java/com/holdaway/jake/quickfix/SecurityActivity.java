package com.holdaway.jake.quickfix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class SecurityActivity extends AppCompatActivity {


    ImageButton defenderbtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security);




        defenderbtn = (ImageButton) findViewById(R.id.defenderbtn);
        defenderbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(SecurityActivity.this, DefenderActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}
