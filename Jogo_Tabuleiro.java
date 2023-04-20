// Nome: Tiago Eloy Possidonio Pereira - RA: 2417677

public class Jogo_Tabuleiro extends Jogo {
    private Boolean ManualRegras;
    private int qntpeças;
    private int qntdados;

    protected Jogo_Tabuleiro(String nome, String marca, Float valor, int qntPlayers, int qntpeças, int qntdados,
            Boolean manual) {
        super(nome, marca, valor, qntPlayers);
        this.qntpeças = qntpeças;
        this.qntdados = qntdados;
        this.ManualRegras = manual;
    }

    public Jogo_Tabuleiro() {
        this.qntpeças = 1;
        this.qntdados = 1;
        this.ManualRegras = false;
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

    public Boolean getManual() {
        return ManualRegras;
    }

    public void setManual(Boolean manualRegras) {
        this.ManualRegras = manualRegras;
    }

}
