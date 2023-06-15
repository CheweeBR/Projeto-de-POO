// Nome: Tiago Eloy Possidonio Pereira - RA: 2417677

package com.mycompany.projeto_gerenciar_jogos_tiagoeloypossidonio;

import java.awt.Component;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BancoDeDados_Jogos {
    private int contador = 0, c = 0;
    private List<Jogo_Cartas> bdCartas = new ArrayList<Jogo_Cartas>();
    private List<Jogo_Tabuleiro> bdTabuleiro = new ArrayList<Jogo_Tabuleiro>();
    private List<Jogo_Eletronico> bdEletronico = new ArrayList<Jogo_Eletronico>();
    private Component rootPane;

    public void Cadastrar(Jogo_Cartas cartas) {
        cartas = new Jogo_Cartas();
        /*if(Consultar(cartas) != null){
            bdCartas.add(cartas);
            JOptionPane.showMessageDialog(rootPane, "Cadastro realizado com sucesso");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Já possuí um item castrado com esse número de ID");
        }*/
        bdCartas.add(cartas);
    }

    public Jogo_Cartas Consultar (Jogo_Cartas cartas) {
        for (contador = 0; contador < bdCartas.size(); contador++) {
            if (cartas.getId() == bdCartas.get(contador).getId()) {                
              return bdCartas.get(contador);
            }
        }
        return cartas;
    }

    public void Alterar(Jogo_Cartas cartas) {
        for (c = 0; c < bdCartas.size(); c++) {
            if (c == bdCartas.get(contador).getId()) {
            }
        }
    }

    public void Deletar(Jogo_Cartas cartas) {
        if (c == bdCartas.get(contador).getId()) {
            bdCartas.remove(bdCartas.get(contador));
        }
    }

    // verificador de disponibilidade de ID
    public int Verifica_ID(Jogo_Cartas cartas) {
        contador = 1;
        for (c = 0; c < bdCartas.size(); c++) {
            if (bdCartas.get(c).getId() == c) {
                System.out.println("Cont: " + contador + " c: " +c + "ID cadastrado: " + bdTabuleiro.size());
                contador++;
            }
        }
        return contador;
    }
        
    public int Verifica_ID(Jogo_Tabuleiro tabuleiro) {
        contador = 1;
        for (c = 0; c < bdTabuleiro.size(); c++) {
            if (bdTabuleiro.get(c).getId() == c) {
                contador++;
            }
        }
        return contador;
    }

    public int Verifica_ID(Jogo_Eletronico eletronico) {
        contador = 1;
        for (c = 0; c < bdEletronico.size(); c++) {
            if (bdEletronico.get(c).getId() == c) {
                contador++;
            }
        }
        return contador;
    }
}
