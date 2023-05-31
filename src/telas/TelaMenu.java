package telas;

public class TelaMenu extends javax.swing.JFrame {

    public TelaMenu(String usuario, String cargo) {
        initComponents();
        lblSaudacao.setText("Bem-vindo(a), " + usuario + "! (" + cargo + ")");
        if (!cargo.equalsIgnoreCase("Gerente")){
            mnuUsuarios.setVisible(false);
            
            itmCadastrarDepartamentos.setEnabled(false);
            itmAlterarDepartamentos.setEnabled(false);
            itmExcluirDepartamentos.setEnabled(false);
            itmConsultarDepartamentos.setEnabled(false);
            
            itmCadastrarFuncionarios.setEnabled(false);
            itmConsultarFuncionarios.setEnabled(false);
            itmAlterarFuncionarios.setEnabled(false);
            itmExcluirFuncionarios.setEnabled(false);
            
        }
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSaudacao = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuDepartamentos = new javax.swing.JMenu();
        itmCadastrarDepartamentos = new javax.swing.JMenuItem();
        itmConsultarDepartamentos = new javax.swing.JMenuItem();
        itmAlterarDepartamentos = new javax.swing.JMenuItem();
        mnuRelatorios = new javax.swing.JMenu();
        itmRelatorioGeralDepartamentos = new javax.swing.JMenuItem();
        itmRelatorioCidadeDepartamentos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itmExcluirDepartamentos = new javax.swing.JMenuItem();
        itmSair = new javax.swing.JMenuItem();
        mnuFuncionarios = new javax.swing.JMenu();
        itmCadastrarFuncionarios = new javax.swing.JMenuItem();
        itmConsultarFuncionarios = new javax.swing.JMenuItem();
        itmAlterarFuncionarios = new javax.swing.JMenuItem();
        itmExcluirFuncionarios = new javax.swing.JMenuItem();
        itmRelatorioFuncionarios = new javax.swing.JMenuItem();
        mnuUsuarios = new javax.swing.JMenu();
        itmCadastrarUsuarios = new javax.swing.JMenuItem();
        itmConsultarUsuarios = new javax.swing.JMenuItem();
        itmAlterarUsuarios = new javax.swing.JMenuItem();
        itmExcluirUsuarios = new javax.swing.JMenuItem();
        itmRelatorioUsuarios = new javax.swing.JMenuItem();
        mnuAjuda = new javax.swing.JMenu();
        itmManualUsuario = new javax.swing.JMenuItem();
        itmSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seja bem-vindo(a)");
        setIconImages(null);
        getContentPane().setLayout(null);
        getContentPane().add(lblSaudacao);
        lblSaudacao.setBounds(10, 20, 320, 16);

        jLabel1.setText("O que deseja fazer?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 40, 220, 16);

        mnuDepartamentos.setText("Departamentos");

        itmCadastrarDepartamentos.setText("Cadastrar");
        itmCadastrarDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarDepartamentosActionPerformed(evt);
            }
        });
        mnuDepartamentos.add(itmCadastrarDepartamentos);

        itmConsultarDepartamentos.setText("Consultar");
        itmConsultarDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConsultarDepartamentosActionPerformed(evt);
            }
        });
        mnuDepartamentos.add(itmConsultarDepartamentos);

        itmAlterarDepartamentos.setText("Alterar");
        itmAlterarDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarDepartamentosActionPerformed(evt);
            }
        });
        mnuDepartamentos.add(itmAlterarDepartamentos);

        mnuRelatorios.setText("Relatórios");

        itmRelatorioGeralDepartamentos.setText("Geral");
        itmRelatorioGeralDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelatorioGeralDepartamentosActionPerformed(evt);
            }
        });
        mnuRelatorios.add(itmRelatorioGeralDepartamentos);

        itmRelatorioCidadeDepartamentos.setText("Cidade");
        itmRelatorioCidadeDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelatorioCidadeDepartamentosActionPerformed(evt);
            }
        });
        mnuRelatorios.add(itmRelatorioCidadeDepartamentos);

        mnuDepartamentos.add(mnuRelatorios);
        mnuDepartamentos.add(jSeparator1);

        itmExcluirDepartamentos.setText("Excluir");
        itmExcluirDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirDepartamentosActionPerformed(evt);
            }
        });
        mnuDepartamentos.add(itmExcluirDepartamentos);

        itmSair.setText("Sair");
        itmSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmSairActionPerformed(evt);
            }
        });
        mnuDepartamentos.add(itmSair);

        jMenuBar1.add(mnuDepartamentos);

        mnuFuncionarios.setText("Funcionários");

        itmCadastrarFuncionarios.setText("Cadastrar");
        itmCadastrarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarFuncionariosActionPerformed(evt);
            }
        });
        mnuFuncionarios.add(itmCadastrarFuncionarios);

        itmConsultarFuncionarios.setText("Consultar");
        itmConsultarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConsultarFuncionariosActionPerformed(evt);
            }
        });
        mnuFuncionarios.add(itmConsultarFuncionarios);

        itmAlterarFuncionarios.setText("Alterar");
        mnuFuncionarios.add(itmAlterarFuncionarios);

        itmExcluirFuncionarios.setText("Excluir");
        itmExcluirFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirFuncionariosActionPerformed(evt);
            }
        });
        mnuFuncionarios.add(itmExcluirFuncionarios);

        itmRelatorioFuncionarios.setText("Relatórios");
        itmRelatorioFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelatorioFuncionariosActionPerformed(evt);
            }
        });
        mnuFuncionarios.add(itmRelatorioFuncionarios);

        jMenuBar1.add(mnuFuncionarios);

        mnuUsuarios.setText("Usuários");

        itmCadastrarUsuarios.setText("Cadastrar");
        itmCadastrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarUsuariosActionPerformed(evt);
            }
        });
        mnuUsuarios.add(itmCadastrarUsuarios);

        itmConsultarUsuarios.setText("Consultar");
        itmConsultarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConsultarUsuariosActionPerformed(evt);
            }
        });
        mnuUsuarios.add(itmConsultarUsuarios);

        itmAlterarUsuarios.setText("Alterar");
        mnuUsuarios.add(itmAlterarUsuarios);

        itmExcluirUsuarios.setText("Excluir");
        itmExcluirUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirUsuariosActionPerformed(evt);
            }
        });
        mnuUsuarios.add(itmExcluirUsuarios);

        itmRelatorioUsuarios.setText("Relatórios");
        itmRelatorioUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelatorioUsuariosActionPerformed(evt);
            }
        });
        mnuUsuarios.add(itmRelatorioUsuarios);

        jMenuBar1.add(mnuUsuarios);

        mnuAjuda.setText("Ajuda");

        itmManualUsuario.setText("Manual do Usuário");
        mnuAjuda.add(itmManualUsuario);

        itmSobre.setText("Sobre");
        itmSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmSobreActionPerformed(evt);
            }
        });
        mnuAjuda.add(itmSobre);

        jMenuBar1.add(mnuAjuda);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(504, 289));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmSobreActionPerformed
        
    }//GEN-LAST:event_itmSobreActionPerformed

    private void itmRelatorioGeralDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatorioGeralDepartamentosActionPerformed
        new RelatorioDepartamentos().setVisible(true);
    }//GEN-LAST:event_itmRelatorioGeralDepartamentosActionPerformed

    private void itmRelatorioCidadeDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatorioCidadeDepartamentosActionPerformed
        
    }//GEN-LAST:event_itmRelatorioCidadeDepartamentosActionPerformed

    private void itmCadastrarDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarDepartamentosActionPerformed
       new ControleDepartamentos("cadastrar").setVisible(true);
    }//GEN-LAST:event_itmCadastrarDepartamentosActionPerformed

    private void itmCadastrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarUsuariosActionPerformed
        new ControleUsuarios("cadastrar").setVisible(true);
    }//GEN-LAST:event_itmCadastrarUsuariosActionPerformed

    private void itmCadastrarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarFuncionariosActionPerformed
        new ControleFuncionarios("cadastrar").setVisible(true);
    }//GEN-LAST:event_itmCadastrarFuncionariosActionPerformed

    private void itmConsultarDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmConsultarDepartamentosActionPerformed
        new ControleDepartamentos("consultar").setVisible(true);
    }//GEN-LAST:event_itmConsultarDepartamentosActionPerformed

    private void itmExcluirDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirDepartamentosActionPerformed
        new ControleDepartamentos("excluir").setVisible(true);
    }//GEN-LAST:event_itmExcluirDepartamentosActionPerformed

    private void itmAlterarDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarDepartamentosActionPerformed
        new ControleDepartamentos("alterar").setVisible(true);
    }//GEN-LAST:event_itmAlterarDepartamentosActionPerformed

    private void itmConsultarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmConsultarUsuariosActionPerformed
        new ControleUsuarios("consultar").setVisible(true);
    }//GEN-LAST:event_itmConsultarUsuariosActionPerformed

    private void itmExcluirUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirUsuariosActionPerformed
        new ControleUsuarios("excluir").setVisible(true);
    }//GEN-LAST:event_itmExcluirUsuariosActionPerformed

    private void itmConsultarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmConsultarFuncionariosActionPerformed
        new ControleFuncionarios("consultar").setVisible(true);
    }//GEN-LAST:event_itmConsultarFuncionariosActionPerformed

    private void itmExcluirFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirFuncionariosActionPerformed
       new ControleFuncionarios("excluir").setVisible(true);
    }//GEN-LAST:event_itmExcluirFuncionariosActionPerformed

    private void itmRelatorioFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatorioFuncionariosActionPerformed
        new RelatorioFuncionarios().setVisible(true);
    }//GEN-LAST:event_itmRelatorioFuncionariosActionPerformed

    private void itmSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmSairActionPerformed
        new TelaLogin().setVisible(true);
    }//GEN-LAST:event_itmSairActionPerformed

    private void itmRelatorioUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatorioUsuariosActionPerformed
        new RelatorioUsuarios().setVisible(true);
    }//GEN-LAST:event_itmRelatorioUsuariosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAlterarDepartamentos;
    private javax.swing.JMenuItem itmAlterarFuncionarios;
    private javax.swing.JMenuItem itmAlterarUsuarios;
    private javax.swing.JMenuItem itmCadastrarDepartamentos;
    private javax.swing.JMenuItem itmCadastrarFuncionarios;
    private javax.swing.JMenuItem itmCadastrarUsuarios;
    private javax.swing.JMenuItem itmConsultarDepartamentos;
    private javax.swing.JMenuItem itmConsultarFuncionarios;
    private javax.swing.JMenuItem itmConsultarUsuarios;
    private javax.swing.JMenuItem itmExcluirDepartamentos;
    private javax.swing.JMenuItem itmExcluirFuncionarios;
    private javax.swing.JMenuItem itmExcluirUsuarios;
    private javax.swing.JMenuItem itmManualUsuario;
    private javax.swing.JMenuItem itmRelatorioCidadeDepartamentos;
    private javax.swing.JMenuItem itmRelatorioFuncionarios;
    private javax.swing.JMenuItem itmRelatorioGeralDepartamentos;
    private javax.swing.JMenuItem itmRelatorioUsuarios;
    private javax.swing.JMenuItem itmSair;
    private javax.swing.JMenuItem itmSobre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblSaudacao;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenu mnuDepartamentos;
    private javax.swing.JMenu mnuFuncionarios;
    private javax.swing.JMenu mnuRelatorios;
    private javax.swing.JMenu mnuUsuarios;
    // End of variables declaration//GEN-END:variables
}
