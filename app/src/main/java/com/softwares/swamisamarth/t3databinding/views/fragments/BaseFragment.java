package com.softwares.swamisamarth.t3databinding.views.fragments;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;

/**
 * Created by C145557 on 9/30/2016.
 */

public class BaseFragment extends Fragment {

    protected Activity context;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        context = context;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        context = activity;
    }
}
