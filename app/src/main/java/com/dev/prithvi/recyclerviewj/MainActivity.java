package com.dev.prithvi.recyclerviewj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] item = {"Apple", "Banana", "Donut", "Cupcake", "Eclairs", "Pie", "Oreo", "Marshmello"};
        String[] itemDesc = {"Fresh And Sweet", "Delicious", "Fresh And Sweet", "Delicious",
                "Fresh And Sweet", "Delicious", "Fresh And Sweet", "Delicious"};
        String[] itemQuantity = {"10", "15", "20", "30", "50", "100", "50", "60"};
        String[] itemPrice = {"10", "20", "45", "50", "60", "100", "150", "500"};

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ItemsAdapter(item, itemDesc, itemQuantity, itemPrice));

    }
}