package com.example.betzaira.ejemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
int pos;
EditText posi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        pos=getIntent().getExtras().getInt("posicion");


        Toast.makeText(getApplicationContext(),"Cliete en la posicion"+pos+ "Es"+ "  "+ MainActivity.productoS.get(pos),Toast.LENGTH_SHORT).show();


    }
}
