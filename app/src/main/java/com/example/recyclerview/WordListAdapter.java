package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.NameViewHolder> {
    private ArrayList<product> nameArrayList;
    private LayoutInflater layoutInflater;
    private Context context;

    public WordListAdapter(ArrayList<product> nameArrayList, Context context) {
        this.nameArrayList = nameArrayList;
        layoutInflater = layoutInflater.from(context);
        this.context = context;
    }
    @NonNull
    @Override
    public WordListAdapter.NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = layoutInflater.inflate(R.layout.wordlist_item,parent,false);
        return new NameViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.NameViewHolder holder, int position) {

        holder.nameItemView.setText(String.valueOf(nameArrayList.get(position).getTen()));
        holder.giaItemView.setText(String.valueOf((nameArrayList.get(position).getGia())));
        holder.avtItemAvt.setImageResource(nameArrayList.get(position).getAvt());

        holder.avtItemAvt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                product product = new product(nameArrayList.get(position).getTen(),nameArrayList.get(position).getChitietsp(),nameArrayList.get(position).getGia() ,nameArrayList.get(position).getAvt());
                Intent intent = new Intent(context ,showInfor.class);
                intent.putExtra("product",product);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return nameArrayList.size();
    }
    public class NameViewHolder extends RecyclerView.ViewHolder{
        public TextView nameItemView;
        public TextView giaItemView;
        public ImageView avtItemAvt;
        WordListAdapter nameListAdapter;

        public NameViewHolder(@NonNull View itemView, WordListAdapter adapter) {
            super(itemView);
            nameItemView = itemView.findViewById(R.id.tvName);
            giaItemView = itemView.findViewById(R.id.tvPrice);
            avtItemAvt = itemView.findViewById(R.id.avtImage);
            this.nameListAdapter = (WordListAdapter) adapter;
        }


    }


}
