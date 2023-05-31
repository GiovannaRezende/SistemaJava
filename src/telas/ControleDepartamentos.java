package telas;

import dados.Departamento;
import dados.SistemaDao;
import javax.swing.JOptionPane;
import java.sql.Connection; //Conectar ao banco de dados
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet; //Guarda o resultado da consulta feita pelo código do departamento


public class ControleDepartamentos extends javax.swing.JFrame {

    public ControleDepartamentos(String op) {
        initComponents();
        if (op.equalsIgnoreCase("cadastrar")) {
            btnExcluirDepartamentos.setVisible(false);
            btnAlterarDepartamentos.setVisible(false);
            btnLimparDepartamentos.setVisible(false);
            btnConsultarDepartamentos.setVisible(false);
            
        } else if (op.equalsIgnoreCase("consultar") || op.equalsIgnoreCase("excluir") || op.equalsIgnoreCase("alterar")) {
            btnSalvarDepartamentos.setVisible(false);
            btnExcluirDepartamentos.setVisible(false);
            btnAlterarDepartamentos.setVisible(false);
            btnLimparDepartamentos.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalvarDepartamentos = new javax.swing.JButton();
        lblCodigoDepartamentos = new javax.swing.JLabel();
        lblNomeDepartamentos = new javax.swing.JLabel();
        txtNomeDepartamentos = new javax.swing.JTextField();
        txtCodigoDepartamentos = new javax.swing.JTextField();
        lblCidadeDepartamentos = new javax.swing.JLabel();
        lblTelefoneDepartamentos = new javax.swing.JLabel();
        txtTelefoneDepartamentos = new javax.swing.JTextField();
        txtCidadeDepartamentos = new javax.swing.JTextField();
        btnConsultarDepartamentos = new javax.swing.JButton();
        btnExcluirDepartamentos = new javax.swing.JButton();
        btnAlterarDepartamentos = new javax.swing.JButton();
        btnLimparDepartamentos = new javax.swing.JButton();

        setTitle("Controle de departamentos");
        getContentPane().setLayout(null);

        btnSalvarDepartamentos.setText("Salvar");
        btnSalvarDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarDepartamentosActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarDepartamentos);
        btnSalvarDepartamentos.setBounds(140, 200, 72, 30);

        lblCodigoDepartamentos.setBackground(new java.awt.Color(0, 0, 0));
        lblCodigoDepartamentos.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblCodigoDepartamentos.setText("Código");
        getContentPane().add(lblCodigoDepartamentos);
        lblCodigoDepartamentos.setBounds(90, 40, 49, 18);

        lblNomeDepartamentos.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblNomeDepartamentos.setText("Nome");
        getContentPane().add(lblNomeDepartamentos);
        lblNomeDepartamentos.setBounds(90, 80, 37, 18);

        txtNomeDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeDepartamentosActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeDepartamentos);
        txtNomeDepartamentos.setBounds(140, 70, 200, 30);

        txtCodigoDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoDepartamentosActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigoDepartamentos);
        txtCodigoDepartamentos.setBounds(140, 30, 200, 30);

        lblCidadeDepartamentos.setBackground(new java.awt.Color(0, 0, 0));
        lblCidadeDepartamentos.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblCidadeDepartamentos.setText("Cidade");
        getContentPane().add(lblCidadeDepartamentos);
        lblCidadeDepartamentos.setBounds(90, 120, 49, 18);

        lblTelefoneDepartamentos.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblTelefoneDepartamentos.setText("Telefone");
        getContentPane().add(lblTelefoneDepartamentos);
        lblTelefoneDepartamentos.setBounds(80, 160, 60, 18);

        txtTelefoneDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneDepartamentosActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefoneDepartamentos);
        txtTelefoneDepartamentos.setBounds(140, 150, 200, 30);

        txtCidadeDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeDepartamentosActionPerformed(evt);
            }
        });
        getContentPane().add(txtCidadeDepartamentos);
        txtCidadeDepartamentos.setBounds(140, 110, 200, 30);

        btnConsultarDepartamentos.setText("Consultar");
        btnConsultarDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarDepartamentosActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultarDepartamentos);
        btnConsultarDepartamentos.setBounds(360, 30, 81, 30);

        btnExcluirDepartamentos.setText("Excluir");
        btnExcluirDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirDepartamentosActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluirDepartamentos);
        btnExcluirDepartamentos.setBounds(220, 200, 72, 30);

        btnAlterarDepartamentos.setText("Alterar");
        btnAlterarDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarDepartamentosActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterarDepartamentos);
        btnAlterarDepartamentos.setBounds(300, 200, 72, 30);

        btnLimparDepartamentos.setText("Limpar");
        btnLimparDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparDepartamentosActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimparDepartamentos);
        btnLimparDepartamentos.setBounds(380, 200, 72, 30);

        setSize(new java.awt.Dimension(524, 290));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeDepartamentosActionPerformed
        
    }//GEN-LAST:event_txtNomeDepartamentosActionPerformed

    private void txtCodigoDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoDepartamentosActionPerformed
        
    }//GEN-LAST:event_txtCodigoDepartamentosActionPerformed

    private void txtTelefoneDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneDepartamentosActionPerformed
        
    }//GEN-LAST:event_txtTelefoneDepartamentosActionPerformed

    private void txtCidadeDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeDepartamentosActionPerformed
        
    }//GEN-LAST:event_txtCidadeDepartamentosActionPerformed

    private void btnSalvarDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarDepartamentosActionPerformed
        
        if(txtCodigoDepartamentos.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O código do departamento é obrigatório!");
            txtCodigoDepartamentos.requestFocus();
            return;
        } 
        
        if(txtNomeDepartamentos.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O nome do departamento é obrigatório!");
            txtNomeDepartamentos.requestFocus();
            return;
        } 
        
        if(txtCidadeDepartamentos.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "A cidade do departamento é obrigatório!");
            txtCidadeDepartamentos.requestFocus();
            return;
        } 
        
        if(txtTelefoneDepartamentos.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O telefone do departamento é obrigatório!");
            txtTelefoneDepartamentos.requestFocus();
            return;
        }
        
        Departamento departamento = new Departamento();
        departamento.setCodigo(txtCodigoDepartamentos.getText());
        departamento.setNome(txtNomeDepartamentos.getText());
        departamento.setCidade(txtCidadeDepartamentos.getText());
        departamento.setTelefone(txtTelefoneDepartamentos.getText());
        
        try {
               
            SistemaDao.salvarDepartamento(departamento);
            
            JOptionPane.showMessageDialog(null, "Departamento cadastrado com sucesso!");
            limparTela();
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        } catch (SQLException ex) {
            if(ex.getMessage().contains("Duplicate entry")){
               JOptionPane.showMessageDialog(null,"O departamento de código " + txtCodigoDepartamentos.getText() + " já está cadastrado. \nConsidere mudar o código de seu novo departamento!");
               txtCodigoDepartamentos.requestFocus();
            } else {           
               JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            
        }
    }//GEN-LAST:event_btnSalvarDepartamentosActionPerformed

    private void btnConsultarDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarDepartamentosActionPerformed
        try {
            
            ResultSet resultado = SistemaDao.consultarDepartamento(txtCodigoDepartamentos.getText());
            
            if(resultado.next()) {
                txtNomeDepartamentos.setText(resultado.getString("nome"));
                txtCidadeDepartamentos.setText(resultado.getString("cidade"));
                txtTelefoneDepartamentos.setText(resultado.getString("telefone"));
                btnExcluirDepartamentos.setVisible(true);
                btnAlterarDepartamentos.setVisible(true);
                btnLimparDepartamentos.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Departamento não encontrado.");
            }

            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        }
    }//GEN-LAST:event_btnConsultarDepartamentosActionPerformed

    private void btnLimparDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparDepartamentosActionPerformed
            limparTela();
            btnExcluirDepartamentos.setVisible(false);
            btnAlterarDepartamentos.setVisible(false);
            btnLimparDepartamentos.setVisible(false);
    }//GEN-LAST:event_btnLimparDepartamentosActionPerformed

    private void btnAlterarDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarDepartamentosActionPerformed
          if (txtCodigoDepartamentos.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O código é obrigatório");
            txtCodigoDepartamentos.requestFocus();
            return; 
        }
        try {
            SistemaDao dao = new SistemaDao();
            Connection conectado = dao.conectar();
            
            PreparedStatement stAlterar = conectado.prepareStatement("UPDATE departamentos SET nome = ? , cidade = ? , telefone = ? WHERE codigo = ?");
            stAlterar.setString(1, txtNomeDepartamentos.getText());
            stAlterar.setString(2, txtCidadeDepartamentos.getText());
            stAlterar.setString(3, txtTelefoneDepartamentos.getText());
            stAlterar.setString(4, txtCodigoDepartamentos.getText());
            stAlterar.executeUpdate();

            JOptionPane.showMessageDialog(null, "Departamento alterado com sucesso");
            btnExcluirDepartamentos.setVisible(false);
            btnAlterarDepartamentos.setVisible(false);
            btnLimparDepartamentos.setVisible(false);
            limparTela();
            txtCodigoDepartamentos.requestFocus();
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnAlterarDepartamentosActionPerformed

    private void btnExcluirDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirDepartamentosActionPerformed
        if(txtCodigoDepartamentos.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O código do departamento é obrigatório!");
            txtCodigoDepartamentos.requestFocus();
            return;
        } 
        
        try {

            SistemaDao.excluirDepartamento(txtCodigoDepartamentos.getText());
            
            JOptionPane.showMessageDialog(null, "Departamento excluído com sucesso!");
            limparTela();
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnExcluirDepartamentosActionPerformed
    
    private void limparTela() {
        txtCodigoDepartamentos.setText("");
        txtNomeDepartamentos.setText("");
        txtCidadeDepartamentos.setText("");
        txtTelefoneDepartamentos.setText("");
        txtCodigoDepartamentos.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarDepartamentos;
    private javax.swing.JButton btnConsultarDepartamentos;
    private javax.swing.JButton btnExcluirDepartamentos;
    private javax.swing.JButton btnLimparDepartamentos;
    private javax.swing.JButton btnSalvarDepartamentos;
    private javax.swing.JLabel lblCidadeDepartamentos;
    private javax.swing.JLabel lblCodigoDepartamentos;
    private javax.swing.JLabel lblNomeDepartamentos;
    private javax.swing.JLabel lblTelefoneDepartamentos;
    private javax.swing.JTextField txtCidadeDepartamentos;
    private javax.swing.JTextField txtCodigoDepartamentos;
    private javax.swing.JTextField txtNomeDepartamentos;
    private javax.swing.JTextField txtTelefoneDepartamentos;
    // End of variables declaration//GEN-END:variables
}
