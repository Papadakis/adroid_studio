package com.example.papadakis.demo_thesis;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class parents_todoActivity extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parents_eat);

        viewPager = ( ViewPager) findViewById(R.id.viewPager);

        ViewTodo viewTodo = new ViewTodo(this);

        viewPager.setAdapter(viewTodo);
    }
}
