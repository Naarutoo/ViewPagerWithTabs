package com.example.viewpagerwithtabs;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class ViewHolder extends RecyclerView.ViewHolder {
TextView mtvName;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        initviews();
    }

    private void initviews() {
    mtvName = itemView.findViewById(R.id.tvName);
    }
    public void setData(String data){
mtvName.setText(data);
    }
}
