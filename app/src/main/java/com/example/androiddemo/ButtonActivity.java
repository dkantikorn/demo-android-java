package com.example.androiddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    private Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);


        final EditText firstNum = (EditText) findViewById(R.id.firstNum);
        final EditText secNum = (EditText) findViewById(R.id.secondNum);
        btnAdd = (Button) findViewById(R.id.addBtn);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNum.getText().toString().isEmpty() || secNum.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please fill all the fields", Toast.LENGTH_SHORT).show();
                } else {
                    Double num1 = Double.parseDouble(firstNum.getText().toString());
                    Double num2 = Double.parseDouble(secNum.getText().toString());
                    Toast.makeText(getApplicationContext(), "SUM = " + (num1 + num2), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void onclickBtnBack(View view) {
        Intent it = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(it);
    }

    public void onclickBtnImageAdd(View view) {
        //btnAdd.performClick();
    }
}
