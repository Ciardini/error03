package com.giacomociardini.error03;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.giacomociardini.error03.databinding.FragmentMainTabBinding;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainTabFragment extends Fragment {

    private FragmentMainTabBinding mBinding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_main_tab, container, false);

        if (getActivity() != null) {
            PagerAdapter adapter = new PagerAdapter(getActivity().getSupportFragmentManager(), getLifecycle(), getFragments());
            mBinding.fragmentMainTabViewpager.setAdapter(adapter);
            mBinding.fragmentMainTabViewpager.setSaveEnabled(false);

            new TabLayoutMediator(mBinding.fragmentMainTabLayout, mBinding.fragmentMainTabViewpager, (tab, position) -> {
                mBinding.fragmentMainTabViewpager.setCurrentItem(tab.getPosition(), true);
                tab.setText(getFragmentTitle(position));
                tab.setIcon(getFragmentIcon(position));
            }).attach();
        }

        return mBinding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mBinding.fragmentMainTabViewpager.setAdapter(null);
        mBinding = null;
    }

    private ArrayList<Fragment> getFragments() {
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new MainFragment(getString(getFragmentTitle(0))));
        fragments.add(new MainFragment(getString(getFragmentTitle(1))));
        fragments.add(new MainFragment(getString(getFragmentTitle(2))));
        return fragments;
    }

    private int getFragmentTitle(int position) {
        switch (position) {
            case 0:
                return R.string.title_first;
            case 1:
                return R.string.title_second;
            case 2:
                return R.string.title_third;
        }

        return 0;
    }

    private int getFragmentIcon(int position) {
        switch (position) {
            case 0:
                return R.drawable.ic_first;
            case 1:
                return R.drawable.ic_second;
            case 2:
                return R.drawable.ic_third;
        }

        return 0;
    }

}