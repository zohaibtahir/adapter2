package com.example.adapter2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class customGridView extends AppCompatActivity {

    String names[] = {"ali","furqan","atiq","ali","furqan","atiq"};
    int imgs[]={R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background};

    GridView gridview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_temp);

        gridview = findViewById(R.id.gridView);
        LocalAdapter adapter = new LocalAdapter(getApplicationContext(),names,imgs);
        gridview.setAdapter(adapter);

    }
}
