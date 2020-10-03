package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class third_activity extends AppCompatActivity {
    TextView name;
    Button btn_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_activity);

        btn_1 = findViewById(R.id.btn1);

        name = findViewById(R.id.names);

        String Names = getIntent().getStringExtra(MainActivity.EXTRA_NAMA);

        if (TextUtils.isEmpty(Names)){
           name.setText("Nama saya ");
        } else {
            name.setText("Nama saya " + Names);
        }

    }

    public void MainActivity(View view) {
        Intent main = new Intent(third_activity.this, MainActivity.class);
        startActivity(main);
    }
}
