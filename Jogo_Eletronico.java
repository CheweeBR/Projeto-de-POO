// Nome: Tiago Eloy Possidonio Pereira - RA: 2417677

public class Jogo_Eletronico extends Jogo implements Calc_lucroInterface {
    private String plataforma;
    private String conectividade;
    private float avaliacao;

    public Jogo_Eletronico(String nome, String marca, Float valor, int qntPlayers, String plataforma,
            String conectividade,
            float avaliacao) {
        super(nome, marca, valor, qntPlayers);
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

    public void setConectividade(String conectividade) {
        this.conectividade = conectividade;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        this.avaliacao = avaliacao;
    }

    // Polimorfismo por sobreescrita, cada classe tem uma % de lucro diferente.
    @Override
    public void adicionar_lucro() {
        setValor(getValor() * 1.75f);
    }
}