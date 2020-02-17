package com.farhan.prottoyon.Approoved_Application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.farhan.prottoyon.ApplicantsDescriptionWithCommentBox;
import com.farhan.prottoyon.LoginActivity;
import com.farhan.prottoyon.R;

public class Activity_Approved_Application_details extends AppCompatActivity {

    TextView appli_name,certificate_name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_17_aplication_details);

        appli_name = findViewById(R.id.applicant_name);
        certificate_name = findViewById(R.id.certificate_name);

        appli_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(),App_Des_with_CommentBox.class));
            }
        });

        certificate_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), Warish_class.class));
            }
        });


    }
}
