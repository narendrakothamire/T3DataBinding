package com.softwares.swamisamarth.t3databinding.viewmodels;

import android.databinding.BaseObservable;
import android.databinding.BindingAdapter;
import android.databinding.Observable;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.TextView;

import com.softwares.swamisamarth.t3databinding.R;

/**
 * Created by C145557 on 9/28/2016.
 */

public class BaseViewModel extends BaseObservable {

    @BindingAdapter("app:font")
    public static void setFont(TextView textView, String name){
        name = "MyriadPro-Regular.otf";
        Typeface type = Typeface.createFromAsset(textView.getContext().getAssets(),"fonts/"+ name);
        textView.setTypeface(type);
    }

    @BindingAdapter("app:color")
    public static void setColor(View view, int color){
       view.setBackgroundColor(view.getContext().getResources().getColor(color));
    }

    @BindingAdapter({"app:drawable", "app:color"})
    public static void setDrawable(View view, int drawable, int color){
        if(drawable != 0){
            Drawable tempDrawable = view.getContext().getResources().getDrawable(drawable);
            int tempColor = view.getContext().getResources().getColor(color);
         //   tempDrawable.setColor(tempColor);
              tempDrawable.setColorFilter(tempColor, PorterDuff.Mode.SRC_IN);
            view.setBackground(tempDrawable);
        }

    }

}
