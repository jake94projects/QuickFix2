package com.holdaway.jake.quickfix;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Jake on 20/04/2018.
 */

public class Frag2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag2_layout, container, false);

        Button opensound = (Button)v.findViewById(R.id.btnsound);
        opensound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SoundActivity.class);
                startActivity(intent);
            }
        });


        Button openos = (Button)v.findViewById(R.id.btnos);
        openos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), OsActivity.class);
                startActivity(intent);
            }
        });


        Button opennetwork = (Button)v.findViewById(R.id.btnnetwork);
        opennetwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NetworkActivity.class);
                startActivity(intent);
            }
        });


        Button openhardware = (Button)v.findViewById(R.id.btnhardware);
        openhardware.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), HardwareActivity.class);
                startActivity(intent);
            }
        });


        Button opendevice = (Button)v.findViewById(R.id.btndevice);
        opendevice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DeviceActivity.class);
                startActivity(intent);
            }
        });


        Button opensecurity = (Button)v.findViewById(R.id.btnsecurity);
        opensecurity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SecurityActivity.class);
                startActivity(intent);
            }
        });

        Button opensearch = (Button)v.findViewById(R.id.btnsearch);
        opensearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SearchActivity.class);
                startActivity(intent);
            }
        });



        return v;


    }
}
