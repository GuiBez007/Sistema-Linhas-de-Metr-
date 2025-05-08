package com.example.sistemalinhasmetro;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

//Desenvolver um App para auxiliar o Metro a coletar os dados para a pesquisa anual de origem e destino.
//
//Principais Requisitos Funcionais
//RF01 - O sistema deve permitir que o entrevistador se identifique antes de utilizar o sistema;
//RF02 - O sistema deve permitir que o entrevistador registre a resposta do usuário (origem e destino);
//RF03 - O sistema deve registrar o nome e telefone do entrevistado e armazenar no banco de dados;
//RF04 - O sistema deve exibir a quantidade de respostas por Origem (valor Absoluto e Percentual);
//RF05 - O sistema deve exibir a quantidade de respostas por destino (valor Absoluto e Percentual);
//RF06 - O sistema deve exibir a quantidade de respostar por origem e destino (valor Absoluto e Percentual);
//RF07 - O sistema deve registrar automaticamente a localização onde os dados foram coletados;
//RF08 - O sistema deve zerar os totais quando for solicitado;
//RF09 - O sistema deve enviar os dados para um Servidor Central
//RF10 - Acrescente um requisitos que julgue importante para esse App.
//
//Requisitos Não Funcionais
//RNF01 - O sistema deve possuir uma interface gráfica com botões rotulados com o nome da estação e uma cor correspondente a linha;
//
// Linhas: cinza e vermelha

public class MainActivity extends AppCompatActivity {

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
}