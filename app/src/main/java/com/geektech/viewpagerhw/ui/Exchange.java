package com.geektech.viewpagerhw.ui;

import android.widget.ImageView;

public class Exchange {

private int icon;
private String name;
private String value;

    public Exchange(int icon, String name, String value) {
        this.icon = icon;
        this.name = name;
        this.value = value;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
