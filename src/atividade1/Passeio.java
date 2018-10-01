/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;

import java.util.ArrayList;

/**
 *
 * @author danilo
 */
public class Passeio {
    Tabuleiro tabuleiro;
    IPeca peca;
    int casasVisitadas;
    
    public Passeio(Tabuleiro tabuleiro, IPeca peca) {
        this.tabuleiro = tabuleiro;
        this.peca = peca;
    }
    
    public boolean iniciarPasseio(int posicaoX, int posicaoY) {
        this.casasVisitadas = 0;
        return this.passear(posicaoX, posicaoY, 1);
    }
    
    public boolean passear(int posicaoX, int posicaoY, int rodada) {
        this.casasVisitadas += 1;
        this.tabuleiro.mapa[posicaoY][posicaoX] = rodada;
        if (!this.passeioEstaCompleto()) {
            ArrayList<int[]> opcoes = this.peca.opcoesDeJogada(this.tabuleiro, posicaoX, posicaoY);

            for (int i = 0; i < opcoes.size(); i +=  1) {
                int[] opcao = opcoes.get(i);
                int proximaPosicaoX = opcao[0];
                int proximaPosicaoY = opcao[1];
                if (this.passear(proximaPosicaoX, proximaPosicaoY, rodada + 1)) {
                    return true;
                }
                this.tabuleiro.mapa[proximaPosicaoY][proximaPosicaoX] = 0;
            }
            
            return false;
        }

        return true;
    }
    
    public boolean passeioEstaCompleto() {
        for (int i = 0; i < this.tabuleiro.tamanho; i += 1) {
            for (int j = 0; j < this.tabuleiro.tamanho; j += 1) {
                if (this.tabuleiro.mapa[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
