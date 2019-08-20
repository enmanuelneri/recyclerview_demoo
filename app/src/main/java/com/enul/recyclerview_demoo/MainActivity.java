package com.enul.recyclerview_demoo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    /* 3)Luego de crear el RecyclerView y su codigo*/
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
        /*Definimos la forma de la lista, (vertical) similar a la de un listView*/
        recyclerViewCasa.setLayoutManager(new LinearLayoutManager(this));

        /*Enviamos toda la informacion guardada en nuestra lista a nuestro adaptador*/
        adaptadorCasa=new RecyclerViewAdaptador(obtenerCasas());
        /*Y asignamos toda esta informacion a nuestro recyclerView de nuestro Layout*/
        recyclerViewCasa.setAdapter(adaptadorCasa);
    }

    /*Creamos una funcion tipo lista, la cual contendra los datos q tendremos*/
    public List<CasaModelo>  obtenerCasas(){
        List<CasaModelo> casas=new ArrayList<>();
        casas.add(new CasaModelo("ABC123","Casa Vivienda",R.drawable.home));
        casas.add(new CasaModelo("CDE123","Restaurant",R.drawable.home2));
        casas.add(new CasaModelo("FGH123","Panaderia",R.drawable.home));
        return casas;
    }

}
