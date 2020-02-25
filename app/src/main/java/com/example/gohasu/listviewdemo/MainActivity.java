package com.example.gohasu.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ListView myListView = findViewById(R.id.myListView);
//
//        final ArrayList<String> myFamily = new ArrayList<String>();
//        myFamily.add("Mai");
//        myFamily.add("Joshua");
//        myFamily.add("Vi An");
//
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFamily);
//
//        myListView.setAdapter(arrayAdapter);
//
//        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//
//                Log.i("Person selected:", myFamily.get(i));
//
//            }
//        });

          ListView newListView = findViewById(R.id.newListView);

          final ArrayList<String> myMovies = new ArrayList<String>();
          myMovies.add("The Witchers");
          myMovies.add("Mandolarian");
          myMovies.add("The Office");

          ArrayAdapter<String> newArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myMovies);

          newListView.setAdapter(newArrayAdapter);

          newListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
              @Override
              public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                  Log.i("Movie: ", myMovies.get(i));
                  Toast.makeText(MainActivity.this, myMovies.get(i) + " is selected", Toast.LENGTH_SHORT).show();
              }
          });




    }
}
