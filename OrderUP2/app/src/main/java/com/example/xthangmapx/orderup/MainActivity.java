package com.example.xthangmapx.orderup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ExpandableListView expandableListView;
    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        expandableListView = (ExpandableListView)findViewById(R.id.expandableListView2);

        final List<String> Headings = new ArrayList<String>();

        List<String> L1 = new ArrayList<String>();
        List<String> L2 = new ArrayList<String>();
        List<String> L3 = new ArrayList<String>();
        List<String> L4 = new ArrayList<String>();
        List<String> L5 = new ArrayList<String>();
        List<String> L6 = new ArrayList<String>();
        List<String> L7 = new ArrayList<String>();

        final HashMap<String,List<String>> ChildList = new HashMap<String,List<String>>();
        String heading_items[]= getResources().getStringArray(R.array.header_titles);

        String l1[]= getResources().getStringArray(R.array.h1_items);
        String l2[]= getResources().getStringArray(R.array.h2_items);
        String l3[]= getResources().getStringArray(R.array.h3_items);
        String l4[]= getResources().getStringArray(R.array.h4_items);
        String l5[]= getResources().getStringArray(R.array.h5_items);
        String l6[]= getResources().getStringArray(R.array.h6_items);
        String l7[]= getResources().getStringArray(R.array.h7_items);
        for(String title : heading_items)
        {
            Headings.add(title);
        }
        for(String title : l1)
        {
            L1.add(title);
        }
        for(String title : l2)
        {
            L2.add(title);
        }
        for(String title : l3)
        {
            L3.add(title);
        }
        for(String title : l4)
        {
            L4.add(title);
        }
        for(String title : l5)
        {
            L5.add(title);
        }
        for(String title : l6)
        {
            L6.add(title);
        }
        for(String title : l7)
        {
            L7.add(title);
        }
        ChildList.put(Headings.get(0), L1);
        ChildList.put(Headings.get(1), L2);
        ChildList.put(Headings.get(2), L3);
        ChildList.put(Headings.get(3), L4);
        ChildList.put(Headings.get(4), L5);
        ChildList.put(Headings.get(5), L6);
        ChildList.put(Headings.get(6), L7);
        MyAdapter myAdapter = new MyAdapter(this,Headings,ChildList);
        expandableListView.setAdapter(myAdapter);
        // Listview on child click listener
        expandableListView.setOnChildClickListener(new OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {

                //TODO add item to the oder here


                return false;
            }
        });
        }

    //called when use clicks kitchen button
    public void onClick_kitchen(View view){
        Intent intent = new Intent(this, KitchenActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
