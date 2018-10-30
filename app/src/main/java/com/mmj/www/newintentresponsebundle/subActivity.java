package com.mmj.www.newintentresponsebundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class subActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        EditText subetname = findViewById(R.id.subetname);
        subetname.getText().toString();
        EditText subetage = findViewById(R.id.subetage);
        subetage.getText().toString();
//        Button subbtngomain = findViewById(R.id.subbtngomain);
//        subbtngomain.setOnClickListener(this);
    }

    @Override
    public void finish() {
        String text;
        EditText subetname = findViewById(R.id.subetname);
        text = subetname.getText().toString();
        EditText subetage = findViewById(R.id.subetage);
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("resultValuename",text);
        bundle.putString("resultValueage",subetage.getText().toString());


        intent.putExtras(bundle);
        setResult(100, intent);
        super.finish();
    }
}
