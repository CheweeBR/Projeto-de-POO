package com.mycompany.projeto_gerenciar_jogos_tiagoeloypossidonio;

// Nome: Tiago Eloy Possidonio Pereira - RA: 2417677

public class Jogo_Cartas extends Jogo implements Calc_lucroInterface {
    private String material;
    private int qntBaralho;
    private int qntCartas;

    // Polimorfismo por sobrecarga
    public Jogo_Cartas() {
        material = "";
        qntBaralho = 0;
        qntCartas = 0;
    }

    public Jogo_Cartas(int id, String nome, String marca, Float valor, int qntPlayers, String material, int qntBaralho,
            int qntCartas) {
        super(id, nome, marca, valor, qntPlayers);
        this.material = material;
        this.qntBaralho = qntBaralho;
        this.qntCartas = qntCartas;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) throws Excecoes {
        if (material.isEmpty()) {
            throw new Excecoes();
        } else {
            this.material = material;
        }
    }

    public int getQntBaralho() {
        return qntBaralho;
    }

    public void setQntBaralho(int qntBaralho) throws Excecoes {
        if (qntBaralho <= 0) {
            throw new Excecoes();
        }
        else {
            this.qntBaralho = qntBaralho;            
        }

    }

    public int getQntCartas() {
        return qntCartas;
    }

    public void setQntCartas(int qntCartas) throws Excecoes {
        if (qntCartas <= 0 ){
            throw new Excecoes();
        }
        else{
            this.qntCartas = qntCartas;
        }
    }

    // Polimorfismo por sobreescrita, cada classe tem uma % de lucro diferente.
    @Override
    public void adicionar_lucro() {
        try {
            setValor(getValor() * 1.5f);
        } catch (Excecoes e) {
            e.valor_invalido();
        }
    }
}
