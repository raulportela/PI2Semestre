/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoPoo.telas.funcionario;

import br.com.projetoPoo.model.pessoa.funcionario.Funcionario;
import br.com.projetoPoo.servico.ServicoFuncionario;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author Raul de Paula
 */
public class IncluirFuncionario extends javax.swing.JInternalFrame {

    private boolean modoEdicao;
    private Funcionario funcionario;

    public boolean isModoEdicao() {
        return modoEdicao;
    }

    public void setModoEdicao(boolean modoEdicao) {
        this.modoEdicao = modoEdicao;
    }

    /**
     * Creates new form IncluirFuncionario
     */
    public IncluirFuncionario() {
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

        painelFuncionario = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblSobrenome = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblDtNasc = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblRg = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        lblCadastroFuncionario = new javax.swing.JLabel();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        fieldSobrenome = new javax.swing.JTextField();
        fieldCpf = new javax.swing.JTextField();
        fieldData = new javax.swing.JTextField();
        fieldNome = new javax.swing.JTextField();
        fieldUsuario = new javax.swing.JTextField();
        fieldRg = new javax.swing.JTextField();
        fieldSenha = new javax.swing.JPasswordField();
        comboCargo = new javax.swing.JComboBox<>();

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

        painelFuncionario.setBackground(new java.awt.Color(240, 240, 255));

        lblNome.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        lblNome.setText("Nome*");

        lblSobrenome.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        lblSobrenome.setText("Sobrenome*");

        lblCPF.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        lblCPF.setText("CPF*");

        lblDtNasc.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        lblDtNasc.setText("Data Nascimento*");

        lblUsuario.setText("Usuario*");

        lblSenha.setText("Senha*");

        lblRg.setText("RG");

        lblCargo.setText("Cargo");

        lblCadastroFuncionario.setFont(new java.awt.Font("Arial Black", 1, 21)); // NOI18N
        lblCadastroFuncionario.setText("Cadastro de Funcionario");

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

        fieldSobrenome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldSobrenomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldSobrenomeFocusLost(evt);
            }
        });

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

        comboCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Gerente", "Peão" }));

        javax.swing.GroupLayout painelFuncionarioLayout = new javax.swing.GroupLayout(painelFuncionario);
        painelFuncionario.setLayout(painelFuncionarioLayout);
        painelFuncionarioLayout.setHorizontalGroup(
            painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFuncionarioLayout.createSequentialGroup()
                        .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldSobrenome))
                    .addGroup(painelFuncionarioLayout.createSequentialGroup()
                        .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCPF)
                            .addComponent(fieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelFuncionarioLayout.createSequentialGroup()
                                .addComponent(fieldData)
                                .addGap(4, 4, 4))
                            .addGroup(painelFuncionarioLayout.createSequentialGroup()
                                .addComponent(lblDtNasc)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFuncionarioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSalvar))
                    .addGroup(painelFuncionarioLayout.createSequentialGroup()
                        .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelFuncionarioLayout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addGap(161, 161, 161)
                                .addComponent(lblSobrenome))
                            .addComponent(lblCadastroFuncionario)
                            .addGroup(painelFuncionarioLayout.createSequentialGroup()
                                .addComponent(lblRg)
                                .addGap(114, 114, 114)
                                .addComponent(lblCargo)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelFuncionarioLayout.createSequentialGroup()
                        .addComponent(fieldRg)
                        .addGap(6, 6, 6)
                        .addComponent(comboCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelFuncionarioLayout.createSequentialGroup()
                        .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addComponent(fieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelFuncionarioLayout.createSequentialGroup()
                                .addComponent(lblSenha)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(fieldSenha))))
                .addContainerGap())
        );
        painelFuncionarioLayout.setVerticalGroup(
            painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadastroFuncionario)
                .addGap(18, 18, 18)
                .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(lblSobrenome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFuncionarioLayout.createSequentialGroup()
                        .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldSobrenome)
                            .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFuncionarioLayout.createSequentialGroup()
                        .addComponent(lblDtNasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRg)
                    .addComponent(lblCargo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(lblSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonSalvar)
                    .addComponent(buttonCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldSobrenomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldSobrenomeFocusGained
        if (fieldSobrenome.getText().equals("")) {
            fieldSobrenome.setBorder(new LineBorder(Color.LIGHT_GRAY));
        }
    }//GEN-LAST:event_fieldSobrenomeFocusGained

    private void fieldSobrenomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldSobrenomeFocusLost
        if (fieldSobrenome.getText().equals("")) {
            fieldSobrenome.setBorder(new LineBorder(Color.RED));
        }
    }//GEN-LAST:event_fieldSobrenomeFocusLost

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

        if (!modoEdicao) {

        } else if (getFuncionario() == null) {
            JOptionPane.showMessageDialog(rootPane, "Não foi pré selecionado um funcionario"
                    + " para realizar alterações");
            return;
        }
        funcionario = new Funcionario();
        getFuncionario().setNome(fieldNome.getText().trim().toUpperCase());
        getFuncionario().setSobrenome(fieldSobrenome.getText().trim().toUpperCase());
        getFuncionario().setCpf(fieldCpf.getText());
        getFuncionario().setStatus(true);
        getFuncionario().setRg(fieldRg.getText().trim().toUpperCase());
        getFuncionario().setDataNascimento(fieldData.getText());
        getFuncionario().setUsuario(fieldUsuario.getText());

        String resposta = null;
        if (!modoEdicao) {
            try {
                resposta = ServicoFuncionario.inserir(getFuncionario());
            } catch (Exception ex) {
                Logger.getLogger(IncluirFuncionario.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            resposta = ServicoFuncionario.atualizar(getFuncionario());
        }
        if (resposta == null) {
            if (!modoEdicao) {
                JOptionPane.showMessageDialog(null, "Funcionario inserido com sucesso");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Funcionario alterado com sucesso");
                this.dispose();
            }

        } else {
            JOptionPane.showMessageDialog(null, resposta);
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

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

    private void fieldCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCpfActionPerformed

    private void fieldDataFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldDataFocusGained
        if (fieldData.getText() != null && fieldData.getText().length() != 10) {
            fieldData.setText(null);
            fieldData.setBorder(new LineBorder(Color.LIGHT_GRAY));
        }
    }//GEN-LAST:event_fieldDataFocusGained

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

    private void fieldDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldDataActionPerformed

    private void fieldNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldNomeFocusGained
        fieldNome.setBorder(new LineBorder(Color.LIGHT_GRAY));
    }//GEN-LAST:event_fieldNomeFocusGained

    private void fieldNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldNomeFocusLost
        if (fieldNome.getText().equals("")) {
            fieldNome.setBorder(new LineBorder(Color.RED));
        }
    }//GEN-LAST:event_fieldNomeFocusLost

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        if (modoEdicao && funcionario != null) {

            //Para atribuir valores para campos de texto, utilizamos o
            //método setText(valor_a_ser_atribuído)
            fieldNome.setText(funcionario.getNome());
            fieldSobrenome.setText(funcionario.getSobrenome());
            fieldCpf.setText(funcionario.getCpf());
            fieldData.setText(funcionario.getDataNascimento());
            fieldRg.setText(funcionario.getRg());
            fieldRg.setText(funcionario.getRg());

            for (int i = 0; i < comboCargo.getItemCount(); i++) {
                if (comboCargo.getItemAt(i).equals(funcionario.getCargo())) {
                    comboCargo.setSelectedIndex(i);
                    break;
                }
            }
            fieldUsuario.setText(funcionario.getUsuario());
            fieldSenha.setText(funcionario.getSenha());
            fieldCpf.setEditable(false);
        }
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JComboBox<String> comboCargo;
    private javax.swing.JTextField fieldCpf;
    private javax.swing.JTextField fieldData;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JTextField fieldRg;
    private javax.swing.JPasswordField fieldSenha;
    private javax.swing.JTextField fieldSobrenome;
    private javax.swing.JTextField fieldUsuario;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCadastroFuncionario;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblDtNasc;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRg;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSobrenome;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel painelFuncionario;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the funcionario
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
