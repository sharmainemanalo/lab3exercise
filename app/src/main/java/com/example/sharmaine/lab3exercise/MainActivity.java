package com.example.sharmaine.lab3exercise;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstNum, secondNum;
    TextView addResult;
    Button addButton;

    int num1, num2, difference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        firstNum = (EditText)findViewById(R.id.editText2);
        secondNum = (EditText)findViewById(R.id.editText);
        addResult = (TextView)findViewById(R.id.textView);
        addButton = (Button)findViewById(R.id.button);

        addButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = Integer.parseInt(firstNum.getText().toString());
                num2 = Integer.parseInt(secondNum.getText().toString());
                subtract(num1, num2);
                addResult.setText(Integer.toString(difference));
            }
        });

    }

    public int subtract(int a, int b) {
        difference = a + b;
        return difference;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
