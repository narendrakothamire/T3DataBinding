package com.softwares.swamisamarth.t3databinding.views.fragments;


import android.os.Bundle;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.softwares.swamisamarth.t3databinding.R;
import com.softwares.swamisamarth.t3databinding.adapters.DashboardAdapter;
import com.softwares.swamisamarth.t3databinding.models.DashboardItem;

import java.util.ArrayList;

/**
 * A simple {@link BaseFragment} subclass.
 */
public class DashboardFragment extends BaseFragment {

    private DashboardAdapter adapter;
    private ArrayList<DashboardItem> dashboardItems = new ArrayList<>();

    public DashboardFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 5);

        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup(){

            @Override
            public int getSpanSize(int position) {
                if(position == 0 || position == 6){
                    return 2;
                }

                return 1;
            }
        });

        recyclerView.setLayoutManager(gridLayoutManager);
        adapter = new DashboardAdapter(context, dashboardItems);

        recyclerView.setAdapter(adapter);

        return view;
    }

}
