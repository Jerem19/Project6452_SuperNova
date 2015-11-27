package com.example.xnnibal.project645_2._fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.xnnibal.project645_2.R;
import com.example.xnnibal.project645_2._activity.HomeActivity;

/**
 * Created by Xnnibal on 26.11.2015.
 */
public class Maps extends Fragment {

    private View view;
    private static final int ARG_SECTION_NUMBER = 7;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

       view = inflater.inflate(R.layout.fragment_maps, container, false);

       return view;
    }
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((HomeActivity)activity).onSectionAttached(ARG_SECTION_NUMBER);
    }
}
