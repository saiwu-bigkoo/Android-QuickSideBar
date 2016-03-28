package com.bigkoo.quicksidebar.listener;

/**
 * Created by Sai on 16/3/25.
 */
public interface OnQuickSideBarTouchListener {
    void onLetterChanged(String letter,int position,int itemHeight);
    void onLetterTouching(boolean touching);
}
