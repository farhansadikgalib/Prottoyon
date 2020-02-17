package com.farhan.prottoyon.All_Item;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.farhan.prottoyon.Approoved_Application.Activity_Approved_Application_details;
import com.farhan.prottoyon.R;

public class Activity_Approved_Application extends AppCompatActivity {

    CardView itemCV;
    TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_blank);

//        itemCV = findViewById(R.id.iteamID);
//        itemCV.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentManager fn =getSupportFragmentManager();
//                Approved_Application_details ApprovedAppDeatails = new Approved_Application_details();
//                fn.beginTransaction().replace(R.id.activity_item_2,ApprovedAppDeatails).commit();
////                asasd
//            }
//        });

        txt1 = findViewById(R.id.click_me);
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), Activity_Approved_Application_details.class));
            }
        });
    }


}
