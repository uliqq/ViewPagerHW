package com.geektech.viewpagerhw.ui.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.viewpagerhw.R;
import com.geektech.viewpagerhw.ui.Exchange;

import java.awt.font.TextAttribute;
import java.util.ArrayList;

public class ExchangeAdapter extends RecyclerView.Adapter<ExchangeAdapter.ViewHolder> {

private ArrayList<Exchange> list;

    public void setList(ArrayList<Exchange> list) {
        this.list = new ArrayList<>();
        this.list.addAll(list);
    }

    @NonNull
    @Override
    public ExchangeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ExchangeAdapter.ViewHolder holder, int position) {
holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView icon;
        private TextView name, value;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.icon);
            name = itemView.findViewById(R.id.name);
            value = itemView.findViewById(R.id.value);
        }

        public void onBind(Exchange exchange) {
            icon.setImageResource(exchange.getIcon());
            name.setText(exchange.getName());
            value.setText(exchange.getValue());

        }
    }
}
