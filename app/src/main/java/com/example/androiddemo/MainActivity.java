package com.example.androiddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.textView2);
        tv.setText("Hello sarawutt.b");
    }

    public void onclickBtnLogin(View view) {
        Toast.makeText(this, "Click Login", Toast.LENGTH_LONG).show();
    }

    public void OnclickBtnRegister(View view) {
        Toast.makeText(this, "Click Register", Toast.LENGTH_SHORT).show();
    }

    public void onclickbtnGotoEditTextTutorial(View view) {
        Intent it = new Intent(this, EditTextActivity.class);
        startActivity(it);
    }

    public void onclickbtnGotoButtonTutorial(View view) {
        Intent intent = new Intent(getApplicationContext(), ButtonActivity.class);
        startActivity(intent);
    }

    public void onclickbtnGotoCheckboxTutorial(View view) {
        Intent intent = new Intent(getApplicationContext(), CheckBoxActivity.class);
        startActivity(intent);
    }

    public void onclickbtnGotoRedioButtonTutorial(View view) {
        Intent intent = new Intent(getApplicationContext(), RedioButtonActivity.class);
        startActivity(intent);
    }

    public void onclickbtnGotoSpinnerDropdownListTutorial(View view) {
        Intent intent = new Intent(getApplicationContext(), SpinnerDropdownListActivity.class);
        startActivity(intent);
    }

    public void onclickbtnLinearLayoutTutorial(View view) {
        Intent intent = new Intent(getApplicationContext(), LinearLayoutActivity.class);
        startActivity(intent);
    }

    public void onclickbtnRelativeLayoutTutorial(View view) {

        Intent intent = new Intent(getApplicationContext(), RelativeLayoutActivity.class);
        startActivity(intent);

    }

    public void onclickbtnTableLayoutTutorial(View view) {
        Intent intent = new Intent(getApplicationContext(), TableLayoutActivity.class);
        startActivity(intent);
    }

    public void onclickbtnFrameLayoutTutorial(View view) {

        Intent intent = new Intent(getApplicationContext(), FrameLayoutActivity.class);
        startActivity(intent);

    }

    public void onclickbtnWebviewTutorial(View view) {
        Intent intent = new Intent(getApplicationContext(), WebviewActivity.class);
        startActivity(intent);
    }

    public void onclickbtnListviewTutorial(View view) {
        Intent intent = new Intent(getApplicationContext(), ListviewActivity.class);
        startActivity(intent);
    }

    public void onclickbtnFlagmentTutorial(View view) {

        Intent intent = new Intent(getApplicationContext(), FlagmentActivity.class);
        startActivity(intent);
    }

    public void onclickbtnViewPagerTutorial(View view) {

        Intent intent = new Intent(getApplicationContext(), DemoViewPagerActivity.class);
        startActivity(intent);

    }
}
