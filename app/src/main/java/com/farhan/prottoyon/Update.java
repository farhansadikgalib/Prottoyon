package com.farhan.prottoyon;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.farhan.prottoyon.ItemLayouts.i1_Activity_Approved_Application_details;

public class Update extends AppCompatActivity {
    Button update;
    TextView NID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);


        NID = findViewById(R.id.nationalUP_ID);

        NID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomDialog(Update.this);

            }
        });

        update = findViewById(R.id.Update);

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Update.this,App_Des_with_CommentBox.class));

            }
        });

        ImageView backButton = findViewById(R.id.Shamprotic);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Update.this, App_Des_with_CommentBox.class));
            }
        });
    }

    public void showCustomDialog(Activity activity) {


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

        dialog.show();

    }


}
