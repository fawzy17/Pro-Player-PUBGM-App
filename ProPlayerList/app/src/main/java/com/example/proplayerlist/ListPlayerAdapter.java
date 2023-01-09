package com.example.proplayerlist;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListPlayerAdapter extends RecyclerView.Adapter<ListPlayerAdapter.ListViewHolder> {
    private ArrayList<Player> listPlayer;
    private Context context;
    public ListPlayerAdapter(ArrayList<Player> list){this.listPlayer = list;}

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_player, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Player player = listPlayer.get(position);
        context = holder.itemView.getContext();
        Glide.with(holder.itemView.getContext())
                .load(player.getFoto())
                .apply(new RequestOptions().override(55,90))
                .into(holder.imgFoto);
        holder.tvName.setText(player.getName());
        holder.tvDesc.setText(player.getDesc());
        holder.imgLove.setImageResource(player.getFavorit());
        holder.btnDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentShare = new Intent(context, details_player.class);
                intentShare.putExtra(details_player.EXTRA_NAME, player.getName());
                intentShare.putExtra(details_player.EXTRA_FOTO, player.getFoto());
                intentShare.putExtra(details_player.EXTRA_DETAIL, player.getDetail());
                intentShare.putExtra(details_player.EXTRA_DESC, player.getDesc());
                context.startActivity(intentShare);
            }
        });
        holder.imgLove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.img_love){
                    if (player.getFavorit() == R.drawable.whitelove){
                        holder.imgLove.setImageResource(R.drawable.redlove);
                        Toast.makeText(holder.itemView.getContext(), player.getName() + " Added to Favorite", Toast.LENGTH_SHORT).show();
                        player.setFavorit(R.drawable.redlove);
                    }else{
                        holder.imgLove.setImageResource(R.drawable.whitelove);
                        Toast.makeText(holder.itemView.getContext(), player.getName() + " Remove from Favorite", Toast.LENGTH_SHORT).show();
                        player.setFavorit(R.drawable.whitelove);
                    }
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPlayer.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFoto, imgLove;
        TextView tvName, tvDesc;
        Button btnDetails;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgLove = itemView.findViewById(R.id.img_love);
            imgFoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDesc = itemView.findViewById(R.id.tv_item_desc);
            btnDetails = itemView.findViewById(R.id.btn_details);
        }
    }
}
