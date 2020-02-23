package com.farhan.prottoyon.ItemLayouts;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.farhan.prottoyon.All_Item.Activity_Item3;
import com.farhan.prottoyon.App_Des_with_CommentBox;
import com.farhan.prottoyon.R;
import com.farhan.prottoyon.Warish_class;

public class i3_ApplicantDetailsActivity extends AppCompatActivity {

    TextView appli_name, certificate_name;
    Button lenden ;
    AlertDialog alertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applicant_details);

        //Back Button Start
        ImageView backbutton = findViewById(R.id.item3);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(i3_ApplicantDetailsActivity.this, Activity_Item3.class));
            }
        });
        //Back Button End


        appli_name = findViewById(R.id.applicant_name3);
        certificate_name = findViewById(R.id.certificate_name3);

        appli_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), App_Des_with_CommentBox.class));
            }
        });

        certificate_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), Warish_class.class));
            }
        });



    }

    public void lenden3(View view) {

        ViewGroup viewGroup = findViewById(android.R.id.content);
        View dialogView = LayoutInflater.from(this).inflate(R.layout.custom_alert_dialog_3, viewGroup, false);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(dialogView);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();



    }

    public void jachai_korun3(View view) {

        ViewGroup viewGroup = findViewById(android.R.id.content);
        View dialogView = LayoutInflater.from(this).inflate(R.layout.custom_alert_dialog, viewGroup, false);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(dialogView);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();


    }

    public void prottakhan3(View view) {


        ViewGroup viewGroup = findViewById(android.R.id.content);
        View dialogView = LayoutInflater.from(this).inflate(R.layout.custom_alert_dialog_2, viewGroup, false);
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
        lenden = findViewById(R.id.lenden3);
        lenden.setVisibility(View.GONE);
        alertDialog.dismiss();



    }


}
