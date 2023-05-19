
package com.atividade;

public class FilaEstatica {
    public Integer[] elementos;
    private Integer primeiro;
    private Integer ultimo;

    public FilaEstatica(int tamanho) {
        this.elementos = new Integer[tamanho];
        this.primeiro = 0;
        this.ultimo = 0;
    }

    public void enqueue(Integer valor) { //insere no final da fila
        if (isFull()) {
            System.out.println("Erro: a fila está cheia!");
        } else if (ultimo % elementos.length == 0) {
            ultimo = 0;
            elementos[ultimo] = valor;
            ultimo++;
        } else {
            elementos[ultimo] = valor;
            ultimo++;
        }
    }

    public boolean isFull() {
        int contador = 0;

        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] != null) {
                contador++;
            }
        }

        if (contador == elementos.length) {
            return true;
        } else {
            return false;
        }
    }


    public Integer dequeue() {  //retorna o primeiro objeto da fila, aquele que, pela ordem, é o próximo a ser removido e remove em seguida
        if (isEmpty()) {
            return null;
        } else if (ultimo % elementos.length == 0) {
            primeiro = 0;
            Integer remove = elementos[primeiro];
            primeiro++;
            return remove;
        } else {
            Integer remove = elementos[primeiro];
            elementos[primeiro] = null;
            primeiro++;
            return remove;
        }
    }

    public boolean isEmpty() {
        int contador = 0;

        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] != null) {
                contador++;
            }
        }

        if (contador > 0) {
            return false;
        } else {
            return true;
        }
    }
}