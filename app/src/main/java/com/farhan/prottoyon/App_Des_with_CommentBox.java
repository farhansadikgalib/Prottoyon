package com.farhan.prottoyon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.farhan.prottoyon.All_Item.Activity_Item1;
import com.farhan.prottoyon.R;
import com.farhan.prottoyon.i1_Activity_Approved_Application_details;

public class App_Des_with_CommentBox extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_applicants_description_with_comment_box);
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
}
