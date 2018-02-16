package com.example.alex.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Course course;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //lv = findViewById(R.id.class_schedule);
        //String[] arr = {"Spanish","CSCI 250","CSCI 230","PEAC 120","CSCI 490"};
        //ArrayAdapter arrAdapt = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arr);
        //lv.setAdapter(arrAdapt);


        ArrayList<Course> courses = new ArrayList<>();

        course = new Course();
        course.setCourseName("CSCI");
        course.setCourseNumber("490");
        course.setProfessor("Briggs");
        courses.add(course);

        course = new Course();
        course.setCourseName("CSCI");
        course.setCourseNumber("250");
        course.setProfessor("Hajah");
        courses.add(course);

        CourseAdapter adapter = new CourseAdapter(this, courses);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Toast.makeText(getApplicationContext(), "Short Click", Toast.LENGTH_SHORT).show();
            }}
        );

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

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
