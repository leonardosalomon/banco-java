/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;
import javax.swing.*;

public class Banco extends javax.swing.JFrame {

    /**
     * Creates new form Banco
     */
    ArrayList<Conta> Contas;
    ArrayList<Pessoa> Titulares;
    ArrayList<Funcionario> Funcionarios;

    public Banco() {
        initComponents();
        Contas = new ArrayList<Conta>();
        Titulares = new ArrayList<Pessoa>();
        Funcionarios = new ArrayList<Funcionario>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.f
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCadConta = new javax.swing.JButton();
        jButtonCadFunc = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonOperacoes = new javax.swing.JButton();
        jButtonListCont = new javax.swing.JButton();
        jButtonGerar = new javax.swing.JButton();
        jButtonListFunc = new javax.swing.JButton();
        jButtonEditarFunc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCadConta.setText("Cadastrar Conta");
        jButtonCadConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadContaActionPerformed(evt);
            }
        });

        jButtonCadFunc.setText("Funcionário");
        jButtonCadFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadFuncActionPerformed(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTitulo.setText("Banco BmB");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel2.setText("BmB - Banco mais Brabo");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel3.setText("By Leonardo Salomon");

        jButtonOperacoes.setText("Operações Conta");
        jButtonOperacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOperacoesActionPerformed(evt);
            }
        });

        jButtonListCont.setText("Listar Contas");
        jButtonListCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListContActionPerformed(evt);
            }
        });

        jButtonGerar.setText("Gerar Dados");
        jButtonGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarActionPerformed(evt);
            }
        });

        jButtonListFunc.setText("Listar Funcionários");
        jButtonListFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListFuncActionPerformed(evt);
            }
        });

        jButtonEditarFunc.setText("Editar Funcionários");
        jButtonEditarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarFuncActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonListFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCadFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(154, 154, 154)
                            .addComponent(jLabelTitulo))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel3)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButtonOperacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonListCont, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonCadConta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(210, 210, 210)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jButtonGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadFunc)
                    .addComponent(jButtonCadConta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonListFunc)
                    .addComponent(jButtonListCont))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditarFunc)
                    .addComponent(jButtonOperacoes))
                .addGap(18, 18, 18)
                .addComponent(jButtonGerar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Botão Cadastro de Conta
    private void jButtonCadContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadContaActionPerformed

        BancoConta AuxConta = new BancoConta(Contas);
        AuxConta.setVisible(true);

    }//GEN-LAST:event_jButtonCadContaActionPerformed

    //Botão Cadastro de Funcionários
    private void jButtonCadFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadFuncActionPerformed

        AddFuncionario auxf = new AddFuncionario(Funcionarios);
        auxf.setVisible(true);

    }//GEN-LAST:event_jButtonCadFuncActionPerformed

    //Botão Operações
    private void jButtonOperacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOperacoesActionPerformed

        Operações auxf = new Operações(Contas);
        auxf.setVisible(true);

    }//GEN-LAST:event_jButtonOperacoesActionPerformed

    //Botão Listar Contas
    private void jButtonListContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListContActionPerformed

        TabelaConta auxTabela = new TabelaConta(Contas);
        auxTabela.setVisible(true);

    }//GEN-LAST:event_jButtonListContActionPerformed

    //Botão Gerar Dados
    private void jButtonGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarActionPerformed

        //Loop de criação de Contas
        for (int i = 1; i < 10; i++) {
            Conta Account = new Conta(i, 1000, 10000, "Name" + i, "000.000.000-0" + i, "Address" + i);

            for (int j = 0; j < 2; j++) {
                Pessoa Titulares = new Pessoa("Name" + i + j, "000.000.000-" + i + j, "Address" + i + j);
                Account.getTitulares().add(Titulares);
            }

            Contas.add(Account);

        }

        //Loop de criação de Funcionários
        for (int i = 1; i < 10; i++) {
            Funcionario Func = new Funcionario("Name" + i, "000.000.000-0" + i, "Address" + i, "00000" + i, 1000);

            Funcionarios.add(Func);
        }

        //Desabilitando o botão de Gerar Dados
        jButtonGerar.setEnabled(false);
    }//GEN-LAST:event_jButtonGerarActionPerformed

    //Botão de Listar Funcionários
    private void jButtonListFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListFuncActionPerformed

        TabelaFuncionario auxTabela = new TabelaFuncionario(Funcionarios);
        auxTabela.setVisible(true);

    }//GEN-LAST:event_jButtonListFuncActionPerformed

    //Botão Editar Funcionários
    private void jButtonEditarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarFuncActionPerformed

        EditarFuncionario auxEditFunc = new EditarFuncionario(Funcionarios);
        auxEditFunc.setVisible(true);

    }//GEN-LAST:event_jButtonEditarFuncActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Banco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadConta;
    private javax.swing.JButton jButtonCadFunc;
    private javax.swing.JButton jButtonEditarFunc;
    private javax.swing.JButton jButtonGerar;
    private javax.swing.JButton jButtonListCont;
    private javax.swing.JButton jButtonListFunc;
    private javax.swing.JButton jButtonOperacoes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}
