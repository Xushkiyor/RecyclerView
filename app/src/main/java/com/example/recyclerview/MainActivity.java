package com.example.recyclerview;

import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    RecyclerView recyclerView;
    Adapter adapters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new GridLayoutManager(getParent(), 2));
        adapters = new Adapter(getFiles());
        recyclerView.setAdapter(adapters);

    }

    private ArrayList<Model> getFiles() {
        ArrayList<Model> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Model model = new Model();
            model.setTitle("Title" + i);
            model.setSubTitle("SubTitle"+i);
            model.setImageId(R.drawable.image_1);
            list.add(model);
        }
        return list;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item_layout, menu);

        SearchView searchView = (SearchView) menu.findItem(R.id.searchIcon).getActionView();
        searchView.setOnQueryTextListener(this);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        Toast.makeText(this, newText, Toast.LENGTH_SHORT).show();
        return false;
    }
}