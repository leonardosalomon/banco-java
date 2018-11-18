/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Leonardo Salomon
 */
public class Operações extends javax.swing.JFrame {

    /**
     * Creates new form Operações
     */
    ArrayList<Conta> Contas;
    private ArrayList<Pessoa> Titulares;
    ArrayList<Funcionario> Funcionarios;

    public Operações() {
        initComponents();
    }

    public Operações(ArrayList<Conta> Contas) {
        initComponents();
        this.Contas = Contas;

        for (Conta aux : Contas) {
            jComboBoxContaOri.addItem(aux);
            jComboBoxContaDes.addItem(aux);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jRadioButtonSaque = new javax.swing.JRadioButton();
        jRadioButtonTrans = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jButtonOk = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxContaOri = new javax.swing.JComboBox<>();
        jRadioButtonDep = new javax.swing.JRadioButton();
        jComboBoxContaDes = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaBanco = new javax.swing.JTextArea();
        jButtonListar = new javax.swing.JButton();
        jTextFieldValor1 = new javax.swing.JTextField();
        jButtonArrayOk = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldContaDes = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldContaOri = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonFechar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setText("Conta Origem");

        buttonGroup1.add(jRadioButtonSaque);
        jRadioButtonSaque.setText("Saque");
        jRadioButtonSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSaqueActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonTrans);
        jRadioButtonTrans.setText("Transferência");
        jRadioButtonTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTransActionPerformed(evt);
            }
        });

        jLabel3.setText("Valor");

        jTextFieldValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorActionPerformed(evt);
            }
        });

        jButtonOk.setText("Ok");
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });

        jLabel4.setText("Conta Destino");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Operações");

        jComboBoxContaOri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxContaOriActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonDep);
        jRadioButtonDep.setText("Depósito");
        jRadioButtonDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDepActionPerformed(evt);
            }
        });

        jComboBoxContaDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxContaDesActionPerformed(evt);
            }
        });

        jTextAreaBanco.setColumns(20);
        jTextAreaBanco.setRows(5);
        jScrollPane1.setViewportView(jTextAreaBanco);

        jButtonListar.setText("Listar");
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });

        jButtonArrayOk.setText("Ok");
        jButtonArrayOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonArrayOkActionPerformed(evt);
            }
        });

        jLabel6.setText("Conta Destino");

        jTextFieldContaDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContaDesActionPerformed(evt);
            }
        });

        jLabel7.setText("Conta Origem");

        jTextFieldContaOri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContaOriActionPerformed(evt);
            }
        });

        jLabel8.setText("Valor");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("For Percorrendo todo o Array");

        jButtonFechar.setText("Fechar Conta");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar Conta");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(393, 393, 393))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jRadioButtonSaque))
                            .addComponent(jComboBoxContaOri, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButtonDep)
                                        .addGap(27, 27, 27)
                                        .addComponent(jRadioButtonTrans))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBoxContaDes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(jLabel5)))
                                .addGap(94, 94, 94))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonFechar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonOk)
                                .addGap(4, 4, 4)
                                .addComponent(jButtonListar)
                                .addGap(36, 36, 36)))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(83, 83, 83))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(19, 19, 19)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonArrayOk)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextFieldContaOri, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldContaDes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldContaDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldContaOri, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonArrayOk))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonTrans)
                            .addComponent(jRadioButtonDep)
                            .addComponent(jRadioButtonSaque))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxContaDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxContaOri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonOk)
                            .addComponent(jButtonListar)
                            .addComponent(jButtonFechar)
                            .addComponent(jButtonEditar))))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSaqueActionPerformed
        // TODO add your handling code here:
        jComboBoxContaDes.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonSaqueActionPerformed

    //Botão Ok
    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed

        Conta contaOri = (Conta) jComboBoxContaOri.getSelectedItem();
        Conta contaDes = (Conta) jComboBoxContaDes.getSelectedItem();

        float valor = Float.parseFloat(jTextFieldValor.getText());

        boolean auxSaca = jRadioButtonSaque.isSelected();
        boolean auxDeposita = jRadioButtonDep.isSelected();
        boolean auxTransferencia = jRadioButtonTrans.isSelected();

        if (auxTransferencia) {
            if (contaOri != contaDes) {
                if (contaOri.transferencia(valor, contaDes)) {
                    jTextAreaBanco.setText("Transferência realizada com êxito! \n-----------------------------------------------\n");
                    jTextAreaBanco.append("Contas \nNumero: " + contaOri.getNumero() + "\nSaldo atual: " + contaOri.getSaldo());
                    jTextAreaBanco.append("\n\nNumero: " + contaDes.getNumero() + "\nSaldo atual: " + contaDes.getSaldo());
                } else {
                    jTextAreaBanco.setText("Saldo indisponivel para fazer a transferência: \n");
                }
            }
        }

        if (auxDeposita) {
            contaOri.deposito(valor);
            jTextAreaBanco.setText("Depósito realizado com êxito! \n--------------------------------------------\n");
            jTextAreaBanco.append("Conta \nNumero: " + contaOri.getNumero() + "\nSaldo atual: " + contaOri.getSaldo());
        }

        if (auxSaca) {
            contaOri.saque(valor);
            jTextAreaBanco.setText("Saque realizado com êxito! \n-------------------------------------------\n");
            jTextAreaBanco.append("Conta \nNumero: " + contaOri.getNumero() + "\nSaldo atual: " + contaOri.getSaldo());
        }

    }//GEN-LAST:event_jButtonOkActionPerformed


    private void jTextFieldValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorActionPerformed

    //Botão Listar
    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed

        jTextAreaBanco.setText("Contas:");

        for (Conta Continha : Contas) {
            jTextAreaBanco.append("\n-------------------------------------------------------------------------------------------");
            jTextAreaBanco.append("\nNumero: " + Continha.getNumero() + "\nSaldo: " + Continha.getSaldo()
                    + "\nLimite: " + Continha.getLimite());

            jTextAreaBanco.append("\n\nTitulares: \n");

            for (Pessoa titu : Continha.getTitulares()) {
                jTextAreaBanco.append("Nome: " + titu.getNome() + "   CPF: " + titu.getCpf()
                        + "   Endereço: " + titu.getEndereco() + "\n");
            }
        }

    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jComboBoxContaDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxContaDesActionPerformed
        // TODO add your handling code here:
        jComboBoxContaDes.setEnabled(false);
    }//GEN-LAST:event_jComboBoxContaDesActionPerformed

    private void jRadioButtonTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTransActionPerformed
        // TODO add your handling code here:
        jComboBoxContaDes.setEnabled(true);
    }//GEN-LAST:event_jRadioButtonTransActionPerformed

    private void jButtonArrayOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonArrayOkActionPerformed

        int conta_ori = Integer.parseInt(jTextFieldContaOri.getText());
        float valor = Float.parseFloat(jTextFieldValor.getText());

        boolean auxSaca = jRadioButtonSaque.isSelected();
        boolean auxDeposita = jRadioButtonDep.isSelected();
        boolean auxTransferencia = jRadioButtonTrans.isSelected();

        if (auxTransferencia) {
            int conta_des = Integer.parseInt(jTextFieldContaDes.getText());
            for (Conta Origem : Contas) {
                if (Origem.getNumero() == conta_ori) {
                    for (Conta Destino : Contas) {
                        if (Destino.getNumero() == conta_des) {
                            if (Origem.transferencia(valor, Destino)) {
                                jTextAreaBanco.setText("Transferência realizada com êxito! \n-----------------------------------------------\n");
                                jTextAreaBanco.append("Contas \nNumero: " + Origem.getNumero() + "\nSaldo atual: " + Origem.getSaldo());
                                jTextAreaBanco.append("\n\nNumero: " + Destino.getNumero() + "\nSaldo atual: " + Destino.getSaldo());
                            } else {
                                jTextAreaBanco.setText("Saldo indisponivel para fazer a transferência: \n");
                            }
                        }
                    }
                }
            }
        } else if (auxDeposita) {
            for (Conta aux : Contas) {
                if (aux.getNumero() == conta_ori) {
                    aux.deposito(valor);
                    jTextAreaBanco.setText("Depósito realizado com êxito! \n--------------------------------------------\n");
                    jTextAreaBanco.append("Conta \nNumero: " + aux.getNumero() + "\nSaldo atual: " + aux.getSaldo());

                }
            }
        } else if (auxSaca) {
            for (Conta aux : Contas) {
                if (aux.getNumero() == conta_ori) {
                    if (aux.saque(valor)) {
                        jTextAreaBanco.setText("Saque realizado com êxito! \n-------------------------------------------\n");
                        jTextAreaBanco.append("Conta \nNumero: " + aux.getNumero() + "\nSaldo atual: " + aux.getSaldo());
                    } else {
                        jTextAreaBanco.setText("A conta não possui limite suficiente. \n");
                    }

                }
            }
        }
    }//GEN-LAST:event_jButtonArrayOkActionPerformed


    private void jTextFieldContaDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContaDesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContaDesActionPerformed

    private void jTextFieldContaOriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContaOriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContaOriActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
      
        Conta rm = (Conta) jComboBoxContaOri.getSelectedItem();
        
        //Remove a Conta
        Contas.remove(rm);
        
        //Remove todos os itens do ComboBox
        jComboBoxContaOri.removeAllItems();
        jComboBoxContaDes.removeAllItems();
        
        //Preenche os ComboBox novamente com as informações pós exclusões
        for (Conta aux : Contas) {
            jComboBoxContaOri.addItem(aux);
            jComboBoxContaDes.addItem(aux);
        }
        
        Conta.totalDeContas--;

        jButtonListar.doClick();
        
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jRadioButtonDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDepActionPerformed
       
        jComboBoxContaDes.setEnabled(false);
        
    }//GEN-LAST:event_jRadioButtonDepActionPerformed

    private void jComboBoxContaOriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxContaOriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxContaOriActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:

        EditarConta auxEditCont = new EditarConta(Contas);
        auxEditCont.setVisible(true);

    }//GEN-LAST:event_jButtonEditarActionPerformed

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
            java.util.logging.Logger.getLogger(Operações.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operações.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operações.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operações.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operações().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonArrayOk;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JComboBox<Conta> jComboBoxContaDes;
    private javax.swing.JComboBox<Conta> jComboBoxContaOri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButtonDep;
    private javax.swing.JRadioButton jRadioButtonSaque;
    private javax.swing.JRadioButton jRadioButtonTrans;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaBanco;
    private javax.swing.JTextField jTextFieldContaDes;
    private javax.swing.JTextField jTextFieldContaOri;
    private javax.swing.JTextField jTextFieldValor;
    private javax.swing.JTextField jTextFieldValor1;
    // End of variables declaration//GEN-END:variables
}
