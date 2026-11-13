package com.example.tugas2anandita;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

import android.widget.TextView;
import android.widget.Toast;

import java.lang.annotation.Target;


public class MainActivity extends AppCompatActivity {
    ImageView imageView2;
    EditText ednim, ednama;
    Button btnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ednim=(EditText)findViewById(R.id.ednim);
        ednama=(EditText)findViewById(R.id.ednama);
        btnext=(Button) findViewById(R.id.btnext);
       }

    public void Next(View view) {
        Intent hubung = new Intent(this,Activity4.class);
        hubung.putExtra("nim", ednim.getText().toString());
        hubung.putExtra("nama", ednama.getText().toString());

        startActivity(hubung);
        }
    }