/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;
import javax.swing.JOptionPane;

/**
 *
 * @author danilo
 */
public class Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho do tabuleiro?"));
        int posicalInicialX = Integer.parseInt(JOptionPane.showInputDialog("Qual a coordenada X da posição inicial?"));
        int posicalInicialY = Integer.parseInt(JOptionPane.showInputDialog("Qual a coordenada Y da posição inicial?"));
        long tempoInicial = System.currentTimeMillis();
        IPeca cavalo = new Cavalo();
        Tabuleiro tabuleiro = new Tabuleiro(tamanho);
        Passeio passeio = new Passeio(tabuleiro, cavalo);
        String mensagem = "";
        if (passeio.iniciarPasseio(posicalInicialX, posicalInicialY)) {
            mensagem += "Existe uma solução!\n";
            mensagem += "Tabuleiro: \n";
            mensagem += tabuleiro;
        } else {
            mensagem += "Não existe solução!\n";
        }
        mensagem += "Quantidade de casas visitadas: " + passeio.casasVisitadas + "\n";
        mensagem += "Tempo de execução da simulação: " + (System.currentTimeMillis() - tempoInicial) + "ms\n";
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
