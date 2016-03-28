package com.bigkoo.quicksidebar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.bigkoo.quicksidebar.tipsview.QuickSideBarTipsItemView;

/**
 * Created by Sai on 16/3/26.
 */
public class QuickSideBarTipsView extends RelativeLayout {
    private QuickSideBarTipsItemView mTipsView;

    public QuickSideBarTipsView(Context context) {
        this(context, null);
    }

    public QuickSideBarTipsView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public QuickSideBarTipsView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        mTipsView = new QuickSideBarTipsItemView(context,attrs);
        LayoutParams layoutParams = new LayoutParams(LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        addView(mTipsView,layoutParams);
    }


    public void setText(String text,int poistion, int itemHeight){
        mTipsView.setText(text);
        LayoutParams layoutParams = (LayoutParams) mTipsView.getLayoutParams();
        layoutParams.topMargin = poistion * itemHeight;
        mTipsView.setLayoutParams(layoutParams);
    }


}
