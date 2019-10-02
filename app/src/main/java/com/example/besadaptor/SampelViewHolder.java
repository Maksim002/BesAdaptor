package com.example.besadaptor;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class SampelViewHolder extends BaseViewHolder<Model> {

    private TextView textView;


    public SampelViewHolder(@NonNull View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.textView);
    }

    @Override
    public void bind(Model data) {
        textView.setText(data.getTitle());
    }

    @Override
    public void unbind() {
    }
}
