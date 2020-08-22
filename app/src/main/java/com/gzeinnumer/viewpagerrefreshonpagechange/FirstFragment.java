package com.gzeinnumer.viewpagerrefreshonpagechange;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class FirstFragment extends Fragment implements ViewPagerAdapter.Updateable {

    @Override
    public void update() {
        Toast.makeText(requireContext(), "Update Here 1", Toast.LENGTH_SHORT).show();
    }

    public FirstFragment() {
        // Required empty public constructor
    }

    public static FirstFragment newInstance() {
        return new FirstFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }
}