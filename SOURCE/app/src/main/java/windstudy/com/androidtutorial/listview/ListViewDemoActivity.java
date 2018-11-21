package windstudy.com.androidtutorial.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import windstudy.com.androidtutorial.R;

public class ListViewDemoActivity extends AppCompatActivity {

    ArrayList<String> arrName = new ArrayList<>();
    ListView lvAndroid003;
//    ArrayAdapter<String> adapter;
    Android003Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_demo);
        init();
        prepareData();
//        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, arrName);
        adapter = new Android003Adapter();
        adapter.data = arrName;
        adapter.context = this;
        lvAndroid003.setAdapter(adapter);

    }

    void init(){
        lvAndroid003 = findViewById(R.id.lv_android003);
    }

    void prepareData(){
        arrName.add("Thăng");
        arrName.add("Thịnh");
        arrName.add("Hoàng");
        arrName.add("Mạnh");
        arrName.add("Dương");
        arrName.add("Long");
        arrName.add("Tiến");
        arrName.add("Hiển");
        arrName.add("Tân");
        arrName.add("Sơn");
        arrName.add("Cường");
        arrName.add("Thăng");
        arrName.add("Thịnh");
        arrName.add("Hoàng");
        arrName.add("Mạnh");
        arrName.add("Dương");
        arrName.add("Long");
        arrName.add("Tiến");
        arrName.add("Hiển");
        arrName.add("Tân");
        arrName.add("Sơn");
        arrName.add("Cường");
        arrName.add("Thăng");
        arrName.add("Thịnh");
        arrName.add("Hoàng");
        arrName.add("Mạnh");
        arrName.add("Dương");
        arrName.add("Long");
        arrName.add("Tiến");
        arrName.add("Hiển");
        arrName.add("Tân");
        arrName.add("Sơn");
        arrName.add("Cường");
        arrName.add("Thăng");
        arrName.add("Thịnh");
        arrName.add("Hoàng");
        arrName.add("Mạnh");
        arrName.add("Dương");
        arrName.add("Long");
        arrName.add("Tiến");
        arrName.add("Hiển");
        arrName.add("Tân");
        arrName.add("Sơn");
        arrName.add("Cường");    arrName.add("Mạnh");
        arrName.add("Dương");
        arrName.add("Long");
        arrName.add("Tiến");
        arrName.add("Hiển");
        arrName.add("Tân");
        arrName.add("Sơn");
        arrName.add("Cường");
        arrName.add("Thăng");
        arrName.add("Thịnh");
        arrName.add("Hoàng");
        arrName.add("Mạnh");
        arrName.add("Dương");
        arrName.add("Long");
        arrName.add("Tiến");
        arrName.add("Hiển");
        arrName.add("Tân");
        arrName.add("Sơn");
        arrName.add("Cường");
        arrName.add("Thăng");
        arrName.add("Thịnh");
        arrName.add("Hoàng");
        arrName.add("Mạnh");
        arrName.add("Dương");
        arrName.add("Long");
        arrName.add("Tiến");
        arrName.add("Hiển");
        arrName.add("Tân");
        arrName.add("Sơn");
        arrName.add("Cường");
    }



}
