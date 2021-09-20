package com.example.viewpagerwithtabs;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class itemAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<String>list;

    public itemAdapter(List<String> list) {
        this.list = list;
    }

    @NonNull

    @Override
    public ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  ViewHolder holder, int position) {
    String s = list.get(position);
    holder.setData(s);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
