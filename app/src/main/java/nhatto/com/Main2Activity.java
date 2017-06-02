package nhatto.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    private ListView listView;
    private TextView textview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView = (ListView) findViewById(R.id.lv_listView);
        textview = (TextView) findViewById(R.id.textView);

        Bundle bd = getIntent().getExtras();

        String name = "";

        if( bd != null ){
            name = bd.getString("name");
//            textview.setText(name);
        }

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("GSON");
        list.add("Android");
        list.add("coder");
        list.add("HTML");
        list.add(name);

        ArrayAdapter adapter = new ArrayAdapter(Main2Activity.this,android.R.layout.simple_list_item_1,list);

        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
