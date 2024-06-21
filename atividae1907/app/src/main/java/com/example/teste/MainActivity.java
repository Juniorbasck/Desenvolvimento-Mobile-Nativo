package com.example.teste;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {



    String[] diciplina = {
      "Diciplina1", "Diciplina2", "Diciplina3", "Diciplina4", "Diciplina5", "Diciplina6", "Diciplina7",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configurando o ListView
        ListView listViewDisciplinas = findViewById(R.id.listViewDisciplinas);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, diciplina);
        listViewDisciplinas.setAdapter(adapter);
    }

    public void openMesesActivity(View view) {
        Intent intent = new Intent(this, MesesActivity.class);
        startActivity(intent);
    }

}