package com.example.myapplication.tuan2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.R;

import java.util.Objects;

public class Tuan2MainAc2 extends AppCompatActivity {

    TextView kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tuan2_main_ac2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        kq = findViewById(R.id.KQ);

        Intent i1 = getIntent();

        String s1 = Objects.requireNonNull(i1.getExtras()).getString("so1");
        String s2 = Objects.requireNonNull(i1.getExtras()).getString("so2");

        assert s1 != null;
        float n1 = Float.parseFloat(s1);
        assert s2 !=null;
        float n2 = Float.parseFloat(s2);

        float tong = n1 + n2;

        kq.setText(String.valueOf(tong));
    }
}