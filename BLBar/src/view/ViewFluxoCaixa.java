/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import controller.ControllerCliente;
import controller.ControllerContaPagar;
import controller.ControllerContaReceber;
import controller.ControllerFormaPagamento;
import controller.ControllerFornecedor;
import controller.ControllerVendas;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.ModelCliente;
import model.ModelContaPagar;
import model.ModelContaReceber;
import model.ModelFormaPagamento;
import model.ModelFornecedor;
import model.ModelVendas;
import util.BLDatas;
import util.BLMascaras;

/**
 *
 * @author Administrador
 */
public class ViewFluxoCaixa extends javax.swing.JFrame {

    ModelContaPagar modelContasPagar = new ModelContaPagar();
    ModelContaReceber modelContasReceber = new ModelContaReceber();
    ControllerCliente controllerCliente = new ControllerCliente();
    ControllerFornecedor controllerFornecedor = new ControllerFornecedor();
    ArrayList<ModelContaPagar> listaModelContasPagar = new ArrayList<>();
    ArrayList<ModelContaReceber> listaModelContasReceber = new ArrayList<>();
    ControllerContaPagar controllerContasPagar = new ControllerContaPagar();
    ControllerContaReceber controllerContaReceber = new ControllerContaReceber();
    ControllerFormaPagamento controllerTipoPagamento = new ControllerFormaPagamento();
    ArrayList<ModelFormaPagamento> listaModelTipoPagamentos = new ArrayList<>();
    ArrayList<ModelCliente> listaModelClientes = new ArrayList<>();
    ArrayList<ModelFornecedor> listaFornecedor = new ArrayList<>();
    ControllerVendas controllerVendas = new ControllerVendas();
    ArrayList<ModelVendas> listaModelVendas = new ArrayList<>();
    BLMascaras bLMascaras = new BLMascaras();
    
    /**
     * Creates new form ViewFluxoCaixa
     */
    public ViewFluxoCaixa() {
        initComponents();
        setLocationRelativeTo(null);
        //pega a data de hoje
        this.jdDataDia.setDate(new java.util.Date());
        carregarContas();
        somaEAtualizaValorTotal();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tbFluxoCaixa = new javax.swing.JTable();
        jbVisualizarConta = new javax.swing.JButton();
        jbCancelar2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jlDebito = new javax.swing.JLabel();
        jlCredito = new javax.swing.JLabel();
        jlSaldoTotalCaixa = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jdDataDia = new com.toedter.calendar.JDateChooser();
        jbAtualizar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fluxo de caixa");
        setResizable(false);

        tbFluxoCaixa.setAutoCreateRowSorter(true);
        tbFluxoCaixa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Cliente", "Data", "Vencimento", "Valor", "Tipo", "Forma de pagamento", "Tipo C/V"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbFluxoCaixa.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbFluxoCaixa.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbFluxoCaixa);
        if (tbFluxoCaixa.getColumnModel().getColumnCount() > 0) {
            tbFluxoCaixa.getColumnModel().getColumn(0).setMinWidth(70);
            tbFluxoCaixa.getColumnModel().getColumn(0).setPreferredWidth(70);
            tbFluxoCaixa.getColumnModel().getColumn(0).setMaxWidth(70);
            tbFluxoCaixa.getColumnModel().getColumn(1).setMinWidth(200);
            tbFluxoCaixa.getColumnModel().getColumn(1).setPreferredWidth(200);
            tbFluxoCaixa.getColumnModel().getColumn(2).setMinWidth(200);
            tbFluxoCaixa.getColumnModel().getColumn(2).setPreferredWidth(200);
            tbFluxoCaixa.getColumnModel().getColumn(6).setMinWidth(100);
            tbFluxoCaixa.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        jbVisualizarConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Report.png"))); // NOI18N
        jbVisualizarConta.setText("Visualizar conta");
        jbVisualizarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVisualizarContaActionPerformed(evt);
            }
        });

        jbCancelar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/No.png"))); // NOI18N
        jbCancelar2.setText("Cancelar");
        jbCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelar2ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(102, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setText("Total Debito:");

        jLabel10.setText("Total Credito:");

        jLabel11.setText("Saldo do dia:");

        jLabel12.setText("R$");

        jLabel13.setText("R$");

        jLabel14.setText("R$");

        jlDebito.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jlDebito.setText("jLabel7");

        jlCredito.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jlCredito.setText("jLabel8");

        jlSaldoTotalCaixa.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jlSaldoTotalCaixa.setText("jLabel9");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlSaldoTotalCaixa))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(26, 26, 26))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(30, 30, 30)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlDebito))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCredito)))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(jlDebito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13)
                    .addComponent(jlCredito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(jlSaldoTotalCaixa))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel3.setText("Selecione o dia:");

        jdDataDia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jdDataDiaFocusLost(evt);
            }
        });

        jbAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Refresh.png"))); // NOI18N
        jbAtualizar.setText("Atualizar");
        jbAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarActionPerformed(evt);
            }
        });

        jButton1.setText("Definir pela data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jdDataDia, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbCancelar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbVisualizarConta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdDataDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbVisualizarConta)
                        .addComponent(jbAtualizar)
                        .addComponent(jbCancelar2))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVisualizarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVisualizarContaActionPerformed
        int linha = tbFluxoCaixa.getSelectedRow();
        int codigo = (int) tbFluxoCaixa.getValueAt(linha, 0);
        String tipo = (String) tbFluxoCaixa.getValueAt(linha, 6);
        String tipoCV = (String) tbFluxoCaixa.getValueAt(linha, 8);
        if (tipoCV.equals("VENDA")) {
            controllerContasPagar.gerarRelatorioContaVenda(codigo);
        } else {
            if (tipo.equals("DÉBITO")) {
                controllerContasPagar.gerarRelatorioContaPagar(codigo);
            } else if (tipo.equals("CRÉDITO")) {
                controllerContaReceber.gerarRelatorioContaReceber(codigo);
            }
        }
    }//GEN-LAST:event_jbVisualizarContaActionPerformed

    private void jbCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelar2ActionPerformed
        // TODO add your handling code here:
        this.jdDataDia.setDate(new java.util.Date());
        carregarContas();
    }//GEN-LAST:event_jbCancelar2ActionPerformed

    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed
        // TODO add your handling code here:
        carregarContas();
        somaEAtualizaValorTotal();
    }//GEN-LAST:event_jbAtualizarActionPerformed

    private void jdDataDiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jdDataDiaFocusLost
        // TODO add your handling code here:
        carregarContas();
        somaEAtualizaValorTotal();
    }//GEN-LAST:event_jdDataDiaFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        carregarContas();
        somaEAtualizaValorTotal();
    }//GEN-LAST:event_jButton1ActionPerformed
    
     private void carregarContas() {
        BLDatas bl = new BLDatas();
        ModelVendas modelVendas = new ModelVendas();
        DefaultTableModel modelo = (DefaultTableModel) tbFluxoCaixa.getModel();
        //seta situação 1 como paga
        modelContasPagar.setSituacao(1);
        try {
            modelContasPagar.setPagamento(bl.converterDataParaDateUS(jdDataDia.getDate()));
            modelVendas.setDataVenda(bl.converterDataParaDateUS(jdDataDia.getDate()));
        } catch (Exception ex) {
            Logger.getLogger(ViewFluxoCaixa.class.getName()).log(Level.SEVERE, null, ex);
        }
        listaModelContasPagar = controllerContasPagar.getListaContasController(modelContasPagar);
        listaModelVendas = controllerVendas.getListaPedidosController(modelVendas);
        modelo.setNumRows(0);
        String nomePessoa, tipoPagamento = "";
        //CARREGA OS DADOS DA LISTA NA TABELA as contas a pagar
        int contPagar = listaModelContasPagar.size();
        for (int i = 0; i < contPagar; i++) {
            nomePessoa = controllerFornecedor.getFornecedorController(listaModelContasPagar.get(i).getCodigoPessoa()).getNome();                
            tipoPagamento = controllerTipoPagamento.getFormaPagamentoController(listaModelContasPagar.get(i).getTipoPagamento()).getDescricao();
            
            modelo.addRow(new Object[]{
                listaModelContasPagar.get(i).getCodigo(),
                listaModelContasPagar.get(i).getDescricao(),
                nomePessoa,
                listaModelContasPagar.get(i).getData(),
                listaModelContasPagar.get(i).getVencimento(),
                listaModelContasPagar.get(i).getValor(),
                "DÉBITO",
                tipoPagamento,
                "CONTA"
            });
        }
        
        
        modelContasReceber.setSituacao(1);
        try {
            modelContasReceber.setPagamento(bl.converterDataParaDateUS(jdDataDia.getDate()));
        } catch (Exception ex) {
            Logger.getLogger(ViewFluxoCaixa.class.getName()).log(Level.SEVERE, null, ex);
        }
        listaModelContasReceber = controllerContaReceber.getListaContasController(modelContasReceber);
        //CARREGA OS DADOS DA LISTA NA TABELA as contas receber
        int contReceber = listaModelContasReceber.size();
        for (int i = 0; i < contReceber; i++) {
            nomePessoa = controllerCliente.getClienteController(listaModelContasReceber.get(i).getCodigoPessoa()).getNome();                
            tipoPagamento = controllerTipoPagamento.getFormaPagamentoController(listaModelContasReceber.get(i).getTipoPagamento()).getDescricao();
            modelo.addRow(new Object[]{
                listaModelContasReceber.get(i).getCodigo(),
                listaModelContasReceber.get(i).getDescricao(),
                nomePessoa,
                listaModelContasReceber.get(i).getData(),
                listaModelContasReceber.get(i).getVencimento(),
                listaModelContasReceber.get(i).getValor(),
                "CRÉDITO",
                tipoPagamento,
                "CONTA"
            });
        }
        
        
        //CARREGA OS DADOS DA LISTA NA TABELA as vendas
        int cont2 = listaModelVendas.size();
        for (int i = 0; i < cont2; i++) {
            nomePessoa = controllerCliente.getClienteController(listaModelVendas.get(i).getClientesCodigo()).getNome();
            tipoPagamento = controllerTipoPagamento.getFormaPagamentoController(listaModelVendas.get(i).getTipoPagamento()).getDescricao();
            modelo.addRow(new Object[]{
                listaModelVendas.get(i).getCodigo(),
                "VENDA DE PRODUTO NO CAIXA",
                nomePessoa,
                listaModelVendas.get(i).getDataVenda(),
                listaModelVendas.get(i).getDataVenda(),
                listaModelVendas.get(i).getValorTotal(),
                "CRÉDITO",
                tipoPagamento,
                "VENDA"
            });
        }
    }
        
    /**
     * Soma e atualiza os valores total
     *
     * @return
     */
    private void somaEAtualizaValorTotal() {
        float totalPagar = 0;
        float totalReceber = 0;
        float valorPagar = 0;
        float valorReceber = 0;
        int cont = tbFluxoCaixa.getRowCount();
        for (int i = 0; i < cont; i++) {
            if (tbFluxoCaixa.getValueAt(i, 6).equals("DÉBITO")) {
                valorPagar = Float.parseFloat(String.valueOf(tbFluxoCaixa.getValueAt(i, 5)));
                totalPagar = valorPagar + totalPagar;
            } else {
                valorReceber = Float.parseFloat(String.valueOf(tbFluxoCaixa.getValueAt(i, 5)));
                totalReceber = valorReceber + totalReceber;
            }
        }
       jlDebito.setText(bLMascaras.arredondamentoComPontoDuasCasasString(totalPagar));
       jlCredito.setText(bLMascaras.arredondamentoComPontoDuasCasasString(totalReceber));
       jlSaldoTotalCaixa.setText(bLMascaras.arredondamentoComPontoDuasCasasString(totalReceber - totalPagar));
    }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewFluxoCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFluxoCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFluxoCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFluxoCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFluxoCaixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbCancelar2;
    private javax.swing.JButton jbVisualizarConta;
    private com.toedter.calendar.JDateChooser jdDataDia;
    private static javax.swing.JLabel jlCredito;
    private static javax.swing.JLabel jlDebito;
    private static javax.swing.JLabel jlSaldoTotalCaixa;
    private javax.swing.JTable tbFluxoCaixa;
    // End of variables declaration//GEN-END:variables
}