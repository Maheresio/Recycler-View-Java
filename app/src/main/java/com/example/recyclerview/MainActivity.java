package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter programAdapter;
    RecyclerView.LayoutManager layoutManager;
    String [] programNameList={
            "item1","item2","item3","item4","item5","item6","item7","item1","item2","item3","item4","item5","item6","item7","item1","item2","item3","item4","item5","item6","item7"
    };

    String [] programPriceList={
            "50","60","70","80","90","100","130","50","60","70","80","90","100","130","50","60","70","80","90","100","130"
    };

int [] programImages={
        R.drawable.z1,R.drawable.z2,R.drawable.z3,R.drawable.z4,R.drawable.z5,R.drawable.z6,R.drawable.z7,R.drawable.z1,R.drawable.z2,R.drawable.z3,R.drawable.z4,R.drawable.z5,R.drawable.z6,R.drawable.z7, R.drawable.z1,R.drawable.z2,R.drawable.z3,R.drawable.z4,R.drawable.z5,R.drawable.z6,R.drawable.z7
};





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rvProgram);
        recyclerView.setHasFixedSize(true);
        layoutManager =new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        programAdapter =new ProgramAdapter(this,programNameList,programPriceList,programImages);
        recyclerView.setAdapter(programAdapter);
    }
}