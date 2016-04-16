package com.example.sharmaine.lab3exercise.tests;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sharmaine.lab3exercise.MainActivity;
import com.example.sharmaine.lab3exercise.R;

/**
 * Created by sharmaine on 4/15/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity>{
    MainActivity mainActivity;
    public JUnit_test(){
        super(MainActivity.class);
    }

    public void test_sum (){
        mainActivity = getActivity();
        int result = mainActivity.subtract(5, 4);
        assertEquals(1, result);
    }
}
