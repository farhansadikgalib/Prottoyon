package com.farhan.prottoyon;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Splash_Last_Page_Activity extends AppCompatActivity {

    //Turzzw
    private  EditText EToldpass,ETnewpass;
    Button BTsubmit;
    String newpassST,repassST;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen_last_page_acrivity);


        //Turzz
        EToldpass = findViewById(R.id.newpassID);
        ETnewpass =findViewById(R.id.repassID);
        BTsubmit =findViewById(R.id.submitButtonID);



        BTsubmit.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {
                newpassST = ETnewpass.getText().toString();
                repassST = EToldpass.getText().toString();

                if(newpassST.equals(repassST))
                {
                    Toast.makeText(Splash_Last_Page_Activity.this, "Successs", Toast.LENGTH_SHORT).show();
                }

                else{
                    Toast.makeText(Splash_Last_Page_Activity.this, "fail vai", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}
