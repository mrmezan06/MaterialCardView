package com.mezan.materialcard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.customview.widget.ViewDragHelper;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;


public class MainActivity extends AppCompatActivity {

    Button btnH,btnS;
    TextView txtH,txtS;
    MaterialCardView mcard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnH = findViewById(R.id.m1);
        btnS = findViewById(R.id.m2);
        txtH = findViewById(R.id.head);
        txtS = findViewById(R.id.sub);
        mcard = findViewById(R.id.mcard);
        mcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mcard.animate().alpha(0.8f).rotation(360f).setDuration(1000);
            }
        });


        btnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnH.setBackgroundColor(Color.rgb(255, 0, 0));
                btnS.setBackgroundColor(Color.rgb(255, 255, 255));
                txtH.setText("Akash Khan");
            }
        });
        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnS.setBackgroundColor(Color.rgb(255, 0, 0));
                btnH.setBackgroundColor(Color.rgb(255, 255, 255));
                txtS.setText("B.Sc Eng.");
            }
        });
    }

}
