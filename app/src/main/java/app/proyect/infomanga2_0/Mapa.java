package app.proyect.infomanga2_0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.infomanga2_0.R;
import com.mapbox.maps.MapView;
import com.mapbox.maps.Style;

public class Mapa extends AppCompatActivity {
     private MapView mapView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        mapView = findViewById(R.id.mapView);
        mapView.getMapboxMap().loadStyleUri(Style.MAPBOX_STREETS);

}}