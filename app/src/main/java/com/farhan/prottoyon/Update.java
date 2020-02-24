package com.farhan.prottoyon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.farhan.prottoyon.ItemLayouts.i1_Activity_Approved_Application_details;

public class Update extends AppCompatActivity {
    Button update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

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
}
