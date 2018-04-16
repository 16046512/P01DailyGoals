package com.example.a16046512.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn = (Button)findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv1,tv3,tv5,tv7;
                RadioGroup rg1,rg2,rg3;
                EditText et1;

                tv1 = (TextView)findViewById(R.id.tv1);
                tv3 = (TextView)findViewById(R.id.tv3);
                tv5 = (TextView)findViewById(R.id.tv5);
                tv7 = (TextView)findViewById(R.id.tv7);

                rg1 = (RadioGroup) findViewById(R.id.radioGroup1);
                rg2 = (RadioGroup)findViewById(R.id.radioGroup2);
                rg3 = (RadioGroup)findViewById(R.id.radioGroup3);

                et1 = (EditText)findViewById(R.id.et1);

                int selectedButtonId1 = rg1.getCheckedRadioButtonId();
                int selectedButtonId2 = rg2.getCheckedRadioButtonId();
                int selectedButtonId3 = rg3.getCheckedRadioButtonId();

                RadioButton rb1 = (RadioButton) findViewById(selectedButtonId1);
                RadioButton rb2 = (RadioButton) findViewById(selectedButtonId2);
                RadioButton rb3 = (RadioButton) findViewById(selectedButtonId3);

                String[] data = {tv1.getText().toString(),rb1.getText().toString(),tv3.getText().toString(),rb2.getText().toString(),tv5.getText().toString(),rb3.getText().toString(),tv7.getText().toString(),et1.getText().toString()};
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("data",data);
                startActivity(intent);


            }
        });

//

    }
}
