package com.filipkesteli.askfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.filipkesteli.askfragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MorningPlansSubFragment extends Fragment {


    public MorningPlansSubFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_morning_plans_sub, container, false);
    }

}
