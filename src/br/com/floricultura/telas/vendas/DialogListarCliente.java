/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.telas.vendas;

import br.com.floricultura.model.cliente.Cliente;
import br.com.floricultura.servico.ServicoCliente;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raul de Paula
 */
public class DialogListarCliente extends javax.swing.JDialog {

    TelaVenda telaVenda = new TelaVenda(); 
    
    private Cliente cliente = new Cliente();
  
    public DialogListarCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        inicializacaoTela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelListaClientes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTListaClientes = new javax.swing.JTable();
        buttonCancelar = new javax.swing.JButton();
        buttonSelecionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTListaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome"
            }
        ));
        jScrollPane1.setViewportView(jTListaClientes);

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        buttonSelecionar.setText("Selecionar");
        buttonSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSelecionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelListaClientesLayout = new javax.swing.GroupLayout(jPanelListaClientes);
        jPanelListaClientes.setLayout(jPanelListaClientesLayout);
        jPanelListaClientesLayout.setHorizontalGroup(
            jPanelListaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelListaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanelListaClientesLayout.createSequentialGroup()
                        .addComponent(buttonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                        .addComponent(buttonSelecionar)))
                .addContainerGap())
        );
        jPanelListaClientesLayout.setVerticalGroup(
            jPanelListaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelListaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelar)
                    .addComponent(buttonSelecionar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelListaClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelListaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSelecionarActionPerformed
        if (jTListaClientes.getSelectedRowCount() >= 0) {
            final int row = jTListaClientes.getSelectedRow();
            String cpf = (String) jTListaClientes.getValueAt(row, 0);
            String cpfn = cpf.substring(0, 3)
                    + cpf.substring(4, 7)
                    + cpf.substring(8, 11)
                    + cpf.substring(12, 14);
            Cliente clienteV = null;
            try {
                clienteV = ServicoCliente.procurarCliente(cpfn);
            } catch (Exception ex) {
                Logger.getLogger(DialogListarCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            setClienteV(clienteV);
            this.dispose();
        }
    }//GEN-LAST:event_buttonSelecionarActionPerformed
    
    public void inicializacaoTela(){
        List<Cliente> listaCliente = null;
        try {
            listaCliente = ServicoCliente.listar();  //MOCK
          //  listaCliente = DaoCliente.listar();       //DAO
        } catch (Exception ex) {
            Logger.getLogger(DialogListarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        Cliente cliente;
        DefaultTableModel dtmListaClientes = (DefaultTableModel) jTListaClientes.getModel();
        Object[] dados = new Object[2];
        dtmListaClientes.setRowCount(0);
        int contadorPosicao = 0;

        while (listaCliente != null && contadorPosicao < listaCliente.size()) {
            cliente = listaCliente.get(contadorPosicao);
            String cpf = "";
            cpf += cliente.getCpf().substring(0, 3) + ".";
            cpf += cliente.getCpf().substring(3, 6) + ".";
            cpf += cliente.getCpf().substring(6, 9) + "-";
            cpf += cliente.getCpf().substring(9, 11);
            dados[0] = cpf;
            dados[1] = cliente.getNome() +" "+ cliente.getSobrenome();
            dtmListaClientes.addRow(dados);
            contadorPosicao++;
        }
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
            java.util.logging.Logger.getLogger(DialogListarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogListarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogListarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogListarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogListarCliente dialog = new DialogListarCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSelecionar;
    private javax.swing.JPanel jPanelListaClientes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTListaClientes;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the clienteV
     */
    public Cliente getClienteV() {
        return cliente;
    }

    /**
     * @param clienteV the clienteV to set
     */
    public void setClienteV(Cliente clienteV) {
        this.cliente = clienteV;
    }
}
