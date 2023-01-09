package com.example.proplayerlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AuthorInfo extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author_info);
        hideActionBar();
        ImageView backIconInfo = findViewById(R.id.back_icon_onInfo);

        backIconInfo.setOnClickListener(this);
    }

    private void hideActionBar(){
        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.back_icon_onInfo){
            super.onBackPressed();
        }
    }
}