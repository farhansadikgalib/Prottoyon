package com.farhan.prottoyon.All_Item;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.farhan.prottoyon.Adapter.Adapter_item6;
import com.farhan.prottoyon.Model.ItemModel;
import com.farhan.prottoyon.R;

import java.util.ArrayList;
import java.util.List;

public class Activity_Item6 extends AppCompatActivity {
    private RecyclerView recyclerView;
    List<ItemModel> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__item6);

        items = new ArrayList<>();

        getData();


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(Activity_Item6.this);
        recyclerView = findViewById(R.id.recyclerView6);
        recyclerView.setLayoutManager(linearLayoutManager);


        //List<ItemModel> rowListItem = getAllItemList() ;

        Adapter_item6 adapter = new Adapter_item6(Activity_Item6.this,items);

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

