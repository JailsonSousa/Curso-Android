package com.jailsonsousa.recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jailsonsousa.recyclerview.R;
import com.jailsonsousa.recyclerview.model.Evento;

import org.w3c.dom.Text;

import java.util.List;

public class EventoAdapter extends RecyclerView.Adapter<EventoAdapter.MyViewHolder> {

    private List<Evento> listaEventos;

    public EventoAdapter(List<Evento> listaEventos) {
        this.listaEventos = listaEventos;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemList = LayoutInflater.from(parent.getContext()).inflate(R.layout.detalhe_evento, parent, false);
        return new MyViewHolder(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Evento e = listaEventos.get(position);
        holder.nomeEvento.setText(e.getNomeEvento());
        holder.descricao.setText(e.getDescricao());
        holder.endereco.setText(e.getEndereco());
        holder.imagem.setImageResource(e.getImagem());
    }

    @Override
    public int getItemCount() {
        return listaEventos.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView nomeEvento;
        private TextView descricao;
        private TextView endereco;
        private ImageView imagem;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nomeEvento = itemView.findViewById(R.id.txtNomeEvento);
            descricao = itemView.findViewById(R.id.txtDescricao);
            endereco = itemView.findViewById(R.id.txtEndereco);
            imagem = itemView.findViewById(R.id.imgEvento);
        }
    }

}
