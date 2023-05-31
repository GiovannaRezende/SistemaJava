package telas;

import dados.SistemaDao;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        ckbVisualizarSenha = new javax.swing.JCheckBox();
        txtUsuario = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Faça seu login");
        setBackground(new java.awt.Color(102, 0, 204));
        getContentPane().setLayout(null);

        lblUsuario.setBackground(new java.awt.Color(0, 0, 0));
        lblUsuario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblUsuario.setText("Usuário");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(40, 40, 49, 18);

        lblSenha.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblSenha.setText("Senha");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(50, 80, 37, 18);

        ckbVisualizarSenha.setBackground(java.awt.Color.darkGray);
        ckbVisualizarSenha.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ckbVisualizarSenha.setText("Visualizar senha");
        ckbVisualizarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbVisualizarSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(ckbVisualizarSenha);
        ckbVisualizarSenha.setBounds(100, 110, 140, 22);

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(100, 32, 200, 30);

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(50, 160, 72, 30);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(100, 72, 200, 30);

        setSize(new java.awt.Dimension(481, 280));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ckbVisualizarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbVisualizarSenhaActionPerformed
        
    }//GEN-LAST:event_ckbVisualizarSenhaActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        try {
            ResultSet resultado = SistemaDao.fazerLogin(txtUsuario.getText(), txtSenha.getText());

            if(resultado.next()){
                String usuario, cargo;
                usuario = resultado.getString("usuario");
                cargo = resultado.getString("cargo");
                dispose();
                new TelaMenu(usuario, cargo).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Usuário/senha inválidos!");
                txtUsuario.requestFocus();
            }
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JCheckBox ckbVisualizarSenha;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
