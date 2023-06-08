import java.util.List;
import java.util.ArrayList;

public class BancoDeDados_Jogos {
    private int contador = 0, id = 0;
    private Leitura ler = new Leitura();
    private List<Jogo_Cartas> bdCartas = new ArrayList<Jogo_Cartas>();
    private List<Jogo_Tabuleiro> bdTabuleiro = new ArrayList<Jogo_Tabuleiro>();
    private List<Jogo_Eletronico> bdEletronico = new ArrayList<Jogo_Eletronico>();

    public void Cadastrar(Jogo_Cartas cartas) {
        String retornar = "";
        int i = 0;
        boolean c = true;
        while (c == true) {
            boolean verificador = true;
            cartas = new Jogo_Cartas();
            System.out.println("\n=================");
            cartas.setId(Integer.parseInt(ler.EntDados("ID: ")));
            while (verificador == true) {
                try {
                    cartas.setNome(ler.EntDados("Nome: "));
                    verificador = false;
                } catch (Excecoes e) {
                    e.nome_vazio();
                }
            }
            while (verificador == false) {
                try {
                    cartas.setMarca(ler.EntDados("Marca: "));
                    verificador = true;
                } catch (Excecoes e) {
                    e.nome_vazio();
                }
            }
            while (verificador == true) {
                try {
                    cartas.setValor(Float.parseFloat(ler.EntDados("Valor: ")));
                    cartas.adicionar_lucro();
                    verificador = false;
                } catch (Excecoes e) {
                    e.valor_invalido();
                }
            }
            while (verificador == false) {
                try {
                    cartas.setQntPlayers(Integer.parseInt(ler.EntDados("Quantidade de jogadores: ")));
                    ;
                    verificador = true;
                } catch (Excecoes e) {
                    e.qtd_min_jogadores();
                }
            }
            while (verificador == true) {
                try {
                    cartas.setMaterial(ler.EntDados("Material (plastico/papelao): "));
                    verificador = false;
                } catch (Excecoes e) {
                    e.nome_vazio();
                }
            }
            cartas.setQntBaralho(Integer.parseInt(ler.EntDados("Quantidade de Baralho: ")));
            cartas.setQntCartas(Integer.parseInt(ler.EntDados("Quantidade de cartas: ")));
            bdCartas.add(i, cartas);
            i++;
            retornar = ler.EntDados("Encerrar cadastramento (sim/enter): ");
            if (retornar.equals("S") || retornar.equals("s")) {
                c = false;
            } else {
                c = true;
            }
        }
    }

    public void Listar(Jogo_Cartas cartas) {
        for (contador = 0; contador < bdCartas.size(); contador++) {
            System.out.println("=========================\n Dados do Jogo de cartas \n=========================");
            System.out.println("ID: " + bdCartas.get(contador).getId());
            System.out.println("Nome: " + bdCartas.get(contador).getNome());
            System.out.println("Marca: " + bdCartas.get(contador).getMarca());
            System.out.println("Valor: R$" + bdCartas.get(contador).getValor());
            System.out.println("Quantidade de jogadores: " + bdCartas.get(contador).getQntPlayers());
            System.out.println("Material: " + bdCartas.get(contador).getMaterial());
            System.out.println("Quantidade de Baralho: " + bdCartas.get(contador).getQntBaralho());
            System.out.println("Quantidade de cartas: " + bdCartas.get(contador).getQntCartas());
        }
    }

    public void Consultar(Jogo_Cartas cartas) {
        id = Integer.parseInt(ler.EntDados("=========================\n ID que deseja consultar: "));
        for (contador = 0; contador < bdCartas.size(); contador++) {
            if (id == bdCartas.get(contador).getId()) {
                System.out.println("=========================\n Dados do Jogo de cartas \n=========================");
                System.out.println("ID: " + (bdCartas.get(contador).getId()));
                System.out.println("Nome: " + bdCartas.get(contador).getNome());
                System.out.println("Marca: " + bdCartas.get(contador).getMarca());
                System.out.println("Valor: R$" + bdCartas.get(contador).getValor());
                System.out.println("Quantidade de jogadores: " + bdCartas.get(contador).getQntPlayers());
                System.out.println("Material: " + bdCartas.get(contador).getMaterial());
                System.out.println("Quantidade de Baralho: " + bdCartas.get(contador).getQntBaralho());
                System.out.println("Quantidade de cartas: " + bdCartas.get(contador).getQntCartas());
            }
        }
    }

    public void Alterar(Jogo_Cartas cartas) {
        id = Integer.parseInt(ler.EntDados("=========================\n ID que deseja Alterar: "));
        for (contador = 0; contador < bdCartas.size(); contador++) {
            if (id == bdCartas.get(contador).getId()) {
                boolean verificador = true;
                cartas.setId(Integer.parseInt(ler.EntDados("ID: ")));
                while (verificador == true) {
                    try {
                        cartas.setNome(ler.EntDados("Nome: "));
                        verificador = false;
                    } catch (Excecoes e) {
                        e.nome_vazio();
                    }
                }
                while (verificador == false) {
                    try {
                        cartas.setMarca(ler.EntDados("Marca: "));
                        verificador = true;
                    } catch (Excecoes e) {
                        e.nome_vazio();
                    }
                }
                while (verificador == true) {
                    try {
                        cartas.setValor(Float.parseFloat(ler.EntDados("Valor: ")));
                        cartas.adicionar_lucro();
                        verificador = false;
                    } catch (Excecoes e) {
                        e.valor_invalido();
                    }
                }
                while (verificador == false) {
                    try {
                        cartas.setQntPlayers(Integer.parseInt(ler.EntDados("Quantidade de jogadores: ")));
                        ;
                        verificador = true;
                    } catch (Excecoes e) {
                        e.qtd_min_jogadores();
                    }
                }
                while (verificador == true) {
                    try {
                        cartas.setMaterial(ler.EntDados("Material (plastico/papelao): "));
                        verificador = false;
                    } catch (Excecoes e) {
                        e.nome_vazio();
                    }
                }
                cartas.setQntBaralho(Integer.parseInt(ler.EntDados("Quantidade de Baralho: ")));
                cartas.setQntCartas(Integer.parseInt(ler.EntDados("Quantidade de cartas: ")));
                bdCartas.set(contador, cartas);
                break;
            }
        }
    }

    public void Deletar(Jogo_Cartas cartas) {
        id = Integer.parseInt(ler.EntDados("=========================\n ID que deseja deletar: "));
        if (id == bdCartas.get(contador).getId()) {
            bdCartas.remove(bdCartas.get(contador));
        }
    }

    // verificador de disponibilidade de ID
    public int Verifica_ID(Jogo_Cartas cartas) {
        int c = 0;
        for (c = 0; c < bdCartas.size(); c++) {
            if (bdCartas.get(c).getId() != c)
                ;
        }
        return c;
    }

    public int Verifica_ID(Jogo_Tabuleiro tabuleiro) {
        int c = 0;
        for (c = 0; c < bdTabuleiro.size(); c++) {
            if (bdTabuleiro.get(c).getId() != c)
                ;
        }
        return c;
    }

    public int Verifica_ID(Jogo_Eletronico eletronico) {
        int c = 0;
        for (c = 0; c < bdEletronico.size(); c++) {
            if (bdEletronico.get(c).getId() != c)
                ;
        }
        return c;
    }
}
