package com.farhan.prottoyon;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.farhan.prottoyon.All_Item.Activity_Item4;
import com.farhan.prottoyon.All_Item.Activity_item2;

public class Activity_Reject_Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reject_details);

        //Back Button Start
        ImageView backbutton = findViewById(R.id.backButtonId);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity_Reject_Details.this, Activity_Item4.class));
            }
        });
        //Back Button End
    }

    public void reject_details(View view) {


        ViewGroup viewGroup = findViewById(android.R.id.content);
        View dialogView = LayoutInflater.from(this).inflate(R.layout.custom_alert_dialog_4, viewGroup, false);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(dialogView);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();


    }
}
