package com.farhan.prottoyon.All_Item;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

import com.farhan.prottoyon.Approoved_Application.Approved_Application_details;
import com.farhan.prottoyon.R;

public class Activity_Approved_Application extends AppCompatActivity {

    CardView itemCV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.row_layout);

        itemCV = findViewById(R.id.iteamID);
        itemCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fn =getSupportFragmentManager();
                Approved_Application_details ApprovedAppDeatails = new Approved_Application_details();
                fn.beginTransaction().replace(R.id.activity_item_2,ApprovedAppDeatails).commit();
            }
        });



    }

    public void clickmefunc(View view) {

//        Fragment someFragment = new Activity_Approved_Application();
//        FragmentTransaction transaction = getFragmentManager().beginTransaction();
//        transaction.replace(R.id.applicantsId, someFragment ); // give your fragment container id in first parameter
//        transaction.addToBackStack(null);  // if written, this transaction will be added to backstack
//        transaction.commit();



    }
}
