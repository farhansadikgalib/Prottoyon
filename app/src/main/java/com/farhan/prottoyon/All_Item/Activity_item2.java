package com.farhan.prottoyon.All_Item;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.farhan.prottoyon.Adapter.Adapter_item2;
import com.farhan.prottoyon.Adapter.Adapter_item3;
import com.farhan.prottoyon.Approoved_Application.Activity_Approved_Application_details;
import com.farhan.prottoyon.MainActivity;
import com.farhan.prottoyon.Model.ItemModel;
import com.farhan.prottoyon.R;

import java.util.ArrayList;
import java.util.List;

public class Activity_item2 extends AppCompatActivity {

    private RecyclerView recyclerView;
    List<ItemModel> itemsx;
    ImageView backbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__item2);

    itemsx = new ArrayList<>();
    getDatax();
        //Back Button Start
    backbutton= findViewById(R.id.BackButton);
    backbutton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(Activity_item2.this, MainActivity.class));
        }
    });
        //Back Button End

    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(Activity_item2.this);
    recyclerView = findViewById(R.id.recyclerView2);
        recyclerView.setLayoutManager(linearLayoutManager);

    Adapter_item2 adapter = new Adapter_item2(Activity_item2.this, itemsx);
        recyclerView.setAdapter(adapter);

}

    public void getDatax(){



        itemsx.add(new ItemModel("ফারহান"," উত্তরাধিকার সনদ ","১০-২০-৩০","১২৩৪৫৬৭৮৯৫২৭৪"));
        itemsx.add(new ItemModel(" সাকিব "," বেকার সনদ ","১১-১২-১৩","১২৩৪৫৬৭৮৯৫২৭৪"));
        itemsx.add(new ItemModel(" মৃদুল "," বিবাহ সনদ ","১৩-১৪-১৫","১২৩৪৫৬৭৮৯৫২৭৪"));
        itemsx.add(new ItemModel(" সাগর "," উত্তরাধিকার সনদ  ","১৬-১৯-২০","১২৩৪৫৬৭৮৯৫২৭৪"));
        itemsx.add(new ItemModel(" সাকিব "," বেকার সনদ ","১১-১২-১৩","১২৩৪৫৬৭৮৯৫২৭৪"));
        itemsx.add(new ItemModel(" মৃদুল "," বিবাহ সনদ ","১৩-১৪-১৫","১২৩৪৫৬৭৮৯৫২৭৪"));
        itemsx.add(new ItemModel(" সাগর "," উত্তরাধিকার সনদ  ","১৬-১৯-২০","১২৩৪৫৬৭৮৯৫২৭৪"));
        itemsx.add(new ItemModel("ফারহান","উত্তরাধিকার সনদ ","1০২-০২-০২","১২৩৪৫৬৭৮৯৫২৭৪"));
        itemsx.add(new ItemModel(" সাকিব "," বেকার সনদ ","১১-১২-১৩","১২৩৪৫৬৭৮৯৫২৭৪"));
        itemsx.add(new ItemModel(" মৃদুল "," বিবাহ সনদ ","১৩-১৪-১৫","১২৩৪৫৬৭৮৯৫২৭৪"));
        itemsx.add(new ItemModel(" সাগর "," উত্তরাধিকার সনদ  ","১৬-১৯-২০","১২৩৪৫৬৭৮৯৫২৭৪"));
        itemsx.add(new ItemModel("ফারহান"," উত্তরাধিকার সনদ ","১০-২০-৩০","১২৩৪৫৬৭৮৯৫২৭৪"));
        itemsx.add(new ItemModel(" সাকিব "," বেকার সনদ ","১১-১২-১৩","১২৩৪৫৬৭৮৯৫২৭৪"));
        itemsx.add(new ItemModel(" মৃদুল "," বিবাহ সনদ ","১৩-১৪-১৫","১২৩৪৫৬৭৮৯৫২৭৪"));
        itemsx.add(new ItemModel(" সাগর "," উত্তরাধিকার সনদ  ","১৬-১৯-২০","১২৩৪৫৬৭৮৯৫২৭৪"));
        itemsx.add(new ItemModel(" সাকিব "," বেকার সনদ ","১১-১২-১৩","১২৩৪৫৬৭৮৯৫২৭৪"));
        itemsx.add(new ItemModel(" মৃদুল "," বিবাহ সনদ ","১৩-১৪-১৫","১২৩৪৫৬৭৮৯৫২৭৪"));
        itemsx.add(new ItemModel(" সাগর "," উত্তরাধিকার সনদ  ","১৬-১৯-২০","১২৩৪৫৬৭৮৯৫২৭৪"));
        itemsx.add(new ItemModel("ফারহান","উত্তরাধিকার সনদ ","1০২-০২-০২","১২৩৪৫৬৭৮৯৫২৭৪"));
        itemsx.add(new ItemModel(" সাকিব "," বেকার সনদ ","১১-১২-১৩","১২৩৪৫৬৭৮৯৫২৭৪"));
        itemsx.add(new ItemModel(" মৃদুল "," বিবাহ সনদ ","১৩-১৪-১৫","১২৩৪৫৬৭৮৯৫২৭৪"));
        itemsx.add(new ItemModel(" সাগর "," উত্তরাধিকার সনদ  ","১৬-১৯-২০","১২৩৪৫৬৭৮৯৫২৭৪"));





    }



}





