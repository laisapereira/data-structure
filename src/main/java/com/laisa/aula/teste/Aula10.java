package com.laisa.aula.teste;

import com.laisa.vetor.VetorObjetos;

public class Aula10 {
    public static void main(String[] args) {
        VetorObjetos vetor = new VetorObjetos(3);


        Contato c1 = new Contato("Contato 1", "1234-5678", "contato1@email.com");

        Contato c2 = new Contato("Contato 2", "1237-5678", "contato2@email.com");

        Contato c3 = new Contato("Contato 3", "1238-5678", "contato3@email.com");

        Contato c4 = new Contato("Contato 1", "1234-5678", "contato1@email.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);



        System.out.println("Tamanho = " + vetor.getTamanho());

        int pos = vetor.busca(c4);

        // para c4 aparecer, precisei sobrescrever o método equals na classe Contato

        if (pos > -1) {
            System.out.println("Elemento existe no vetor");
            System.out.println("Elemento: " + vetor.busca(pos));
            // ao chamar vetor.busca(pos), é retornado o objeto contato correspondente à position
        } else {
            System.out.println("Elemento nao existe no vetor");
        }


    }
}
