package com.farhan.prottoyon.ItemLayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.farhan.prottoyon.All_Item.Activity_item2;
import com.farhan.prottoyon.App_Des_with_CommentBox;
import com.farhan.prottoyon.R;
import com.farhan.prottoyon.Warish_class;

public class i2_Application_Details_Activity_2 extends AppCompatActivity {
    TextView appli_name, certificate_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_details__2);



        //Back Button Start
        ImageView BackId = findViewById(R.id.backeId);
        BackId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(i2_Application_Details_Activity_2.this, Activity_item2.class));
            }
        });
        //Back Button End
        appli_name = findViewById(R.id.applicant_name2);
        certificate_name = findViewById(R.id.certificate_name2);

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
}
