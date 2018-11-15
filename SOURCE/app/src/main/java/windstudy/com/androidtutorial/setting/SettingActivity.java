
package windstudy.com.androidtutorial.setting;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import windstudy.com.androidtutorial.R;

public class SettingActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    Switch swWifi, swBluetooth;
    CheckBox cbBatterySave;
    Button btnSave, btnClear;
    EditText edtPhoneName, edtNum1, edtNum2, edtNum3, edtNum4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        init();
    }

    void init() {
        swWifi = findViewById(R.id.sw_wifi);
        swBluetooth = findViewById(R.id.sw_bluetooth);
        cbBatterySave = findViewById(R.id.cb_battery_save);
        btnSave = findViewById(R.id.btn_save);
        btnClear = findViewById(R.id.btn_clear);
        edtPhoneName = findViewById(R.id.edt_phone_name);
        edtNum1 = findViewById(R.id.edt_num1);
        edtNum2 = findViewById(R.id.edt_num2);
        edtNum3 = findViewById(R.id.edt_num3);
        edtNum4 = findViewById(R.id.edt_num4);

        // cach 1 su dung interface
//        btnSave.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                actionClick();
//            }
//        });
//        btnClear.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                actionClick();
//            }
//        });

        btnSave.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        swWifi.setOnCheckedChangeListener(this);
        swBluetooth.setOnCheckedChangeListener(this);
        cbBatterySave.setOnCheckedChangeListener(this);
        edtPhoneName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {
                Log.d("Edt beforeTextChanged", "beforeTextChanged: "
                        + charSequence + " "
                        + start + " "
                        + count + " "
                        + after + " ");
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.d("Edt onTextChanged", "beforeTextChanged: "
                        + charSequence + " "
                        + i + " "
                        + i1 + " "
                        + i2 + " ");
            }

            @Override
            public void afterTextChanged(Editable editable) {
                Log.d("Edt onTextChanged", "beforeTextChanged: " + editable.toString());
            }
        });

        edtNum1.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
                if (edtNum1.getText().toString().length() == 1)     //size as per your requirement
                {
                    edtNum2.requestFocus();
                }
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // TODO Auto-generated method stub
            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
            }

        });
        edtNum2.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
                if (edtNum2.getText().toString().length() == 1)     //size as per your requirement
                {
                    edtNum3.requestFocus();
                }
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // TODO Auto-generated method stub
            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
            }

        });
        edtNum3.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
                if (edtNum3.getText().toString().length() == 1)     //size as per your requirement
                {
                    edtNum4.requestFocus();
                }
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // TODO Auto-generated method stub
            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
            }

        });
        edtNum4.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
                if (edtNum4.getText().toString().length() == 1)     //size as per your requirement
                {
                    btnSave.requestFocus();
                }
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // TODO Auto-generated method stub
            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
            }

        });

    }

    void actionClear() {
        // dua tat ca ve off
        // ten dth = ""
        swWifi.setChecked(false);
        swBluetooth.setChecked(false);
        cbBatterySave.setChecked(false);
        edtPhoneName.setText("");
    }

    void actionSave() {
        boolean isWifiOn = swWifi.isChecked();
        boolean isBluetoothOn = swBluetooth.isChecked();
        boolean isBatterySaveOn = cbBatterySave.isChecked();
        String phoneName = edtPhoneName.getText().toString();

        Log.d("setting", "onClick: "
                + isWifiOn + " "
                + isBluetoothOn + " "
                + isBatterySaveOn + " "
                + phoneName
        );

    }

    @Override
    public void onClick(View view) {
        Log.d("Click", "onClick: ");
        int id = view.getId();

        switch (id) {
            case R.id.btn_save: {
                actionSave();
                break;
            }
            case R.id.btn_clear: {
                actionClear();
                break;
            }
            default:
                break;
        }

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        int id = compoundButton.getId();
        switch (id) {
            case R.id.sw_wifi: {
                if (b) {
                    Toast.makeText(this, "Wifi is On", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Wifi is Off", Toast.LENGTH_SHORT).show();
                }

                break;
            }
            case R.id.sw_bluetooth: {
                if (b) {
                    Toast.makeText(this, "Bluetooth is On", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Bluetooth is Off", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.cb_battery_save: {
                if (b) {
                    Toast.makeText(this, "Battery Save is On", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Battery Save Off", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            default:
                break;
        }
    }


}
