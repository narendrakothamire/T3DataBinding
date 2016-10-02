package com.softwares.swamisamarth.t3databinding.models;

import android.content.Context;
import android.support.annotation.ColorInt;

import com.softwares.swamisamarth.t3databinding.viewmodels.BaseViewModel;

/**
 * Created by C145557 on 9/30/2016.
 */

public class DashboardItem{

    private String title;
    private int color;
    private int drawable;

    public DashboardItem() {
    }

    public DashboardItem(String title, int drawable, int color) {
        this.title = title;
        this.drawable = drawable;
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }

}
