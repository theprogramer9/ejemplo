package com.example.betzaira.ejemplo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    Button aceptarButton;
    EditText clavetext;
    EditText nomtext, destext, prestext, kiltext ;
    productosDTO producto;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        aceptarButton = findViewById(R.id.agreButton);
        clavetext = findViewById(R.id.txtClave);
        nomtext = findViewById(R.id.txtNom);
        destext= findViewById(R.id.txtDes);
        prestext = findViewById(R.id.txtPres);
        kiltext = findViewById(R.id.txtKil);

        aceptarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                producto=new productosDTO();

                producto.setClave(Integer.parseInt(clavetext.getText().toString()));
                producto.setNombre_producto(nomtext.getText().toString());
                producto.setDescripcion(destext.getText().toString());
                producto.setPrecio(Double.parseDouble(prestext.getText().toString()));
                producto.setKilogramos(Double.parseDouble(kiltext.getText().toString()));




                 MainActivity.productoS.add(producto);
                 Intent mynewintent = new Intent(view.getContext(),MainActivity.class);
                 startActivity(mynewintent);





            }
        });




    }
}
