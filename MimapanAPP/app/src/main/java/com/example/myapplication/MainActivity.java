package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    public Button btn_write,btn_de;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_write = findViewById(R.id.btn_write);
        btn_write.setOnClickListener(btnClickListener);
        btn_de = findViewById(R.id.btn_de);
        btn_de.setOnClickListener(btnClickListener);
    }
    Button.OnClickListener btnClickListener=new Button.OnClickListener(){
        @Override
        public void onClick(View view) {
            switch(view.getId()){
                case R.id.btn_write:
                    Intent intent_write=new Intent(MainActivity.this,MainActivity2.class );
                    Bundle bundle=new Bundle();
                    startActivity(intent_write);
                    break;
                case R.id.btn_de:
                    Intent intent_de=new Intent(MainActivity.this,MainActivity3.class );
                    Bundle bundle2=new Bundle();
                    startActivity(intent_de);
                    break;
            }

            //#FF82D900
        }
    };

}