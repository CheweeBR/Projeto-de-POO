// Nome: Tiago Eloy Possidonio Pereira - RA: 2417677

public class Excecoes extends Exception {
    public void nome_vazio() {
        System.out.println("O campo esta vazio e deve ser preenchido!");
    }
    public void valor_invalido(){
        System.out.println("O valor do produto deve ser maior que R$00.00");
    }
    public void qtd_min_jogadores(){
        System.out.println("A quantidade de jogadores deve ser maior que 0.");
    }
    public void restricao_material() {
        System.out.println("Os materiais devem estar dentro das alternativas (Plastico/Papelao).");
    }
    public void restricao_manual(){
        System.out.println("A resposta obrigatoriamente deve ser Sim (S) ou Nao (N).");
    }
}
