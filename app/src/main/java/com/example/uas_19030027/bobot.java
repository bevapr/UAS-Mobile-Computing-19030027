package com.example.uas_19030027;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class bobot extends AppCompatActivity {
    EditText boabsen, botugas, bouas, bouts;
    Double NAbsensi, NTugas, NUAS, NUTS;
    double defaultValue = 0 ;
    String Nilai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bobot_nilai);
        boabsen = findViewById(R.id.babsen);
        botugas = findViewById(R.id.btugas);
        bouas = findViewById(R.id.buas);
        bouts = findViewById(R.id.buts);

        Intent intent = getIntent();
        NAbsensi=intent.getDoubleExtra("Absensi",defaultValue);
        NTugas=intent.getDoubleExtra("Tugas", defaultValue);
        NUAS=intent.getDoubleExtra("UAS",defaultValue);
        NUTS=intent.getDoubleExtra("UTS",defaultValue);

    }
    public void proses(View v) {
        double valueabsen = Double.parseDouble(boabsen.getText().toString())/100;
        double valuetugas = Double.parseDouble(botugas.getText().toString())/100;
        double valueuas = Double.parseDouble(bouas.getText().toString())/100;
        double valueuts = Double.parseDouble(bouts.getText().toString())/100;


        if(botugas.getText().toString().equals("")||bouas.getText().toString().equals("")||boabsen.getText().toString().equals("")||
                botugas.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Harap Isi Data!", Toast.LENGTH_SHORT).show();
        }
        else{
        double NA=(valueabsen*NAbsensi)+(valuetugas*NTugas)+(valueuas*NUAS)+(valueuts*NUTS);
        if(NA>=80){
            Nilai = "A";
        }
        else if(NA>=65&&NA<79.9){
            Nilai = "B";
        }
        else if(NA>=55&&NA<64.9){
            Nilai = "C";
        }
        else if(NA>=40&&NA<54.9){
            Nilai = "C";
        }
        else{
            Nilai = "D";
        }
        }
        startActivity(new Intent(bobot.this, output.class));
    }
}