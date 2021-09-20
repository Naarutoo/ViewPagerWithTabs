package com.example.viewpagerwithtabs;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FragmentA extends Fragment {

RecyclerView recyclerView;
private List<String>list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initviews(view);
        buildlist();
        setRecyclerview();
    }

    private void setRecyclerview() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        itemAdapter Adapter = new itemAdapter(list);
    recyclerView.setAdapter(Adapter);
    }

    private void buildlist() {
    String[]arr ={"ram","shyam","john","shubham","prabhu","saurabh","ronaldo"};
        Collections.addAll(list,arr);
    }

    private void initviews(View view) {
    recyclerView = view.findViewById(R.id.recyclerView);
    list = new ArrayList<>();
    }


}