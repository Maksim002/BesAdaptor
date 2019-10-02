package com.example.besadaptor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String SAMPLE = "question_set.json";
    private RecyclerView recyclerView;
    private SampelAdaptor adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adaptor = new SampelAdaptor(getSample()));
        adaptor.updeteList(getSample());


        readFileFromAssets();
    }

    private void readFileFromAssets() {

        String json = ResourceManager.readFileFromAssets(getApplicationContext(), SAMPLE);
        MainActivity homeModels = new Gson().fromJson(json, MainActivity.class);
        adaptor.notify(homeModels.question_set());

    }
    private List<Model> getSample(){
        List<Model> models = new ArrayList<>();
        models.add(new Model("ddddddddddddddddddddddddddddddddd"));
        models.add(new Model("ddddddddddddddddddddddddddddddddd"));
        models.add(new Model("ddddddddddddddddddddddddddddddddd"));
        models.add(new Model("ddddddddddddddddddddddddddddddddd"));
        models.add(new Model("ddddddddddddddddddddddddddddddddd"));
        models.add(new Model("ddddddddddddddddddddddddddddddddd"));
        models.add(new Model("ddddddddddddddddddddddddddddddddd"));
        models.add(new Model("ddddddddddddddddddddddddddddddddd"));
        models.add(new Model("ddddddddddddddddddddddddddddddddd"));
        models.add(new Model("ddddddddddddddddddddddddddddddddd"));
        models.add(new Model("ddddddddddddddddddddddddddddddddd"));
        models.add(new Model("ddddddddddddddddddddddddddddddddd"));
        models.add(new Model("ddddddddddddddddddddddddddddddddd"));
        models.add(new Model("ddddddddddddddddddddddddddddddddd"));
        models.add(new Model("ddddddddddddddddddddddddddddddddd"));
        models.add(new Model("ddddddddddddddddddddddddddddddddd"));
        models.add(new Model("ddddddddddddddddddddddddddddddddd"));
        models.add(new Model("ddddddddddddddddddddddddddddddddd"));
        models.add(new Model("ddddddddddddddddddddddddddddddddd"));
        models.add(new Model("ddddddddddddddddddddddddddddddddd"));
        models.add(new Model("ddddddddddddddddddddddddddddddddd"));
        models.add(new Model("ddddddddddddddddddddddddddddddddd"));
        models.add(new Model("ddddddddddddddddddddddddddddddddd"));
        models.add(new Model("ddddddddddddddddddddddddddddddddd"));
        return models;
    }
}
