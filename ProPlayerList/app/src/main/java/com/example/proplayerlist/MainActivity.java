package com.example.proplayerlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RecyclerView rvPlayers;
    private ArrayList<Player> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hideActionBar();
        ImageView backIcon = findViewById(R.id.back_icon_onMain);
        ImageView infoIcon = findViewById(R.id.info_icon);

        rvPlayers = findViewById(R.id.rv_player);
        backIcon.setOnClickListener(this);
        infoIcon.setOnClickListener(this);
        rvPlayers.setHasFixedSize(true);

        list.addAll(PlayerData.getListData());
        showList();
    }

    private void showList() {
        rvPlayers.setLayoutManager(new LinearLayoutManager(this));
        ListPlayerAdapter listPlayerAdapter = new ListPlayerAdapter(list);
        rvPlayers.setAdapter(listPlayerAdapter);
    }

    private void hideActionBar(){
        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.back_icon_onMain){
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }
        if (v.getId() == R.id.info_icon){
            Intent infoIntent = new Intent(MainActivity.this, AuthorInfo.class);
            startActivity(infoIntent);
        }

    }
}