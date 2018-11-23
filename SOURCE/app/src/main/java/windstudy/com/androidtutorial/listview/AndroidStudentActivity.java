package windstudy.com.androidtutorial.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import windstudy.com.androidtutorial.R;

public class AndroidStudentActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnAdd, btnUpdate,btnDel;
    EditText edtName, edtPhoneNumber, edtAddr, edtID;
    ArrayList<AndroidStudent> arrData = new ArrayList<>();
    ListView lvAndroidStudent;
    AndroidStudentAdapter adapter;
    int currentPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_student);
        init();
    }

    void init() {
        btnAdd = findViewById(R.id.btn_add);
        btnUpdate = findViewById(R.id.btn_update);
        btnDel = findViewById(R.id.btn_del);
        btnAdd.setTag("add");
        btnUpdate.setTag("update");
        btnDel.setTag("del");
        edtName = findViewById(R.id.edt_name);
        edtPhoneNumber = findViewById(R.id.edt_phone_number);
        edtAddr = findViewById(R.id.edt_addr);
        lvAndroidStudent = findViewById(R.id.lv_android_student);
        edtID = findViewById(R.id.edt_id);
        btnAdd.setOnClickListener(this);
        btnUpdate.setOnClickListener(this);
        adapter = new AndroidStudentAdapter();
        adapter.data = arrData;
        adapter.context = this;
        lvAndroidStudent.setAdapter(adapter);
        lvAndroidStudent.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("Thangnt", "onItemClick: " + i);
                // Lấy đối tượng AndoroidStudent ở vị trí i
                AndroidStudent androidStudent = arrData.get(i);
                edtName.setText(androidStudent.getName());
                edtID.setText("" + androidStudent.getId());
                edtAddr.setText(androidStudent.getAddr());
                edtPhoneNumber.setText(androidStudent.getPhoneNumber());
                currentPos = i;
            }
        });
    }


    void actionAdd() {
        // kiem tra xem da nhap day du chua , neu chua thi bao loi va bat nhap.

        // get cac text ra
        String name = edtName.getText().toString();
        String addr = edtAddr.getText().toString();
        int id = Integer.parseInt(edtID.getText().toString());
        String phoneNumber = edtPhoneNumber.getText().toString();

        //Tao doi tuong tu cac thong tin tren
        AndroidStudent androidStudent = new AndroidStudent(id, name, addr, phoneNumber);
        
        //Add vao arrayList
        arrData.add(androidStudent);
        clearEdittext();
        Log.d("Thangnt", "arrData Size: " + arrData.size() + "\n" + arrData.toString());

        // Hien thi ra listView
        adapter.notifyDataSetChanged();


    }

    void actionUpdate() {
        AndroidStudent androidStudent = arrData.get(currentPos);
        androidStudent.setAddr(edtAddr.getText().toString());
        androidStudent.setId(Integer.parseInt(edtID.getText().toString()));
        androidStudent.setName(edtName.getText().toString());
        androidStudent.setPhoneNumber(edtPhoneNumber.getText().toString());
        adapter.notifyDataSetChanged();
    }
    void actionDelete() {
        arrData.remove(currentPos);
        adapter.notifyDataSetChanged();
    }

    void clearEdittext() {
        edtPhoneNumber.setText("");
        edtID.setText("");
        edtName.setText("");
        edtAddr.setText("");
    }

    @Override
    public void onClick(View view) {
        if (view.getTag().equals("add"))
            actionAdd();
        if (view.getTag().equals("update"))
            actionUpdate();
        if (view.getTag().equals("del"))
            actionDelete();
    }
}
