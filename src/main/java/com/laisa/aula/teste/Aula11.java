package com.laisa.aula.teste;


import com.laisa.vetor.Lista;
import com.laisa.vetor.VetorObjetos;

// uso do generics

public class Aula11 {
    public static void main(String[] args) {


        // para isso aqui nao acontecer, tem que usar generics



        //VetorObjetos vetor = new VetorObjetos(2);

       /* vetor.adiciona(1);
        vetor.adiciona("elemento 2 - string"); */

        // System.out.println(vetor.getTamanho());


        Lista <String> vetor = new Lista <String>(2);
        vetor.adiciona("elemento 1");


        System.out.println(vetor);



    }

}