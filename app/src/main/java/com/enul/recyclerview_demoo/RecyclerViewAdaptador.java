package com.enul.recyclerview_demoo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder> {

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
    /*Cremaos una lista para poner las casas*/
    public List<CasaModelo> casaLista;

    /*Creamos un constructor el cual recibira como parametro la lista creada*/

    public RecyclerViewAdaptador(List<CasaModelo> casaLista) {
        this.casaLista = casaLista;
    }

    /*Con el sgt metodo inflamos; es decir hacemos uso de un Layout dentro de otro Layout*/
    /*Por ejemplo nuestro Layout item_Casa tiene como destinoser parte del layout activity_Main*/


    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }
}
