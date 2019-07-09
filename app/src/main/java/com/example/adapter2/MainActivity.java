package com.example.adapter2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Button custmbtn,gridbtn;
    GridView gridview;

    ListView listview;

    String names[] = {"ali","furqan","atiq"};
    int imgs[]={R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        custmbtn = findViewById(R.id.custombtn);
        gridbtn = findViewById(R.id.gridbtn);
        listview = findViewById(R.id.listView);
        gridview = findViewById(R.id.gridView);

        custmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridview.setVisibility(View.GONE);
                listview.setVisibility(View.VISIBLE);
                LocalAdapter adapter = new LocalAdapter(getApplicationContext(),names,imgs);
                listview.setAdapter(adapter);
            }
        });
        gridbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridview.setVisibility(View.VISIBLE);
                listview.setVisibility(View.GONE);
                LocalAdapter adapter = new LocalAdapter(getApplicationContext(),names,imgs);
                gridview.setAdapter(adapter);
            }
        });
    }
}
