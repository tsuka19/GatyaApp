package com.example.gachaapp;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
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

public class ThirdActivity extends AppCompatActivity {
    int r;
    int k=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        TextView rea1 = findViewById(R.id.textView7);
        TextView rea2 = findViewById(R.id.textView8);
        TextView rea3 = findViewById(R.id.textView9);
        Button btnBack = findViewById(R.id.button4);
        TextView result = findViewById(R.id.textView6);
        ImageView imageRea1 = findViewById(R.id.imageView2);
        ImageView imageRea2 = findViewById(R.id.imageView3);
        ImageView imageRea3 = findViewById(R.id.imageView4);
        ImageView ini = findViewById(R.id.imageView7);


        Intent i = getIntent();
        String zokusei = i.getStringExtra("zokusei");
        result.setText("属性："+zokusei);
        ArrayList<Integer> data = new ArrayList<Integer>();
        AL al = new AL();
        for (int j=1;j<=3;j++){
             r = (int) (Math.random()*20)+1;
            data.add(r);
        }
        String fileName = "pic_";
        for (int a : data) {
            k += 1;

                switch (a) {
                    case 1:
                        String[] f=al.URGacha(zokusei);
                        fileName=f[0];
                        String zoku=f[1];

                        int resId = getResources().getIdentifier(
                                fileName,
                                "drawable",
                                getPackageName()
                        );

                        if (k == 1) {
                            imageRea1.setImageResource(resId);
                            rea1.setText("("+zoku+")"+fileName+"(URレア)");
                        }
                        else if (k ==2) {
                            imageRea2.setImageResource(resId);
                            rea2.setText("("+zoku+")"+fileName+"(URレア)");

                        } else if (k==3) {
                            imageRea3.setImageResource(resId);
                            rea3.setText("("+zoku+")"+fileName+"(URレア)");
                        }
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
                        if (k == 1) {
                            imageRea1.setImageResource(resId);
                            rea1.setText("("+zoku+")"+fileName+"(SRレア)");
                        }
                        else if (k ==2) {
                            imageRea2.setImageResource(resId);
                            rea2.setText("("+zoku+")"+fileName+"(SRレア)");

                        } else if (k==3) {
                            imageRea3.setImageResource(resId);
                            rea3.setText("("+zoku+")"+fileName+"(SRレア)");
                        }

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
                        if (k == 1) {
                            imageRea1.setImageResource(resId);
                            rea1.setText("("+zoku+")"+fileName+"(Cレア)");
                        }
                        else if (k ==2) {
                            imageRea2.setImageResource(resId);
                            rea2.setText("("+zoku+")"+fileName+"(Cレア)");

                        } else if (k==3) {
                            imageRea3.setImageResource(resId);
                            rea3.setText("("+zoku+")"+fileName+"(Cレア)");
                        }
                        break;
                }
            }
        int r = (int)(Math.random()*3) +1;
        if(r==1) {
            ini.setImageResource(R.drawable.takumitonatuki);
        } else if (r==2) {
            ini.setImageResource(R.drawable.ten);
        } else {
            ini.setImageResource(R.drawable.yuuiti);
        }

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}