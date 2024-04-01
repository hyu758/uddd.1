package com.example.myapplication.tuan2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.R;

public class Tuan2MainAc1 extends AppCompatActivity {
    EditText t1, t2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tuan2_main_ac1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        t1 = findViewById(R.id.txt1);
        t2 = findViewById(R.id.txt2);
        btn = findViewById(R.id.btn1);

        btn.setOnClickListener(v->{
            Intent i = new Intent(Tuan2MainAc1.this, Tuan2MainAc2.class);
            i.putExtra("so1", t1.getText().toString());
            i.putExtra("so2", t2.getText().toString());

            startActivity(i);
        });
    }
}