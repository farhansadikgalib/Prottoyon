package com.farhan.prottoyon;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.farhan.prottoyon.All_Item.Activity_Item1;
import com.farhan.prottoyon.All_Item.Activity_item2;
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
    LinearLayout ItemId1,ItemId6;
    CardView ItemId2,ItemId3,ItemId4,ItemId5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        frameLayoutx = view.findViewById(R.id.mainframeLayout);

        ItemId1 = view.findViewById(R.id.ItemId1);
        ItemId2 = view.findViewById(R.id.ItemId2);
        ItemId3 = view.findViewById(R.id.ItemId3);
        ItemId4 = view.findViewById(R.id.ItemId4);
        ItemId5 = view.findViewById(R.id.ItemId5);
        ItemId6 = view.findViewById(R.id.ItemId6);

        ItemId1.setOnClickListener(this);
        ItemId2.setOnClickListener(this);
        ItemId3.setOnClickListener(this);
        ItemId4.setOnClickListener(this);
        ItemId5.setOnClickListener(this);
        ItemId6.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.ItemId1){
            startActivity(new Intent(getActivity(), Activity_Item1.class));
        }
        if (v.getId()==R.id.ItemId2){
            startActivity(new Intent(getActivity(), Activity_item2.class));
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
