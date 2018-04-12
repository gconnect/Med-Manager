package com.gconsult.medicalapp.Adapter;

/**
 * Created by Gconsult on 4/10/2018.
 */

public class TabAdapter extends FragmentStatePagerAdapter {

    public static final int CURRENT_TASK_FRAGMENT_POSITION = 0;
    public static final int DONE_TASK_FRAGMENT_POSITION = 1;

    private Fragment[] mFragments = {
            new CurrentTaskFragment(),
            new DoneTaskFragment(),
    };

    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments[position];
    }

    @Override
    public int getCount() {
        return mFragments.length;
    }

}
