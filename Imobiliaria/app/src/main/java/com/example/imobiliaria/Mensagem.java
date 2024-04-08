package com.example.imobiliaria;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Mensagem extends Activity{

    public void onCreate (Bundle estadoSalvo) {

        super.onCreate (estadoSalvo);

        TextView tv = new TextView(this);
        tv.setText("Dados inseridos com sucesso!");
        setContentView(tv);
    }
}