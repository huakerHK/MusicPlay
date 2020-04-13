package com.example.musicplay;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.musicplay.MainActivity;
import com.example.musicplay.R;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class onlineclass extends MainActivity {
    private  String[] data={"张三","李四","小红","abc"};
    private List fruitList=new ArrayList();
    private Date LayoutInflater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.local_layout);
        ListView listView=findViewById(R.id.list_item);
        ArrayAdapter adapter=new ArrayAdapter(com.example.musicplay.onlineclass.this,android.R.layout.simple_expandable_list_item_1,data);
        listView.setAdapter(adapter);
    }
}