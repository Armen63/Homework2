package com.example.homework2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    RelativeLayout rBlue;
    RelativeLayout rPink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rBlue = (RelativeLayout) findViewById(R.id.blue);
        rPink = (RelativeLayout) findViewById(R.id.pink);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.blue:

                break;
            case R.id.pink:

                break;
        }
    }
}
