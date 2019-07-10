package com.example.androiddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView)findViewById(R.id.textView2);
        tv.setText("Hello sarawutt.b");
    }

    public void onclickBtnLogin(View view) {
        Toast.makeText(this,"Click Login",Toast.LENGTH_LONG).show();
    }

    public void OnclickBtnRegister(View view) {
        Toast.makeText(this ,"Click Register",Toast.LENGTH_SHORT).show();
    }

    public void onclickbtnGotoEditTextTutorial(View view) {
        Intent it = new Intent(this,editTextActivity.class);
        startActivity(it);
    }
}
