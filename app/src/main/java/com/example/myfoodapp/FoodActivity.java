package com.example.myfoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity {

    public static final String EXTRA_FOODNO= "foodno";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        int foodno= (int) getIntent().getExtras().get(EXTRA_FOODNO);
        Food food= Food.foods[foodno];
        TextView tvName = (TextView) findViewById(R.id.name);
        TextView tvDesc = (TextView) findViewById(R.id.desc);
        ImageView foodImg=(ImageView) findViewById(R.id.foodImage);
        tvName.setText(food.getName());
        tvDesc.setText(food.getDescription());
        foodImg.setImageResource(food.getImageID());
    }
}
