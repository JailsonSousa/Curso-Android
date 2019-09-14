package com.jailsonsousa.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView list;
    private String[] listaNomesPessoas = {
            "Alvito Freyre",
            "Barnabé Araújo",
            "Carlos Marmou",
            "Constança Bicudo",
            "Constança Mangueira",
            "Dina Carqueijeiro",
            "Fausto Granjeiro",
            "Fábio Hernández",
            "Gerardo Benevides",
            "Guadalupe Aldeia",
            "Heriberto Beça",
            "Ismael Souto",
            "Jacinto Alvarenga",
            "Leonel Vilarinho",
            "Marco Villaça",
            "Mbicy Bethancout",
            "Nilza Ferraz",
            "Penélope Viégas",
            "Rebeca Espartero",
            "Silvana Salgado"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.listaNomes);

        // criar adaptador para a lista

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                listaNomesPessoas
        );

        // adicionar adaptador

        list.setAdapter(adaptador);

        // adicionar click nos itens da lista

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String itemClicado = list.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), itemClicado, Toast.LENGTH_LONG).show();

            }
        });
    }
}
