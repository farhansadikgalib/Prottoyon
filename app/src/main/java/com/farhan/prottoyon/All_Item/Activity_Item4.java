package com.farhan.prottoyon.All_Item;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.farhan.prottoyon.Adapter.Adapter_item4;
import com.farhan.prottoyon.Model.ItemModel;
import com.farhan.prottoyon.R;

import java.util.ArrayList;
import java.util.List;

public class Activity_Item4 extends AppCompatActivity {

    private RecyclerView recyclerView;
    List<ItemModel> itemsx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__item4);

        itemsx = new ArrayList<>();
        getDatax();


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(Activity_Item4.this);
        recyclerView = findViewById(R.id.recyclerView4);
        recyclerView.setLayoutManager(linearLayoutManager);

        Adapter_item4 adapter = new Adapter_item4(Activity_Item4.this, itemsx);

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

