package com.farhan.prottoyon;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class CurrentApplicationListFragment extends Fragment {

    ArrayList<CurrentApplicationListAdapter> applicantsList =new ArrayList<>();
    RecyclerView applicantsRV;
    Context context;
    RecyclerView.LayoutManager layoutManager;


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context=context;
    }

    public CurrentApplicationListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_current_application_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        applicantsRV=view.findViewById(R.id.applicantsRV);
        // in content do not change the layout size of the RecyclerView

        applicantsRV.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(getContext());
        applicantsRV.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        CurrentApplicationListAdapter mAdapter = new CurrentApplicationListAdapter(applicantsList);
        applicantsRV.setAdapter(mAdapter);
    }
}
