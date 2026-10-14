package com.senai.singletonn.entidades;

public class Teste {

    public void testar() {
        for (Carro c : Singleton.getInstancia().carros) {
            System.out.println(c.getModelo());
        }

    }

}
