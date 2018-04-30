package com.holdaway.jake.quickfix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {
    private static final String TAG = "SearchActivity";

    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        ListView list = (ListView) findViewById(R.id.listview);
        String[] values = new String[] {"Sound Playback devices manager","Sound Troubleshoot audio","Hardware how to install cpu","Hardware how to install hdd",
        "Network how to fix internet issues", "Windows how to set up a restore point", "Device how to install a new keyboard"};


        EditText filter = (EditText) findViewById(R.id.txtsearch);
        Log.d(TAG, "onCreate, Started");




        adapter = new ArrayAdapter<String>(this, R.layout.list_item, values);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent loadintent = new Intent(view.getContext(), PlaybackActivity.class);
                    startActivityForResult(loadintent, 0);

                }
                else if (position == 1) {
                    Intent loadintent = new Intent(view.getContext(), TroubleaudioActivity.class);
                    startActivityForResult(loadintent, 1);
                }




            }
        });




        filter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                (SearchActivity.this).adapter.getFilter().filter(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


    }
}