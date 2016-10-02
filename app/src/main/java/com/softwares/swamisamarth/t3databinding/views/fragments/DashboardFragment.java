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
import com.softwares.swamisamarth.t3databinding.widgets.SpacesItemDecoration;

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
        recyclerView.addItemDecoration(new SpacesItemDecoration(5));
        loadData();
        adapter = new DashboardAdapter(context, dashboardItems);

        recyclerView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();

    }

    public void loadData(){

        DashboardItem dashboardItem0 = new DashboardItem("Conduct", R.drawable.button_bg, R.color.colorAccent);
        DashboardItem dashboardItem1 = new DashboardItem("Product Information", R.drawable.button_bg, R.color.light_green);
        DashboardItem dashboardItem2 = new DashboardItem("Markets", R.drawable.button_bg, R.color.light_orange);
        DashboardItem dashboardItem3 = new DashboardItem("Wire", R.drawable.button_bg, R.color.light_greenish_blue);
        DashboardItem dashboardItem4 = new DashboardItem("CRM", R.drawable.button_bg, R.color.light_green);
        DashboardItem dashboardItem5 = new DashboardItem("My Performance", R.drawable.button_bg, R.color.light_orange);
        DashboardItem dashboardItem6 = new DashboardItem("Markets calls & Alerts", R.drawable.button_bg, R.color.colorAccent);
        DashboardItem dashboardItem7 = new DashboardItem("Training", R.drawable.button_bg, R.color.light_greenish_blue);

        dashboardItems.add(dashboardItem0);
        dashboardItems.add(dashboardItem1);
        dashboardItems.add(dashboardItem2);
        dashboardItems.add(dashboardItem3);
        dashboardItems.add(dashboardItem4);
        dashboardItems.add(dashboardItem5);
        dashboardItems.add(dashboardItem6);
        dashboardItems.add(dashboardItem7);

       // adapter.notifyDataSetChanged();

    }

}
