package com.example.gerenciaartigos;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class Principal extends ListActivity {

    /*String apenas para exemplificar o layout da tela*/
    String[] cidades = {
            "Votuporanga", "Santa Fé do Sul", "SJ do Rio Preto",
            "Jales", "Fernandópolis", "Urânia", "Três Fronteiras",
            "Nova Canaã Paulista", "Ilha Solteira", "Cosmorama",
            "São Paulo", "São Carlos", "Santos", "Bauru",
            "Birigui", "Presidente Prudente", "Presidente Epitácio",
            "Osasco", "Americana", "Rubinéia"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_principal);

        ArrayAdapter<String> listaCores = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, cidades
        );

        setListAdapter(listaCores);
    }
}

