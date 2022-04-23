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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnProfile = findViewById(R.id.btn_profile);
        Button btnLogout = findViewById(R.id.btn_logout);

        btnProfile.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ProfilActivity.class);
            startActivity(intent);
        });

        btnLogout.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        });
    }
}