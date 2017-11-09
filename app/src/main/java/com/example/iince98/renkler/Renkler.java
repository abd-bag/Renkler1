package com.example.iince98.renkler;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

/**
 * Created by iince98 on 28/10/2017.
 */

public class Renkler extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.renkler);

        Button pembe= (Button)findViewById(R.id.pembe);
        Button kırmızı= (Button)findViewById(R.id.kırmızı);
        Button mavi= (Button)findViewById(R.id.mavi);
        Button yeşil= (Button)findViewById(R.id.yeşil);
        Button turuncu= (Button)findViewById(R.id.turuncu);
        Button sarı= (Button)findViewById(R.id.sarı);
        Button siyah= (Button)findViewById(R.id.siyah);
        Button beyaz= (Button)findViewById(R.id.beyaz);

        pembe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp= MediaPlayer.create(getApplicationContext(), R.raw.pembe);
                mp.start();
            }
        });

        siyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp= MediaPlayer.create(getApplicationContext(), R.raw.black);
                mp.start();
            }
        });

        mavi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp= MediaPlayer.create(getApplicationContext(), R.raw.blau);
                mp.start();
            }
        });

        yeşil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp= MediaPlayer.create(getApplicationContext(), R.raw.green);
                mp.start();
            }
        });

        turuncu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp= MediaPlayer.create(getApplicationContext(), R.raw.orange);
                mp.start();
            }
        });

        kırmızı.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp= MediaPlayer.create(getApplicationContext(), R.raw.rot);
                mp.start();
            }
        });

        beyaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp= MediaPlayer.create(getApplicationContext(), R.raw.white);
                mp.start();
            }
        });

        sarı.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp= MediaPlayer.create(getApplicationContext(), R.raw.yellow);
                mp.start();
            }
        });
    }
}

