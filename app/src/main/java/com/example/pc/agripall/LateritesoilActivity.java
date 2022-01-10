package com.example.pc.agripall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class LateritesoilActivity extends AppCompatActivity {

    RelativeLayout rellay_paddy, rellay_coconut,rellay_cotton, rellay_tobacco, rellay_rubber, rellay_oilseeds, rellay_citrusfruits, rellay_wheat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lateritesoil);

        rellay_paddy = findViewById(R.id.rellay_paddy);
        rellay_coconut = findViewById(R.id.rellay_coconut);
        rellay_cotton = findViewById(R.id.rellay_cotton);
        rellay_tobacco = findViewById(R.id.rellay_tobacco);
        rellay_rubber = findViewById(R.id.rellay_rubber);
        rellay_oilseeds = findViewById(R.id.rellay_oilseeds);
        rellay_citrusfruits = findViewById(R.id.rellay_citrusfruits);
        rellay_wheat = findViewById(R.id.rellay_wheat);

        rellay_paddy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LateritesoilActivity.this, PaddyActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });

        rellay_coconut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LateritesoilActivity.this, CoconutActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
        rellay_cotton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LateritesoilActivity.this, CottonActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
        rellay_tobacco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LateritesoilActivity.this, TobaccoActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
        rellay_rubber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LateritesoilActivity.this, RubberActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
        rellay_oilseeds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LateritesoilActivity.this, OilseedsActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
        rellay_citrusfruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LateritesoilActivity.this, CitrusActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
        rellay_wheat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LateritesoilActivity.this, WheatActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
    }
}
