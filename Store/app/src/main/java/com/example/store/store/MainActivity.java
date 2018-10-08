package com.example.store.store;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ModeloAndroid modeloAndroid = new ModeloAndroid();
    private RecyclerView recyclerViewDrone;
    private ReciclerViewAdaptador adaptadorDrone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewDrone = (RecyclerView) findViewById(R.id.recyclerDrone);
        recyclerViewDrone.setLayoutManager(new LinearLayoutManager(this));

        adaptadorDrone = new ReciclerViewAdaptador(modeloAndroid.obterDrones());
        recyclerViewDrone.setAdapter(adaptadorDrone);
    }


}
