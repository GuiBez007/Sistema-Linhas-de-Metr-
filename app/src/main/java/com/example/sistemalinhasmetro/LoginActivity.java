package com.example.sistemalinhasmetro;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

//Desenvolver um App para auxiliar o Metro a coletar os dados para a pesquisa anual de origem e destino.
//
//Principais Requisitos Funcionais
//RF01 - O sistema deve permitir que o ENTREVISTADOR SE IDENTIFIQUE antes de utilizar o sistema;
//RF02 - O sistema deve permitir que o ENTREVISTADOR REGISTRE a resposta do usuário (ORIGEM E DESTINO);
//RF03 - O sistema deve registrar o NOME E TELEFONE DO ENTREVISTADO e armazenar no banco de dados;
//RF04 - O sistema deve exibir a QUANTIDADE DE RESPOSTAS por ORIGEM (valor Absoluto e Percentual);
//RF05 - O sistema deve exibir a QUANTIDADE DE RESPOSTAS por DESTINO (valor Absoluto e Percentual);
//RF06 - O sistema deve exibir a QUANTIDADE DE RESPOSTAS por ORIGEM E DESTINO (valor Absoluto e Percentual);
//RF08 - O sistema deve zerar os totais quando for solicitado;


//RF07 - O sistema deve registrar automaticamente a localização onde os dados foram coletados;
//RF09 - O sistema deve enviar os dados para um Servidor Central
//RF10 - Acrescente um requisitos que julgue importante para esse App.
//RF11? - Adicionar quantas estações a pessoa vai passar até chegar ao destino

//Requisitos Não Funcionais
//RNF01 - O sistema deve possuir uma interface gráfica com botões rotulados com o nome da estação e uma cor correspondente a linha;

// Linhas: cinza e vermelha

//List<String> estacoesLinha8 = Arrays.asList(
//        "Júlio Prestes",
//        "Palmeiras-Barra Funda",
//        "Lapa",
//        "Domingo de Moraes",
//        "Imperatriz Leopoldina",
//        "Presidente Altino",
//        "Osasco",
//        "Comandante Sampaio",
//        "Quitaúna",
//        "General Miguel Costa",
//        "Carapicuíba",
//        "Santa Teresinha",
//        "Antônio João",
//        "Barueri",
//        "Jardim Belval",
//        "Jardim Silveira",
//        "Jandira",
//        "Sagrado Coração",
//        "Engenheiro Cardoso",
//        "Itapevi",
//        "Santa Rita",
//        "Amador Bueno"
//);

//List<String> estacoesLinha3 = Arrays.asList(
//        "Palmeiras-Barra Funda",
//        "Marechal Deodoro",
//        "Santa Cecília",
//        "República",
//        "Anhangabaú",
//        "Sé",
//        "Pedro II",
//        "Brás",
//        "Bresser-Mooca",
//        "Belém",
//        "Tatuapé",
//        "Carrão",
//        "Penha",
//        "Vila Matilde",
//        "Guilhermina-Esperança",
//        "Patriarca-Vila Ré",
//        "Artur Alvim",
//        "Corinthians-Itaquera"
//);

public class LoginActivity extends AppCompatActivity {
    private Button teste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        mainConfig();

        teste.setOnClickListener(r -> {
            startActivity(new Intent(this, RespostasActivity.class));
            finish();
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void mainConfig() {
        teste = (Button) findViewById(R.id.button);
    }

}