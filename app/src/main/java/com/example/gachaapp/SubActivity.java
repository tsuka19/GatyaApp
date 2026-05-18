package com.example.gachaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Random;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        TextView result = findViewById(R.id.textView4);
        TextView rea =findViewById(R.id.textView3);
        Button btnBack = findViewById(R.id.button3);
        ImageView ini = findViewById(R.id.imageView6);


        Intent i = getIntent();
        String zokusei = i.getStringExtra("zokusei");
        result.setText("属性："+zokusei);

        AL al = new AL();

        String fileName = "pic_";
        ImageView imageView= findViewById(R.id.imageView);

        int r = (int)(Math.random() * 20) + 1;
        switch (r){
            case 1 :

                String[] f=al.URGacha(zokusei);
                fileName=f[0];
                String zoku=f[1];


                int resId = getResources().getIdentifier(
                        fileName,
                        "drawable",
                        getPackageName()
                );
                ini.setImageResource(R.drawable.bunta);
                imageView.setImageResource(resId);
                rea.setText("("+zoku+")"+fileName+"(URレア)");
                break;
            case 2:
            case 3:
            case 4:
                f=al.SRGacha(zokusei);
                fileName=f[0];
                zoku=f[1];

                resId = getResources().getIdentifier(
                        fileName,
                        "drawable",
                        getPackageName()
                );
                ini.setImageResource(R.drawable.takahasi);
                imageView.setImageResource(resId);
                rea.setText("("+zoku+")"+fileName+"(SRレア)");
                break;
            default:
                f=al.CGacha(zokusei);
                fileName=f[0];
                zoku=f[1];
                 resId = getResources().getIdentifier(
                        fileName,
                        "drawable",
                        getPackageName()
                );
                 ini.setImageResource(R.drawable.ituki);
                imageView.setImageResource(resId);
                rea.setText("("+zoku+")"+fileName+"(Cレア)");
                break;
        }


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}