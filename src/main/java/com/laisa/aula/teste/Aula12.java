package com.laisa.aula.teste;

import java.util.ArrayList;

public class Aula12 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("A");
        arrayList.add("C");

        System.out.println(arrayList);

        arrayList.add(1, "B");

        System.out.println(arrayList);

        boolean existe = arrayList.contains("A");

        if(existe) {
            System.out.println("Elemento existe no vetor");
        } else {
            System.out.println("Elemento não existe no vetor");
        }



        System.out.println(arrayList.get(1));

        System.out.println(arrayList.size());



    }
    }
