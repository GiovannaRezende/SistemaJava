package telas;

import dados.SistemaDao;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ControleUsuarios extends javax.swing.JFrame {

public ControleUsuarios(String op) {
        initComponents();
        if (op.equalsIgnoreCase("cadastrar")) {
            btnExcluirUsuarios.setVisible(false);
            btnConsultarUsuarios.setVisible(false);
            
        } else if (op.equalsIgnoreCase("consultar") || op.equalsIgnoreCase("excluir")) {
            btnSalvarUsuarios.setVisible(false);
            btnExcluirUsuarios.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCadastrarUsuario = new javax.swing.JLabel();
        lblSenhaUsuarios = new javax.swing.JLabel();
        txtNomeUsuarios = new javax.swing.JTextField();
        lblCargoUsuarios = new javax.swing.JLabel();
        txtCargoUsuarios = new javax.swing.JTextField();
        btnSalvarUsuarios = new javax.swing.JButton();
        txtSenhaUsuarios = new javax.swing.JPasswordField();
        btnConsultarUsuarios = new javax.swing.JButton();
        btnExcluirUsuarios = new javax.swing.JButton();

        setTitle("Cadastro de usuários");
        getContentPane().setLayout(null);

        lblCadastrarUsuario.setBackground(new java.awt.Color(0, 0, 0));
        lblCadastrarUsuario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblCadastrarUsuario.setText("Usuário");
        getContentPane().add(lblCadastrarUsuario);
        lblCadastrarUsuario.setBounds(40, 50, 49, 20);

        lblSenhaUsuarios.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblSenhaUsuarios.setText("Senha");
        getContentPane().add(lblSenhaUsuarios);
        lblSenhaUsuarios.setBounds(40, 90, 37, 18);

        txtNomeUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeUsuarios);
        txtNomeUsuarios.setBounds(90, 40, 200, 30);

        lblCargoUsuarios.setBackground(new java.awt.Color(0, 0, 0));
        lblCargoUsuarios.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblCargoUsuarios.setText("Cargo");
        getContentPane().add(lblCargoUsuarios);
        lblCargoUsuarios.setBounds(40, 130, 49, 18);

        txtCargoUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(txtCargoUsuarios);
        txtCargoUsuarios.setBounds(90, 120, 200, 30);

        btnSalvarUsuarios.setText("Salvar");
        btnSalvarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarUsuarios);
        btnSalvarUsuarios.setBounds(90, 180, 72, 30);
        getContentPane().add(txtSenhaUsuarios);
        txtSenhaUsuarios.setBounds(90, 80, 200, 30);

        btnConsultarUsuarios.setText("Consultar");
        btnConsultarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultarUsuarios);
        btnConsultarUsuarios.setBounds(330, 40, 81, 30);

        btnExcluirUsuarios.setText("Excluir");
        btnExcluirUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluirUsuarios);
        btnExcluirUsuarios.setBounds(220, 180, 72, 30);

        setSize(new java.awt.Dimension(524, 296));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeUsuariosActionPerformed

    }//GEN-LAST:event_txtNomeUsuariosActionPerformed

    private void txtCargoUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoUsuariosActionPerformed

    }//GEN-LAST:event_txtCargoUsuariosActionPerformed

    private void btnSalvarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarUsuariosActionPerformed
        try {
            
            SistemaDao.salvarUsuario(txtNomeUsuarios.getText(), txtSenhaUsuarios.getText(), txtCargoUsuarios.getText());
            
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
            txtNomeUsuarios.setText("");
            txtSenhaUsuarios.setText("");
            txtCargoUsuarios.setText("");
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnSalvarUsuariosActionPerformed

    private void btnConsultarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarUsuariosActionPerformed
    try {
        
        ResultSet resultado = SistemaDao.consultarUsuario(txtNomeUsuarios.getText());
            
        if(resultado.next()) {
                txtNomeUsuarios.setText(resultado.getString("usuario"));
                txtSenhaUsuarios.setText(resultado.getString("senha"));
                txtCargoUsuarios.setText(resultado.getString("cargo"));
                btnExcluirUsuarios.setVisible(true);
              
        } else {
                JOptionPane.showMessageDialog(null, "Usuário não encontrado.");
        }

            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        }
    }//GEN-LAST:event_btnConsultarUsuariosActionPerformed

    private void btnExcluirUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirUsuariosActionPerformed
        if(txtNomeUsuarios.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O código do departamento é obrigatório!");
            txtNomeUsuarios.requestFocus();
            return;
        } 
        
        try {
            
            SistemaDao.excluirDepartamento(txtNomeUsuarios.getText());
            
            JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!");
            txtNomeUsuarios.setText("");
            txtSenhaUsuarios.setText("");
            txtCargoUsuarios.setText("");
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnExcluirUsuariosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarUsuarios;
    private javax.swing.JButton btnExcluirUsuarios;
    private javax.swing.JButton btnSalvarUsuarios;
    private javax.swing.JLabel lblCadastrarUsuario;
    private javax.swing.JLabel lblCargoUsuarios;
    private javax.swing.JLabel lblSenhaUsuarios;
    private javax.swing.JTextField txtCargoUsuarios;
    private javax.swing.JTextField txtNomeUsuarios;
    private javax.swing.JPasswordField txtSenhaUsuarios;
    // End of variables declaration//GEN-END:variables
}
