package com.gconsult.medicalapp.model;

/**
 * Created by Gconsult on 4/11/2018.
 */

public class ModelSeparator implements Item{
    public static final int TYPE_OVERDUE = R.string.separator_overdue;
    public static final int TYPE_TODAY = R.string.separator_today;
    public static final int TYPE_TOMORROW = R.string.separator_tomorrow;
    public static final int TYPE_FUTURE = R.string.separator_future;

    private int mType;

    public ModelSeparator(int type) {
        this.mType = type;
    }

    @Override
    public boolean isTask() {
        return false;
    }

    public int getType() {
        return mType;
    }

}