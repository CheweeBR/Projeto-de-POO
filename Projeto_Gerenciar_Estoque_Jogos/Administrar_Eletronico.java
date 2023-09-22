// Nome: Tiago Eloy Possidonio Pereira - RA: 2417677

import javax.swing.JOptionPane;

public class Administrar_Eletronico extends javax.swing.JFrame {

    private BancoDeDados_Jogos bdEletronico = BancoDeDados_Jogos.getInstance();
    private Jogo_Eletronico eletronico = new Jogo_Eletronico();
    private boolean verificador = true;
    private static Administrar_Eletronico instancia;
    
    private Administrar_Eletronico() {
        initComponents();
    }
    
    public static Administrar_Eletronico getAdministrar_Eletronico() {
        if(instancia == null) {
            instancia = new Administrar_Eletronico(); 
        }
        return instancia;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Titulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_ID = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel_Nome = new javax.swing.JLabel();
        jTextField_Nome = new javax.swing.JTextField();
        jLabel_Marca = new javax.swing.JLabel();
        jTextField_Marca = new javax.swing.JTextField();
        jLabel_QtdJogadores = new javax.swing.JLabel();
        jTextField_QtdJogadores = new javax.swing.JTextField();
        jTextField_Avaliacao = new javax.swing.JTextField();
        jLabel_Avaliacao = new javax.swing.JLabel();
        jTextField_Conectividade = new javax.swing.JTextField();
        jLabel_Conectividade = new javax.swing.JLabel();
        jLabel_Plataforma = new javax.swing.JLabel();
        jTextField_Plataforma = new javax.swing.JTextField();
        jLabel_Valor = new javax.swing.JLabel();
        jTextField_valor = new javax.swing.JTextField();
        jButtonConsultar = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrar Jogos Eletronicos");

        jLabel_Titulo.setFont(new java.awt.Font("Segoe UI", 0, 38)); // NOI18N
        jLabel_Titulo.setText("Jogos Eletronicos");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel_ID.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel_ID.setText("ID:");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel_Nome.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel_Nome.setText("Nome.........:");

        jLabel_Marca.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel_Marca.setText("Marca.........:");

        jLabel_QtdJogadores.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel_QtdJogadores.setText("Qtd. de Jogadores..:");

        jTextField_QtdJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_QtdJogadoresActionPerformed(evt);
            }
        });

        jLabel_Avaliacao.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel_Avaliacao.setText("Avaliação..:");

        jTextField_Conectividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ConectividadeActionPerformed(evt);
            }
        });

        jLabel_Conectividade.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel_Conectividade.setText("Conectividade..:");

        jLabel_Plataforma.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel_Plataforma.setText("Plataforma..:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_Nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_Marca)
                        .addGap(7, 7, 7)
                        .addComponent(jTextField_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_Avaliacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Avaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_QtdJogadores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_QtdJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_Plataforma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_Plataforma))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_Conectividade)
                        .addGap(11, 11, 11)
                        .addComponent(jTextField_Conectividade, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_Nome)
                        .addComponent(jTextField_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_Plataforma)
                        .addComponent(jTextField_Plataforma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_Marca)
                        .addComponent(jTextField_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_Conectividade)
                        .addComponent(jTextField_Conectividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Avaliacao)
                    .addComponent(jTextField_Avaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_QtdJogadores)
                    .addComponent(jTextField_QtdJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        jLabel_Valor.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel_Valor.setText("R$:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel_ID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_Valor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_ID))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Valor))
                .addGap(14, 14, 14))
        );

        jButtonConsultar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jButtonCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonAlterar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonDeletar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonDeletar.setText("Deletar");
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel_Titulo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        Consultar(eletronico);
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        Cadastrar();
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        Deletar();
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jTextField_QtdJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_QtdJogadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_QtdJogadoresActionPerformed

    private void jTextField_ConectividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ConectividadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ConectividadeActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        Alterar();
    }//GEN-LAST:event_jButtonAlterarActionPerformed
 public void Cadastrar(){
        verificador = true;
        while (verificador==true) {
            try {
                eletronico.setId(Integer.parseInt(jTextField_ID.getText()));
            }
            catch (Excecoes e) {
                e.ID_vazio();
                break;
            }
            try {
                eletronico.setNome(jTextField_Nome.getText());
            }
            catch (Excecoes e) {
                e.ID_vazio();
                break;
            }
            try {
                eletronico.setPlataforma(jTextField_Plataforma.getText());
            } catch(Excecoes e) {
                e.Plataforma_vazio();
                break;
            }     
            try {
                eletronico.setMarca(jTextField_Marca.getText());
            } catch (Excecoes e) {
                e.Marca_vazio();
                break;
            } 
            try {
                eletronico.setConectividade(jTextField_Conectividade.getText());
            } catch(Excecoes e){
                 e.conectividade_vazio();
                 break;
            }
            try {
                eletronico.setAvaliacao(Float.parseFloat(jTextField_Avaliacao.getText()));
            } catch (Excecoes e) {
                e.Avaliacao_vazio();
                break;
            }
            try {
                eletronico.setQntPlayers(Integer.parseInt(jTextField_QtdJogadores.getText()));

            } catch (Excecoes e) {
                e.qtd_min_jogadores();
                break;
            }
            try {
                eletronico.setValor(Float.parseFloat(jTextField_valor.getText()));
                eletronico.adicionar_lucro();
            } catch (Excecoes e) {
                e.valor_invalido();
                break;
            }
            eletronico = bdEletronico.Cadastrar(eletronico);
            if(eletronico != null) {
                JOptionPane.showMessageDialog(rootPane, "Cadastro realizado com sucesso!");
                Limpar();
            }
            else {
                JOptionPane.showMessageDialog(rootPane, "Já possuí um item cadastrado com esse ID!");
                Limpar();
            }
            verificador = false;
        }
    }
    
    public void Consultar(Jogo_Eletronico eletronico){
        try {
            eletronico.setId(Integer.parseInt(jTextField_ID.getText()));
            eletronico = bdEletronico.Consultar(eletronico);
            if(eletronico != null) {
            jTextField_ID.setText(Integer.toString(eletronico.getId()));
            jTextField_Marca.setText(eletronico.getMarca());
            jTextField_Plataforma.setText(eletronico.getPlataforma());
            jTextField_Nome.setText(eletronico.getNome());
            jTextField_Conectividade.setText(eletronico.getConectividade());
            jTextField_Avaliacao.setText(String.valueOf(eletronico.getAvaliacao()));
            jTextField_QtdJogadores.setText(Integer.toString(eletronico.getQntPlayers()));
            jTextField_valor.setText(String.valueOf(eletronico.getValor()));
            JOptionPane.showConfirmDialog(rootPane, "Os dados estão corretos?");
            Limpar();
            }      
            else {
                JOptionPane.showMessageDialog(null, "Não há nenhum item cadastrado com esse ID.", "Verifique se digitou corretamente.", 0 );
        }
        
    }
        catch (Excecoes NumberFormatExeption) {
            JOptionPane.showConfirmDialog(rootPane, "O ID deve ser um número inteiro.");
        }
    }

    public void Alterar(){
        try {
            eletronico.setId(Integer.parseInt(jTextField_ID.getText()));
            eletronico.setNome(jTextField_Nome.getText());
            eletronico.setPlataforma(jTextField_Plataforma.getText());
            eletronico.setMarca(jTextField_Marca.getText());
            eletronico.setConectividade(jTextField_Conectividade.getText());
            eletronico.setAvaliacao(Float.parseFloat(jTextField_Avaliacao.getText()));
            eletronico.setQntPlayers(Integer.parseInt(jTextField_QtdJogadores.getText()));
            eletronico.setValor(Float.parseFloat(jTextField_valor.getText()));
        } catch (Excecoes e) {
            
        }       
        eletronico = bdEletronico.Alterar(eletronico);
        if (eletronico != null) {
            JOptionPane.showConfirmDialog(rootPane, "Item atualizado!");
        }
        else {
            JOptionPane.showConfirmDialog(rootPane, "Erro para atualizado!");
        }
        Limpar();
    }
    
    public void Deletar() {
        eletronico = bdEletronico.Deletar(eletronico);
        if(eletronico != null) {
            JOptionPane.showConfirmDialog(rootPane, "Item removido!");
        } else {
            JOptionPane.showConfirmDialog(rootPane, "Item não removido!");
        }
        Limpar();
    }

    public void Limpar(){
        jTextField_ID.setText(null);
        jTextField_Marca.setText(null);
        jTextField_Plataforma.setText(null);
        jTextField_Nome.setText(null);
        jTextField_Conectividade.setText(null);
        jTextField_Avaliacao.setText(null);
        jTextField_QtdJogadores.setText(null);
        jTextField_valor.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JLabel jLabel_Avaliacao;
    private javax.swing.JLabel jLabel_Conectividade;
    private javax.swing.JLabel jLabel_ID;
    private javax.swing.JLabel jLabel_Marca;
    private javax.swing.JLabel jLabel_Nome;
    private javax.swing.JLabel jLabel_Plataforma;
    private javax.swing.JLabel jLabel_QtdJogadores;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Valor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField_Avaliacao;
    private javax.swing.JTextField jTextField_Conectividade;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_Marca;
    private javax.swing.JTextField jTextField_Nome;
    private javax.swing.JTextField jTextField_Plataforma;
    private javax.swing.JTextField jTextField_QtdJogadores;
    private javax.swing.JTextField jTextField_valor;
    // End of variables declaration//GEN-END:variables
}
