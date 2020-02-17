package com.farhan.prottoyon.Model;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.farhan.prottoyon.All_Item.Activity_Item5;
import com.farhan.prottoyon.ApplicantDetailsActivity;
import com.farhan.prottoyon.R;

import java.util.List;

public class AdapetList extends  RecyclerView.Adapter<AdapetList.ViewHolder> {

    private Context context;
    private List<ItemModel> doctorList;

    public AdapetList(Context context, List<ItemModel> list) {
        this.context = context;
        this.doctorList = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.row_layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final ItemModel doctor = doctorList.get(position);


        holder.phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, ""+doctor.getApplicantName() ,Toast.LENGTH_SHORT).show();

                Intent i = new Intent(context, ApplicantDetailsActivity.class);
                context.startActivity(i);


            }
        });


    }

    @Override
    public int getItemCount() {
        return doctorList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CardView phone;

        public ViewHolder(View itemView) {
            super(itemView);


            phone = itemView.findViewById(R.id.cardView);
        }
    }
}



