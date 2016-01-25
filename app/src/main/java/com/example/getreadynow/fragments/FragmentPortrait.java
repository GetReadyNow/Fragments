package com.example.getreadynow.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by AlHassaneAgne on 1/25/16.
 */
public class FragmentPortrait extends Fragment {
    @Nullable
    @Override
    //Layout inflater takes the xml configuration and produces a layout based on it
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.portrait_fragment, container, false);
    }
}
