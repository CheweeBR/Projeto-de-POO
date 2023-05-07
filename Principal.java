// Nome: Tiago Eloy Possidonio Pereira - RA: 2417677

public class Principal {
    public static void main(String arg[]) {
        int alt = 0;
        Leitura ler = new Leitura();
        Jogo_Cartas cartas = new Jogo_Cartas();
        Jogo_Tabuleiro tabuleiro = new Jogo_Tabuleiro();
        Jogo_Eletronico eletronico = new Jogo_Eletronico();
        System.out.println("==================\n Tipos de Jogos  \n==================");
        System.out.println(" [1] Cartas\n [2] Tabuleiro\n [3] Eletronico  \n==================");
        alt = Integer.parseInt(ler.EntDados("Alternativa: "));
        System.out.println("==================");
        switch (alt) {
            case 1:
                cartas.setNome(ler.EntDados("Nome: "));
                cartas.setMarca(ler.EntDados("Marca: "));
                cartas.setQntPlayers(Integer.parseInt(ler.EntDados("Quantidade de jogadores: ")));
                cartas.setMaterial(ler.EntDados("Material: "));
                cartas.setQntBaralho(Integer.parseInt(ler.EntDados("Quantidade de Baralho: ")));
                cartas.setQntCartas(Integer.parseInt(ler.EntDados("Quantidade de cartas: ")));
                System.out.println("=========================\n Dados do Jogo de cartas \n=========================");
                System.out.println("Nome: " + cartas.getNome());
                System.out.println("Marca: " + cartas.getMarca());
                System.out.println("Quantidade de jogadores: " + cartas.getQntPlayers());
                System.out.println("Material: " + cartas.getMaterial());
                System.out.println("Quantidade de Baralho: " + cartas.getQntBaralho());
                System.out.println("Quantidade de cartas: " + cartas.getQntCartas());
                break;
            case 2:
                tabuleiro.setNome(ler.EntDados("Nome: "));
                tabuleiro.setMarca(ler.EntDados("Marca: "));
                tabuleiro.setQntPlayers(Integer.parseInt(ler.EntDados("Quantidade de jogadores: ")));
                tabuleiro.setManualRegras(ler.EntDados("Possui manual: "));
                tabuleiro.setQntdados(Integer.parseInt(ler.EntDados("Quantidade de dados: ")));
                tabuleiro.setQntpeças(Integer.parseInt(ler.EntDados("Quantidade de peças: ")));
                System.out.println(
                        "========================\n Dados do Jogo de tabuleiro \n========================");
                System.out.println("Nome: " + tabuleiro.getNome());
                System.out.println("Marca: " + tabuleiro.getMarca());
                System.out.println("Quantidade de jogadores: " + tabuleiro.getQntPlayers());
                System.out.println("Possui manual: " + tabuleiro.getManualRegras());
                System.out.println("Quantidade de dados: " + tabuleiro.getQntdados());
                System.out.println("Quantidade de peças: " + tabuleiro.getQntpeças());
                break;
            case 3:
                eletronico.setNome(ler.EntDados("Nome: "));
                eletronico.setMarca(ler.EntDados("Marca: "));
                eletronico.setQntPlayers(Integer.parseInt(ler.EntDados("Quantidade de jogadores: ")));
                eletronico.setPlataforma(ler.EntDados("Plataforma: "));
                eletronico.setAvaliação(Float.parseFloat(ler.EntDados("Avaliação: ")));
                eletronico.setConectividade(ler.EntDados("Conectividade (online/Local): "));
                System.out.println(
                        "=========================\n Dados do Jogo Eletronico \n=========================");
                System.out.println("Nome: " + eletronico.getNome());
                System.out.println("Marca: " + eletronico.getMarca());
                System.out.println("Quantidade de jogadores: " + eletronico.getQntPlayers());
                System.out.println("Plataforma: " + eletronico.getPlataforma());
                System.out.println("Avaliação: " + eletronico.getAvaliação());
                System.out.println("Conectividade (online/Local): " + eletronico.getConectividade());
                break;
            default:
                System.out.println("Alternativa incorreta, o numero informado deve ser entre 1 a 3");
                break;

        }
    }
}
