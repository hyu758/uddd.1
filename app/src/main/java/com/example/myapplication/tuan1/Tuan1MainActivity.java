package com.example.myapplication.tuan1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.layout.AlignmentLineProvider;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.R;

public class Tuan1MainActivity extends AppCompatActivity {
    EditText t1, t2;

    Button btn;

    TextView ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tuan1_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        t1 = findViewById(R.id.b1);
        t2 = findViewById(R.id.b2);
        btn = findViewById(R.id.btn1);
        ans = findViewById(R.id.output);

        btn.setOnClickListener(v -> {
            tinhTong();
        });
    }

    private void tinhTong() {
        String s1 = t1.getText().toString();
        String s2 = t2.getText().toString();

        float n1 = Float.parseFloat(s1);
        float n2 = Float.parseFloat(s2);

        float sum = n1 + n2;
        ans.setText(String.valueOf(sum));
    }
}