package com.example.ltdd_kt1_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;


public class ListActivity extends AppCompatActivity {
    ListView lvSinger;
    ArrayList<Singer> arraySinger;
    SingerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        AnhXa();
        adapter = new SingerAdapter(this, R.layout.activity_listitem, arraySinger);
        lvSinger.setAdapter(adapter);
    }

    private void AnhXa() {
        lvSinger = (ListView) findViewById(R.id.lvSinger);
        arraySinger = new ArrayList<>();
        arraySinger.add(new Singer("Stefani Joanne Angelina Germanotta", "America", "Lady Gaga",R.drawable.singer1,1250));
        arraySinger.add(new Singer("Adam Noah Levine","America", "Adam Levine", R.drawable.singer2,2041));
        arraySinger.add(new Singer("Ariana Grande-Butera", "America", "Ariana Grande", R.drawable.singer3,921));
        arraySinger.add(new Singer("Justin Drew Bieber", "Canada", "Justin Bieber", R.drawable.singer4,5214));
        arraySinger.add(new Singer("Sia Kate Isobelle Furler", "Australia", "Sia",R.drawable.singer5,1921));

    }
}

