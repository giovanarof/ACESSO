package com.example.acesso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaEntrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_entrar);
    }

    public void buttonEntrar2 (View v) {
        Intent intent = new Intent(this, TelaPrincipal.class);
        startActivity(intent);
    }
}