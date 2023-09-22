// Nome: Tiago Eloy Possidonio Pereira - RA: 2417677

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class BancoDeDados_Jogos {
    private int contador = 0;
    private static BancoDeDados_Jogos instance = null;
    private List<Jogo_Cartas> bdCartas = new ArrayList<Jogo_Cartas>();
    private List<Jogo_Tabuleiro> bdTabuleiro = new ArrayList<Jogo_Tabuleiro>();
    private List<Jogo_Eletronico> bdEletronico = new ArrayList<Jogo_Eletronico>();
    
    private BancoDeDados_Jogos(){
            
    }
    public static BancoDeDados_Jogos getInstance() {
        synchronized (BancoDeDados_Jogos.class) {
            if(Objects.isNull(instance)) {
                instance = new BancoDeDados_Jogos();
            }
        }
        return instance;
    }
    
    public List<Jogo_Cartas> getBdCartas(){
        return bdCartas;
    }
    
    public List<Jogo_Tabuleiro> getBdTabuleiro(){
        return bdTabuleiro;
    }
    
    public List<Jogo_Eletronico> getBdEletronico(){
        return bdEletronico;
    }
    
    public Jogo_Cartas Cadastrar(Jogo_Cartas cartas) {
        cartas = new Jogo_Cartas();
        if(Consultar(cartas) == null){
            bdCartas.add(cartas);
            System.out.println("cadastrado");
            return cartas;
        } else {
            System.out.println("nao cadastrado");
            return null;
        }
    }

    public Jogo_Tabuleiro Cadastrar(Jogo_Tabuleiro tabuleiro) {
        tabuleiro = new Jogo_Tabuleiro();
        if(Consultar(tabuleiro) == null){
            bdTabuleiro.add(tabuleiro);
            System.out.println("cadastrado");
            return tabuleiro;
        } else {
            System.out.println("nao cadastrado");
            return null;
        }
    }
    
    public Jogo_Eletronico Cadastrar(Jogo_Eletronico eletronico) {
        eletronico = new Jogo_Eletronico();
        if(Consultar(eletronico) == null){
            bdEletronico.add(eletronico);
            return eletronico;
        } else {
            return null;
        }
    }

    public Jogo_Tabuleiro Consultar (Jogo_Tabuleiro tabuleiro) {
        for (contador = 0; contador < bdTabuleiro.size(); contador++) {
            if (tabuleiro.getId() == bdTabuleiro.get(contador).getId()){      
                return bdTabuleiro.get(contador);
            }
        }
        return null;
    }
    
    public Jogo_Cartas Consultar (Jogo_Cartas cartas) {
        for (contador = 0; contador < bdCartas.size(); contador++) {
            if (cartas.getId() == bdCartas.get(contador).getId()){      
                return bdCartas.get(contador);
            }
        }
        return null;
    }
    
    public Jogo_Eletronico Consultar (Jogo_Eletronico eletronico) {
        for (contador = 0; contador < bdEletronico.size(); contador++) {
            if (eletronico.getId() == bdEletronico.get(contador).getId()){      
                return bdEletronico.get(contador);
            }
        }
        return null;
    }

    public Jogo_Cartas Alterar(Jogo_Cartas cartas) {
        for (contador = 0; contador < bdCartas.size(); contador++) {
            if (cartas.getId() == bdCartas.get(contador).getId()) {
                try {
                    bdCartas.get(contador).setId(cartas.getId());
                } catch (Excecoes e) {
                    
                }
                try {
                    bdCartas.get(contador).setNome(cartas.getNome());
                } catch (Excecoes e) {
                    e.nome_vazio();
                }
                try {
                    bdCartas.get(contador).setMarca(cartas.getMarca());
                } catch(Excecoes e) {
                    e.Marca_vazio();
                }
                try {
                    bdCartas.get(contador).setQntCartas(cartas.getQntCartas());
                } 
                catch(Excecoes e){
                    e.valor_invalido();
                }
                try {
                   bdCartas.get(contador).setQntBaralho(cartas.getQntBaralho());
                } 
                catch(Excecoes e){
                     e.valor_invalido();
                }
                try {
                    bdCartas.get(contador).setMaterial(cartas.getMaterial());
                } catch (Excecoes e) {
                    e.nome_vazio();
                }
                try {
                    bdCartas.get(contador).setQntPlayers(cartas.getQntPlayers());
                } catch (Excecoes e) {
                    e.qtd_min_jogadores();
                }
                try {
                    bdCartas.get(contador).setValor(cartas.getValor());
                    cartas.adicionar_lucro();
                } catch (Excecoes e) {
                    e.valor_invalido();
                }
                return bdCartas.get(contador);
            }
        }
        return null;
    }
    
    public Jogo_Eletronico Alterar(Jogo_Eletronico eletronico) {
        for (contador = 0; contador < bdEletronico.size(); contador++) {
            if (eletronico.getId() == bdEletronico.get(contador).getId()) {
                try {
                    bdEletronico.get(contador).setId(eletronico.getId());
                } catch (Excecoes e) {
                    e.ID_vazio();
                }
                try {
                    bdEletronico.get(contador).setNome(eletronico.getNome());
                } catch (Excecoes e) {
                    e.nome_vazio();
                }
                try {
                    bdEletronico.get(contador).setMarca(eletronico.getMarca());
                } catch(Excecoes e) {
                    e.Marca_vazio();
                }
                try {
                    bdEletronico.get(contador).setPlataforma(eletronico.getPlataforma());
                } 
                catch(Excecoes e){
                    e.Plataforma_vazio();
                }
                try {
                   bdEletronico.get(contador).setConectividade(eletronico.getConectividade());
                } 
                catch(Excecoes e){
                     e.conectividade_vazio();                }
                try {
                    bdEletronico.get(contador).setAvaliacao(eletronico.getAvaliacao());
                } catch (Excecoes e) {
                    e.Avaliacao_vazio();
                }
                try {
                    bdEletronico.get(contador).setQntPlayers(eletronico.getQntPlayers());
                } catch (Excecoes e) {
                    e.qtd_min_jogadores();
                }
                try {
                    bdEletronico.get(contador).setValor(eletronico.getValor());
                    eletronico.adicionar_lucro();
                } catch (Excecoes e) {
                    e.valor_invalido();
                }
                return bdEletronico.get(contador);
            }
        }
        return null;
    }
    
    public Jogo_Tabuleiro Alterar(Jogo_Tabuleiro tabuleiro) {
        for (contador = 0; contador < bdTabuleiro.size(); contador++) {
            if (tabuleiro.getId() == bdTabuleiro.get(contador).getId()) {
                try {
                    bdTabuleiro.get(contador).setId(tabuleiro.getId());
                } catch (Excecoes e) {
                    e.ID_vazio();
                }
                try {
                    bdTabuleiro.get(contador).setNome(tabuleiro.getNome());
                } catch (Excecoes e) {
                    e.nome_vazio();
                }
                try {
                    bdTabuleiro.get(contador).setMarca(tabuleiro.getMarca());
                } catch(Excecoes e) {
                    e.Marca_vazio();
                }
                try {
                    bdTabuleiro.get(contador).setManualRegras(tabuleiro.getManualRegras());
                } 
                catch(Excecoes e){
                    e.restricao_manual();
                }
                try {
                   bdTabuleiro.get(contador).setQntdados(tabuleiro.getQntdados());
                } 
                catch(Excecoes e){
                     e.qtd_Dados();                }
                try {
                    bdTabuleiro.get(contador).setQntpecas(tabuleiro.getQntpecas());
                } catch (Excecoes e) {
                    e.qtd_Pecas();
                }
                try {
                    bdTabuleiro.get(contador).setQntPlayers(tabuleiro.getQntPlayers());
                } catch (Excecoes e) {
                    e.qtd_min_jogadores();
                }
                try {
                    bdTabuleiro.get(contador).setValor(tabuleiro.getValor());
                    tabuleiro.adicionar_lucro();
                } catch (Excecoes e) {
                    e.valor_invalido();
                }
                return bdTabuleiro.get(contador);
            }
        }
        return null;
    }
    
    public Jogo_Cartas Deletar(Jogo_Cartas cartas) {       
        for (contador = 0; contador < bdCartas.size(); contador++) {
            if (cartas.getId() == bdCartas.get(contador).getId()) {
            bdCartas.remove(bdCartas.get(contador));
            return cartas;
            }   
        }
        return null;
    }

    public Jogo_Eletronico Deletar(Jogo_Eletronico eletronico) {       
        for (contador = 0; contador < bdEletronico.size(); contador++) {
            if (eletronico.getId() == bdEletronico.get(contador).getId()) {
            bdEletronico.remove(bdEletronico.get(contador));
            return eletronico;
            }   
        }
        return null;
    }
    
    public Jogo_Tabuleiro Deletar(Jogo_Tabuleiro tabuleiro) {       
        for (contador = 0; contador < bdTabuleiro.size(); contador++) {
            if (tabuleiro.getId() == bdTabuleiro.get(contador).getId()) {
            bdTabuleiro.remove(bdTabuleiro.get(contador));
            return tabuleiro;
            }   
        }
        return null;
    }
}
