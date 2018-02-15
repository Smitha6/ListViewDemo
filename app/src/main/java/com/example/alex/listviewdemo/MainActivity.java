package com.example.alex.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    ListView lv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lv = findViewById(R.id.class_schedule);

        String[] arr = {"Spanish","CSCI 250","CSCI 230","PEAC 120","CSCI 490"};

        ArrayAdapter arrAdapt = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arr);
        lv.setAdapter(arrAdapt);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Toast.makeText(getApplicationContext(), "Short Click", Toast.LENGTH_SHORT).show();
            }

                                  }

        );



        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Toast.makeText(getApplicationContext(), "Long Click", Toast.LENGTH_SHORT).show();

                return true;
            }
        }

        );

    }


}
