package com.example.googlemapsapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView isanPedro,campoSanmiguel,teotihuacan,tlaminca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // IaMapas=(Button) findViewById(R.id.ButonIaMapas);
       // IaMapas.setOnClickListener(this);

        isanPedro=(ImageView)findViewById(R.id.ivisanpedro);
        campoSanmiguel=(ImageView) findViewById(R.id.Ivcsanmiguel);
        teotihuacan=(ImageView) findViewById(R.id.ivteotihuacan);
        tlaminca=(ImageView) findViewById(R.id.ivtlaminca);

        isanPedro.setOnClickListener(this);
        campoSanmiguel.setOnClickListener(this);
        teotihuacan.setOnClickListener(this);
        tlaminca.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent=new Intent(MainActivity.this,Mapas_activity.class);
        if(view.getId()==R.id.ivisanpedro) {
            intent.putExtra("latitud", 19.555961);
            intent.putExtra("longitud", -98.897753);
            startActivity(intent);
        }
        else if(view.getId()==R.id.ivteotihuacan){
            intent.putExtra("latitud", 19.694101);
            intent.putExtra("longitud",  -98.842780);
            startActivity(intent);
        }
        else if(view.getId()==R.id.ivtlaminca){
            intent.putExtra("latitud", 19.497025);
            intent.putExtra("longitud", -98.820480);
            startActivity(intent);
        }
        else{
            intent.putExtra("latitud", 19.558955);
            intent.putExtra("longitud", -98.892075);
            startActivity(intent);
        }
    }
}