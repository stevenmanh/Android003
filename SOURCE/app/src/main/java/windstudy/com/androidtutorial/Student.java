package windstudy.com.androidtutorial;

import android.util.Log;

public class Student {
    public static String TAG = "student";

    String name;
    int age;
    String addr;

    public Student() {

    }

    public Student(String nameInput, int ageInput, String addrInput) {
        name = nameInput;
        age = ageInput;
        addr = addrInput;
    }

    void getStudentInfo() {
        Log.d(TAG, name);
        Log.d(TAG, String.valueOf(age));
        Log.d(TAG, addr);
    }

}
