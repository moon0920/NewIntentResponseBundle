package com.mmj.www.newintentresponsebundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String name, age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView maintvname = findViewById(R.id.maintvname);
        //name = maintvname.getText().toString();
        TextView maintvage = findViewById(R.id.maintvage);
        //age = maintvage.getText().toString();
        Button mainbtngosub = findViewById(R.id.mainbtngosub);
        mainbtngosub.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {



        Intent intent = new Intent(this,subActivity.class);

        startActivityForResult(intent, 100);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(data.hasExtra("resultValueage")) {
            //name = ;
            TextView maintvage = (TextView) findViewById(R.id.maintvage);
            maintvage.setText(data.getStringExtra("resultValueage"));

        }
        if(data.hasExtra("resultValuename")) {
            //name = ;

            TextView maintvname = (TextView) findViewById(R.id.maintvname);
            maintvname.setText(data.getStringExtra("resultValuename"));
        }

    }
}
