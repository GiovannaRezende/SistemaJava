package telas;

import dados.SistemaDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RelatorioFuncionarios extends javax.swing.JFrame {

    public RelatorioFuncionarios() {
        initComponents();
        try {
            
            ResultSet resultado = SistemaDao.listarFuncionarios();

            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblFuncionarios.getModel();
            modeloTabela.setRowCount(0);
            while (resultado.next()) { 
              Object dep[] = {
                resultado.getString("matricula"),
                resultado.getString("nome"),
                resultado.getString("cargo"),
                resultado.getString("salario")                
              };
              modeloTabela.addRow(dep);
              cmbMatricula.addItem(resultado.getString("matricula"));
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
        tblFuncionarios = new javax.swing.JTable();
        lblMatricula = new javax.swing.JLabel();
        cmbMatricula = new javax.swing.JComboBox<>();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        lblCargo = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        btnPesquisarCargo = new javax.swing.JButton();

        setTitle("Relatório de Funcionários");
        getContentPane().setLayout(null);

        tblFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Nome", "Cargo", "Salário"
            }
        ));
        jScrollPane1.setViewportView(tblFuncionarios);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 110, 460, 210);

        lblMatricula.setText("Matrícula");
        getContentPane().add(lblMatricula);
        lblMatricula.setBounds(70, 40, 60, 16);

        cmbMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMatriculaActionPerformed(evt);
            }
        });
        getContentPane().add(cmbMatricula);
        cmbMatricula.setBounds(130, 30, 100, 30);

        lblNome.setText("Nome");
        getContentPane().add(lblNome);
        lblNome.setBounds(260, 40, 33, 16);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(300, 30, 120, 30);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(440, 30, 90, 30);

        lblCargo.setText("Cargo");
        getContentPane().add(lblCargo);
        lblCargo.setBounds(260, 80, 37, 16);
        getContentPane().add(txtCargo);
        txtCargo.setBounds(300, 70, 120, 30);

        btnPesquisarCargo.setText("Pesquisar");
        btnPesquisarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarCargoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisarCargo);
        btnPesquisarCargo.setBounds(440, 70, 90, 30);

        setSize(new java.awt.Dimension(611, 385));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
          try {

            ResultSet resultado = SistemaDao.pesquisarFuncionarioPorNome(txtNome.getText());  
              
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblFuncionarios.getModel();
            modeloTabela.setRowCount(0);
        while (resultado.next()) { 
              Object dep[] = {
                resultado.getString("matricula"),
                resultado.getString("nome"),
                resultado.getString("cargo"),
                resultado.getString("salario")                
              };
              modeloTabela.addRow(dep);
            } 
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void cmbMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMatriculaActionPerformed
        try {
            
            ResultSet resultado = SistemaDao.pesquisarFuncionarioPorMatricula(cmbMatricula.getSelectedItem().toString());

            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblFuncionarios.getModel();
            modeloTabela.setRowCount(0);
        while (resultado.next()) { 
              Object dep[] = {
                resultado.getString("matricula"),
                resultado.getString("nome"),
                resultado.getString("cargo"),
                resultado.getString("salario")                
              };
              modeloTabela.addRow(dep);
            } 
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_cmbMatriculaActionPerformed

    private void btnPesquisarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarCargoActionPerformed
        try {
            
            ResultSet resultado = SistemaDao.pesquisarFuncionarioPorCargo(txtCargo.getText());
            
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblFuncionarios.getModel();
            modeloTabela.setRowCount(0);
        while (resultado.next()) { 
              Object dep[] = {
                resultado.getString("matricula"),
                resultado.getString("nome"),
                resultado.getString("cargo"),
                resultado.getString("salario")                
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
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPesquisarCargo;
    private javax.swing.JComboBox<String> cmbMatricula;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTable tblFuncionarios;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
