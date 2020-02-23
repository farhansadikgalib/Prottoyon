package com.farhan.prottoyon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.farhan.prottoyon.All_Item.Activity_Item3;
import com.farhan.prottoyon.All_Item.Activity_Item6;

public class ApplicantDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applicant_details);

        //Back Button Start
        ImageView BackId = findViewById(R.id.backButtonId);
        BackId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ApplicantDetailsActivity.this, Activity_Item6.class));
            }
        });//Back Button End
    }
}
