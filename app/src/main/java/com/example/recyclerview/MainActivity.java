package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycler;
    int[] images;
    String[] titles;
        String[] versions;
        String[] releaseDate;
    MyAdapter adapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler=findViewById(R.id.recyclerview);
        titles=getResources().getStringArray(R.array.imagetitles);
        versions=getResources().getStringArray(R.array.imageversions);
        releaseDate=getResources().getStringArray(R.array.releasedate);




        images=new int[]{R.drawable.i14,R.drawable.i1,R.drawable.i2,
                R.drawable.i3,R.drawable.i4,
                R.drawable.i5,R.drawable.i6,
                R.drawable.i7,R.drawable.i8,
                R.drawable.i9,R.drawable.i10,
                R.drawable.i11,R.drawable.i12,
                R.drawable.i13,
                R.drawable.i15,R.drawable.i16
        };

        adapter= new MyAdapter(this,titles,versions,images,releaseDate);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(adapter);



    }
}