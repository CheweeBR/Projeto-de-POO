// Nome: Tiago Eloy Possidonio Pereira - RA: 2417677

public abstract class Jogo {
    private String nome;
    private String marca;
    private float valor;
    private int QntPlayers;

    public Jogo() {
        this.nome = "";
        this.marca = "";
        this.valor = 0.00f;
        QntPlayers = 1;
    }

    public Jogo(String nome, String marca, Float valor, int qntPlayers) {
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
        QntPlayers = qntPlayers;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) throws Excecoes{
        if(valor <= 0) {
            throw new Excecoes();
        }
        this.valor = valor;
    }

    public int getQntPlayers() {
        return QntPlayers;
    }

    public void setQntPlayers(int qntPlayers) {
        QntPlayers = qntPlayers;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Excecoes {
        if (nome.isEmpty()) {
            throw new Excecoes();
        } else {
            this.nome = nome;
        }

    }
}