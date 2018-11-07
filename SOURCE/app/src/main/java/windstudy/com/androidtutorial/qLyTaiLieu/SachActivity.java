package windstudy.com.androidtutorial.qLyTaiLieu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.EditText;

import windstudy.com.androidtutorial.R;

public class SachActivity extends TaiLieuActivity {
    EditText edtAuthor, edtBookName,edtPageCount;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sach_layout);
    }

    @Override
    void init() {
        super.init();
        edtAuthor = findViewById(R.id.edt_author);
        edtBookName = findViewById(R.id.edt_book_name);
        edtPageCount = findViewById(R.id.edt_page_count);
    }
}
