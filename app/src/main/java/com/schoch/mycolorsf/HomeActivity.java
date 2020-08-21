package com.schoch.mycolorsf;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class HomeActivity extends AppCompatActivity implements OnClickListener {

    int zufall = 0;

    String[] hashtag = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "A", "B", "C", "D", "E", "F"};
    String color = "#";

    private Button button;
    private Random rand = new Random();
    private LinearLayout homi;

    protected void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            w.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_home);
        button = findViewById(R.id.button);
        homi = findViewById(R.id.homi);
        button.setOnClickListener(this);
        homi.setOnClickListener(this);

        for (int i = 0; i < 6; i++) {
            zufall = rand.nextInt((15 - 0) + 1) + 0;
            color= color + hashtag[zufall];
        }
        button.setText(color);
        homi.setBackgroundColor(Color.parseColor(color));
        color = "#";

    }

    @Override
    public void onClick(View view) {
        if (view == button) {
            for (int i = 0; i < 6; i++) {
                zufall = rand.nextInt((15 - 0) + 1) + 0;
                color= color + hashtag[zufall];
            }
            button.setText(color);
            homi.setBackgroundColor(Color.parseColor(color));
            color = "#";
        } else if (view == homi) {
            for (int i = 0; i < 6; i++) {
                zufall = rand.nextInt((15 - 0) + 1) + 0;
                color= color + hashtag[zufall];
            }
            button.setText(color);
            homi.setBackgroundColor(Color.parseColor(color));
            color = "#";
        }
    }
}