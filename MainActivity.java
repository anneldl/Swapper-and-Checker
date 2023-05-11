package com.lopez.swapperandchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);
        Button swap = findViewById(R.id.button);
        Button check = findViewById(R.id.button2);

        swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt1 = editText1.getText().toString();
                String txt2 = editText2.getText().toString();
                editText1.setText(txt2);
                editText2.setText(txt1);
            }
        });

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt1 = editText1.getText().toString();
                String txt2 = editText2.getText().toString();

                String output ="";
                if(txt1.equals(txt2)){
                    output = "SAME";
                }
                else{
                    output = "NOT SAME";
                }

                Intent intent = new Intent(MainActivity.this, SameNotSameAct.class);
                intent.putExtra("output",output);
                startActivity(intent);
            }
        });
    }
}