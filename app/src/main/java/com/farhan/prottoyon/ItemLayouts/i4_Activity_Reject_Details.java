package com.farhan.prottoyon.ItemLayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.farhan.prottoyon.All_Item.Activity_Item4;
import com.farhan.prottoyon.App_Des_with_CommentBox;
import com.farhan.prottoyon.R;
import com.farhan.prottoyon.Warish_class;

public class i4_Activity_Reject_Details extends AppCompatActivity {
    TextView appli_name, certificate_name;
    AlertDialog alertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reject_details);


        //Back Button Start
        ImageView backbutton = findViewById(R.id.backButtonId);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(i4_Activity_Reject_Details.this, Activity_Item4.class));
            }
        });
        //Back Button End



        appli_name = findViewById(R.id.applicant_name4);
        certificate_name = findViewById(R.id.certificate_name4);

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

    public void reject_details(View view) {


        ViewGroup viewGroup = findViewById(android.R.id.content);
        View dialogView = LayoutInflater.from(this).inflate(R.layout.custom_alert_dialog_4, viewGroup, false);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(dialogView);
        alertDialog = builder.create();
        alertDialog.show();


    }

    public void crossY(View view) {
        alertDialog.dismiss();
    }
}
