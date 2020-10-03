package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class second_activity extends AppCompatActivity implements View.OnClickListener {

    TextView tvNama, tvInstitusi;
    Button btnAct3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);

        tvNama = findViewById(R.id.tv_nama);
        tvInstitusi = findViewById(R.id.tv_institusi);
        btnAct3 = findViewById(R.id.btn_activity3);
        btnAct3.setOnClickListener(this);

        String nama = getIntent().getStringExtra(MainActivity.EXTRA_NAMA);
        String institusi = getIntent().getStringExtra(MainActivity.EXTRA_INSTITUSI);

        if (TextUtils.isEmpty(nama)){
            tvNama.setText("Nama : ");
        } else {
            tvNama.setText("Nama : " + nama);
        }

        if (TextUtils.isEmpty(institusi)){
            tvInstitusi.setText("Asal Institusi : ");
        } else {
            tvInstitusi.setText("Asal Institusi : " + institusi);
        }

    }

    @Override
    public void onClick(View v) {
        pindahAct3();
    }

    private void pindahAct3() {
        String name = getIntent().getStringExtra(MainActivity.EXTRA_NAMA);
        Intent act3 = new Intent(second_activity.this, third_activity.class);

        act3.putExtra(MainActivity.EXTRA_NAMA, name);

        startActivity(act3);
    }
}
