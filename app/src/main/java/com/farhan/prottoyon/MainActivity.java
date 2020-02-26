package com.farhan.prottoyon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.farhan.prottoyon.All_Item.Activity_Item1;
import com.farhan.prottoyon.All_Item.Activity_Item3;
import com.farhan.prottoyon.All_Item.Activity_Item4;
import com.farhan.prottoyon.All_Item.Activity_Item5;
import com.farhan.prottoyon.All_Item.Activity_Item6;
import com.farhan.prottoyon.All_Item.Activity_item2;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;
    FrameLayout frameLayout;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("প্রত্যায়ন");
        setContentView(R.layout.activity_main); drawerLayout = findViewById(R.id.drawer);
        toolbar = findViewById(R.id.toolbar);

        navigationView = findViewById(R.id.navigationView);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.drawerOpen,R.string.drawerClose);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        frameLayout = findViewById(R.id.mainframeLayout);
        setFragment(new Dashboard());

    }
    private  void  setFragment(Fragment fragment) {

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(frameLayout.getId(), fragment);
        ft.commit();

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){

        }
        return false;
    }

    public void recentApplication(View view) {
        startActivity(new Intent(this, Activity_Item1.class));

    }

    public void approvedApplication(View view) {

        startActivity(new Intent(this, Activity_item2.class));

    }
    public void underConsiderationApplication(View view) {

        startActivity(new Intent(this, Activity_Item3.class));


    }
    public void UnApprovedApplication(View view) {

        startActivity(new Intent(this, Activity_Item4.class));


    }
    public void reAppliedApplication(View view) {

        startActivity(new Intent(this, Activity_Item5.class));

    }
    public void timeOver(View view) {

        startActivity(new Intent(this, Activity_Item6.class));


    }
    public void logout(View view) {


        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();


    }











}
