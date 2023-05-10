public class Excecoes extends Exception {
    public void nome_vazio() {
        Leitura ler = new Leitura();
        String novo_nome = "";
        Jogo_Cartas cartas = new Jogo_Cartas();
        System.out.println("O nome esta vazio e deve ser preenchido!");
        novo_nome = ler.EntDados("Nome: ");
        if (novo_nome.isEmpty()) {
            nome_vazio();
        }
        cartas.setMaterial(novo_nome);
    }
}
