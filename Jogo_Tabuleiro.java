// Nome: Tiago Eloy Possidonio Pereira - RA: 2417677

public class Jogo_Tabuleiro extends Jogo {
    private String ManualRegras;
    private int qntpeças;
    private int qntdados;

    public Jogo_Tabuleiro(String nome, String marca, Float valor, int qntPlayers, int qntpeças, int qntdados,
            String ManualRegras) {
        super(nome, marca, valor, qntPlayers);
        this.qntpeças = qntpeças;
        this.qntdados = qntdados;
        this.ManualRegras = ManualRegras;
    }

    public Jogo_Tabuleiro() {
        this.qntpeças = 1;
        this.qntdados = 1;
        this.ManualRegras = "";
    }

    public int getQntpeças() {
        return qntpeças;
    }

    public void setQntpeças(int qntpeças) {
        this.qntpeças = qntpeças;
    }

    public int getQntdados() {
        return qntdados;
    }

    public void setQntdados(int qntdados) {
        this.qntdados = qntdados;
    }

    public void setManualRegras(String manualRegras) {
        this.ManualRegras = manualRegras;
    }

    public String getManualRegras() {
        return ManualRegras;
    }

}
