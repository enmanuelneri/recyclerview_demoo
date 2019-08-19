package com.enul.recyclerview_demoo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    /*Creamos una instacia de la clase "RecyclerView" y otra de nuestro "Adaptador" creado anteriormente*/
    private RecyclerView recyclerViewCasa;
    private RecyclerViewAdaptador adaptadorCasa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* OJO: A continuacion vinculamos nuestra insstancia  recyclerViewCasa con el recyclerView de
         * nuestro Layout */

        recyclerViewCasa=(RecyclerView)findViewById(R.id.recyclerCasa);

    }
}
