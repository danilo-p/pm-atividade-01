/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;

/**
 *
 * @author danilo
 */
public class Tabuleiro {
    int tamanho;
    int[][] mapa;
    
    public Tabuleiro(int tamanho) {
        this.tamanho = tamanho;
        this.mapa = new int[tamanho][tamanho];
        for (int i = 0; i < tamanho; i += 1) {
            for (int j = 0; j < tamanho; j += 1) {
                this.mapa[i][j] = 0;
            }
        }
    }
    
    public boolean posicaoEstaDisponivel(int posicaoX, int posicaoY) {
        return (
            posicaoX >= 0 && posicaoX < this.tamanho &&
            posicaoY >= 0 && posicaoY < this.tamanho &&
            this.mapa[posicaoY][posicaoX] == 0
        );
    }
    
    @Override
    public String toString() {
        String string = "";
        for (int i = 0; i < this.tamanho; i += 1) {
            for (int j = 0; j < this.tamanho; j += 1) {
                string += this.mapa[i][j];
                string += "\t";
            }
            string += "\n";
        }
        return string;
    }
}
