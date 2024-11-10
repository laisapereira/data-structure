package com.laisa.vetor;

public class Vetor {

    private String[] elementos;

    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }

    // por default, o valor de uma string é null

   /* public void adiciona(String elemento) {
        // iterar sobre as posições do vetor, se tiver nula x posição é nessa posição que vou add o elemento

        //nao é otimizado, pois ele vai percorrer o vetor inteiro, mesmo que tenha um elemento nulo no meio, e se for um vetor grande? custoso

       for (int i = 0; i < elementos.length; i++) {
            if (this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }
        } }*/


    // é mais perfomatico considerar o tamanho do vetor em si

    public boolean adiciona(String elemento) {

        if (this.tamanho < this.elementos.length) {

            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;

        }

        return false;


    }

    //overloading, sobrecarregando o metodo adiciona


    public boolean adiciona(int posicao, String elemento) {

        // verificar se a posição que o usuário busca é válida
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        //mover todos os elementos

        for (int i = tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }

        //atribuir o elemento a posicao desejada

        this.elementos[posicao] = elemento;
        this.tamanho++;


        return true;
    }

    public String busca(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(String elemento) {
        // busca sequencial: ir de em posição em posição até encontrar o elemento, return true ou algo do tipo

        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }

        }

        return -1;
    }


}
