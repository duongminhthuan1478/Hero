package com.example.dell.hero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private OnItemClickListener mListener;
    private RecyclerView mRecyclerView;
    private StudentAdapter mStudentAdapter;
    private ArrayList<Student> studentArrayList = new ArrayList<>();

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
                Intent intent = new Intent(getApplicationContext(), DetailStudent.class);
                intent.putExtra("student", studentArrayList.get(position));
                startActivity(intent);
            }
        });
    }

    public void initView() {
        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(layoutManager);

        studentArrayList.add(
                new Student(R.drawable.scarlet, "Scarlet Witch", "14565875", "K21-CMUTPM6"));
        studentArrayList.add(new Student(R.drawable.hulk, "Hulk", "2", "K21-CMUTPM6"));
        studentArrayList.add(
                new Student(R.drawable.iron_man, "Iron Man", "3554548162", "The World"));
        studentArrayList.add(new Student(R.drawable.captain_america, "Captain", "4242", "PSU"));
        studentArrayList.add(new Student(R.drawable.ic_launcher_background, "Minh Thuan", "3455",
                "Toán Rời Rạc"));
        studentArrayList.add(new Student(R.drawable.ic_launcher_background, "Cam Tu", "144345",
                "Lập Trình Cơ Sở"));
        studentArrayList.add(new Student(R.drawable.ic_launcher_background, "Trang Duong", "57",
                "Lập Trình Ứng Dụng"));

        mStudentAdapter = new StudentAdapter(studentArrayList, getApplicationContext());
        mRecyclerView.setAdapter(mStudentAdapter);
    }
}
