package com.lopez.swapperandchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SameNotSameAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samenotsame);

        TextView result = findViewById(R.id.textView1);

        Intent intent = getIntent();
        String output1 = intent.getStringExtra("output");
        result.setText(output1);
    }
}