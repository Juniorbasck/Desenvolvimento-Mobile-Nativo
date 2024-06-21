package com.example.teste;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FormActivity extends AppCompatActivity {

    private EditText editTextId, editTextNome;
    private Spinner spinnerDia;
    private Button buttonSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forms);

        editTextId = findViewById(R.id.editTextId);
        editTextNome = findViewById(R.id.editTextNome);
        spinnerDia = findViewById(R.id.spinnerDia);
        buttonSalvar = findViewById(R.id.buttonSalvar);

        String[] diasSemana = {"Segunda-feira", "Terça-feira", "Quarta-feira",
                "Quinta-feira", "Sexta-feira", "Sábado", "Domingo"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, diasSemana);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDia.setAdapter(adapter);

        buttonSalvar.setOnClickListener(view -> salvarDados());

        Button buttonVoltar = findViewById(R.id.buttonVoltar);
        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void salvarDados() {
        String id = editTextId.getText().toString().trim();
        String nome = editTextNome.getText().toString().trim();
        String dia = spinnerDia.getSelectedItem().toString();

        if (!id.isEmpty() && !nome.isEmpty()) {
            String mensagem = "ID: " + id + "\nNome: " + nome + "\nDia: " + dia;
            Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
        }
    }
}