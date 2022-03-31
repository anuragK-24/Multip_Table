package com.firstapp.table;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Here we go..!", Toast.LENGTH_SHORT).show();
                String s= editText.getText().toString();
                int num=Integer.parseInt(s);
                textView.setText(num + " * 1  = " + num * 1+"\n" + num + " * 2  = " + num * 2 + "\n" + num + " * 3  = " + num * 3 + "\n" + num + " * 4  = " + num * 4 + "\n" + num + " * 5  = " + num*5 + "\n" + num + " * 6  = " + num*6 + "\n" + num + " * 7  = " + num*7 + "\n" + num + " * 8  = " + num*8 + "\n" + num + " * 9  = " + num*9 + "\n" + num + " * 10 = " + num*10);
            }
        });

    }
}