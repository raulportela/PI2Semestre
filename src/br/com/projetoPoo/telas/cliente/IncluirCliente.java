/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoPoo.telas.cliente;

import br.com.projetoPoo.model.pessoa.cliente.Cliente;
import br.com.projetoPoo.servico.ServicoCliente;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author raul.pportela
 */
public class IncluirCliente extends javax.swing.JInternalFrame {

    private boolean modoEdicao = false;

    private Cliente cliente = null;

    /**
     * Creates new form CadastroCliente2
     */
    public IncluirCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCliente = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblSobrenome = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblDtNasc = new javax.swing.JLabel();
        fieldSobrenome = new javax.swing.JTextField();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fieldCpf = new javax.swing.JTextField();
        fieldData = new javax.swing.JTextField();
        fieldNome = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cliente");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        painelCliente.setBackground(new java.awt.Color(240, 240, 255));

        lblNome.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        lblNome.setText("Nome");

        lblSobrenome.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        lblSobrenome.setText("Sobrenome");

        lblCPF.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        lblCPF.setText("CPF");

        lblDtNasc.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        lblDtNasc.setText("Data Nascimento");

        fieldSobrenome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldSobrenomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldSobrenomeFocusLost(evt);
            }
        });

        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 21)); // NOI18N
        jLabel1.setText("Cadastro de Cliente");

        fieldCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldCpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldCpfFocusLost(evt);
            }
        });
        fieldCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCpfActionPerformed(evt);
            }
        });

        fieldData.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldDataFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldDataFocusLost(evt);
            }
        });
        fieldData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDataActionPerformed(evt);
            }
        });

        fieldNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldNomeFocusLost(evt);
            }
        });

        javax.swing.GroupLayout painelClienteLayout = new javax.swing.GroupLayout(painelCliente);
        painelCliente.setLayout(painelClienteLayout);
        painelClienteLayout.setHorizontalGroup(
            painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelClienteLayout.createSequentialGroup()
                        .addComponent(lblCPF)
                        .addGap(356, 356, 356))
                    .addGroup(painelClienteLayout.createSequentialGroup()
                        .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelClienteLayout.createSequentialGroup()
                                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelClienteLayout.createSequentialGroup()
                                        .addComponent(lblNome)
                                        .addGap(161, 161, 161)
                                        .addComponent(lblSobrenome))
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelClienteLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(buttonCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonSalvar))
                            .addGroup(painelClienteLayout.createSequentialGroup()
                                .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldSobrenome))
                            .addGroup(painelClienteLayout.createSequentialGroup()
                                .addComponent(fieldCpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblDtNasc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        painelClienteLayout.setVerticalGroup(
            painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(lblSobrenome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelClienteLayout.createSequentialGroup()
                        .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldSobrenome)
                            .addComponent(fieldNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelClienteLayout.createSequentialGroup()
                        .addComponent(lblDtNasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonSalvar)
                    .addComponent(buttonCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        if (modoEdicao && cliente != null) {
            fieldNome.setText(cliente.getNome());
            fieldSobrenome.setText(cliente.getSobrenome());
            String cpfPontuado = "";
            cpfPontuado += cliente.getCpf().substring(0, 3) + ".";
            cpfPontuado += cliente.getCpf().substring(3, 6) + ".";
            cpfPontuado += cliente.getCpf().substring(6, 9) + "-";
            cpfPontuado += cliente.getCpf().substring(9, 11);
            fieldCpf.setText(cpfPontuado);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void fieldNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldNomeFocusLost
        if (fieldNome.getText().equals("")) {
            fieldNome.setBorder(new LineBorder(Color.RED));
        }
    }//GEN-LAST:event_fieldNomeFocusLost

    private void fieldNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldNomeFocusGained
        fieldNome.setBorder(new LineBorder(Color.LIGHT_GRAY));
    }//GEN-LAST:event_fieldNomeFocusGained

    private void fieldDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldDataActionPerformed

    private void fieldDataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldDataFocusLost
        if (fieldData.getText() != null && fieldData.getText().length() == 8) {
            String dataS = "";
            dataS += fieldData.getText().substring(0, 2) + "/";
            dataS += fieldData.getText().substring(2, 4) + "/";
            dataS += fieldData.getText().substring(4, 8);
            fieldData.setText(dataS);
        } else if (fieldData.getText() != null && (fieldData.getText().length() != 8
            && fieldData.getText().length() != 10)) {
        fieldData.setBorder(new LineBorder(Color.RED));
        }
    }//GEN-LAST:event_fieldDataFocusLost

    private void fieldDataFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldDataFocusGained
        if (fieldData.getText() != null && fieldData.getText().length() != 10) {
            fieldData.setText(null);
            fieldData.setBorder(new LineBorder(Color.LIGHT_GRAY));
        }
    }//GEN-LAST:event_fieldDataFocusGained

    private void fieldCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCpfActionPerformed

    private void fieldCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldCpfFocusLost
        if (fieldCpf.getText() != null && fieldCpf.getText().length() == 11) {
            String CPF = fieldCpf.getText();
            String CpfS = "";
            CpfS += CPF.substring(0, 3) + ".";
            CpfS += CPF.substring(3, 6) + ".";
            CpfS += CPF.substring(6, 9) + "-";
            CpfS += CPF.substring(9, 11);
            fieldCpf.setText(CpfS);
        } else if (fieldCpf.getText() != null && (fieldCpf.getText().length() != 11
            && fieldCpf.getText().length() != 14)) {
        fieldCpf.setBorder(new LineBorder(Color.RED));
        }
    }//GEN-LAST:event_fieldCpfFocusLost

    private void fieldCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldCpfFocusGained
        if (fieldCpf.getText() != null && fieldCpf.getText().length() == 14) {
            String cpf = fieldCpf.getText().substring(0, 3)
            + fieldCpf.getText().substring(4, 7)
            + fieldCpf.getText().substring(8, 11)
            + fieldCpf.getText().substring(12, 14);
            fieldCpf.setBorder(new LineBorder(Color.LIGHT_GRAY));
        } else if (fieldCpf.getText() != null && (fieldCpf.getText().length() < 14
            || fieldCpf.getText().length() > 14)) {
        fieldCpf.setBorder(new LineBorder(Color.LIGHT_GRAY));
        }
    }//GEN-LAST:event_fieldCpfFocusGained

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if (!modoEdicao) {
            cliente = new Cliente();
        } else if (cliente == null) {
            JOptionPane.showMessageDialog(rootPane, "Não foi pré selecionado um cliente"
                + " para realizar alterações");
            return;
        }
        cliente.setStatus(true);
        cliente.setNome(fieldNome.getText().trim().toUpperCase());
        cliente.setSobrenome(fieldSobrenome.getText().trim().toUpperCase());
        cliente.setCpf(fieldCpf.getText());
        cliente.setDataNascimento(fieldData.getText());
        
        String resposta = null;
        if (!modoEdicao) {
            try {
                resposta = ServicoCliente.cadastrarCliente(cliente);
            } catch (Exception ex) {
                Logger.getLogger(IncluirCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            resposta = ServicoCliente.atualizarCliente(cliente);
        }
        if (resposta == null) {
            if (!modoEdicao) {
                JOptionPane.showMessageDialog(null, "Cliente inserido com sucesso");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso");
                this.dispose();
            }

        } else {
            JOptionPane.showMessageDialog(null, resposta);
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void fieldSobrenomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldSobrenomeFocusLost
        if (fieldSobrenome.getText().equals("")) {
            fieldSobrenome.setBorder(new LineBorder(Color.RED));
        }
    }//GEN-LAST:event_fieldSobrenomeFocusLost

    private void fieldSobrenomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldSobrenomeFocusGained
        if (fieldSobrenome.getText().equals("")) {
            fieldSobrenome.setBorder(new LineBorder(Color.LIGHT_GRAY));
        }
    }//GEN-LAST:event_fieldSobrenomeFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JTextField fieldCpf;
    private javax.swing.JTextField fieldData;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JTextField fieldSobrenome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblDtNasc;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSobrenome;
    private javax.swing.JPanel painelCliente;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the modoEdicao
     */
    public boolean isModoEdicao() {
        return modoEdicao;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @param modoEdicao the modoEdicao to set
     */
    public void setModoEdicao(boolean modoEdicao) {
        this.modoEdicao = modoEdicao;
    }
}