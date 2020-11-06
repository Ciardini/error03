package com.giacomociardini.error03;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class PagerAdapter extends FragmentStateAdapter {

    private final ArrayList<Fragment> mFragments;

    public PagerAdapter(@NonNull FragmentManager fragmentManager,
                        @NonNull Lifecycle lifecycle,
                        ArrayList<Fragment> list) {
        super(fragmentManager, lifecycle);
        this.mFragments = list;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getItemCount() {
        return mFragments.size();
    }
}