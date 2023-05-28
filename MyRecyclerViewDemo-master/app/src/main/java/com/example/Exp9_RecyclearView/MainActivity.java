package com.example.Exp9_RecyclearView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Nagesh  Waghmode","abc@email.com",R.drawable.a));
        items.add(new Item("Sharad Bangar","abc@email.com",R.drawable.a));
        items.add(new Item("Sneha jawalekar","abc@email.com",R.drawable.b));
        items.add(new Item("Nisank Kose","abc@email.com",R.drawable.a));
        items.add(new Item("Ajay Surse","abc.j@email.com",R.drawable.f));
        items.add(new Item("Anil Ghuge","abc@email.com",R.drawable.f));
        items.add(new Item("Himanshu Bhure","abc@email.com",R.drawable.f));
        items.add(new Item("Shubham Bansode","abc@email.com",R.drawable.f));
        items.add(new Item("Nagesh  Waghmode","abc@email.com",R.drawable.a));
        items.add(new Item("Sharad Bangar","abc@email.com",R.drawable.a));
        items.add(new Item("Sneha jawalekar","abc@email.com",R.drawable.b));
        items.add(new Item("Nisank Kose","abc@email.com",R.drawable.a));
        items.add(new Item("Ajay Surse","abc.j@email.com",R.drawable.f));
        items.add(new Item("Anil Ghuge","abc@email.com",R.drawable.f));
        items.add(new Item("Himanshu Bhure","abc@email.com",R.drawable.f));
        items.add(new Item("Shubham Bansode","abc@email.com",R.drawable.f));
        items.add(new Item("Nagesh  Waghmode","abc@email.com",R.drawable.a));
        items.add(new Item("Sharad Bangar","abc@email.com",R.drawable.a));
        items.add(new Item("Sneha jawalekar","abc@email.com",R.drawable.b));
        items.add(new Item("Nisank Kose","abc@email.com",R.drawable.a));
        items.add(new Item("Ajay Surse","abc.j@email.com",R.drawable.f));
        items.add(new Item("Anil Ghuge","abc@email.com",R.drawable.f));
        items.add(new Item("Himanshu Bhure","abc@email.com",R.drawable.f));
        items.add(new Item("Shubham Bansode","abc@email.com",R.drawable.f));






        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));

    }
}