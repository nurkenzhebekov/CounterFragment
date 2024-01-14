package com.example.counterfragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainFragment extends Fragment {

    private int numberCounter = 0;
    private TextView mainZeroTV;
    private Button minusBT;
    private Button plusBT;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mainZeroTV = requireActivity().findViewById(R.id.main_zero_TV);
        minusBT = requireActivity().findViewById(R.id.minus_BT);
        plusBT = requireActivity().findViewById(R.id.plus_BT);

        minusBT.setOnClickListener(v -> {
            numberCounter --;
            mainZeroTV.setText(Integer.toString(numberCounter));
        });

        plusBT.setOnClickListener(v -> {
            numberCounter ++;
            mainZeroTV.setText(Integer.toString(numberCounter));
        });

    }
}