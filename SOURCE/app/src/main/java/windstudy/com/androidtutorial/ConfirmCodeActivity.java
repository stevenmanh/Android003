package windstudy.com.androidtutorial;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ConfirmCodeActivity extends AppCompatActivity implements TextWatcher {
    EditText edtNum1, edtNum2, edtNum3, edtNum4;
    View btnConfirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirm_code_activity);
        edtNum1 = findViewById(R.id.edt_num1);
        edtNum2 = findViewById(R.id.edt_num2);
        edtNum3 = findViewById(R.id.edt_num3);
        edtNum4 = findViewById(R.id.edt_num4);
        btnConfirm = findViewById(R.id.btn_confirm);
        edtNum1.addTextChangedListener(this);
        edtNum2.addTextChangedListener(this);
        edtNum3.addTextChangedListener(this);
        edtNum4.addTextChangedListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        if (edtNum1.getText().toString().length() >0){
            edtNum2.requestFocus();
        }
        if (edtNum2.getText().toString().length() >0){
            edtNum3.requestFocus();
        }
        if (edtNum3.getText().toString().length() >0){
            edtNum4.requestFocus();
        }
        if (edtNum4.getText().toString().length() >0){
            btnConfirm.clearFocus();
        }
    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
}
