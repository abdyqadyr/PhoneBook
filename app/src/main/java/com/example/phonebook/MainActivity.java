package com.example.phonebook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView myList;
    private ArrayList<Contacts> users;
    private CustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myList = findViewById(R.id.listView);

        addContact();
        adapter = new CustomAdapter(this,users);
        myList.setAdapter(adapter);
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,final int position, long id) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main , menu);
        return true;
    }

    public void addContact(){
        users = new ArrayList<Contacts>();
        users.add(new Contacts("Niyara", "+77082300765",R.drawable.ic_android_black_24dp));
        users.add(new Contacts("Zheka", "+77073145192",R.drawable.ic_android_black_24dp));
        users.add(new Contacts("Madina", "+77074020024",R.drawable.ic_android_black_24dp));
        users.add(new Contacts("Niyara", "+77082300765",R.drawable.ic_android_black_24dp));
        users.add(new Contacts("Niyara", "+77082300765",R.drawable.ic_android_black_24dp));
    }

}
