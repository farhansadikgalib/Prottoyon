package com.farhan.prottoyon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.farhan.prottoyon.All_Item.Activity_item2;

public class i2_Application_Details_Activity_2 extends AppCompatActivity {

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
    }
}
