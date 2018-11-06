/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/*
 * @author Leonardo Salomon
 */
public class BancoConta extends javax.swing.JFrame {

    /**
     * Creates new form BancoConta
     */
    ArrayList<Conta> Contas;
    private ArrayList<Pessoa> Titulares;
    ArrayList<Funcionario> Funcionarios;

    public BancoConta() {
        initComponents();
        Contas = new ArrayList<Conta>();
        Titulares = new ArrayList<Pessoa>();
        Funcionarios = new ArrayList<Funcionario>();

    }

    public BancoConta(ArrayList<Conta> Conta) {
        initComponents();
        FormatarCampos();
        Contas = new ArrayList<Conta>();
        Titulares = new ArrayList<Pessoa>();
        Funcionarios = new ArrayList<Funcionario>();

    }

    private void FormatarCampos() {
        try {
            MaskFormatter mask = new MaskFormatter("###.###.###-##");
            mask.install(jFormattedTextFieldCpf);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao formatar campo de texto", "ERRO", JOptionPane.ERROR);
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

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabelNumero = new javax.swing.JLabel();
        jLabelSaldo = new javax.swing.JLabel();
        jLabelLimite = new javax.swing.JLabel();
        jTextFieldLimite = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jLabelNumTitulares = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldSaldo = new javax.swing.JTextField();
        jTextFieldNum = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaBanco = new javax.swing.JTextArea();
        jButtonListar = new javax.swing.JButton();
        jSpinnerNumTitulares = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jTextFieldContaDes = new javax.swing.JTextField();
        jRadioButtonDep = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButtonSaque = new javax.swing.JRadioButton();
        jTextFieldContaOri = new javax.swing.JTextField();
        jRadioButtonTrans = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelNumero.setText("Numero");

        jLabelSaldo.setText("Saldo");

        jLabelLimite.setText("Limite");

        jTextFieldLimite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLimiteActionPerformed(evt);
            }
        });

        jLabelNome.setText("Nome");

        jLabelCpf.setText("CPF");

        jLabelEndereco.setText("Endereço");

        jLabelNumTitulares.setText("N° Titulares");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jTextFieldEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEnderecoActionPerformed(evt);
            }
        });

        jTextFieldSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSaldoActionPerformed(evt);
            }
        });

        jTextFieldNum.setName(""); // NOI18N
        jTextFieldNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Conta");

        jFormattedTextFieldCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCpfActionPerformed(evt);
            }
        });

        jTextFieldContaDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContaDesActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonDep);
        jRadioButtonDep.setText("Depósito");

        jLabel2.setText("Conta Origem");

        buttonGroup1.add(jRadioButtonSaque);
        jRadioButtonSaque.setText("Saque");
        jRadioButtonSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSaqueActionPerformed(evt);
            }
        });

        jTextFieldContaOri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContaOriActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonTrans);
        jRadioButtonTrans.setText("Transferência");

        jLabel3.setText("Valor");

        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Conta Destino");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Operações");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldContaOri, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(292, 292, 292))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelNumero)
                                    .addComponent(jTextFieldNome)
                                    .addComponent(jTextFieldNum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabelNome))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelCpf)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabelSaldo)
                                        .addComponent(jFormattedTextFieldCpf)
                                        .addComponent(jTextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelLimite)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(106, 106, 106)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButtonSalvar)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabelEndereco))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelNumTitulares)
                                                .addComponent(jSpinnerNumTitulares, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextFieldContaDes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(37, 37, 37)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jRadioButtonSaque)
                                    .addGap(40, 40, 40)
                                    .addComponent(jRadioButtonDep)))
                            .addGap(35, 35, 35)
                            .addComponent(jRadioButtonTrans)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(jLabel1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButtonListar)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelLimite)
                            .addComponent(jLabelSaldo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNome)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCpf)
                            .addComponent(jLabelEndereco)
                            .addComponent(jLabelNumTitulares))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerNumTitulares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSalvar)
                .addGap(7, 7, 7)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonTrans)
                    .addComponent(jRadioButtonSaque)
                    .addComponent(jRadioButtonDep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldContaOri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldContaDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonListar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Botao Salvar
    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        int numero = Integer.parseInt(jTextFieldNum.getText());
        float saldo = Float.parseFloat(jTextFieldSaldo.getText());
        float limite = Float.parseFloat(jTextFieldLimite.getText());
        String nome = (jTextFieldNome.getText());
        String cpf = (jFormattedTextFieldCpf.getText());
        String endereco = (jTextFieldEndereco.getText());
        int num_titu = (int) (jSpinnerNumTitulares.getValue());

        if (!jTextFieldNum.getText().isEmpty() && !jTextFieldSaldo.getText().isEmpty() && !jTextFieldLimite.getText().isEmpty()
                && !jTextFieldNome.getText().isEmpty() && !jFormattedTextFieldCpf.getText().isEmpty() && !jTextFieldEndereco.getText().isEmpty()) {

            Conta auxConta;

            auxConta = new Conta(numero, saldo, limite, nome, cpf, endereco);

            for (int i = 0; i < (int) (jSpinnerNumTitulares.getValue()) - 1; i++) {

                AddTitular auxAdd = new AddTitular();

                JOptionPane.showConfirmDialog(this, auxAdd);

                auxConta.getTitulares().add(
                        new Pessoa(
                                auxAdd.getjTextFieldNome().getText(),
                                auxAdd.getjTextFieldCpf().getText(),
                                auxAdd.getjTextFieldEndereco().getText()));
            }

            Contas.add(auxConta);

            jTextFieldNum.setText("");
            jTextFieldSaldo.setText("");
            jTextFieldLimite.setText("");
            jTextFieldNome.setText("");
            jFormattedTextFieldCpf.setText("");
            jTextFieldEndereco.setText("");
            jSpinnerNumTitulares.setValue(0);
            jTextAreaBanco.setText("");

            jButtonListar.doClick();
        }


    }//GEN-LAST:event_jButtonSalvarActionPerformed


    private void jTextFieldLimiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLimiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLimiteActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEnderecoActionPerformed

    private void jTextFieldSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSaldoActionPerformed

    private void jTextFieldNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumActionPerformed

    //Botao Listar
    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        // TODO add your handling code here:

        jTextAreaBanco.setText("Contas:");

        for (Conta Continha : Contas) {
            jTextAreaBanco.append("\n-------------------------------------------------------------------------------------------");
            jTextAreaBanco.append("\nNumero: " + Continha.getNumero() + "\nSaldo: " + Continha.getSaldo()
                    + "\nLimite: " + Continha.getLimite());

            jTextAreaBanco.append("\n\nTItulares: \n");

            for (Pessoa titu : Continha.getTitulares()) {
                jTextAreaBanco.append("Nome: " + titu.getNome() + "   CPF: " + titu.getCpf()
                        + "   Endereço: " + titu.getEndereco() + "\n");
            }
        }


    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jFormattedTextFieldCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCpfActionPerformed

    private void jTextFieldContaDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContaDesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContaDesActionPerformed

    private void jRadioButtonSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSaqueActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jRadioButtonSaqueActionPerformed

    private void jTextFieldContaOriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContaOriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContaOriActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

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
                
    }//GEN-LAST:event_jButton1ActionPerformed
        }
        
        jTextFieldContaOri.setText("");
        jTextFieldContaDes.setText("");
        jTextFieldValor.setText("");
    
    }

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
            java.util.logging.Logger.getLogger(BancoConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BancoConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BancoConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BancoConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BancoConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelLimite;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNumTitulares;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelSaldo;
    private javax.swing.JRadioButton jRadioButtonDep;
    private javax.swing.JRadioButton jRadioButtonSaque;
    private javax.swing.JRadioButton jRadioButtonTrans;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerNumTitulares;
    private javax.swing.JTextArea jTextAreaBanco;
    private javax.swing.JTextField jTextFieldContaDes;
    private javax.swing.JTextField jTextFieldContaOri;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldLimite;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNum;
    private javax.swing.JTextField jTextFieldSaldo;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}
