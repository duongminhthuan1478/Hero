package com.example.dell.hero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void initView(){
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL ,false);
        recyclerView.setLayoutManager(layoutManager);

        final ArrayList<Hero> heroArrayList = new ArrayList<>();

        heroArrayList.add(new Hero(R.drawable.scarlet, "Scarlet Witch"));
        heroArrayList.add(new Hero(R.drawable.hulk, "Hulk"));
        heroArrayList.add(new Hero(R.drawable.iron_man, "Iron Man"));
        heroArrayList.add(new Hero(R.drawable.captain_america, "Captain America"));


        HeroAdapter heroAdapter = new HeroAdapter(heroArrayList, getApplicationContext());
        recyclerView.setAdapter(heroAdapter);



    }
}
