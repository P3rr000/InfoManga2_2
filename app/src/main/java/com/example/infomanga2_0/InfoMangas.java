package com.example.infomanga2_0;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;

public class InfoMangas extends AppCompatActivity {

    SensorManager sensorManager;
    Sensor sensor;
    SensorEventListener sensorEventListener;

    @Override
    protected void onPause() {
        stop();
        super.onPause();
    }

    @Override
    protected void onResume() {
        start();
        super.onResume();
    }

    @SuppressLint("ServiceCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_mangas);

        sensorManager=(SensorManager) getSystemService(SENSOR_SERVICE);
        sensor=sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);

        if (sensor==null)
            finish();

        sensorEventListener=new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                if(sensorEvent.values[0]<sensor.getMaximumRange()){
                    getWindow().getDecorView().setBackgroundColor(Color.RED);
                }
                else{
                    getWindow().getDecorView().setBackgroundColor(Color.WHITE);
                }
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {

            }
        };
        start();
    }
    public void MostrarLista(View view) {
        Intent mostrarLista = new Intent(this, CardView.class);
        startActivity(mostrarLista);
    }

    public void Volver(View view) {
        Intent volver = new Intent(this, HomeActivity.class);
        startActivity(volver);
    }

    public void start(){
        sensorManager.registerListener(sensorEventListener,sensor, 2000*1000);
    }
    public void stop(){
        sensorManager.unregisterListener(sensorEventListener);
    }
}