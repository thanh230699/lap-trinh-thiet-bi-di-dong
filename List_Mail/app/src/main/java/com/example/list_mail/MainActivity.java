package com.example.list_mail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Item> emailList = new ArrayList<>();
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new Adapter(emailList, MainActivity.this);
        recyclerView.setAdapter(adapter);
        getEmailList();
    }

    public void getEmailList() {
        emailList.add(new Item("Edurila.com", "$19 Only (First 10 spots) - Bestselling...\nAre you looking to Learn Web Designin...", "12:34 PM"));
        emailList.add(new Item("Chris Abad", "$19 Only (First 10 spots) - Bestselling...\nAre you looking to Learn Web Designin...", "11:22 AM"));
        emailList.add(new Item("Tuto.com", "$19 Only (First 10 spots) - Bestselling...\nAre you looking to Learn Web Designin...", "11:04 AM"));
        emailList.add(new Item("support", "$19 Only (First 10 spots) - Bestselling...\nAre you looking to Learn Web Designin...", "10:26 AM"));
        emailList.add(new Item("Matt from Ionic", "$19 Only (First 10 spots) - Bestselling...\nAre you looking to Learn Web Designin...", "10:11 AM"));
        emailList.add(new Item("Edurila.com", "$19 Only (First 10 spots) - Bestselling...\nAre you looking to Learn Web Designin...", "12:34 PM"));
        emailList.add(new Item("Chris Abad", "$19 Only (First 10 spots) - Bestselling...\nAre you looking to Learn Web Designin...", "11:22 AM"));
        emailList.add(new Item("Tuto.com", "$19 Only (First 10 spots) - Bestselling...\nAre you looking to Learn Web Designin...", "11:04 AM"));
        emailList.add(new Item("support", "$19 Only (First 10 spots) - Bestselling...\nAre you looking to Learn Web Designin...", "10:26 AM"));
        emailList.add(new Item("Matt from Ionic", "$19 Only (First 10 spots) - Bestselling...\nAre you looking to Learn Web Designin...", "10:11 AM"));

    }
}