package com.rocpjunior.frasesmotivacionais;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String frases [] = {
            "Há ainda tanta coisa linda na vida para se descobrir.",
            "Somos capazes de fazer muito mais do que imaginamos!",
            "Não há a necessidade de caminhar rápido. Apenas siga caminhando.",
            "Você é forte, você consegue.",
            "A única forma de chegar ao impossível é acreditar que é possível.",
            "Ninguém conquista o mundo sem uma boa noite de sono!",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void gerarFraseAleatoria(View view) {

        int numeroAleatorio = new Random().nextInt(6);

        TextView texto = findViewById(R.id.textoFrases);
        String fraseGerada = frases[numeroAleatorio];
        texto.setText(fraseGerada);
    }

    public void mostrarTodasFrases (View view) {

        TextView texto = findViewById(R.id.textoFrases);

        String textoResultado = "";
        for (String frase: frases ) {
            textoResultado = textoResultado + frase +"\n";
        }

        texto.setText(textoResultado);
    }
}