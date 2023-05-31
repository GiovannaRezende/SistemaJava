package telas;

import dados.SistemaDao;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class RelatorioDepartamentos extends javax.swing.JFrame {

public RelatorioDepartamentos() {
        initComponents();
        try {
            SistemaDao dao = new SistemaDao();
            
            ResultSet resultado = SistemaDao.listarDepartamentos();
            
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblDepartamentos.getModel();
            modeloTabela.setRowCount(0);
            while (resultado.next()) { 
              Object dep[] = {
                resultado.getString("codigo"),
                resultado.getString("nome"),
                resultado.getString("cidade"),
                resultado.getString("telefone")                
              };
              modeloTabela.addRow(dep);
              cmbCodigo.addItem(resultado.getString("codigo"));
              cmbCidade.addItem(resultado.getString("Cidade"));
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

        jProgressBar1 = new javax.swing.JProgressBar();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDepartamentos = new javax.swing.JTable();
        lblCodigo = new javax.swing.JLabel();
        cmbCodigo = new javax.swing.JComboBox<>();
        lblCidade = new javax.swing.JLabel();
        cmbCidade = new javax.swing.JComboBox<>();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();

        setTitle("Relatório de Departamentos");
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(170, 150, 0, 3);

        tblDepartamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Cidade", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(tblDepartamentos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 70, 630, 190);

        lblCodigo.setText("Código");
        getContentPane().add(lblCodigo);
        lblCodigo.setBounds(40, 30, 50, 16);

        cmbCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCodigo);
        cmbCodigo.setBounds(90, 20, 110, 30);

        lblCidade.setText("Cidade");
        getContentPane().add(lblCidade);
        lblCidade.setBounds(220, 30, 70, 16);

        cmbCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCidadeActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCidade);
        cmbCidade.setBounds(270, 20, 100, 30);

        lblNome.setText("Nome");
        getContentPane().add(lblNome);
        lblNome.setBounds(400, 30, 37, 16);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(450, 20, 110, 30);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(570, 20, 90, 30);

        setSize(new java.awt.Dimension(750, 330));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigoActionPerformed
        try {

            ResultSet resultado = SistemaDao.pesquisarDepartamentoPorCodigo(cmbCodigo.getSelectedItem().toString());
            
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblDepartamentos.getModel();
            modeloTabela.setRowCount(0);
        while (resultado.next()) { 
              Object dep[] = {
                resultado.getString("codigo"),
                resultado.getString("nome"),
                resultado.getString("cidade"),
                resultado.getString("telefone")                
              };
              modeloTabela.addRow(dep);
            } 
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_cmbCodigoActionPerformed

    private void cmbCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCidadeActionPerformed
        try {
            
            ResultSet resultado = SistemaDao.pesquisarDepartamentoPorCidade(cmbCidade.getSelectedItem().toString());
            
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblDepartamentos.getModel();
            modeloTabela.setRowCount(0);
        while (resultado.next()) { 
              Object dep[] = {
                resultado.getString("codigo"),
                resultado.getString("nome"),
                resultado.getString("cidade"),
                resultado.getString("telefone")                
              };
              modeloTabela.addRow(dep);
            } 
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_cmbCidadeActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {

            ResultSet resultado = SistemaDao.pesquisarDepartamentoPorNome(txtNome.getText());
            
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblDepartamentos.getModel();
            modeloTabela.setRowCount(0);
        while (resultado.next()) { 
              Object dep[] = {
                resultado.getString("codigo"),
                resultado.getString("nome"),
                resultado.getString("cidade"),
                resultado.getString("telefone")                
              };
              modeloTabela.addRow(dep);
            } 
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cmbCidade;
    private javax.swing.JComboBox<String> cmbCodigo;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTable tblDepartamentos;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
 
}