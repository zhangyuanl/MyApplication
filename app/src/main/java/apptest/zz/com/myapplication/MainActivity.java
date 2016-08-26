package apptest.zz.com.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

import apptest.zz.com.adapter.MyAdapter;

public class MainActivity extends AppCompatActivity {
    private ListView listview;
    private MyAdapter myAdapter;
    private Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initView();
    }

    private void initView() {
        context = MainActivity.this;
        listview = (ListView) findViewById(R.id.listview);
        myAdapter = new MyAdapter(context);
        listview.setAdapter(myAdapter);

    }
}