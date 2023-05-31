package telas;

import dados.SistemaDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RelatorioUsuarios extends javax.swing.JFrame {

    public RelatorioUsuarios() {
        initComponents();
        try {
            
            ResultSet resultado = SistemaDao.listarUsuarios();
            
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblUsuarios.getModel();
            modeloTabela.setRowCount(0);
            while (resultado.next()) { 
              Object dep[] = {
                resultado.getString("usuario"),
                //resultado.getString("senha"),
                resultado.getString("cargo"),              
              };
              modeloTabela.addRow(dep);
              //cmbCodigo.addItem(resultado.getString("codigo"));
              //cmbCidade.addItem(resultado.getString("Cidade"));
            } 
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        lblUsuario = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        btnPesquisarCargo = new javax.swing.JButton();
        btnPesquisarUsuario = new javax.swing.JButton();

        setTitle("Relatório de Usuários");
        getContentPane().setLayout(null);

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuário", "Cargo"
            }
        ));
        jScrollPane1.setViewportView(tblUsuarios);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 140, 452, 150);

        lblUsuario.setText("Usuário");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(70, 50, 80, 16);

        lblCargo.setText("Cargo");
        getContentPane().add(lblCargo);
        lblCargo.setBounds(70, 90, 40, 16);
        getContentPane().add(txtCargo);
        txtCargo.setBounds(120, 80, 140, 30);

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(120, 42, 140, 30);

        btnPesquisarCargo.setText("Pesquisar");
        btnPesquisarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarCargoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisarCargo);
        btnPesquisarCargo.setBounds(280, 80, 90, 30);

        btnPesquisarUsuario.setText("Pesquisar");
        btnPesquisarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisarUsuario);
        btnPesquisarUsuario.setBounds(280, 40, 90, 30);

        setSize(new java.awt.Dimension(608, 372));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnPesquisarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarUsuarioActionPerformed
        try {
            
            ResultSet resultado = SistemaDao.pesquisarUsuarioPorUsuario(txtUsuario.getText());
            
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblUsuarios.getModel();
            modeloTabela.setRowCount(0);
        while (resultado.next()) { 
              Object dep[] = {
                resultado.getString("usuario"),
                resultado.getString("cargo"),              
              };
              modeloTabela.addRow(dep);
            } 
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnPesquisarUsuarioActionPerformed

    private void btnPesquisarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarCargoActionPerformed
        try {
            
            ResultSet resultado = SistemaDao.pesquisarUsuarioPorCargo(txtCargo.getText());
            
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblUsuarios.getModel();
            modeloTabela.setRowCount(0);
        while (resultado.next()) { 
              Object dep[] = {
                resultado.getString("usuario"),
                resultado.getString("cargo"),              
              };
              modeloTabela.addRow(dep);
            } 
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnPesquisarCargoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisarCargo;
    private javax.swing.JButton btnPesquisarUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
