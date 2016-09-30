package com.softwares.swamisamarth.t3databinding.adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.softwares.swamisamarth.t3databinding.BR;
import com.softwares.swamisamarth.t3databinding.R;
import com.softwares.swamisamarth.t3databinding.models.DashboardItem;

import java.util.ArrayList;

/**
 * Created by C145557 on 9/30/2016.
 */

public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.DashboardViewHolder> {

    private Context context;
    private ArrayList<DashboardItem> dashboardItems;
    private LayoutInflater inflater;
    private final int SPAN_2 = 2;
    private final int SPAN_1 = 1;


    public DashboardAdapter(Context context, ArrayList<DashboardItem> dashboardItems) {
        this.context = context;
        this.dashboardItems = dashboardItems;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public DashboardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        ViewDataBinding viewDataBinding;
        View view;
        if(viewType == SPAN_1){
            view = inflater.inflate(R.layout.dashboard_item_1, parent, false);
        }else {
            view = inflater.inflate(R.layout.dashboard_item_2, parent, false);
        }

        viewDataBinding = DataBindingUtil.getBinding(view);
        return new DashboardViewHolder(viewDataBinding);
    }

    @Override
    public void onBindViewHolder(DashboardViewHolder holder, int position) {
            holder.viewDataBinding.setVariable(BR.model, dashboardItems.get(position));
    }

    @Override
    public int getItemViewType(int position) {
        if(position == 0 || position == 6){
            return SPAN_2;
        }
        return SPAN_1;
    }

    @Override
    public int getItemCount() {
        return dashboardItems.size();
    }

    static class DashboardViewHolder extends RecyclerView.ViewHolder{

        ViewDataBinding viewDataBinding;

        public DashboardViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            viewDataBinding = binding;
            viewDataBinding.executePendingBindings();
        }

    }

}
