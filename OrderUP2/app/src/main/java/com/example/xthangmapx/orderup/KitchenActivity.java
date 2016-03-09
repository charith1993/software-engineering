package com.example.xthangmapx.orderup;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class KitchenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen);
<<<<<<< HEAD
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
=======
>>>>>>> 54973538f33744599cb3f229ca1967832546379e
    }

    public void onClick_EditMenu(View view){
        Intent intent = new Intent(this, EditMenuActivity.class);
        startActivity(intent);
    }

}
