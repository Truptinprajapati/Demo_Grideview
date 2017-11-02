package com.example.trupti.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    int[] img={R.drawable.call,R.drawable.download,R.drawable.mail,R.drawable.mod,R.drawable.music,R.drawable.wifi
              ,R.drawable.call,R.drawable.download,R.drawable.mail,R.drawable.mod,R.drawable.music,R.drawable.wifi
            ,R.drawable.call,R.drawable.download,R.drawable.mail,R.drawable.mod,R.drawable.music,R.drawable.wifi};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gd=(GridView)findViewById(R.id.gdlist);
        ImageAdapter adapter=new ImageAdapter(this,img);
        gd.setAdapter(adapter);
    }
}
