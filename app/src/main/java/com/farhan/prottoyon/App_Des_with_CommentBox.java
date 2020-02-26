package com.farhan.prottoyon;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.farhan.prottoyon.ItemLayouts.i1_Activity_Approved_Application_details;


public class App_Des_with_CommentBox extends AppCompatActivity {
    Button submit;
    TextView NID;

     Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_applicants_description_with_comment_box);


        NID = findViewById(R.id.nationalID_ID);

        NID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomDialog(App_Des_with_CommentBox.this);

            }
        });


        submit = findViewById(R.id.SubmitToUpdate);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(App_Des_with_CommentBox.this,Update.class));
            }
        });
        //Back Button Start
        ImageView backButton = findViewById(R.id.Shamprotic);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(App_Des_with_CommentBox.this, i1_Activity_Approved_Application_details.class));
            }
        });
        //Back Button End
    }



    public void showCustomDialog(Activity activity) {
//        ViewGroup viewGroup = findViewById(android.R.id.content);
//        View dialogView = LayoutInflater.from(this).inflate(R.layout.activity_national, viewGroup, false);
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setView(dialogView);
//        AlertDialog alertDialog = builder.create();
//        alertDialog.show();
//        alertDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        alertDialog.setCancelable(false);


        final Dialog dialog = new Dialog(activity, android.R.style.Theme_Translucent_NoTitleBar_Fullscreen);
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.activity_national);

        ImageView imageView =  dialog.findViewById(R.id.crossID);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });


//        Button dialogButton1 = (Button) dialog.findViewById(R.id.btn1);
//        dialogButton1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                dialog.dismiss();
//            }
//        });


        dialog.show();

    }
}
