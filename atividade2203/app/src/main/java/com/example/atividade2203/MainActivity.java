package com.example.atividade2203;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    EditText editTextNome, editTextRegiao;
    Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNome = findViewById(R.id.editTextNome);
        editTextRegiao = findViewById(R.id.editTextRegiao);
        buttonEnviar = (ImageButton)findViewById(R.id.buttonEnviar);


        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = editTextNome.getText().toString().trim();
                String regiao = editTextRegiao.getText().toString().trim();

                if (nome.isEmpty() || regiao.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Por favor, preencha todos os campos", Toast.LENGTH_SHORT).show();
                } else {

                    String mensagem = "Nome: " + nome + "\nRegião: " + regiao;
                    Toast.makeText(MainActivity.this, mensagem, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
