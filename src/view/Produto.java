/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.*;
import Banco.Conexao;
import Dao.ProdutoDao;
import javax.swing.JOptionPane;
import model.ProdutosDiversos;


/**
 *
 * @author ADM
 */
public class Produto extends javax.swing.JFrame {
    ProdutoDao proDao = new ProdutoDao();
    ProdutosDiversos prod= new ProdutosDiversos();
    
    
    Connection conexao1=null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public Produto() {
        initComponents();
        conexao1=Conexao.conector();
    }
      
   /*
    private void remover(){
        int confirmar=JOptionPane.showConfirmDialog(null,"Certeza?","Atenção",JOptionPane.YES_NO_OPTION);
            if(confirmar==JOptionPane.YES_OPTION){
                String sql="delete from tbproduto where cod_produto=?";
                try {
                    pst=conexao1.prepareStatement(sql);
                    pst.setString(1,jLabelCodigo_produto.getText());
                    int apagado=pst.executeUpdate();
                                               
                    if(apagado>0){
                        JOptionPane.showMessageDialog(null,"Produto Removido");
                    }
                    jLabelCodigo_produto.setText(null);
                    jTextFieldDescricao_produto.setText(null);
                    jTextFieldCategoria_produto.setText(null);
                    jTextFieldEstoque_produto.setText(null);
                    jTextFieldValor_produto.setText(null);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,e);
                }
                }
    }
    */
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDescricao_produto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCategoria_produto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldEstoque_produto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButtonAlterar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        JTconsulta_codigo = new javax.swing.JTextField();
        jLabelCodigo_produto = new javax.swing.JTextField();
        jTextFieldValor_produto = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel1.setText("Informações Produto");

        jLabel2.setText("Código:");

        jLabel3.setText("Descrição: ");

        jLabel5.setText("Categoria:");

        jLabel6.setText("Valor:");

        jLabel7.setText("Estoque:");

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonConsultar.setText("Consultar Codigo");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        JTconsulta_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTconsulta_codigoActionPerformed(evt);
            }
        });

        jButton2.setText("Listar produtos por nome");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Listar produtos existentes");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldCategoria_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(25, 25, 25)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldEstoque_produto, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(jTextFieldValor_produto))
                                        .addGap(100, 100, 100))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldDescricao_produto, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jLabelCodigo_produto)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonConsultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTconsulta_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(252, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(jButtonAlterar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButtonLimpar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButtonNovo)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButtonExcluir)
                    .addGap(119, 119, 119)
                    .addComponent(jButton1)
                    .addContainerGap(104, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelCodigo_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDescricao_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCategoria_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldValor_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEstoque_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTconsulta_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(0, 81, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(368, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAlterar)
                        .addComponent(jButtonLimpar)
                        .addComponent(jButtonNovo)
                        .addComponent(jButtonExcluir)
                        .addComponent(jButton1))
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        prod.setCod_produto(jLabelCodigo_produto.getText());
        prod.setDescricao_produto(jTextFieldDescricao_produto.getText());
        prod.setCategoria_produto(jTextFieldCategoria_produto.getText());
        prod.setEstoque_produto(Integer.parseInt(jTextFieldEstoque_produto.getText()));
        prod.setValor_produto(Double.parseDouble(jTextFieldValor_produto.getText()));    
        if(proDao.alterar(prod)){
            jLabelCodigo_produto.setText(null);
            jTextFieldDescricao_produto.setText(null);
            jTextFieldCategoria_produto.setText(null);
            jTextFieldEstoque_produto.setText(null);
            jTextFieldValor_produto.setText(null); 
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jLabelCodigo_produto.setText(null);
        jTextFieldDescricao_produto.setText(null);
        jTextFieldCategoria_produto.setText(null);
        jTextFieldEstoque_produto.setText(null);
        jTextFieldValor_produto.setText(null);
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
                prod.setCod_produto(jLabelCodigo_produto.getText());
                prod.setDescricao_produto(jTextFieldDescricao_produto.getText());
                prod.setCategoria_produto(jTextFieldCategoria_produto.getText());
                prod.setEstoque_produto(Integer.parseInt(jTextFieldEstoque_produto.getText()));
                prod.setValor_produto(Double.parseDouble(jTextFieldValor_produto.getText()));                
        if(proDao.adicionar(prod)){
                jLabelCodigo_produto.setText(null);
                jTextFieldDescricao_produto.setText(null);
                jTextFieldCategoria_produto.setText(null);
                jTextFieldEstoque_produto.setText(null);
                jTextFieldValor_produto.setText(null);
       }
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        String campo_pesquisa = JTconsulta_codigo.getText();
        
        if(proDao.remover(campo_pesquisa)){
            jLabelCodigo_produto.setText(null);
            jTextFieldDescricao_produto.setText(null);
            jTextFieldCategoria_produto.setText(null);
            jTextFieldEstoque_produto.setText(null);
            jTextFieldValor_produto.setText(null);
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        //chamando metodo pra consultar
        String pesquisa = JTconsulta_codigo.getText();
        prod=proDao.consultar(pesquisa);
        jLabelCodigo_produto.setText(prod.getCod_produto());
        jTextFieldDescricao_produto.setText(prod.getDescricao_produto());
        jTextFieldCategoria_produto.setText(prod.getCategoria_produto());
        jTextFieldValor_produto.setText(Double.toString(prod.getValor_produto()));
        jTextFieldEstoque_produto.setText(Integer.toString(prod.getEstoque_produto()));
        
        
        
        
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void JTconsulta_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTconsulta_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTconsulta_codigoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       new ListarProdutoNome().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new ListarProdutosExistentes().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTconsulta_codigo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jLabelCodigo_produto;
    private javax.swing.JTextField jTextFieldCategoria_produto;
    private javax.swing.JTextField jTextFieldDescricao_produto;
    private javax.swing.JTextField jTextFieldEstoque_produto;
    private javax.swing.JTextField jTextFieldValor_produto;
    // End of variables declaration//GEN-END:variables
}
