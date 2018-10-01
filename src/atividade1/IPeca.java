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
public interface IPeca {
    public ArrayList<int[]> opcoesDeJogada(Tabuleiro tabuleiro, int posicaoX, int posicaoY);
}
