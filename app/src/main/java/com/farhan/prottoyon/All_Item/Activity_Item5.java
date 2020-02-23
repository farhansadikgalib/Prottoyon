package com.farhan.prottoyon.All_Item;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.farhan.prottoyon.Adapter.Adapter_item5;
import com.farhan.prottoyon.Adapter.Adapter_item6;
import com.farhan.prottoyon.MainActivity;
import com.farhan.prottoyon.Model.ItemModel;
import com.farhan.prottoyon.R;

import java.util.ArrayList;
import java.util.List;

public class Activity_Item5 extends AppCompatActivity {

    private RecyclerView recyclerView;
    List<ItemModel> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__item5);

        items = new ArrayList<>();

        //Back Button Start
        ImageView BackId = findViewById(R.id.backButtonId);
        BackId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity_Item5.this, MainActivity.class));
            }
        });
        //Back Button End

        getData();


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(Activity_Item5.this);
        recyclerView = findViewById(R.id.recyclerView5);
        recyclerView.setLayoutManager(linearLayoutManager);



        Adapter_item5 adapter = new Adapter_item5(Activity_Item5.this,items);

        recyclerView.setAdapter(adapter);



    }

    public void  getData(){



        items.add(new ItemModel("ফারহান"," উত্তরাধিকার সনদ ","১০-২০-৩০","১২৩৪৫৬৭৮৯৫২৭৪"));
        items.add(new ItemModel(" সাকিব "," বেকার সনদ ","১১-১২-১৩","১২৩৪৫৬৭৮৯৫২৭৪"));
        items.add(new ItemModel(" মৃদুল "," বিবাহ সনদ ","১৩-১৪-১৫","১২৩৪৫৬৭৮৯৫২৭৪"));
        items.add(new ItemModel(" সাগর "," উত্তরাধিকার সনদ  ","১৬-১৯-২০","১২৩৪৫৬৭৮৯৫২৭৪"));
        items.add(new ItemModel(" সাকিব "," বেকার সনদ ","১১-১২-১৩","১২৩৪৫৬৭৮৯৫২৭৪"));
        items.add(new ItemModel(" মৃদুল "," বিবাহ সনদ ","১৩-১৪-১৫","১২৩৪৫৬৭৮৯৫২৭৪"));
        items.add(new ItemModel(" সাগর "," উত্তরাধিকার সনদ  ","১৬-১৯-২০","১২৩৪৫৬৭৮৯৫২৭৪"));
        items.add(new ItemModel("ফারহান","উত্তরাধিকার সনদ ","1০২-০২-০২","১২৩৪৫৬৭৮৯৫২৭৪"));
        items.add(new ItemModel(" সাকিব "," বেকার সনদ ","১১-১২-১৩","১২৩৪৫৬৭৮৯৫২৭৪"));
        items.add(new ItemModel(" মৃদুল "," বিবাহ সনদ ","১৩-১৪-১৫","১২৩৪৫৬৭৮৯৫২৭৪"));
        items.add(new ItemModel(" সাগর "," উত্তরাধিকার সনদ  ","১৬-১৯-২০","১২৩৪৫৬৭৮৯৫২৭৪"));
        items.add(new ItemModel("ফারহান"," উত্তরাধিকার সনদ ","১০-২০-৩০","১২৩৪৫৬৭৮৯৫২৭৪"));
        items.add(new ItemModel(" সাকিব "," বেকার সনদ ","১১-১২-১৩","১২৩৪৫৬৭৮৯৫২৭৪"));
        items.add(new ItemModel(" মৃদুল "," বিবাহ সনদ ","১৩-১৪-১৫","১২৩৪৫৬৭৮৯৫২৭৪"));
        items.add(new ItemModel(" সাগর "," উত্তরাধিকার সনদ  ","১৬-১৯-২০","১২৩৪৫৬৭৮৯৫২৭৪"));
        items.add(new ItemModel(" সাকিব "," বেকার সনদ ","১১-১২-১৩","১২৩৪৫৬৭৮৯৫২৭৪"));
        items.add(new ItemModel(" মৃদুল "," বিবাহ সনদ ","১৩-১৪-১৫","১২৩৪৫৬৭৮৯৫২৭৪"));
        items.add(new ItemModel(" সাগর "," উত্তরাধিকার সনদ  ","১৬-১৯-২০","১২৩৪৫৬৭৮৯৫২৭৪"));
        items.add(new ItemModel("ফারহান","উত্তরাধিকার সনদ ","1০২-০২-০২","১২৩৪৫৬৭৮৯৫২৭৪"));
        items.add(new ItemModel(" সাকিব "," বেকার সনদ ","১১-১২-১৩","১২৩৪৫৬৭৮৯৫২৭৪"));
        items.add(new ItemModel(" মৃদুল "," বিবাহ সনদ ","১৩-১৪-১৫","১২৩৪৫৬৭৮৯৫২৭৪"));
        items.add(new ItemModel(" সাগর "," উত্তরাধিকার সনদ  ","১৬-১৯-২০","১২৩৪৫৬৭৮৯৫২৭৪"));



    }





}

