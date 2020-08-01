package com.example.myfoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View v, int position, long id) {

                if (position==0)
                {
                    Intent intent = new Intent(MainActivity.this, FoodCategoryActivity.class);
                    startActivity(intent);
                }
            }
        };
        ListView listview =(ListView) findViewById(R.id.list_options);
        listview.setOnItemClickListener(itemClickListener);
    }
}
