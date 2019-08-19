package com.enul.recyclerview_demoo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;

/*Esta clase tiene como funcion comunicar a nuestro RecyclerView de nuestro Layout la cantidad de
* informacion que se utilizará para crear y poblar cada item de nuestra lista. Este actua como un
* puente de comunicacion entre la "Presentacion" y la "fuente de informacion" a mostrar.
* Osea en base al modelo MVC, seria el "Controlador"*/

/*Extendemos de la clase RecyclerView.Adapter*/
public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder> {
    /*Los adaptadores para el RecyclerView deben tener una "clase interna" que extienda de RecyclerView.ViewHolder*/
    /*Creamos la siguiente clase interna*/
    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView codigo,descripcion;
        ImageView fotoCasa;

        public ViewHolder(View itemView){
            super(itemView);
            codigo=(TextView)itemView.findViewById(R.id.txtCodigo);
            descripcion=(TextView)itemView.findViewById(R.id.txtDescripcion);
            fotoCasa=(ImageView)itemView.findViewById(R.id.imgCasa);
        }
    }
    //=========================Hasta aca llega la clase interna ========================
    /*Cremaos una lista para almacenar los datos mostrados en cada item*/
    public List<CasaModelo> casaLista;

    /*Creamos un constructor el cual recibira como parametro la lista creada*/

    public RecyclerViewAdaptador(List<CasaModelo> casaLista) {
        this.casaLista = casaLista;
    }

    /*Con el sgt metodo inflamos; es decir hacemos uso de un Layout dentro de otro Layout*/
    /*Por ejemplo nuestro Layout item_Casa tiene como destino ser parte del layout activity_Main*/
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Por ejemplo en este caso, nuestro layout item cantante es parte de nuestro Layout ActivityMain
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_casa,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    /*El metodo onBindViewHolder es el que realiza las modificaciones de contenido para cada item*/
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) { /*La clase ViewHolder es la q creaste arriba*/
        holder.codigo.setText(casaLista.get(position).getCodigo());
        holder.descripcion.setText((casaLista.get(position).getDescripcion()));
        holder.fotoCasa.setImageResource(casaLista.get(position).getImgCasa());
    }

    /*El sgt metodo permite saber la cantidad de elementos que se procesaran*/
    @Override
    public int getItemCount() {
        return casaLista.size();
    }
}
