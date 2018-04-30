package com.holdaway.jake.quickfix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class WindowsActivity extends AppCompatActivity {


    ImageButton restorebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_windows);



        restorebtn = (ImageButton) findViewById(R.id.restorebtn);
        restorebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(WindowsActivity.this, WindowsrestoreActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}
