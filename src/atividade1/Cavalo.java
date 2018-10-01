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
public class Cavalo implements IPeca {

    @Override
    public ArrayList<int[]> opcoesDeJogada(Tabuleiro tabuleiro, int posicaoX, int posicaoY) {
        ArrayList opcoes = new ArrayList<int[]>();

        if (tabuleiro.posicaoEstaDisponivel(posicaoX + 1, posicaoY + 2)) {
            int[] opcao = new int[2];
            opcao[0] = posicaoX + 1;
            opcao[1] = posicaoY + 2;
            opcoes.add(opcao);
        }
        
        if (tabuleiro.posicaoEstaDisponivel(posicaoX - 1, posicaoY + 2)) {
            int[] opcao = new int[2];
            opcao[0] = posicaoX - 1;
            opcao[1] = posicaoY + 2;
            opcoes.add(opcao);
        }
        
        if (tabuleiro.posicaoEstaDisponivel(posicaoX + 1, posicaoY - 2)) {
            int[] opcao = new int[2];
            opcao[0] = posicaoX + 1;
            opcao[1] = posicaoY - 2;
            opcoes.add(opcao);
        }
        
        if (tabuleiro.posicaoEstaDisponivel(posicaoX - 1, posicaoY - 2)) {
            int[] opcao = new int[2];
            opcao[0] = posicaoX - 1;
            opcao[1] = posicaoY - 2;
            opcoes.add(opcao);
        }
        
        if (tabuleiro.posicaoEstaDisponivel(posicaoX + 2, posicaoY + 1)) {
            int[] opcao = new int[2];
            opcao[0] = posicaoX + 2;
            opcao[1] = posicaoY + 1;
            opcoes.add(opcao);
        }
        
        if (tabuleiro.posicaoEstaDisponivel(posicaoX + 2, posicaoY - 1)) {
            int[] opcao = new int[2];
            opcao[0] = posicaoX + 2;
            opcao[1] = posicaoY - 1;
            opcoes.add(opcao);
        }
        
        if (tabuleiro.posicaoEstaDisponivel(posicaoX - 2, posicaoY + 1)) {
            int[] opcao = new int[2];
            opcao[0] = posicaoX - 2;
            opcao[1] = posicaoY + 1;
            opcoes.add(opcao);
        }
        
        if (tabuleiro.posicaoEstaDisponivel(posicaoX - 2, posicaoY - 1)) {
            int[] opcao = new int[2];
            opcao[0] = posicaoX - 2;
            opcao[1] = posicaoY - 1;
            opcoes.add(opcao);
        }
        
        return opcoes;
    }

}
