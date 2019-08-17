package com.example.ammgolamyeazdani.arrayrotating;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int[] original = {1, 2, 3, 4, 5};
    private TextView a, b, c, d, e;
    private Button left, right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = findViewById(R.id.one);
        b = findViewById(R.id.two);
        c = findViewById(R.id.three);
        d = findViewById(R.id.four);
        e = findViewById(R.id.five);
        left = findViewById(R.id.left);
        right = findViewById(R.id.right);

        a.setText(String.valueOf(original[0]));
        b.setText(String.valueOf(original[1]));
        c.setText(String.valueOf(original[2]));
        d.setText(String.valueOf(original[3]));
        e.setText(String.valueOf(original[4]));

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int temp = original[0];
                for (int i = 0; i < original.length - 1; i++) {
                    original[i] = original[i + 1];
                }
                original[original.length - 1] = temp;
                a.setText(String.valueOf(original[0]));
                b.setText(String.valueOf(original[1]));
                c.setText(String.valueOf(original[2]));
                d.setText(String.valueOf(original[3]));
                e.setText(String.valueOf(original[4]));

            }
        });
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int temp = original[original.length - 1];
                for (int i = original.length - 1; i > 0; i--) {
                    original[i] = original[i - 1];
                }
                original[0] = temp;
                a.setText(String.valueOf(original[0]));
                b.setText(String.valueOf(original[1]));
                c.setText(String.valueOf(original[2]));
                d.setText(String.valueOf(original[3]));
                e.setText(String.valueOf(original[4]));
            }
        });
    }

}
