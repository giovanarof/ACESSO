package com.example.acesso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class TelaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
    }

    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected ( MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuPerfil:

                Intent intentPerfil = new Intent(getApplicationContext(), TelaPerfil.class);
                startActivity(intentPerfil);

                break;

            case R.id.menuAvaliacao:

                Intent intentMinhasAval = new Intent(getApplicationContext(), TelaAvaliacao.class);
                startActivity(intentMinhasAval);

                break;

            case R.id.menuSobre:

                Intent intentSobre = new Intent(getApplicationContext(), TelaSobre.class);
                startActivity(intentSobre);

                break;

            case R.id.menuSair:

                Intent intentSair = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intentSair);

                break;
        }
        return true;
    }

    public void telaGastronomia (View v) {
        Intent intent = new Intent(this, TelaGastronomia.class);
        startActivity(intent);
    }
    public void telaEducacao (View v) {
        Intent intent = new Intent(this, TelaEducacao.class);
        startActivity(intent);
    }
    public void telaLojas (View v) {
        Intent intent = new Intent(this, TelaLojas.class);
        startActivity(intent);
    }
    public void telaLazer (View v) {
        Intent intent = new Intent(this, TelaLazer.class);
        startActivity(intent);
    }
    public void telaHospedaria (View v) {
        Intent intent = new Intent(this, TelaHospedaria.class);
        startActivity(intent);
    }
    public void telaSaude (View v) {
        Intent intent = new Intent(this, TelaSaude.class);
        startActivity(intent);
    }
    public void telaTodas (View v) {
        Intent intent = new Intent(this, TelaTodas.class);
        startActivity(intent);
    }
}