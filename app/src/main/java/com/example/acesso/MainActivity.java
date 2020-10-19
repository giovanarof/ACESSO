package com.example.acesso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonCadastrar (View v) {
        Intent intent = new Intent(this, TelaCadastro.class);
        startActivity(intent);
    }
    public void buttonEntrar (View v) {
        Intent intent = new Intent(this, TelaEntrar.class);
        startActivity(intent);
    }
}