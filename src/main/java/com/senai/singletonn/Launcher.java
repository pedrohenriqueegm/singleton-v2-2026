package com.senai.singletonn;

import com.senai.singletonn.entidades.Carro;
import com.senai.singletonn.entidades.Singleton;
import com.senai.singletonn.entidades.Teste;
import javafx.application.Application;

import java.util.ArrayList;

public class Launcher {
    public static void main(String[] args) {
        // Application.launch(HelloApplication.class, args);

        Carro c1 = new Carro("Prata", "Civic", "Honda", 1999);
        Carro c2 = new Carro("Vermelho", "C3", "Citroen", 2006);
        Carro c3 = new Carro("Fusca", "Volkswagen", "Azul", 1980);

        Singleton.getInstancia().carros.add(c1);
        Singleton.getInstancia().carros.add(c2);
        Singleton.getInstancia().carros.add(c3);



        Teste teste = new Teste();
        teste.testar();

    }
}
