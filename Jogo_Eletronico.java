// Nome: Tiago Eloy Possidonio Pereira - RA: 2417677

public class Jogo_Eletronico extends Jogo implements Calc_lucroInterface {
    private String plataforma;
    private String conectividade;
    private float avaliacao;

    public Jogo_Eletronico(int id, String nome, String marca, Float valor, int qntPlayers, String plataforma,
            String conectividade,
            float avaliacao) {
        super(id, nome, marca, valor, qntPlayers);
        this.plataforma = plataforma;
        this.conectividade = conectividade;
        this.avaliacao = avaliacao;
    }

    public Jogo_Eletronico() {
        plataforma = "";
        conectividade = "";
        avaliacao = 0f;
    }

    public String getConectividade() {
        return conectividade;
    }

    public void setConectividade(String conectividade) throws Excecoes {
        if (conectividade.isEmpty()) {
            throw new Excecoes();
        } else {
        this.conectividade = conectividade;
        }
    }
    
    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) throws Excecoes {
        if (plataforma.isEmpty()) {
            throw new Excecoes();
        } else {
        this.plataforma = plataforma;
        }
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao)throws Excecoes {
        if (avaliacao < 0) {
            throw new Excecoes();
        } else {
        this.avaliacao = avaliacao;
        }
    }

    // Polimorfismo por sobreescrita, cada classe tem uma % de lucro diferente.
    @Override
    public void adicionar_lucro() {
        try {
            setValor(getValor() * 1.75f);
        } catch (Excecoes e) {
            e.valor_invalido();
        }
    }
}