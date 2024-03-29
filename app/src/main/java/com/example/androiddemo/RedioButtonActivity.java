package com.example.androiddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class RedioButtonActivity extends AppCompatActivity {

    RadioButton android, java, angular, python;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redio_button);

        android = (RadioButton) findViewById(R.id.rdbAndroid);
        angular = (RadioButton) findViewById(R.id.rdbAngular);
        java = (RadioButton) findViewById(R.id.rdbJava);
        python = (RadioButton) findViewById(R.id.rdbPython);
        Button btn = (Button) findViewById(R.id.getBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = "Selected Course: ";
                result += (android.isChecked()) ? "Android" : (angular.isChecked()) ? "AngularJS" : (java.isChecked()) ? "Java" : (python.isChecked()) ? "Python" : "";
                Toast toast = Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP | Gravity.RIGHT, 20, 20);
                toast.show();
            }
        });
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        String str = "";
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.rdbAndroid:
                if (checked)
                    str = "Android Selected";
                break;
            case R.id.rdbAngular:
                if (checked)
                    str = "AngularJS Selected";
                break;
            case R.id.rdbJava:
                if (checked)
                    str = "Java Selected";
                break;
            case R.id.rdbPython:
                if (checked)
                    str = "Python Selected";
                break;
        }
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }
}
