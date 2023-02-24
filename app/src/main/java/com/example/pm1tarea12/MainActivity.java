package com.example.pm1tarea12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView nom, apell, edadd, correoele;
    private Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nom = findViewById(R.id.nombre);
        apell = findViewById(R.id.apellido);
        edadd = findViewById(R.id.edad);
        correoele = findViewById(R.id.correo);
        buttonSend = findViewById(R.id.btninfo);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String names = nom.getText().toString();
                String lastNames = apell.getText().toString();
                int age = Integer.parseInt(edadd.getText().toString());
                String email = correoele.getText().toString();

                Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);
                intent.putExtra("names", names);
                intent.putExtra("lastNames", lastNames);
                intent.putExtra("age", age);
                intent.putExtra("email", email);
                startActivity(intent);
            }
        });
    }
}