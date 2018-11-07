package windstudy.com.androidtutorial.qLyTaiLieu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import windstudy.com.androidtutorial.R;

public class TaiLieuActivity extends AppCompatActivity {
    EditText edtID, edtProducer, edtCount;
    TextView tvContent;
    Button btnSave;
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tai_lieu_layout);
        init();
    }

    void init() {
        edtID = findViewById(R.id.edt_id);
        edtProducer = findViewById(R.id.edt_producer);
        edtCount = findViewById(R.id.edt_code);
        tvContent = findViewById(R.id.tv_log);
        btnSave = findViewById(R.id.btn_save);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TaiLieu taiLieu = new TaiLieu();
                taiLieu.maTaiLieu = edtID.getText().toString();
                taiLieu.nhaXuatBan = edtProducer.getText().toString();
                taiLieu.soBanPhatHanh = Integer.parseInt(edtCount.getText().toString());
            }
        });
    }
}
