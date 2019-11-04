package com.example.poc001;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private TextView msgTextView ;
    private Button add;
    private Button sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msgTextView = (TextView)findViewById(R.id.result);
        add = (Button)findViewById(R.id.add);
        sub = (Button)findViewById(R.id.sub);
        msgTextView.setText("0");
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i =Integer.valueOf(msgTextView.getText().toString());
                i+=1;
                msgTextView.setText(String.valueOf(i));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i =Integer.valueOf(msgTextView.getText().toString());
               if(i>0){
                i-=1;
               }
                msgTextView.setText(String.valueOf(i));
            }
        });
    }

}
