package com.farhan.prottoyon.Approoved_Application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.farhan.prottoyon.All_Item.Activity_Item5;
import com.farhan.prottoyon.MainActivity;
import com.farhan.prottoyon.R;

public class Warish_class extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_warish);

        //Back Button Start
        ImageView BackId = findViewById(R.id.back);
        BackId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Warish_class.this, Activity_Approved_Application_details.class));
            }
        });
        //Back Button End
    }
}
