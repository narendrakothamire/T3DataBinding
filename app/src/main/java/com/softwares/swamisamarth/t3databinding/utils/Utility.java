package com.softwares.swamisamarth.t3databinding.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.softwares.swamisamarth.t3databinding.R;

/**
 * Created by C145557 on 9/29/2016.
 */

public class Utility {

    public static void showToast(Context context, String msg){
        Toast toast = new Toast(context);
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.toast_layout, null);
        TextView tv = (TextView) v.findViewById(R.id.toast_msg_tv);
        toast.setView(v);
        tv.setText(msg);
        toast.show();
    }
}
