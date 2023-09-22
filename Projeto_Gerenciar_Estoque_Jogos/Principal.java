// Apache NetBeans IDE 18
// Nome: Tiago Eloy Possidonio Pereira - RA: 2417677

import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    private Administrar_Cartas admCarta;
    private Administrar_Eletronico admEletronic;
    private Administrar_Tabuleiro admTabuleiro;
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_GerenciarEstoque = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        jGerenciar = new javax.swing.JMenu();
        jcartas = new javax.swing.JMenuItem();
        jEletronicos = new javax.swing.JMenuItem();
        jtabuleiro = new javax.swing.JMenuItem();
        jsobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrar Estoque");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel_GerenciarEstoque.setFont(new java.awt.Font("Georgia", 0, 48)); // NOI18N
        jLabel_GerenciarEstoque.setText("Gerenciar Estoque");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel_GerenciarEstoque)
                .addContainerGap(204, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jLabel_GerenciarEstoque)
                .addContainerGap(274, Short.MAX_VALUE))
        );

        MenuBar.setPreferredSize(new java.awt.Dimension(150, 30));
        MenuBar.setRequestFocusEnabled(false);

        jGerenciar.setText("Gerenciar");
        jGerenciar.setFocusable(false);
        jGerenciar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jcartas.setText("Jogos de Cartas");
        jcartas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcartasActionPerformed(evt);
            }
        });
        jGerenciar.add(jcartas);

        jEletronicos.setText("Jogos Eletronicos");
        jEletronicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEletronicosActionPerformed(evt);
            }
        });
        jGerenciar.add(jEletronicos);

        jtabuleiro.setText("Jogos de Tabuleiro");
        jtabuleiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtabuleiroActionPerformed(evt);
            }
        });
        jGerenciar.add(jtabuleiro);

        MenuBar.add(jGerenciar);

        jsobre.setText("Sobre");
        jsobre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jsobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jsobreMouseClicked(evt);
            }
        });
        jsobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsobreActionPerformed(evt);
            }
        });
        MenuBar.add(jsobre);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jsobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsobreActionPerformed
        
    }//GEN-LAST:event_jsobreActionPerformed

    private void jcartasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcartasActionPerformed
        admCarta.getAdministrar_Cartas().setVisible(true);
        
    }//GEN-LAST:event_jcartasActionPerformed

    private void jEletronicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEletronicosActionPerformed
        admEletronic.getAdministrar_Eletronico().setVisible(true);
    }//GEN-LAST:event_jEletronicosActionPerformed

    private void jtabuleiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtabuleiroActionPerformed
        admTabuleiro.getAdministrar_Tabuleiro().setVisible(true);
    }//GEN-LAST:event_jtabuleiroActionPerformed

    private void jsobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsobreMouseClicked
        JOptionPane.showMessageDialog(null, "Essa aplicação tem a finalidade de gerenciar o estoque de uma loja de jogos de três tipos: Cartas, tabuleiro e eletronico.\nDesenvolvido pelo aluno: Tiago Eloy Possidonio Pereira / RA: 2417677 ");
    }//GEN-LAST:event_jsobreMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        BancoDeDados_Jogos bd = BancoDeDados_Jogos.getInstance();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem jEletronicos;
    private javax.swing.JMenu jGerenciar;
    private javax.swing.JLabel jLabel_GerenciarEstoque;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jcartas;
    private javax.swing.JMenu jsobre;
    private javax.swing.JMenuItem jtabuleiro;
    // End of variables declaration//GEN-END:variables
}
