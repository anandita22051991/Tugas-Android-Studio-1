package com.example.tugas2anandita;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity4 extends AppCompatActivity {
    TextView edhasil ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
         edhasil = (TextView)findViewById(R.id.edhasil);

        Bundle b1 = getIntent().getExtras();
        String s1 = b1.getString("nim");
        edhasil.setText("NIM:"+s1);
        Bundle b2 = getIntent().getExtras();
        String s2 = b2.getString("nama:");
        edhasil.setText("Nama:"+s2);

        Bundle b3= getIntent().getExtras();
        String s3 = b3.getString("jurusan1");
        edhasil.setText("Jurusan 1"+s3);
        Bundle b4 = getIntent().getExtras();
        String s4 = b4.getString("jurusan2");
        edhasil.setText("Jurusan 2"+s4);
        Bundle b5 = getIntent().getExtras();
        String s5 = b5.getString("kelas1");
        edhasil.setText("Kelas 1"+s5);
        Bundle b6 = getIntent().getExtras();
        String s6 = b6.getString("kelas2");
        edhasil.setText("Kelas 2"+s6);

        Bundle b7= getIntent().getExtras();
        String s7 = b7.getString("ipk");
        edhasil.setText("IPK :"+s7);
        Bundle b8 = getIntent().getExtras();
        String s8 = b1.getString("nilaimk1");
        edhasil.setText("Nilai Mata Kuliah 1 :"+s8);
        Bundle b9 = getIntent().getExtras();
        String s9 = b9.getString("nilaimk2");
        edhasil.setText("Nilai Mata Kuliah 2 :"+s9);
        Bundle b10 = getIntent().getExtras();
        String s10 = b10.getString("nilairatarata");
        edhasil.setText("Nilai Rata-Rata :"+s10);


        }

}