

// Nome: Tiago Eloy Possidonio Pereira - RA: 2417677

public abstract class Jogo {
    private int id;
    private String nome;
    private String marca;
    private float valor;
    private int QntPlayers;

    // Polimorfismo por sobrecarga
    public Jogo() {
        this.id = 0;
        this.nome = "";
        this.marca = "";
        this.valor = 0.00f;
        QntPlayers = 1;
    }

    public Jogo(int id, String nome, String marca, Float valor, int qntPlayers) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
        QntPlayers = qntPlayers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws Excecoes {
        if(Integer.toString(id).isEmpty()) {
            throw new Excecoes();
        }
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) throws Excecoes {
        if (marca.isEmpty()) {
            throw new Excecoes();
        } else {
            this.marca = marca;
        }
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(float valor) throws Excecoes {
        if (valor <= 0) {
            throw new Excecoes();
        }
        this.valor = valor;
    }

    public int getQntPlayers() {
        return QntPlayers;
    }

    public void setQntPlayers(int qntPlayers) throws Excecoes {
        if (qntPlayers <= 0) {
            throw new Excecoes();
        } else {
            this.QntPlayers = qntPlayers;
        }
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