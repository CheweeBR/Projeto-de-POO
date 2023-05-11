// Nome: Tiago Eloy Possidonio Pereira - RA: 2417677

public class Jogo_Tabuleiro extends Jogo implements Calc_lucroInterface {
    private String ManualRegras;
    private int qntpecas;
    private int qntdados;

    public Jogo_Tabuleiro(String nome, String marca, Float valor, int qntPlayers, int qntpecas, int qntdados,String ManualRegras) {
        super(nome, marca, valor, qntPlayers);
        this.qntpecas = qntpecas;
        this.qntdados = qntdados;
        this.ManualRegras = ManualRegras;
    }

    public Jogo_Tabuleiro() {
        this.qntpecas = 1;
        this.qntdados = 1;
        this.ManualRegras = "";
    }

    public int getQntpecas() {
        return qntpecas;
    }

    public void setQntpecas(int qntpecas) {
        this.qntpecas = qntpecas;
    }

    public int getQntdados() {
        return qntdados;
    }

    public void setQntdados(int qntdados) {
        this.qntdados = qntdados;
    }

    public void setManualRegras(String manualRegras) throws Excecoes {
        if((ManualRegras == "S" || ManualRegras == "s" || ManualRegras == "n" || ManualRegras == "N")){
            throw new Excecoes();
        }
        else {
            this.ManualRegras = manualRegras;
        }
    }

    public String getManualRegras() {
        return ManualRegras;
    }

    // Polimorfismo por sobreescrita, cada classe tem uma % de lucro diferente.
    @Override
    public void adicionar_lucro() {
        try {
            setValor(getValor() * 2.5f);
        } catch (Excecoes e) {
            e.valor_invalido();
        }
    }
}
