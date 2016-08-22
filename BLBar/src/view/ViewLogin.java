/**
 * @author  BLSoft
 * www.Blsoft.com.br
 * Venda de software e código fonte
*/
package view;

import controller.ControllerUsuario;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.ModelSessaoUsuario;
import model.ModelUsuario;

public class ViewLogin extends javax.swing.JFrame {
    
    private ModelSessaoUsuario modelSessaoUsuario = new ModelSessaoUsuario();

    public ViewLogin() {

        initComponents();
        setLocationRelativeTo(null);
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jtfSenha = new javax.swing.JPasswordField();
        bEntrar = new javax.swing.JButton();
        bSair = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(153, 255, 153));
        setMaximumSize(new java.awt.Dimension(321, 167));
        setMinimumSize(new java.awt.Dimension(321, 167));
        setResizable(false);

        jLabel2.setText("Usuário:");

        jLabel3.setText("Senha:");

        jtfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSenhaActionPerformed(evt);
            }
        });

        bEntrar.setBackground(new java.awt.Color(153, 255, 153));
        bEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/OK.png"))); // NOI18N
        bEntrar.setText("Entrar");
        bEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEntrarActionPerformed(evt);
            }
        });

        bSair.setBackground(new java.awt.Color(255, 51, 51));
        bSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/No.png"))); // NOI18N
        bSair.setText("Sair");
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/blbar7.png"))); // NOI18N

        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Atualizado em 06/2015");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Versão beta 1.0.1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bSair, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(96, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(16, 16, 16)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(8, 8, 8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEntrar)
                    .addComponent(bSair))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bSairActionPerformed

    private void bEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEntrarActionPerformed
        // TODO add your handling code here:
        autenticar();
    }//GEN-LAST:event_bEntrarActionPerformed

    private void autenticar() {
        ModelUsuario modelUsuario = new ModelUsuario();
        ControllerUsuario controllerUsuario = new ControllerUsuario();
        modelUsuario.setLogin(this.jtfUsuario.getText());
        modelUsuario.setSenha(new String(this.jtfSenha.getPassword()));
       
        if (controllerUsuario.getUsuarioController(modelUsuario)) {
            modelUsuario = controllerUsuario.getUsuarioController(modelUsuario.getLogin());
            modelSessaoUsuario.nome = modelUsuario.getNome();
            modelSessaoUsuario.codigo = modelUsuario.getCodigo();
            modelSessaoUsuario.login = modelUsuario.getLogin();
            
            ViewiPrincipal viewPrincipal = new ViewiPrincipal();
            viewPrincipal.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuário/Senha inválida.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }
    private void jtfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSenhaActionPerformed
        // TODO add your handling code here:
        autenticar();
    }//GEN-LAST:event_jtfSenhaActionPerformed

        public static void main(String args[]) {         
            
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                //começa o look aqui
                LookAndFeel lf = UIManager.getLookAndFeel();

                try {

                    for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                            UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }

                } catch (UnsupportedLookAndFeelException exc) {
                } catch (ClassNotFoundException exc) {
                } catch (InstantiationException exc) {
                } catch (IllegalAccessException exc) {
                }

                UIManager.put("nimbusBase", new Color(80, 100, 242));

                UIManager.put("nimbusBlueGrey", new Color(190, 189, 170));

                UIManager.put("control", new Color(242, 242, 242));
                //temina o look aqui
                new ViewLogin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEntrar;
    private javax.swing.JButton bSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jtfSenha;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables


}
