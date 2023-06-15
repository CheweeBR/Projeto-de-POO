package com.mycompany.projeto_gerenciar_jogos_tiagoeloypossidonio;

// Nome: Tiago Eloy Possidonio Pereira - RA: 2417677

import java.awt.Component;
import javax.swing.JOptionPane;


public class Excecoes extends Exception {
    private Component rootPane;
    
    public void ID_vazio(){
    JOptionPane.showMessageDialog(rootPane, "O campo 'ID' está vazio!");
    }
    public void nome_vazio(){
    JOptionPane.showMessageDialog(rootPane, "O campo 'Nome' está vazio!");
    }
    public void Marca_vazio(){
    JOptionPane.showMessageDialog(rootPane, "O campo 'Marca' está vazio!");
    }
    public void valor_invalido(){
        JOptionPane.showMessageDialog(rootPane, "O valor do produto deve ser maior que R$00.00");
    }
    public void qtd_min_jogadores(){
        JOptionPane.showMessageDialog(rootPane, "A quantidade de jogadores deve ser maior que 0.");
    }
    public void restricao_material() {
        JOptionPane.showMessageDialog(rootPane, "Os materiais devem estar dentro das alternativas (Plastico/Papelao).");
    }
    public void restricao_manual(){
        JOptionPane.showMessageDialog(rootPane, "A resposta obrigatoriamente deve ser Sim ou Não.");
    }
}
