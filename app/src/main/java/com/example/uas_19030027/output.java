package com.example.uas_19030027;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class output extends AppCompatActivity {
    TextView txtmatkul, txtnim, txtnama,txtnilai,txtgrade;
    String text,txnim,txnama;
    double defaultValue = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);
        txtmatkul = findViewById(R.id.tvmatkul);
        txtnama = findViewById(R.id.tvnama);
        txtnim = findViewById(R.id.tvnim);
        txtnilai = findViewById(R.id.tvnilai);
        txtgrade = findViewById(R.id.tvgrade);

        Intent intent = getIntent();
        text = intent.getStringExtra("Spinner");
        txnim = intent.getStringExtra("NIM");
        txnama = intent.getStringExtra("Nama");

        txtmatkul.  setText("" + text);
        txtgrade.   setText("Grade Nilai    : ");
        txtnilai.   setText("Nilai Akhir    :");
        txtnim.     setText("NIM            :"+txnim);
        txtnama.    setText("Nama           : "+txnama);
    }
    public void Menu(View v) {
        startActivity(new Intent(output.this, MainActivity.class));
    }
}