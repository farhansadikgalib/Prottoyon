package com.farhan.prottoyon.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.farhan.prottoyon.ItemLayouts.i4_Activity_Reject_Details;
import com.farhan.prottoyon.Model.ItemModel;
import com.farhan.prottoyon.R;

import java.util.List;

public class Adapter_item4 extends  RecyclerView.Adapter<Adapter_item6.ViewHolder> {

    private Context context;
    private List<ItemModel> itemModelList;

    public Adapter_item4(Context context, List<ItemModel> list) {
        this.context = context;
        this.itemModelList = list;
    }

    @Override
    public Adapter_item6.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.row_layout, parent, false);
        return new Adapter_item6.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(Adapter_item6.ViewHolder holder, final int position) {
        final ItemModel itemModel = itemModelList.get(position);


        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, ""+itemModel.getApplicantName() ,Toast.LENGTH_SHORT).show();

                Intent i = new Intent(context, i4_Activity_Reject_Details.class);
                context.startActivity(i);
            }
        });


    }

    @Override
    public int getItemCount() {
        return itemModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);

            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}



