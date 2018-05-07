package com.jordanburke.wowcharacterinformation.Reputation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ReputationInfoFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

//        View view = inflater.inflate(R.layout.)



        return null;
    }

    public static ReputationInfoFragment newInstance() {

        Bundle args = new Bundle();

        ReputationInfoFragment fragment = new ReputationInfoFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
