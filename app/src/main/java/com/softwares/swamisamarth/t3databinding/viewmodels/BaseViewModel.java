package com.softwares.swamisamarth.t3databinding.viewmodels;

import android.databinding.BindingAdapter;
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * Created by C145557 on 9/28/2016.
 */

public class BaseViewModel {

    @BindingAdapter("app:font")
    public static void setFont(TextView textView, String name){
        Typeface type = Typeface.createFromAsset(textView.getContext().getAssets(),"fonts/"+ name);
        textView.setTypeface(type);
    }
}
