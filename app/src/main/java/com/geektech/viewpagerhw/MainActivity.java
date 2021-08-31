package com.geektech.viewpagerhw;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.geektech.viewpagerhw.ui.fragments.FirstFragment;
import com.geektech.viewpagerhw.ui.fragments.SecondFragment;
import com.geektech.viewpagerhw.ui.fragments.ThirdFragment;
import com.geektech.viewpagerhw.ui.adapters.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager2;
    private TabLayout tabLayout;
    private ViewPagerAdapter adapter;
    private ArrayList<Fragment> list = new ArrayList<>();
    private String[] titles = {"Exchange", "Date & Time", "More"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        createList();
        initViewPager();
    }

    private void initViews() {
        viewPager2 = findViewById(R.id.view_pager2);
        tabLayout = findViewById(R.id.tab_layout);
    }

    private void createList() {
        list.add(new FirstFragment());
        list.add(new SecondFragment());
        list.add(new ThirdFragment());
    }

    private void initViewPager() {
        adapter = new ViewPagerAdapter(this);
        adapter.setList(list);
        viewPager2.setAdapter(adapter);
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText(titles[position]);
            }
        }).attach();
    }
}