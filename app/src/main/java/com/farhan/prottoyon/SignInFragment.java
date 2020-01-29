package com.farhan.prottoyon;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class SignInFragment extends Fragment {


    public SignInFragment() {
        // Required empty public constructor
    }
    private EditText phoneET,passwordET;
    private Button singInBtn;
    private CheckBox checkBox;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sign_in, container, false);
        phoneET = view.findViewById(R.id.phoneET);
        passwordET = view.findViewById(R.id.passET);
        singInBtn = view.findViewById(R.id.loginBtn);
        checkBox = view.findViewById(R.id.remenbercheckbox);


        singInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getContext(),MainActivity.class));

            }
        });





                return view;
    }


}
