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
public class AfternoonFeelSubFragment extends Fragment {


    public AfternoonFeelSubFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_afternoon_feel_sub, container, false);
    }

}
