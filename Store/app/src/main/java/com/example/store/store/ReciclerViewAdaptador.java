package com.example.store.store;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ReciclerViewAdaptador extends RecyclerView.Adapter<ReciclerViewAdaptador.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private TextView modelo, marca, valor;
        ImageView imgDrone;

        public ViewHolder(View itemView){
            super(itemView);

            modelo = (TextView) itemView.findViewById(R.id.tvModelo);
            marca = (TextView) itemView.findViewById(R.id.tvMarca);
            valor = (TextView) itemView.findViewById(R.id.tvValor);
            imgDrone = (ImageView) itemView.findViewById(R.id.imgDrone);
        }

    }

    public List<DroneAndroid> droneAndroidLista;

    public ReciclerViewAdaptador(List<DroneAndroid> droneAndroidLista) {
        this.droneAndroidLista = droneAndroidLista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_content,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.modelo.setText(droneAndroidLista.get(position).getEspec().getModelo());
        holder.marca.setText(droneAndroidLista.get(position).getEspec().getMarca());
        holder.valor.setText(droneAndroidLista.get(position).getEspec().getValor());
        holder.imgDrone.setImageResource(droneAndroidLista.get(position).getEspec().getImgDrone());
    }

    @Override
    public int getItemCount() {
        return droneAndroidLista.size();
    }
}
