// Nome: Tiago Eloy Possidonio Pereira - RA: 2417677

public class Excecoes extends Exception {
    public void nome_vazio() {
        System.out.println("O campo esta vazio e deve ser preenchido!");
    }
    public void valor_invalido(){
        System.out.println("O valor do produto deve ser maior que R$00.00");
    }
}
