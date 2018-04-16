package com.example.a16046512.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String[] data = intent.getStringArrayExtra("data");
        TextView display = (TextView)findViewById(R.id.display);
        display.setText(data[0]+" : "+data[1]+"\n"+data[2]+" : "+data[3]+"\n"+data[4]+" : "+data[5]+"\nReflection:"+data[7]);
    }
}
