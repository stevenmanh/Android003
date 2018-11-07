package windstudy.com.androidtutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static String TAG = "student";
    EditText edtName;
    EditText edtAge;
    EditText edtAddr;
    Button btnSave;
    TextView tvLog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_layout);
        //Khai báo
        Student hienRau;
        Student tanMotCu;

        // Gia Vo khoi tao
        edtName = findViewById(R.id.edt_code);
        edtAge = findViewById(R.id.edt_producer);
        edtAddr = findViewById(R.id.edt_count);
        btnSave = findViewById(R.id.btn_save);
        tvLog = findViewById(R.id.tv_log);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Khi có ai ấn vào button thì sẽ gọi vào đây
                String inputText = edtName.getText().toString();
                int inputAge = Integer.parseInt(edtAge.getText().toString());
                String inputAddr = edtAddr.getText().toString();
                Student inputStudent = new Student(inputText, inputAge, inputAddr);
                inputStudent.getStudentInfo();

                String currentLog = tvLog.getText().toString();

                tvLog.setText(inputStudent.name
                        + " ++ " + inputStudent.age
                        + " ++ " + inputStudent.addr + "\n" + currentLog);
            }
        });

        //Khởi tạo
//        hienRau = new Student("Hiển Râu Quặp", 28, "Hà Lội");
//        tanMotCu = new Student("Tân Hai Cú", 22, "Tiểu Vương Quốc");
//        hienRau.getStudentInfo();
//        tanMotCu.getStudentInfo();
    }
}
