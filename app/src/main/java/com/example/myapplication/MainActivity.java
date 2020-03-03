package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        recyclerView= (RecyclerView)findViewById ( R.id.rEcycle_View );
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager ( this );
        recyclerView.setLayoutManager(layoutManager);
        List<String> input=new ArrayList<> ();
        for (int i = 0;i<50; i++){
            input.add ( "Shabbir khan or jansakhan"+ i );
        }



        mAdapter= new MyAapter (input);
        recyclerView.setAdapter ( mAdapter );


    }
}
