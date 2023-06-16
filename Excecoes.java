// Nome: Tiago Eloy Possidonio Pereira - RA: 2417677

import java.awt.Component;
import javax.swing.JOptionPane;

public class Excecoes extends Exception {
    private Component rootPane;
    
    public void ID_vazio(){
    JOptionPane.showMessageDialog(rootPane, "O campo 'ID' está vazio!", "erro", 0);
    }
    public void nome_vazio(){
    JOptionPane.showMessageDialog(rootPane, "O campo 'Nome' está vazio!", "erro", 0);
    }
    public void Marca_vazio(){
    JOptionPane.showMessageDialog(rootPane, "O campo 'Marca' está vazio!", "erro", 0);
    }
    public void valor_invalido(){
        JOptionPane.showMessageDialog(rootPane, "O valor do produto deve ser maior que R$00.00", "erro", 0);
    }
    public void qtd_min_jogadores(){
        JOptionPane.showMessageDialog(rootPane, "A quantidade de jogadores deve ser maior que 0.","erro", 0);
    }
    public void restricao_material() {
        JOptionPane.showMessageDialog(rootPane, "Os materiais devem estar dentro das alternativas (Plastico/Papelao).", "erro", 0);
    }
    public void restricao_manual(){
        JOptionPane.showMessageDialog(rootPane, "O campo 'Manual' deve ser Sim ou Não.", "erro", 0);
    }
    public void Plataforma_vazio(){
    JOptionPane.showMessageDialog(rootPane, "O campo 'Plataforma' está vazio!", "erro", 0);
    }
    public void conectividade_vazio(){
    JOptionPane.showMessageDialog(rootPane, "O campo 'conectividade' está vazio!", "erro", 0);
    }
    public void Avaliacao_vazio(){
    JOptionPane.showMessageDialog(rootPane, "O valor da 'avaliação' não pode ser menor que 0!", "erro", 0);
    }
    public void qtd_Dados(){
        JOptionPane.showMessageDialog(rootPane, "O valor da 'Quatidade Dados' não pode ser menor que 0!", "erro", 0);
    }
    public void qtd_Pecas(){
        JOptionPane.showMessageDialog(rootPane, "O valor da 'Quatidade de peças' não pode ser menor que 0!", "erro", 0);
    }
}
