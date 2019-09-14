package com.jailsonsousa.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortear(View v){
        TextView numeroEscolhido = (TextView) findViewById(R.id.txtNumeroEscolhido);
        int numero = new Random().nextInt(11);
        numeroEscolhido.setText(Integer.toString(numero));
    }

}
