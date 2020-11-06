package com.giacomociardini.error03;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.giacomociardini.error03.databinding.FragmentMainBinding;

public class MainFragment extends Fragment {

    private FragmentMainBinding mBinding;
    private String mTitle;

    public MainFragment(String title) {
        this.mTitle = title;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);
        mBinding.fragmentMainTitle.setText(mTitle);
        return mBinding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();;
        mBinding = null;
    }
}