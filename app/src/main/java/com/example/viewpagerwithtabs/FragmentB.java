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


public class FragmentB extends Fragment {
RecyclerView recyclerView;
List<String>list = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initviews(view);
        buildLIst();
        setRecyclerView();
    }

    private void setRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        itemAdapter adapter = new itemAdapter(list);
        recyclerView.setAdapter(adapter);
    }

    private void buildLIst() {
    String[] arr2 = {"delhi","kerala","mumbai","rajsthan","jaipur","shimla","manali"};
        Collections.addAll(list,arr2);
    }

    private void initviews(View view) {
    recyclerView =view.findViewById(R.id.recyclerView);
    }


}