package app.proyect.infomanga2_0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.infomanga2_0.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void MostrarMangas(View view) {
        Intent mostrarMangas = new Intent(this, InfoMangas.class);
        startActivity(mostrarMangas);
    }
    public void Salir(View view) {
        Intent salir = new Intent(this, LoginActivity.class);
        startActivity(salir);
        finish();
    }
}