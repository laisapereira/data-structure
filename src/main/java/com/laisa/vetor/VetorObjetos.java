package com.laisa.vetor;

public class VetorObjetos {

    private Object[] elementos;

    private int tamanho;

    public VetorObjetos(int capacidade) {
        this.elementos = new Object[capacidade];
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

    public boolean adiciona(Object elemento) {

        this.aumentaCapacidade();

        if (this.tamanho < this.elementos.length) {

            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;

        }

        return false;


    }

    //overloading, sobrecarregando o metodo adiciona


    public boolean adiciona(int posicao, Object elemento) {

        // verificar se a posição que o usuário busca é válida
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        //mover todos os elementos

        for (int i = tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }

        //atribuir o elemento a posicao desejada

        this.elementos[posicao] = elemento;
        this.tamanho++;


        return true;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            Object [] elementosNovos = new Object[this.elementos.length * 2]; //dobrando a capacidade]
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            };

            this.elementos = elementosNovos;
        }
    }

    // lógica para remover um elemento do vetor
    // B G D E F - posição a ser removida é 1(G)
    // 0 1 2 3 4 - tamanho é 5
    // a ideia eh sempre puxar pra esquerda
    // B D D E F, depois B D E E F, depois B D E F F
    // vetor[1] = vetor[2]
    // vetor[2] = vetor[3]
    // vetor[3] = vetor[4]...


    public void remove(int posicao) {

        // verificar se a posição que o usuário busca é válida
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;


        return;
    }

    public Object busca(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(Object elemento) {
        // busca sequencial: ir de em posição em posição até encontrar o elemento, return true ou algo do tipo

        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }

        }

        return -1;
    }


}
