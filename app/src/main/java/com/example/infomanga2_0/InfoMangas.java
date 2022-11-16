package com.example.infomanga2_0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InfoMangas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_mangas);
    }
    public void MostrarLista(View view) {
        Intent mostrarLista = new Intent(this, CardView.class);
        startActivity(mostrarLista);
    }

    public void Volver(View view) {
        Intent volver = new Intent(this, HomeActivity.class);
        startActivity(volver);
    }
}