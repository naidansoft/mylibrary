package com.naidansoft.treelibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by FamilySG on 26/08/2016.
 */
public class MyView extends LinearLayout {

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    private void initialize(Context context){
        inflate(context, R.layout.my_view, this);
    }

}