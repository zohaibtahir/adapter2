package com.example.adapter2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;

public class customListView extends AppCompatActivity {

    ListView listview;

    String names[] = {"ali","furqan","atiq"};
    int imgs[]={R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        listview = findViewById(R.id.listView);
        LocalAdapter adapter = new LocalAdapter(getApplicationContext(),names,imgs);
        listview.setAdapter(adapter);

    }
}
