package com.geektech.viewpagerhw.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.viewpagerhw.R;
import com.geektech.viewpagerhw.ui.Exchange;
import com.geektech.viewpagerhw.ui.adapters.ExchangeAdapter;

import java.util.ArrayList;


public class FirstFragment extends Fragment {

    private RecyclerView recyclerView;
    private ExchangeAdapter adapter;
    private ArrayList<Exchange> list;

    public FirstFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        createList();
        initRecycler(view);
        createDivider();
    }

    private void createDivider() {
recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL));
    }

    private void initRecycler(View view) {
recyclerView = view.findViewById(R.id.first_fragment);
adapter = new ExchangeAdapter();
adapter.setList(list);
recyclerView.setAdapter(adapter);
    }

    private void createList() {
        list = new ArrayList<>();
        list.add(new Exchange(R.drawable.start,"V - coin", "USD 1.00"));
        list.add(new Exchange(R.drawable.usd,"B - coin +", "USD 4.00"));
        list.add(new Exchange(R.drawable.usdt,"Label", "USD 0.00"));
        list.add(new Exchange(R.drawable.xbc,"S - coin", "USD 6.00"));
        list.add(new Exchange(R.drawable.xvc,"T - coin", "USD 0.00"));
        list.add(new Exchange(R.drawable.zrx,"X - coin", "USD 119.00"));
        list.add(new Exchange(R.drawable.start,"Label", "USD 0.00"));
        list.add(new Exchange(R.drawable.xbc,"Label", "USD 500.00"));
        list.add(new Exchange(R.drawable.xvc,"Label", "USD 40.00"));
        list.add(new Exchange(R.drawable.usdt,"Label", "USD 0.00"));
    }

}