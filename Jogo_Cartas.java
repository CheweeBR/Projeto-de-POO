// Nome: Tiago Eloy Possidonio Pereira - RA: 2417677

public class Jogo_Cartas extends Jogo {
    private String material;
    private int qntBaralho;
    private int qntCartas;

    public Jogo_Cartas() {
        material = "";
        qntBaralho = 0;
        qntCartas = 0;
    }

    public Jogo_Cartas(String nome, String marca, Float valor, int qntPlayers, String material, int qntBaralho,
            int qntCartas) {
        super(nome, marca, valor, qntPlayers);
        this.material = material;
        this.qntBaralho = qntBaralho;
        this.qntCartas = qntCartas;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getQntBaralho() {
        return qntBaralho;
    }

    public void setQntBaralho(int qntBaralho) {
        this.qntBaralho = qntBaralho;
    }

    public int getQntCartas() {
        return qntCartas;
    }

    public void setQntCartas(int qntCartas) {
        this.qntCartas = qntCartas;
    }

}
