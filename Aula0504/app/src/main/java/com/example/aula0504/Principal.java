package com.example.aula0504;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Principal extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_principal);

        TrataBotao tb = new TrataBotao();
        tb.saida = this;

        Button b = findViewById(R.id.botao1);

        b.setOnClickListener(tb);

    }

    class TrataBotao implements View.OnClickListener {

        private Principal saida;

        @Override
        public void onClick(View v) {
            Toast.makeText(saida, "Apertei  o botão", Toast.LENGTH_LONG).show();
        }

        public void setSaida (Principal p) {
            saida = p;
        }
    }
}
