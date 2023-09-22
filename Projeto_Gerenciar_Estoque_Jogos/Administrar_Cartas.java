// Nome: Tiago Eloy Possidonio Pereira - RA: 2417677

import javax.swing.JOptionPane;

public class Administrar_Cartas extends javax.swing.JFrame {
    
    private BancoDeDados_Jogos bdCartas = BancoDeDados_Jogos.getInstance();
    private Jogo_Cartas cartas = new Jogo_Cartas();;
    private boolean verificador = true;
    private static Administrar_Cartas instancia;
    
    private Administrar_Cartas() {
        initComponents();
    }
    
    public static Administrar_Cartas getAdministrar_Cartas() {
        if(instancia == null) {
            instancia = new Administrar_Cartas(); 
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
        jTextField_Material = new javax.swing.JTextField();
        jLabel_Material = new javax.swing.JLabel();
        jTextField_QtdBaralhos = new javax.swing.JTextField();
        jLabel_QtdBaralhos = new javax.swing.JLabel();
        jLabel_QtdCartas = new javax.swing.JLabel();
        jTextField_QtdCartas = new javax.swing.JTextField();
        jLabel_valor = new javax.swing.JLabel();
        jTextField_valor = new javax.swing.JTextField();
        jButtonConsultar = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrar Jogos de Cartas");

        jLabel_Titulo.setFont(new java.awt.Font("Segoe UI", 0, 38)); // NOI18N
        jLabel_Titulo.setText("Jogos de Cartas");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel_ID.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel_ID.setText("ID:");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel_Nome.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel_Nome.setText("Nome.......:");

        jLabel_Marca.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel_Marca.setText("Marca......:");

        jLabel_QtdJogadores.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel_QtdJogadores.setText("Qtd. de Jogadores.:");

        jLabel_Material.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel_Material.setText("Material..:");

        jLabel_QtdBaralhos.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel_QtdBaralhos.setText("Qtd. de Baralhos...:");

        jLabel_QtdCartas.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel_QtdCartas.setText("Qtd. de Cartas........:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
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
                        .addComponent(jLabel_Material)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Material, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_QtdJogadores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_QtdJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_QtdBaralhos)
                            .addComponent(jLabel_QtdCartas))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_QtdCartas, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_QtdBaralhos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(83, 83, 83))
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
                        .addComponent(jLabel_QtdCartas)
                        .addComponent(jTextField_QtdCartas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_Marca)
                        .addComponent(jTextField_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_QtdBaralhos)
                        .addComponent(jTextField_QtdBaralhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Material)
                    .addComponent(jTextField_Material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_QtdJogadores)
                    .addComponent(jTextField_QtdJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        jLabel_valor.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel_valor.setText("R$:");

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
                .addComponent(jLabel_valor)
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
                    .addComponent(jLabel_valor))
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
                .addGap(98, 98, 98)
                .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        Consultar(cartas);
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        Cadastrar();
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        Deletar();
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        Alterar(); 
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    public void Cadastrar(){
        verificador = true;
        System.out.println(bdCartas);
        while (verificador==true) {
            try {
                cartas.setId(Integer.parseInt(jTextField_ID.getText()));
            }
            catch (Excecoes e) {
                e.ID_vazio();
                break;
            }
            try {
                cartas.setNome(jTextField_Nome.getText());
            }
            catch (Excecoes e) {
                e.ID_vazio();
                break;
            }
            try {
                cartas.setQntCartas(Integer.parseInt(jTextField_QtdCartas.getText()));
            } catch(Excecoes e) {
                e.valor_invalido();
                break;
            }     
            try {
                cartas.setMarca(jTextField_Marca.getText());
            } catch (Excecoes e) {
                e.Marca_vazio();
                break;
            } 
            try {
                cartas.setQntBaralho(Integer.parseInt(jTextField_QtdBaralhos.getText()));
            } catch(Excecoes e){
                 e.valor_invalido();
                 break;
            }
            try {
                cartas.setMaterial(jTextField_Material.getText());
            } catch (Excecoes e) {
                e.nome_vazio();
                break;
            }
            try {
                cartas.setQntPlayers(Integer.parseInt(jTextField_QtdJogadores.getText()));

            } catch (Excecoes e) {
                e.qtd_min_jogadores();
                break;
            }
            try {
                cartas.setValor(Float.parseFloat(jTextField_valor.getText()));
                cartas.adicionar_lucro();
            } catch (Excecoes e) {
                e.valor_invalido();
                break;
            }
            cartas = bdCartas.Cadastrar(cartas);
            if(cartas != null) {
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
    
    public void Consultar(Jogo_Cartas cartas){
        try {
            cartas.setId(Integer.parseInt(jTextField_ID.getText()));
            cartas = bdCartas.Consultar(cartas);
            if(cartas != null) {
            jTextField_ID.setText(Integer.toString(cartas.getId()));
            jTextField_Marca.setText(cartas.getMarca());
            jTextField_Material.setText(cartas.getMaterial());
            jTextField_Nome.setText(cartas.getNome());
            jTextField_QtdBaralhos.setText(Integer.toString(cartas.getQntBaralho()));
            jTextField_QtdCartas.setText(Integer.toString(cartas.getQntCartas()));
            jTextField_QtdJogadores.setText(Integer.toString(cartas.getQntPlayers()));
            jTextField_valor.setText(String.valueOf(cartas.getValor()));
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
            cartas.setId(Integer.parseInt(jTextField_ID.getText()));
            cartas.setNome(jTextField_Nome.getText());
            cartas.setQntCartas(Integer.parseInt(jTextField_QtdCartas.getText()));
            cartas.setMarca(jTextField_Marca.getText());
            cartas.setQntBaralho(Integer.parseInt(jTextField_QtdBaralhos.getText()));
            cartas.setMaterial(jTextField_Material.getText());
            cartas.setQntPlayers(Integer.parseInt(jTextField_QtdJogadores.getText()));
            cartas.setValor(Float.parseFloat(jTextField_valor.getText()));
        } catch (Excecoes e) {
            
        }       
        cartas = bdCartas.Alterar(cartas);
        if (cartas != null) {
            JOptionPane.showConfirmDialog(rootPane, "Item atualizado!");
        }
        else {
            JOptionPane.showConfirmDialog(rootPane, "Erro para atualizado!");
        }
        Limpar();
    }
    
    public void Deletar() {
        cartas = bdCartas.Deletar(cartas);
        if(cartas != null) {
            JOptionPane.showConfirmDialog(rootPane, "Item removido!");
        } else {
            JOptionPane.showConfirmDialog(rootPane, "Item não removido!");
        }
        Limpar();
    }
    
    public void Limpar(){
        jTextField_ID.requestFocus();
        jTextField_ID.setText(null);
        jTextField_Marca.setText(null);
        jTextField_Material.setText(null);
        jTextField_Nome.setText(null);
        jTextField_QtdBaralhos.setText(null);
        jTextField_QtdCartas.setText(null);
        jTextField_QtdJogadores.setText(null);
        jTextField_valor.setText(null) ;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JLabel jLabel_ID;
    private javax.swing.JLabel jLabel_Marca;
    private javax.swing.JLabel jLabel_Material;
    private javax.swing.JLabel jLabel_Nome;
    private javax.swing.JLabel jLabel_QtdBaralhos;
    private javax.swing.JLabel jLabel_QtdCartas;
    private javax.swing.JLabel jLabel_QtdJogadores;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_valor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_Marca;
    private javax.swing.JTextField jTextField_Material;
    private javax.swing.JTextField jTextField_Nome;
    private javax.swing.JTextField jTextField_QtdBaralhos;
    private javax.swing.JTextField jTextField_QtdCartas;
    private javax.swing.JTextField jTextField_QtdJogadores;
    private javax.swing.JTextField jTextField_valor;
    // End of variables declaration//GEN-END:variables
}
