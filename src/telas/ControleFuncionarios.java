package telas;

import dados.SistemaDao;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ControleFuncionarios extends javax.swing.JFrame {

public ControleFuncionarios(String op) {
        initComponents();
        if (op.equalsIgnoreCase("cadastrar")) {
            btnExcluirFuncionarios.setVisible(false);
            btnConsultarFuncionarios.setVisible(false);
        } else if (op.equalsIgnoreCase("consultar") || op.equalsIgnoreCase("excluir")) {
            btnSalvarFuncionarios.setVisible(false);
            btnExcluirFuncionarios.setVisible(false);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMatriculaFuncionarios = new javax.swing.JLabel();
        lblNomeFuncionarios = new javax.swing.JLabel();
        lblCargoFuncionarios = new javax.swing.JLabel();
        lblSalarioFuncionarios = new javax.swing.JLabel();
        btnSalvarFuncionarios = new javax.swing.JButton();
        txtNomeFuncionarios = new javax.swing.JTextField();
        txtMatriculaFuncionarios = new javax.swing.JTextField();
        txtCargoFuncionarios = new javax.swing.JTextField();
        txtSalarioFuncionarios = new javax.swing.JTextField();
        btnConsultarFuncionarios = new javax.swing.JButton();
        btnExcluirFuncionarios = new javax.swing.JButton();

        setTitle("Cadastro de funcionários");
        getContentPane().setLayout(null);

        lblMatriculaFuncionarios.setText("Matrícula");
        getContentPane().add(lblMatriculaFuncionarios);
        lblMatriculaFuncionarios.setBounds(40, 40, 60, 16);

        lblNomeFuncionarios.setText("Nome");
        getContentPane().add(lblNomeFuncionarios);
        lblNomeFuncionarios.setBounds(40, 80, 50, 16);

        lblCargoFuncionarios.setText("Cargo");
        getContentPane().add(lblCargoFuncionarios);
        lblCargoFuncionarios.setBounds(40, 120, 50, 16);

        lblSalarioFuncionarios.setText("Salario");
        getContentPane().add(lblSalarioFuncionarios);
        lblSalarioFuncionarios.setBounds(40, 160, 60, 16);

        btnSalvarFuncionarios.setText("Salvar");
        btnSalvarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarFuncionariosActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarFuncionarios);
        btnSalvarFuncionarios.setBounds(70, 200, 75, 30);
        getContentPane().add(txtNomeFuncionarios);
        txtNomeFuncionarios.setBounds(110, 70, 190, 30);
        getContentPane().add(txtMatriculaFuncionarios);
        txtMatriculaFuncionarios.setBounds(110, 30, 190, 30);
        getContentPane().add(txtCargoFuncionarios);
        txtCargoFuncionarios.setBounds(110, 110, 190, 30);
        getContentPane().add(txtSalarioFuncionarios);
        txtSalarioFuncionarios.setBounds(110, 150, 190, 30);

        btnConsultarFuncionarios.setText("Consultar");
        btnConsultarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarFuncionariosActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultarFuncionarios);
        btnConsultarFuncionarios.setBounds(330, 30, 80, 30);

        btnExcluirFuncionarios.setText("Excluir");
        btnExcluirFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirFuncionariosActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluirFuncionarios);
        btnExcluirFuncionarios.setBounds(220, 200, 75, 30);

        setSize(new java.awt.Dimension(524, 290));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarFuncionariosActionPerformed
        if(txtMatriculaFuncionarios.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "A matrícula do funcionário é obrigatória!");
            txtMatriculaFuncionarios.requestFocus();
            return;
        } 
        
        if(txtNomeFuncionarios.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O nome do funcionário é obrigatório!");
            txtNomeFuncionarios.requestFocus();
            return;
        } 
        
        if(txtCargoFuncionarios.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O cargo do funcionário é obrigatório!");
            txtCargoFuncionarios.requestFocus();
            return;
        } 
        
        if(txtSalarioFuncionarios.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O salário do funcionário é obrigatório!");
            txtSalarioFuncionarios.requestFocus();
            return;
        }
        
        try {
 
            SistemaDao.salvarFuncionario(txtMatriculaFuncionarios.getText(), txtNomeFuncionarios.getText(), txtCargoFuncionarios.getText(), Double.parseDouble(txtSalarioFuncionarios.getText()));
            
            JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
            limparTela(); 
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        } catch (SQLException ex) {
            if(ex.getMessage().contains("Duplicate entry")){
               JOptionPane.showMessageDialog(null,"A matrícula de funcionário " + txtMatriculaFuncionarios.getText() + " já está cadastrada. \nConsidere mudar a matrícula do novo funcionário!");
               txtMatriculaFuncionarios.requestFocus();
            } else {           
               JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            
            //JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnSalvarFuncionariosActionPerformed

    private void btnConsultarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarFuncionariosActionPerformed
        try {
            
            ResultSet resultado = SistemaDao.consultarFuncionario(txtMatriculaFuncionarios.getText());
            
            if(resultado.next()) {
                txtMatriculaFuncionarios.setText(resultado.getString("matricula"));
                txtNomeFuncionarios.setText(resultado.getString("nome"));
                txtCargoFuncionarios.setText(resultado.getString("cargo"));
                txtSalarioFuncionarios.setText(resultado.getString("salario"));
                btnExcluirFuncionarios.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Funcionário não encontrado.");
            }

            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        }
    }//GEN-LAST:event_btnConsultarFuncionariosActionPerformed

    private void btnExcluirFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirFuncionariosActionPerformed
        if(txtMatriculaFuncionarios.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O código do funcionário é obrigatório!");
            txtMatriculaFuncionarios.requestFocus();
            return;
        } 
        
        try {

            SistemaDao.excluirFuncionario(txtMatriculaFuncionarios.getText());
            
            JOptionPane.showMessageDialog(null, "Funcionário excluído com sucesso!");
            limparTela();    
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnExcluirFuncionariosActionPerformed
    
    private void limparTela() {
        txtMatriculaFuncionarios.setText("");
        txtNomeFuncionarios.setText("");
        txtCargoFuncionarios.setText("");
        txtSalarioFuncionarios.setText("");
        txtMatriculaFuncionarios.requestFocus();
    } 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarFuncionarios;
    private javax.swing.JButton btnExcluirFuncionarios;
    private javax.swing.JButton btnSalvarFuncionarios;
    private javax.swing.JLabel lblCargoFuncionarios;
    private javax.swing.JLabel lblMatriculaFuncionarios;
    private javax.swing.JLabel lblNomeFuncionarios;
    private javax.swing.JLabel lblSalarioFuncionarios;
    private javax.swing.JTextField txtCargoFuncionarios;
    private javax.swing.JTextField txtMatriculaFuncionarios;
    private javax.swing.JTextField txtNomeFuncionarios;
    private javax.swing.JTextField txtSalarioFuncionarios;
    // End of variables declaration//GEN-END:variables
}
