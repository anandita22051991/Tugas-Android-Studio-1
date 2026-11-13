package com.example.tugas2anandita;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Extra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_extra);
        extView edjurusan,edkelas;
        Button btnext1;
        RadioButton edjurusan1, edjurusan2;
        CheckBox cb1, cb2;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            edjurusan = (TextView) findViewById(R.id.edjurusan);
            edkelas = (TextView) findViewById(R.id.edkelas);
            edjurusan2 = (RadioButton)findViewById(R.id.edjurusan2);
            edjurusan1 = (RadioButton)findViewById(R.id.edjurusan1);
            cb1 = (CheckBox) findViewById(R.id.cb1);
            cb2 = (CheckBox) findViewById(cb2);
        }
        public void Next1(View view) {
            Intent hubung1 = new Intent(this,Activity4.class);
            hubung1.putExtra("jurusan1",edjurusan1.getText().toString());
            hubung1.putExtra("jurusan2",edjurusan2.getText().toString());
            hubung1.putExtra("kelas1",cb1.getText().toString());
            hubung1.putExtra("kelas 2",cb1.getText().toString());

        }
    }


}
