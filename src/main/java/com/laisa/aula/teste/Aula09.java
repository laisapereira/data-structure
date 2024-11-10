package com.laisa.aula.teste;

import com.laisa.vetor.Vetor;

public class Aula09 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");

        System.out.println(vetor);

        vetor.remove(4);
        System.out.println(vetor);

        System.out.println("Remover o elemento C");

        int posic = vetor.busca("C");

        if (posic > -1) {
            vetor.remove(posic);
        } else {
            System.out.println("Elemento não existe no vetor");
        }

        System.out.println(vetor);


    }

}