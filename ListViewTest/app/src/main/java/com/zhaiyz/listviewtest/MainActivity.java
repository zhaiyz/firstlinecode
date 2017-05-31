package com.zhaiyz.listviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
//
//    private String[] data = {
//            "Apple",
//            "Banana",
//            "Orange",
//            "Watermelon",
//            "Pear",
//            "Grape",
//            "Pineapple",
//            "Strawberry",
//            "Cherry",
//            "Mango",
//            "Apple",
//            "Banana",
//            "Orange",
//            "Watermelon",
//            "Pear",
//            "Grape",
//            "Pineapple",
//            "Strawberry",
//            "Cherry",
//            "Mango"
//    };

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(
//                MainActivity.this, android.R.layout.simple_list_item_1, data);
        initFruits();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this, R.layout.fruit_item, fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(MainActivity.this, fruit.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initFruits() {
        for (int i = 0; i < 200; i++) {
            Fruit apple = new Fruit("Apple", R.drawable.apple);
            fruitList.add(apple);
            Fruit banner = new Fruit("Banner", R.drawable.bannar);
            fruitList.add(banner);
        }
    }
}
