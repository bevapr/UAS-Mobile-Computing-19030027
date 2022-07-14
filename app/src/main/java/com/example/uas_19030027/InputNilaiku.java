package com.example.uas_19030027;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class input extends AppCompatActivity {
    EditText nim, nama, absen, tugas, uts, uas;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_nilai);
        nim = findViewById(R.id.etnim);
        nama = findViewById(R.id.etnama);
        absen = findViewById(R.id.etabsen);
        tugas = findViewById(R.id.ettugas);
        uts = findViewById(R.id.etuts);
        uas = findViewById(R.id.etuas);
    }

    public void submit(View v) {
        String namamhs = nama.getText().toString();
        String nimmhs = nim.getText().toString();
        double absenmhs = Double.parseDouble(absen.getText().toString());
        double tugasmhs = Double.parseDouble(tugas.getText().toString());
        double uasmhs = Double.parseDouble(uas.getText().toString());
        double utsmhs = Double.parseDouble(uts.getText().toString());

        if(nama.getText().toString().equals("")||nim.getText().toString().equals("")||absen.getText().toString().equals("")||
                tugas.getText().toString().equals("")||uts.getText().toString().equals("")||uas.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Harap Isi Data!", Toast.LENGTH_SHORT).show();
        }
        else{

        }
        Intent intent = new Intent(input.this,bobot.class);

        startActivity(intent);
    }
}