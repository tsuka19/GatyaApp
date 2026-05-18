package com.example.gachaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    int point;
    TextView zokuseiText;
    String zokusei="通常";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button one = findViewById(R.id.button);
        Button three = findViewById(R.id.button2);
        TextView textView = findViewById(R.id.textView);
        Spinner spinner = findViewById(R.id.spinner);
        ArrayList<String> data = new ArrayList<>(Arrays.asList("通常","炎","水"));
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,data);
        spinner.setAdapter(adapter);
        Button reset = findViewById(R.id.button6);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                point=5000;
                textView.setText("残り"+point+"pt");

            }
        });

        point = 5000;
        textView.setText("残り"+point+"pt");

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(id==0){
                    zokuseiText = (TextView) view;
                }
                else if (id==1){
                    zokuseiText = (TextView) view;
                } else if (id==2) {
                    zokuseiText = (TextView) view;
                }
                zokusei = zokuseiText.getText().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (point>=200){
                    point-=200;
                    textView.setText("残り"+point+"pt");
                    Intent i = new Intent(MainActivity.this, SubActivity.class);
                    i.putExtra("zokusei",zokusei);
                    startActivity(i);

                }
                else {
                    Toast.makeText(MainActivity.this, "ポイント不足で引けません", Toast.LENGTH_SHORT).show();
                }
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (point>=600){
                    point-=600;
                    textView.setText("残り"+point+"pt");
                    Intent i2 = new Intent(MainActivity.this, ThirdActivity.class);
                    i2.putExtra("zokusei",zokusei);
                    startActivity(i2);

                }
                else {
                    Toast.makeText(MainActivity.this, "ポイント不足で引けません", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}