package com.example.pesquisahttp;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void executaConsulta(View view) {

        String response;
        String url = "https://jsonplaceholder.typicode.com/todos/";

        EditText txtConsulta = findViewById(R.id.editTextPesquisa);
        url += txtConsulta.getText().toString();

        TextView txtNome = findViewById(R.id.txtNome);
        TextView txtSobrenome = findViewById(R.id.txtSobrenome);
        TextView txtMensagem = findViewById(R.id.viewMensagem);


        new DataGetter(txtNome, txtSobrenome, txtMensagem).execute(url);

    }
}





