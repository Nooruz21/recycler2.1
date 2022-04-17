package com.example.homework31;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);
        contacts= new ArrayList<>();
        contacts.add("+9963244738978");
        contacts.add("+7777777777777");
        contacts.add("+9967564547233");
        contacts.add("+8888888888888");
        contacts.add("+9963468573280");
        contacts.add("+9952583585389");
        contacts.add("+2544367656788");
        contacts.add("+3258793456679");
        contacts.add("+9953246723469");
        contacts.add("+9325677468323");
        contacts.add("+9769823465787");
        contacts.add("+2347569854367");
        contacts.add("+8679324052843");
        contacts.add("+1235679081325");
        contacts.add("+1352967073862");
        ContactAdapter adapter= new ContactAdapter(contacts);
        recyclerView.setAdapter(adapter);
    }
}