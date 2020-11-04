package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import org.w3c.dom.NameList;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rclName;
    private WordListAdapter nameListAdapter;
    private ArrayList<product> nameArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameArrayList = new ArrayList<>();
        nameArrayList.add(new product("Donut do" ,"bánh này có màu đỏ ăn vào không có gì nhưng màu đỏ", 12000,R.drawable.donutred));
        nameArrayList.add(new product("Donut vang" , "bánh này có màu vàng ăn vào sức mạnh vô địch",12000,R.drawable.donut_yellow));
        nameArrayList.add(new product("Donut xanh" ,"bánh này có màu xanh ăn vào top 1 liên quân", 12000,R.drawable.donut_green));
        nameArrayList.add(new product("Donut tim" ,"bánh này có màu tím ăn vào trường sinh bất lão", 12000,R.drawable.donut_violet));




        rclName= findViewById(R.id.rclName);


        nameListAdapter = new WordListAdapter(nameArrayList, this);
        rclName.setAdapter(nameListAdapter);
        rclName.setLayoutManager(new LinearLayoutManager(this));
    }
}