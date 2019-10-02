package com.example.besadaptor;

import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class SampelAdaptor extends BesRecyclerAdaptor<SampelViewHolder, Model> {


    public SampelAdaptor(List<Model> list) {
        super(list);
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.item_map;
    }

    @Override
    protected SampelViewHolder getViewHolder(View view) {
        return new SampelViewHolder(view);
    }
}
