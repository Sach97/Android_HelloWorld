package com.example.sacha.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //For debugging
        Toast.makeText(this,"OnCreate",Toast.LENGTH_SHORT).show();
        //Modifier l'icone de l'application
        //Modifier le layout pour que le texte soit centré et de couleur différente
    }
}
