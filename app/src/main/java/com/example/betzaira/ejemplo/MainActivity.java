package com.example.betzaira.ejemplo;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

import Adapters.AdapterItem_Producto;


public class MainActivity extends AppCompatActivity {
   static final ArrayList<productosDTO> productoS = new ArrayList<productosDTO>();

    productosDTO prodDTO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


      //  ArrayList<productosDTO> producto = new ArrayList<productosDTO>();
        prodDTO = new productosDTO();

        prodDTO.setClave(1);
        prodDTO.setNombre_producto("arrachera");
        prodDTO.setImagen(ruta("@drawable/arrachera"));
        productoS.add(prodDTO);
        prodDTO = new productosDTO();

        prodDTO.setClave(2);
        prodDTO.setNombre_producto("cosido");
        prodDTO.setImagen(ruta("@drawable/cosido"));
        productoS.add(prodDTO);
        prodDTO = new productosDTO();

        prodDTO.setClave(3);
        prodDTO.setNombre_producto("bistec");
        prodDTO.setImagen(ruta("@drawable/bistec"));
        productoS.add(prodDTO);
        prodDTO = new productosDTO();

        prodDTO.setClave(4);
        prodDTO.setNombre_producto("chuleta ahumada");
        prodDTO.setImagen(ruta("@drawable/chuleta"));
        productoS.add(prodDTO);
        prodDTO = new productosDTO();

        prodDTO.setClave(5);
        prodDTO.setNombre_producto("pollo");
        prodDTO.setImagen(ruta("@drawable/pollo"));
        productoS.add(prodDTO);



        ListView lv = (ListView) findViewById(R.id.listview);


        AdapterItem_Producto adapter = new AdapterItem_Producto(this, productoS);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                final int pos = position;

                    Intent myintent = new Intent(view.getContext(),Main2Activity.class);

                    myintent.putExtra("posicion",pos);
             startActivity(myintent);



            }
        });




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                       // .setAction("Action", null).show();

                startActivity (new Intent(MainActivity.this,Main3Activity.class));

            }
        });
    }

    public Drawable ruta (String ruta){
        String url = ruta;
        int imagenResourse = getResources().getIdentifier(url, null, getPackageName());
        Drawable imagen = ContextCompat.getDrawable(getApplicationContext(),imagenResourse);
        return  imagen;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
