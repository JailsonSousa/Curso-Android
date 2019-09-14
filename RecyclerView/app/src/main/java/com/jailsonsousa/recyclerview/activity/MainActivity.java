package com.jailsonsousa.recyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.jailsonsousa.recyclerview.R;
import com.jailsonsousa.recyclerview.adapter.EventoAdapter;
import com.jailsonsousa.recyclerview.model.Evento;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Evento> listaEventos = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        // Criar eventos para exemplo

        this.criarEventos();

        // configurar eventoAdapter

        EventoAdapter eventoAdapter = new EventoAdapter(listaEventos);

        // configurar recycle view

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(eventoAdapter);

    }

    public void criarEventos(){

        Evento e = new Evento("Empreenday", "Evento para empreendedores.", "UFC Campus Quixadá", R.drawable.empreenday);
        listaEventos.add(e);

        e = new Evento("WTISC", "Workshop de Tecnologia da Informação do Sertão Central.", "UFC Campus Quixadá", R.drawable.wtisc);
        listaEventos.add(e);

        e = new Evento("Encontros Universitários", "Espaço de Iniciação à pesquisa científica.", "UFC Campus Quixadá", R.drawable.encontros);
        listaEventos.add(e);

        e = new Evento("GameNight", "Tem como objetivo promover uma noite de jogos e interação dos alunos do Campus", "UFC Campus Quixadá", R.drawable.gamenight);
        listaEventos.add(e);

        e = new Evento("WTISC", "Workshop de Tecnologia da Informação do Sertão Central.", "UFC Campus Quixadá", R.drawable.wtisc);
        listaEventos.add(e);

        e = new Evento("Empreenday", "Evento para empreendedores", "UFC Campus Quixadá", R.drawable.empreenday);
        listaEventos.add(e);

        e = new Evento("Encontros Universitários", "Espaço de Iniciação à pesquisa científica.", "UFC Campus Quixadá", R.drawable.encontros);
        listaEventos.add(e);

        e = new Evento("Empreenday", "Evento para empreendedores", "UFC Campus Quixadá", R.drawable.empreenday);
        listaEventos.add(e);

        e = new Evento("GameNight", "Tem como objetivo promover uma noite de jogos e interação dos alunos do Campus", "UFC Campus Quixadá", R.drawable.gamenight);
        listaEventos.add(e);

    }

    public void clickGostei(View view){
        Toast.makeText(getApplicationContext(), "Click Gostei", Toast.LENGTH_LONG).show();
    }

    public void clickComentar(View view){
        Toast.makeText(getApplicationContext(), "Click Comentar", Toast.LENGTH_LONG).show();
    }
}
