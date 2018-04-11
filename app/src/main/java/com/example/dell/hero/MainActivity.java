package com.example.dell.hero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.util.Log;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private OnItemClickListener mListener;
    RecyclerView mRecyclerView;
    StudentAdapter mStudentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        itemClick();
    }

    private void itemClick() {
        mStudentAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(getApplicationContext(), "Clicked",Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void initView(){
        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL ,false);
        mRecyclerView.setLayoutManager(layoutManager);

        final ArrayList<Student> heroArrayList = new ArrayList<>();

        heroArrayList.add(new Student(R.drawable.scarlet, "Scarlet Witch","1","K21-CMUTPM6"));
        heroArrayList.add(new Student(R.drawable.hulk, "Hulk","2", "K21-CMUTPM6"));
        heroArrayList.add(new Student(R.drawable.iron_man, "Iron Man", "3", "The World"));
        heroArrayList.add(new Student(R.drawable.captain_america, "Captain", "4242", "PSU"));
        heroArrayList.add(new Student(R.drawable.ic_launcher_background, "Minh Thuan", "3455", "LTDD"));
        heroArrayList.add(new Student(R.drawable.ic_launcher_background, "Cam Tu", "144345", "CDIO"));
        heroArrayList.add(new Student(R.drawable.ic_launcher_background, "Trang Duong", "57", "Android"));



        mStudentAdapter = new StudentAdapter(heroArrayList, getApplicationContext());
        mRecyclerView.setAdapter(mStudentAdapter);

    }
}
