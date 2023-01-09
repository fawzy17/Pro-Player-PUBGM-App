package com.example.proplayerlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class details_player extends AppCompatActivity implements View.OnClickListener {
    public static final String EXTRA_FOTO = "extra_foto";
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_DESC = "extra_desc";
    private int i;
    public ImageView foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_player);

        hideActionBar();
        ImageView backIconDetails = findViewById(R.id.back_icon_onDetails);

        TextView namaPlayer = findViewById(R.id.nama_player);
        TextView detailPlayer = findViewById(R.id.detail_player);
        TextView descPlayer = findViewById(R.id.desc_player);

        ImageView bigFotoPlayer = findViewById(R.id.big_detail_foto);
        ImageView smallFotoPlayer = findViewById(R.id.small_detail_foto);

        Button btnShare = findViewById(R.id.btn_share);

        String detailPlayerReceiver = getIntent().getStringExtra(EXTRA_DETAIL);
        String namaPlayerReceiver = getIntent().getStringExtra(EXTRA_NAME);
        String descPlayerReceiver = getIntent().getStringExtra(EXTRA_DESC);
        int fotoPlayerReceiver = getIntent().getIntExtra(EXTRA_FOTO, 0);

        namaPlayer.setText(namaPlayerReceiver);
        detailPlayer.setText(detailPlayerReceiver);
        descPlayer.setText(descPlayerReceiver);


        for (i = 0; i < PlayerData.playerImages.length; i++){
            if(PlayerData.playerImages[i] == fotoPlayerReceiver){
                bigFotoPlayer.setImageResource(fotoPlayerReceiver);
                smallFotoPlayer.setImageResource(fotoPlayerReceiver);
                foto = bigFotoPlayer;
                break;
            }
        }

        backIconDetails.setOnClickListener(this);
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.btn_share){
                    Intent intentShare = new Intent(Intent.ACTION_SEND);
                    intentShare.setType("text/plain");
                    intentShare.putExtra(Intent.EXTRA_TEXT, namaPlayerReceiver + "\n" + detailPlayerReceiver + "\n" + descPlayerReceiver);
                    startActivity(Intent.createChooser(intentShare, "sharing options"));
                }
            }
        });



    }

    private void hideActionBar(){
        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.back_icon_onDetails){
            super.onBackPressed();
        }
    }
}