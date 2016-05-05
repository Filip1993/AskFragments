package com.filipkesteli.askfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

import com.filipkesteli.askfragments.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MorningAskFragment extends Fragment {

    private CardView cvMorningView;
    private Switch swMorningView;
    private TextView tvMorningView;
    private SeekBar sbMorningView;

    public MorningAskFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_morning_ask, container, false);

        initWidgets(v);
        setupListeners();

        return v;
    }

    private void initWidgets(View v) {
        cvMorningView = (CardView) v.findViewById(R.id.cvMorningAsk);
        swMorningView = (Switch) v.findViewById(R.id.swMorningAsk);
        tvMorningView = (TextView) v.findViewById(R.id.tvMorningAsk);
        sbMorningView = (SeekBar) v.findViewById(R.id.sbMorningAsk);
    }

    private void setupListeners() {
        //Dvije razine:
        //Switch -> klikom na switch, promijeni se boja CardView-a
        //SeekBar -> mijenjaju se slova, a mije
    }
}
