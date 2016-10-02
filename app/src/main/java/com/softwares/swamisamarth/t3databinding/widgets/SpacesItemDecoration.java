package com.softwares.swamisamarth.t3databinding.widgets;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

public class SpacesItemDecoration extends RecyclerView.ItemDecoration {
  private int space;

  public SpacesItemDecoration(int space) {
    this.space = space;
  }

  @Override
  public void getItemOffsets(Rect outRect, View view,
                             RecyclerView parent, RecyclerView.State state) {
    outRect.left = space;

    outRect.bottom = space;
    int position = parent.getChildLayoutPosition(view);
    // Add top margin only for the first item to avoid double space between items
    if (position / 4 == 0) {
        outRect.top = space;
    } else {
        outRect.top = 0;
    }

//    if(position != 0 && (position / 3) % 2 != 0){
//      Log.d("Narendra", position+"");
//      outRect.right = space;
//    }

    int row = position / 3;

    if(position == 3 || position % 3 < row && position % 3 != 0){
      outRect.right = space;
    }
  }
}