package com.example.projetotresbotoes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;
import android.view.View;



public class Principal extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_principal);

        //Handler (tratador) de eventos
        TelaGato1 t1 = new TelaGato1();
        t1.setSaida(this);

        TelaGato2 t2 = new TelaGato2();
        t2.setSaida(this);

        TelaGato3 t3 = new TelaGato3();
        t3.setSaida(this);

        Button bt1, bt2, bt3;

        bt1 = (Button)findViewById(R.id.botao1);
        bt2 = (Button)findViewById(R.id.botao2);
        bt3 = (Button)findViewById(R.id.botao3);

        bt1.setOnClickListener(t1);
        bt2.setOnClickListener(t2);
        bt3.setOnClickListener(t3);
    }
}

class TelaGato1 implements View.OnClickListener {

    private Principal saida;

    @Override
    public void onClick(View v) {
        Intent i = new Intent(saida, Tela1.class);
        saida.startActivity(i);
    }

    public void setSaida (Principal p) {
        saida = p;
    }
}

class TelaGato2 implements View.OnClickListener {

    private Principal saida;

    @Override
    public void onClick(View v) {
        Intent i = new Intent(saida, Tela2.class);
        saida.startActivity(i);
    }

    public void setSaida(Principal p) {
        saida = p;
    }
}

class TelaGato3 implements View.OnClickListener {

    private Principal saida;

    @Override
    public void onClick(View v) {
        Intent i = new Intent(saida, Tela3.class);
        saida.startActivity(i);
    }

    public void setSaida(Principal p) {
        saida = p;
    }
}
