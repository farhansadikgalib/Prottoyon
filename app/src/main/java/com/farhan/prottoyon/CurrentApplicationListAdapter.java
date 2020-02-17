package com.farhan.prottoyon;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class CurrentApplicationListAdapter extends RecyclerView.Adapter<CurrentApplicationListAdapter.ViewHolder> {

    private ArrayList<Applicants> applicantsList;

    Context context;

    public CurrentApplicationListAdapter(Context context,ArrayList<Applicants> applicantsList) {
        this.applicantsList = applicantsList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);



        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
      holder.nameTV.setText(position);
      holder.legacyTV.setText(position);
      holder.applicantionTV.setText(position);
      holder.applicantsIdTV.setText(position);

      holder.applicantionTV.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show();
          }
      });





    }

    @Override
    public int getItemCount() {
        return applicantsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView nameTV,legacyTV,applicantionTV,applicantsIdTV;
        CardView layout;


            public ViewHolder(@NonNull View itemView) {
                super(itemView);

                nameTV=itemView.findViewById(R.id.nameTV);
                legacyTV=itemView.findViewById(R.id.legacyTV);
                applicantionTV=itemView.findViewById(R.id.dateTV);
                applicantsIdTV=itemView.findViewById(R.id.applicantsIdTV);

               // itemCV = itemView.findViewById(R.id.iteamID);

//                layout = itemView.findViewById(R.id.iteamID);






            }
        }









    }
