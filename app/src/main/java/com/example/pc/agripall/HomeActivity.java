package com.example.pc.agripall;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class HomeActivity extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // storing string resources into Array
        String[] adobe_products = getResources().getStringArray(R.array.adobe_products);

        // Binding resources Array to ListAdapter
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, R.id.label, adobe_products));

        ListView lv = getListView();

        // listening to single list item on click
        lv.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // selected item
                String product = ((TextView) view).getText().toString();

                if(position==0)// Launching new Activity on selecting single List Item
                {Intent i = new Intent(getApplicationContext(), RedsoilActivity.class);
                    // sending data to new activity
                    startActivity(i);}
                else if(position==1)
                {
                    Intent j = new Intent(getApplicationContext(), BlacksoilActivity.class);
                    // sending data to new activity
                    startActivity(j);}
                else if(position==2)
                {
                    Intent k = new Intent(getApplicationContext(), AlluvialsoilActivity.class);
                    // sending data to new activity
                    startActivity(k);}
                    else
                {
                    Intent l = new Intent(getApplicationContext(), LateritesoilActivity.class);
                    // sending data to new activity
                    startActivity(l);
                }
            }
        });
    }
}