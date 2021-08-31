package com.geektech.viewpagerhw.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.geektech.viewpagerhw.R;

import java.util.Date;

public class SecondFragment extends Fragment {
private TextView time;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initTv(view);
        createTime();
    }

    private void initTv(View view) {
        time = view.findViewById(R.id.time_date);
    }

    private void createTime() {
        String currentTime = java.text.DateFormat.getDateTimeInstance().format(new Date());
time.setText(currentTime);
    }
}