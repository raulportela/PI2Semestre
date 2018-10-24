/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.telas.produto;

import br.com.floricultura.model.produto.Produto;
import br.com.floricultura.model.validador.ValidadorProduto;
import br.com.floricultura.servico.ServicoProduto;
import br.com.floricultura.servico.ServicoCliente;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author raul.pportela
 */
public class CadastrarProduto extends javax.swing.JInternalFrame {

    private Produto produto = new Produto();
    private boolean modoEdicao = false;

    /**
     * Creates new form CadastrarCliente
     */
    public CadastrarProduto() {
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

        jPanel1 = new javax.swing.JPanel();
        lblCor = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblValorUnitario = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        lblProduto = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        fieldProduto = new javax.swing.JTextField();
        fieldQuantidade = new javax.swing.JTextField();
        fieldValorUnitario = new javax.swing.JTextField();
        fieldDescricao = new javax.swing.JScrollPane();
        textDescricao = new javax.swing.JTextPane();
        boxCor = new javax.swing.JComboBox<>();
        boxCategoria = new javax.swing.JComboBox<>();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Produto");
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

        jPanel1.setBackground(new java.awt.Color(240, 240, 255));

        lblCor.setText("Cor");

        lblCategoria.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        lblCategoria.setText("Categoria");

        lblValorUnitario.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        lblValorUnitario.setText("Valor Unitário");

        lblQuantidade.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        lblQuantidade.setText("Quantidade");

        lblProduto.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        lblProduto.setText("Produto");

        lblDescricao.setText("Descrição");

        fieldProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldProdutoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldProdutoFocusLost(evt);
            }
        });

        fieldQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldQuantidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldQuantidadeFocusLost(evt);
            }
        });

        fieldValorUnitario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldValorUnitarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldValorUnitarioFocusLost(evt);
            }
        });
        fieldValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldValorUnitarioActionPerformed(evt);
            }
        });

        textDescricao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textDescricaoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textDescricaoFocusLost(evt);
            }
        });
        fieldDescricao.setViewportView(textDescricao);

        boxCor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Vermelho", "Azul", "Amarelo", "Verde", "Branco", "Preto", "Roxo", "Marrom", "Bege", "Bordô", "Turquesa", "Laranja", " " }));

        boxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Rosa", "Flores", "Plantas", "Comes/Bebes" }));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldDescricao)
                    .addComponent(fieldProduto)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCategoria))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCor)
                                    .addComponent(boxCor, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblDescricao)
                            .addComponent(lblProduto)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblValorUnitario)
                                        .addGap(12, 12, 12))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(fieldValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblQuantidade)
                                    .addComponent(fieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(103, 103, 103)
                                        .addComponent(buttonCancelar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonSalvar)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(lblCor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorUnitario)
                    .addComponent(lblQuantidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSalvar)
                    .addComponent(buttonCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if (!modoEdicao) {
            produto = new Produto();
        } else if (produto == null) {
            JOptionPane.showMessageDialog(rootPane, "Não foi pré selecionado um produto"
                    + " para realizar alterações");
            return;
        }
        produto.setStatusProduto(true);
        produto.setProduto(fieldProduto.getText().trim().toUpperCase());
        produto.setCategoria((String) boxCategoria.getSelectedItem());
        produto.setCor((String) boxCor.getSelectedItem());
        produto.setDescricao(textDescricao.getText().trim().toUpperCase());
        produto.setValorUnitario(fieldValorUnitario.getText().trim().toUpperCase().replaceAll("\\,", "\\."));
        produto.setQuantidade(fieldQuantidade.getText().trim().toUpperCase());

        String resposta = null;
        if (!modoEdicao) {
            try {
                resposta = ServicoProduto.cadastroProduto(produto);
            } catch (Exception ex) {
                Logger.getLogger(CadastrarProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                resposta = ServicoProduto.atualizarProduto(produto);
            } catch (Exception ex) {
                Logger.getLogger(CadastrarProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (resposta == null) {
            if (!modoEdicao) {
                JOptionPane.showMessageDialog(rootPane, "Produto inserido com sucesso.");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Produto alterado com sucesso.");
                this.dispose();
            }

        } else {
            JOptionPane.showMessageDialog(null, resposta);
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void fieldProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldProdutoFocusGained
        fieldProduto.setBorder(new LineBorder(Color.BLUE));

    }//GEN-LAST:event_fieldProdutoFocusGained

    private void fieldProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldProdutoFocusLost
        fieldProduto.setBorder(new LineBorder(Color.LIGHT_GRAY));
        if (fieldProduto == null || fieldProduto.getText().length() > 30) {
            fieldProduto.setBorder(new LineBorder(Color.RED));
        }
    }//GEN-LAST:event_fieldProdutoFocusLost

    private void textDescricaoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textDescricaoFocusGained
        textDescricao.setBorder(new LineBorder(Color.BLUE));
    }//GEN-LAST:event_textDescricaoFocusGained

    private void textDescricaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textDescricaoFocusLost
        fieldDescricao.setBorder(new LineBorder(Color.LIGHT_GRAY));
        if (textDescricao.getText() == null || textDescricao.getText().length() > 200) {
            textDescricao.setBorder(new LineBorder(Color.RED));
        }
    }//GEN-LAST:event_textDescricaoFocusLost

    private void fieldQuantidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldQuantidadeFocusGained
        fieldQuantidade.setBorder(new LineBorder(Color.BLUE));
    }//GEN-LAST:event_fieldQuantidadeFocusGained

    private void fieldQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldQuantidadeFocusLost
        fieldQuantidade.setBorder(new LineBorder(Color.LIGHT_GRAY));
        if (fieldQuantidade.getText() == null || fieldQuantidade.getText().length() > 4) {
            fieldQuantidade.setBorder(new LineBorder(Color.RED));
        }
    }//GEN-LAST:event_fieldQuantidadeFocusLost

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        if (modoEdicao && produto != null) {
            fieldProduto.setText(produto.getProduto());
            for (int i = 0; i < 4; i++) {
                if (boxCategoria.getItemAt(i).equals(produto.getCategoria())) {
                    boxCategoria.setSelectedIndex(i);
                    break;
                }
            }
            for (int i = 0; i < 14; i++) {
                if (boxCor.getItemAt(i).equals(produto.getCor())) {
                    boxCor.setSelectedIndex(i);
                    break;
                }
            }
            textDescricao.setText(produto.getDescricao());
            fieldValorUnitario.setText(produto.getValorUnitario());
            fieldQuantidade.setText(produto.getQuantidade());
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void fieldValorUnitarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldValorUnitarioFocusLost
        fieldValorUnitario.setBorder(new LineBorder(Color.LIGHT_GRAY));
        if (fieldValorUnitario.getText() == null || fieldValorUnitario.getText().length() > 9999.99) {
            fieldValorUnitario.setBorder(new LineBorder(Color.RED));
        }
    }//GEN-LAST:event_fieldValorUnitarioFocusLost

    private void fieldValorUnitarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldValorUnitarioFocusGained
        fieldValorUnitario.setBorder(new LineBorder(Color.BLUE));
    }//GEN-LAST:event_fieldValorUnitarioFocusGained

    private void fieldValorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldValorUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldValorUnitarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCategoria;
    private javax.swing.JComboBox<String> boxCor;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JScrollPane fieldDescricao;
    private javax.swing.JTextField fieldProduto;
    private javax.swing.JTextField fieldQuantidade;
    private javax.swing.JTextField fieldValorUnitario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblValorUnitario;
    private javax.swing.JTextPane textDescricao;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * @return the modoEdicao
     */
    public boolean isModoEdicao() {
        return modoEdicao;
    }

    /**
     * @param modoEdicao the modoEdicao to set
     */
    public void setModoEdicao(boolean modoEdicao) {
        this.modoEdicao = modoEdicao;
    }
}
