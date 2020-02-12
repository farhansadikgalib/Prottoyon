package com.farhan.prottoyon;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import androidx.fragment.app.Fragment;

import com.farhan.prottoyon.All_Item.Activity_Item1;
import com.farhan.prottoyon.All_Item.Activity_Approved_Apllication;
import com.farhan.prottoyon.All_Item.Activity_Item3;
import com.farhan.prottoyon.All_Item.Activity_Item4;
import com.farhan.prottoyon.All_Item.Activity_Item5;
import com.farhan.prottoyon.All_Item.Activity_Item6;


/**
 * A simple {@link Fragment} subclass.
 */
public class Dashboard extends Fragment implements  View.OnClickListener {


    public Dashboard() {
        // Required empty public constructor
    }

    FrameLayout frameLayoutx;
    RelativeLayout Item1,Item2,Item3,Item4,Item5,Item6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        frameLayoutx = view.findViewById(R.id.mainframeLayout);

        Item1 = view.findViewById(R.id.ItemId1);
        Item2 = view.findViewById(R.id.ItemId2);
        Item3 = view.findViewById(R.id.ItemId3);
        Item4 = view.findViewById(R.id.ItemId4);
        Item5 = view.findViewById(R.id.ItemId5);
        Item6 = view.findViewById(R.id.ItemId6);

        Item1.setOnClickListener(this);
        Item2.setOnClickListener(this);
        Item3.setOnClickListener(this);
        Item4.setOnClickListener(this);
        Item5.setOnClickListener(this);
        Item6.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.ItemId1){
            startActivity(new Intent(getActivity(), Activity_Item1.class));
        }
        if (v.getId()==R.id.ItemId2){
            startActivity(new Intent(getActivity(), Activity_Approved_Apllication.class));
        }
        if (v.getId()==R.id.ItemId3){
            startActivity(new Intent(getActivity(), Activity_Item3.class));
        }
        if (v.getId()==R.id.ItemId4){
            startActivity(new Intent(getActivity(), Activity_Item4.class));
        }
        if (v.getId()==R.id.ItemId5){
            startActivity(new Intent(getActivity(), Activity_Item5.class));
        }
        if (v.getId()==R.id.ItemId6){
            startActivity(new Intent(getActivity(), Activity_Item6.class));
        }


    }
}
