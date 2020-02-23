package com.farhan.prottoyon;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.farhan.prottoyon.All_Item.Activity_item2;

public class TimeOverActivity extends AppCompatActivity {

    AlertDialog alertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_over);

        //Back Button Start
        ImageView BackId = findViewById(R.id.backeId);
        BackId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TimeOverActivity.this, Activity_item2.class));
            }
        });
    }

    public void jachai_korun6(View view) {


        ViewGroup viewGroup = findViewById(android.R.id.content);
        View dialogView = LayoutInflater.from(this).inflate(R.layout.custom_alert_dialog, viewGroup, false);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(dialogView);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void prottakhan6(View view) {


        ViewGroup viewGroup = findViewById(android.R.id.content);
        View dialogView = LayoutInflater.from(this).inflate(R.layout.custom_alert_dialog_2, viewGroup, false);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(dialogView);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void lenden6(View view) {


        ViewGroup viewGroup = findViewById(android.R.id.content);
        View dialogView = LayoutInflater.from(this).inflate(R.layout.custom_alert_dialog_3, viewGroup, false);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(dialogView);
        alertDialog = builder.create();
        alertDialog.show();
    }

    public void accecpt(View view) {
        finish();
    }

    public void reject(View view) {
        finish();
    }

    public void submit(View view) {
        finish();
    }

    public void submitx(View view) {
     Button lenden = findViewById(R.id.lenden6);
        lenden.setVisibility(View.GONE);
        alertDialog.dismiss();



    }

}
