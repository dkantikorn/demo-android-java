package com.example.androiddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListviewActivity extends AppCompatActivity {

//    private ListView mListView;
//    private ArrayAdapter aAdapter;
//    private String[] users = { "Java Android", "Kotlin Android", "PHP", "Angular", "React JS", "Node JS"};
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_listview);
//
//        mListView = (ListView) findViewById(R.id.userlist);
//        aAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, users);
//        mListView.setAdapter(aAdapter);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList userList = getListData();
        final ListView lv = (ListView) findViewById(R.id.user_list);
        lv.setAdapter(new CustomListAdapter(this, userList));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                ListItem user = (ListItem) lv.getItemAtPosition(position);
                Toast.makeText(ListviewActivity.this, "Selected :" + " " + user.getName() + ", " + user.getLocation(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private ArrayList getListData() {
        ArrayList<ListItem> results = new ArrayList<>();

        ListItem user1 = new ListItem();
        user1.setName("Suresh Dasari");
        user1.setDesignation("Team Leader");
        user1.setLocation("Hyderabad");
        results.add(user1);

        ListItem user2 = new ListItem();
        user2.setName("Rohini Alavala");
        user2.setDesignation("Agricultural Officer");
        user2.setLocation("Guntur");
        results.add(user2);

        ListItem user3 = new ListItem();
        user3.setName("Trishika Dasari");
        user3.setDesignation("Charted Accountant");
        user3.setLocation("Guntur");
        results.add(user3);

        return results;
    }
}
