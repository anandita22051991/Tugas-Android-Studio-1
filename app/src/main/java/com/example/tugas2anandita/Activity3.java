package com.example.tugas2anandita;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity3 extends AppCompatActivity {
    TextView edipk1;
    EditText edipk, ednilaimk1, ednilaimk2, edratarata;
    Button bthitung,btfinish;
    Double vipk, vnilaimk1, vnilaimk2, vratarata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edipk1=(TextView) findViewById(R.id.edipk1);
        edipk=(EditText)findViewById(R.id.edipk);
        ednilaimk1=(EditText)findViewById(R.id.ednilaimk1);
        ednilaimk2=(EditText)findViewById(R.id.ednilaimk2);
        edratarata=(EditText)findViewById(R.id.edratarata);
        bthitung=(Button) findViewById(R.id.bthitung);
        btfinish=(Button) findViewById(R.id.btfinish);

    }

    public void hitung (View view) {
        vnilaimk1 = Double.parseDouble(ednilaimk1.getText().toString());
        vnilaimk2 = Double.parseDouble(ednilaimk2.getText().toString());

        vratarata = (vnilaimk1 * 0.5) + (vnilaimk2 * 0.5);

        edratarata.setText("" + vratarata);
    }
        public void Finish(View view) {
            Intent hubung2 = new Intent(this,Activity4.class);
            hubung2.putExtra("ipk",vipk.toString());
            hubung2.putExtra("nilaimk1",vnilaimk1.toString());
            hubung2.putExtra("nilaimk2",vnilaimk2.toString());
            hubung2.putExtra("nilairatarata",vratarata.toString());
            startActivity(hubung2);
    }
}
