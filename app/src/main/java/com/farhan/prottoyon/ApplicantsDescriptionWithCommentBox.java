package com.farhan.prottoyon;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class ApplicantsDescriptionWithCommentBox extends Fragment {

    TextView NID;
    Context context;

    public ApplicantsDescriptionWithCommentBox() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = LayoutInflater.from(context).inflate(R.layout.fragment_applicants_description_with_comment_box, container, false);
        // Inflate the layout for this fragment


        return view;








    }




}
