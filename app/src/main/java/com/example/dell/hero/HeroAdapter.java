package com.example.dell.hero;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Dell on 15-Jan-18.
 */

public class HeroAdapter extends RecyclerView.Adapter <HeroAdapter.ViewHolder> {

    ArrayList<Hero> heroList;
    Context context;

    public HeroAdapter(ArrayList<Hero> heroList, Context context) {
        this.heroList = heroList;
        this.context = context;
    }

    @Override


    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = layoutInflater.inflate(R.layout.list_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // Take data each positon
        holder.nameTextView.setText(heroList.get(position).getName());
        holder.imageView.setImageResource(heroList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return heroList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView nameTextView;
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.name_textview);
            imageView = itemView.findViewById(R.id.image_view);
        }
    }
}
