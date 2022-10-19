package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }
    public void initView(){
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);

        ArrayList<Phim> dataPhim = new ArrayList<>();

        dataPhim.add(new Phim("Hậu Duệ Mặt Trời",R.drawable.anh1_phimhot));
        dataPhim.add(new Phim("Two Worlds", R.drawable.anh2_phimhot));
        dataPhim.add(new Phim("Vì sao đưa anh tới",R.drawable.anh3_phimhot));
        dataPhim.add(new Phim("Cô dâu 8 tuổi",R.drawable.anh4_phimhot));
        dataPhim.add(new Phim("Gạo nếp gạo tẻ",R.drawable.anh5_phimhot));

        PhimAdapter phimAdapter = new PhimAdapter(dataPhim,getApplicationContext());
        recyclerView.setAdapter(phimAdapter);
    }
}