package com.androidjavaproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    private ArrayList<Item> list ;
    private RecyclerView mList;
    private ListAdapter mListAdapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        mList = findViewById(R.id.list);
        list = new ArrayList<>();
        createList();
        System.out.println("Create list");
        mListAdapter = new ListAdapter(this, list);
        mList.setAdapter(mListAdapter);
        mList.setLayoutManager(new LinearLayoutManager(this));
    }

    private void createList() {
        list.add(new Item("Thor",R.drawable.image1));
        list.add(new Item("IronMan",R.drawable.image1));
    }
}
