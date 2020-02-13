package com.farhan.prottoyon;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CurrentApplicationListAdapter extends RecyclerView.Adapter<CurrentApplicationListAdapter.ViewHolder> {

    private List<Applicants> applicantsList;

    public CurrentApplicationListAdapter(ArrayList<CurrentApplicationListAdapter> applicantsList) {
        this.applicantsList = applicantsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
      holder.nameTV.setText(position);
      holder.legacyTV.setText(position);
      holder.applicantionTV.setText(position);
      holder.applicantsIdTV.setText(position);
    }

    @Override
    public int getItemCount() {
        return applicantsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView nameTV,legacyTV,applicantionTV,applicantsIdTV;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);

                nameTV=itemView.findViewById(R.id.nameTV);
                legacyTV=itemView.findViewById(R.id.legacyTV);
                applicantionTV=itemView.findViewById(R.id.applicantionTV);
                applicantsIdTV=itemView.findViewById(R.id.applicantsIdTV);
            }
        }
    }
