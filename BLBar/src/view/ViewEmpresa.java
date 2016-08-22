/*
 * ViewClientes.java
 *
 */

package view;

import controller.ControllerCidade;
import controller.ControllerEmpresa;
import controller.ControllerEmpresaCidadeEstado;
import controller.ControllerEstado;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelCidade;
import model.ModelEmpresa;
import model.ModelEmpresaCidadeEstado;
import model.ModelEstado;
import util.BLTiraAcentos;

/**
 * @author  BLSoft
 * www.Blsoft.com.br
 * Venda de software e código fonte
 */
public class ViewEmpresa extends javax.swing.JFrame {
    
    ModelEmpresa modelEmpresa = new ModelEmpresa();
    ControllerEmpresa controllerEmpresa = new ControllerEmpresa();
    ControllerEstado controllerEstado = new ControllerEstado();
    ControllerCidade controllerCidade = new ControllerCidade();
    ControllerEmpresaCidadeEstado controllerEmpresaCidadeEstado = new ControllerEmpresaCidadeEstado();
    ArrayList<ModelCidade> listaModelCidades = new ArrayList<>();
    ArrayList<ModelEstado> listaModelEstados = new ArrayList<>();
    ArrayList<ModelEmpresa> listaModelEmpresas = new ArrayList<>();
    ArrayList<ModelEmpresaCidadeEstado> listaEmpresaCidadeEstados = new ArrayList<>();
    ModelEmpresaCidadeEstado modelEmpresaCidadeEstado = new ModelEmpresaCidadeEstado();
    
    /** Creates new form Empresas */
    public ViewEmpresa() {
        initComponents();
        setLocationRelativeTo(null);
        this.carregarEmpresa();
        this.listarEstados();
        this.listarCidades();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfNomeFantasia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfEndereco = new javax.swing.JTextField();
        tfBairro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfCep = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btAlterar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEmpresa = new javax.swing.JTable();
        tfCodigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox();
        cbCidade = new javax.swing.JComboBox();
        btNovaCidade = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        tfRazaoSocial = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfLogomarca = new javax.swing.JTextField();
        btLocalizarImagem = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        tfCNPJ = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Empresa");
        setResizable(false);

        jLabel1.setText("Nome fantasia:");

        tfNomeFantasia.setEditable(false);
        tfNomeFantasia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNomeFantasiaFocusLost(evt);
            }
        });

        jLabel2.setText("Endereço:");

        tfEndereco.setEditable(false);

        tfBairro.setEditable(false);

        jLabel3.setText("Bairro:");

        jLabel4.setText("Cidade:");

        jLabel5.setText("UF:");

        jLabel6.setText("CEP:");

        tfCep.setEditable(false);

        tfTelefone.setEditable(false);

        jLabel7.setText("Telefone:");

        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Modify.png"))); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/No.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Save.png"))); // NOI18N
        btSalvar.setText("Salvar alteração");
        btSalvar.setEnabled(false);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        tblEmpresa.setAutoCreateRowSorter(true);
        tblEmpresa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Cidade", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmpresa.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblEmpresa.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblEmpresa);
        if (tblEmpresa.getColumnModel().getColumnCount() > 0) {
            tblEmpresa.getColumnModel().getColumn(1).setPreferredWidth(250);
            tblEmpresa.getColumnModel().getColumn(2).setMinWidth(150);
            tblEmpresa.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblEmpresa.getColumnModel().getColumn(3).setMinWidth(150);
            tblEmpresa.getColumnModel().getColumn(3).setPreferredWidth(150);
        }

        tfCodigo.setEditable(false);
        tfCodigo.setEnabled(false);

        jLabel8.setText("Código:");

        cbEstado.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbEstadoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        btNovaCidade.setText("+");
        btNovaCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovaCidadeActionPerformed(evt);
            }
        });

        jLabel9.setText("Razão social:");

        tfRazaoSocial.setEditable(false);

        jLabel10.setText("Logomarca:");

        tfLogomarca.setEditable(false);
        tfLogomarca.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfLogomarca.setForeground(new java.awt.Color(255, 0, 0));
        tfLogomarca.setText("TAMANHO IDEAL 323X80");

        btLocalizarImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Find.png"))); // NOI18N
        btLocalizarImagem.setText("Localizar Logo");
        btLocalizarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLocalizarImagemActionPerformed(evt);
            }
        });

        jLabel11.setText("CNPJ");

        tfCNPJ.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(tfBairro))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(cbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btNovaCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(btCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btSalvar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(221, 221, 221)
                                        .addComponent(jLabel3)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(tfLogomarca, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(btLocalizarImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(tfNomeFantasia)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCNPJ))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addGap(197, 197, 197)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btNovaCidade)))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfLogomarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLocalizarImagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterar)
                    .addComponent(btCancelar)
                    .addComponent(btSalvar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.desabilitarCampos();
    }//GEN-LAST:event_btCancelarActionPerformed
    
    /**
     * Preencher combobox estados
     */
    private void listarEstados(){
        listaModelEstados = controllerEstado.getListaEstadoController();
        cbEstado.removeAllItems();
        for (int i = 0; i < listaModelEstados.size(); i++){
            cbEstado.addItem(listaModelEstados.get(i).getUf());
        }
    }
    /**
     * Preencher combobox cidades
     */
    private void listarCidades(){
        listaModelCidades = controllerCidade.getListaCidadePorEstadoController(controllerEstado.getEstadoUFController(this.cbEstado.getSelectedItem().toString()).getCodigo());
        cbCidade.removeAllItems();
        for (int i = 0; i < listaModelCidades.size(); i++){
            cbCidade.addItem(listaModelCidades.get(i).getNome());
        }
    }
    
    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        novo();
        habilitarCampos();
        recuperarEmpresa();
    }//GEN-LAST:event_btAlterarActionPerformed
    
    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
       alterarEmpresa();
    }//GEN-LAST:event_btSalvarActionPerformed
    
    private boolean alterarEmpresa() {
        modelEmpresa.setCodigo(Integer.parseInt(this.tfCodigo.getText()));
        modelEmpresa.setNomeFantasia(this.tfNomeFantasia.getText());
        modelEmpresa.setRazaoSocial(this.tfRazaoSocial.getText());
        modelEmpresa.setCnpj(this.tfCNPJ.getText());
        modelEmpresa.setEndereco(this.tfEndereco.getText());
        modelEmpresa.setBairro(this.tfBairro.getText());
        modelEmpresa.setCodCidade(controllerCidade.getCidadeController(this.cbCidade.getSelectedItem().toString()).getCodigo());
        modelEmpresa.setCodEstado(controllerEstado.getEstadoUFController(this.cbEstado.getSelectedItem().toString()).getCodigo());
        modelEmpresa.setCep(this.tfCep.getText());
        modelEmpresa.setTelefone(this.tfTelefone.getText());

        //alterar 
        if (controllerEmpresa.atualizarEmpresaController(modelEmpresa)) {
            JOptionPane.showMessageDialog(this, "Registro alterado com sucesso!");
            this.desabilitarCampos();
            this.carregarEmpresa();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    
    private boolean recuperarEmpresa() {
        //pega o codigo da linha selecionada
        int codigo = (Integer) tblEmpresa.getValueAt(0, 0);

        try {
            //recupera os dados do banco
            modelEmpresa = controllerEmpresa.getEmpresaController(codigo);
            //seta os dados na interface
            this.tfCodigo.setText(String.valueOf(modelEmpresa.getCodigo()));
            this.tfNomeFantasia.setText(modelEmpresa.getNomeFantasia());
            this.tfRazaoSocial.setText(modelEmpresa.getRazaoSocial());
            this.tfEndereco.setText(modelEmpresa.getEndereco());
            this.tfBairro.setText(modelEmpresa.getBairro());
            this.cbEstado.setSelectedItem(controllerEstado.getEstadoController(modelEmpresa.getCodEstado()).getUf());
            this.listarCidades();
            this.cbCidade.setSelectedItem(controllerCidade.getCidadeController(modelEmpresa.getCodCidade()).getNome());
            this.tfCep.setText(modelEmpresa.getCep());
            this.tfTelefone.setText(modelEmpresa.getTelefone());
            this.tfCNPJ.setText(modelEmpresa.getCnpj());
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }
    
     private void carregarEmpresa() {
        modelEmpresaCidadeEstado = controllerEmpresaCidadeEstado.getEmpresaCidadeEstadoController(1);
        DefaultTableModel modelo = (DefaultTableModel) tblEmpresa.getModel();
        modelo.setNumRows(0);
        //CARREGA OS DADOS DA LISTA NA TABELA
            modelo.addRow(new Object[]{
                modelEmpresaCidadeEstado.getModelEmpresa().getCodigo(),
                modelEmpresaCidadeEstado.getModelEmpresa().getNomeFantasia(),
                modelEmpresaCidadeEstado.getModelCidade().getNome(),
                modelEmpresaCidadeEstado.getModelEstado().getUf()
            });
    }
    
    private void novo(){
        habilitarCampos();
        tfCodigo.setText("Novo");
        tfNomeFantasia.setText("");
        tfRazaoSocial.setText("");
        tfEndereco.setText("");
        tfBairro.setText("");
        tfCep.setText("");
        tfTelefone.setText("");
        tfCNPJ.setText("");
    }
    
    protected boolean verificarCampos(){
        if (!tfNomeFantasia.getText().trim().equals("")){
            return true;
        }
        return false;
    }
    
    private void habilitarCampos(){
        tfNomeFantasia.setEditable(true);
        tfRazaoSocial.setEditable(true);
        tfEndereco.setEditable(true);
        tfBairro.setEditable(true);
        cbCidade.setEnabled(true);
        tfCep.setEditable(true);
        cbEstado.setEnabled(true);
        tfTelefone.setEditable(true);
        tfCNPJ.setEditable(true);
        btSalvar.setEnabled(true);
    }
    
    protected void desabilitarCampos(){
        tfNomeFantasia.setEditable(false);
        tfRazaoSocial.setEditable(true);
        tfEndereco.setEditable(false);
        tfBairro.setEditable(false);
        cbCidade.setEnabled(false);
        tfCep.setEditable(false);
        cbEstado.setEnabled(false);
        tfTelefone.setEditable(false);
        tfCNPJ.setEditable(false);
        btSalvar.setEnabled(false);
        tfCodigo.setText("");
        tfNomeFantasia.setText("");
        tfRazaoSocial.setText("");
        tfEndereco.setText("");
        tfBairro.setText("");
        tfCep.setText("");
        tfTelefone.setText("");
        tfCNPJ.setText("");
    }
    
            
    private void tfNomeFantasiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNomeFantasiaFocusLost
        // converte em maiusculo o que o usuario digitar
        this.tfNomeFantasia.setText(tfNomeFantasia.getText().toUpperCase());
        //tira acentos
        BLTiraAcentos blTiraAcentos = new BLTiraAcentos();
        this.tfNomeFantasia.setText(blTiraAcentos.TiraAcentos(tfNomeFantasia.getText()));
    }//GEN-LAST:event_tfNomeFantasiaFocusLost

    private void cbEstadoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbEstadoPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        if (this.cbEstado.isPopupVisible()) {
            listarCidades();
        }
    }//GEN-LAST:event_cbEstadoPopupMenuWillBecomeInvisible

    private void btNovaCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovaCidadeActionPerformed
        // TODO add your handling code here:
        new ViewCidade().setVisible(true);
    }//GEN-LAST:event_btNovaCidadeActionPerformed

    private void btLocalizarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLocalizarImagemActionPerformed
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(btLocalizarImagem);
            File file = chooser.getSelectedFile();

            String l = file.getAbsolutePath();
            //caminho da imagem e nome
            String caminhoImagem = "C:/BLVendasPdvMySQL/src/imagens/processimg.png";

            FileInputStream fisDe = new FileInputStream(l);
            FileOutputStream fisPara = new FileOutputStream(caminhoImagem);

            FileChannel fcPara = fisDe.getChannel();
            FileChannel fcDe = fisPara.getChannel();
            tfLogomarca.setText(caminhoImagem);

            if (fcPara.transferTo(0, fcPara.size(), fcDe) == 0L) {
                fcPara.close();
                fcDe.close();
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_btLocalizarImagemActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEmpresa().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btLocalizarImagem;
    private javax.swing.JButton btNovaCidade;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbCidade;
    private javax.swing.JComboBox cbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblEmpresa;
    protected javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCNPJ;
    protected javax.swing.JTextField tfCep;
    private javax.swing.JTextField tfCodigo;
    protected javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfLogomarca;
    protected javax.swing.JTextField tfNomeFantasia;
    private javax.swing.JTextField tfRazaoSocial;
    protected javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
    
}