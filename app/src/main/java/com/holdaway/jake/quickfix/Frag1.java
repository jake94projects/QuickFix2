package com.holdaway.jake.quickfix;



import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * Created by Jake on 20/04/2018.
 */

public class Frag1 extends Fragment {
    public Frag1() {
        //public constructor
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate((R.layout.frag1_layout), container, false);

        ImageButton audiobtn = (ImageButton) view.findViewById(R.id.audiobtn);
        audiobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(getActivity() , PlaybackActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });

        ImageButton defenderbtn = (ImageButton) view.findViewById(R.id.defenderbtn);
        defenderbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(getActivity() , DefenderActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });

        ImageButton restorebtn = (ImageButton) view.findViewById(R.id.restorebtn);
        restorebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(getActivity() , WindowsrestoreActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });

        ImageButton devicemanagerbtn = (ImageButton) view.findViewById(R.id.devicemanagerbtn);
        devicemanagerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(getActivity() , DevicemanagerActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });

        ImageButton networkbtn = (ImageButton) view.findViewById(R.id.networkbtn);
        networkbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(getActivity() , NetworkadapterActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });



        //inflate layout fragment
        return view;
    }
}









