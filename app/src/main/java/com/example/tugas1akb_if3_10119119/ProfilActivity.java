//<!--
//        Tanggal Pengerjaan : 23 April 2022
//        Nama               : Muhammad Hadyan Nur Adabi
//        Kelas              : IF-3
//        NIM                : 10119119
//        -->
package com.example.tugas1akb_if3_10119119;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        Button btn_back = findViewById(R.id.btn_back);

        btn_back.setOnClickListener(view -> {
            Intent intent = new Intent(ProfilActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}