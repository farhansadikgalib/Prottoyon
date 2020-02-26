package com.farhan.prottoyon.ItemLayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.farhan.prottoyon.App_Des_with_CommentBox;
import com.farhan.prottoyon.R;
import com.farhan.prottoyon.Warish_class;

public class i5_RenewApplicationActivity extends AppCompatActivity {

    AlertDialog alertDialog;
    TextView appli_name, certificate_name;
    Button lenden;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_renew_application);
        appli_name = findViewById(R.id.applicant_name5);
        certificate_name = findViewById(R.id.certificate_name5);



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

    public void lenden5(View view) {


        ViewGroup viewGroup = findViewById(android.R.id.content);
        View dialogView = LayoutInflater.from(this).inflate(R.layout.custom_alert_dialog_3, viewGroup, false);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(dialogView);
        alertDialog = builder.create();
        alertDialog.show();


    }

    public void prottakhan5(View view) {


        ViewGroup viewGroup = findViewById(android.R.id.content);
        View dialogView = LayoutInflater.from(this).inflate(R.layout.custom_alert_dialog_4, viewGroup, false);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(dialogView);
         alertDialog = builder.create();
         alertDialog.show();
    }

    public void jachai_korun5(View view) {

        ViewGroup viewGroup = findViewById(android.R.id.content);
        View dialogView = LayoutInflater.from(this).inflate(R.layout.custom_alert_dialog, viewGroup, false);
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

        lenden = findViewById(R.id.lendenx5);
        lenden.setVisibility(View.GONE);
        alertDialog.dismiss();

    }


    public void Cross(View view) {

        alertDialog.dismiss();

    }

    public void crossx(View view) {
        alertDialog.dismiss();
    }

    public void crossM(View view) {

        alertDialog.dismiss();

    }

    public void crossY(View view) {

        alertDialog.dismiss();

    }
}
