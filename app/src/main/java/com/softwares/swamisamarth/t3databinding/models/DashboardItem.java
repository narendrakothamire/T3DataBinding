package com.softwares.swamisamarth.t3databinding.models;

import android.support.annotation.ColorInt;

/**
 * Created by C145557 on 9/30/2016.
 */

public class DashboardItem {

    private String title;
    private @ColorInt int color;

    public DashboardItem() {
    }

    public DashboardItem(String title, int color) {
        this.title = title;
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
}
