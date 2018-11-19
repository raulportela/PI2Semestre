/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.telas.principal;

import br.com.floricultura.telas.cliente.IncluirCliente;
import br.com.floricultura.telas.cliente.PesquisarCliente;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JInternalFrame;

/**
 *
 * @author Jeferson Nolasco
 */
public class TelaPrincipal extends javax.swing.JFrame {

            //TELA CLIENTE
    private IncluirCliente cadastroCliente = null;
    private PesquisarCliente telaPesquisarCliente = null;
    
            //TELA PRODUTO
    private CadastrarProduto cadastroProduto = null;  
    private TelaPesquisar telaPesquisarProduto = null;
    
            //TELA RELATORIO
    private PesquisaRelatorio telaRelatorio = null;
    
            //TELA VENDA
    private TelaVenda telaVenda = null;
    
    /**
     * Creates new form principal
     */
    


    public TelaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public IncluirCliente getCadastroCliente(){
        return cadastroCliente;
    }
    
    public void setCasdastroCliente (IncluirCliente cadastroCliente){
        this.cadastroCliente =cadastroCliente;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane() {
            private Image image;
            {
                try {
                    image = ImageIO.read(new File("src/imagens/FundoPrincipal.jpg"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        barraMenus = new javax.swing.JMenuBar();
        menuCliente = new javax.swing.JMenu();
        menuCadastrarCliente = new javax.swing.JMenuItem();
        menuConsultarCliente = new javax.swing.JMenuItem();
        menuCliente1 = new javax.swing.JMenu();
        menuCadastrarCliente1 = new javax.swing.JMenuItem();
        menuConsultarCliente1 = new javax.swing.JMenuItem();
        menuCliente2 = new javax.swing.JMenu();
        menuCadastrarCliente2 = new javax.swing.JMenuItem();
        menuCliente3 = new javax.swing.JMenu();
        menuCadastrarCliente3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Floricultura");
        setExtendedState(6);

        desktopPane.setMaximumSize(new java.awt.Dimension(1024, 768));
        desktopPane.setMinimumSize(new java.awt.Dimension(800, 600));

        menuCliente.setText("Cliente");

        menuCadastrarCliente.setText("Cadastrar Cliente");
        menuCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(menuCadastrarCliente);

        menuConsultarCliente.setText("Consultar Clientes");
        menuConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(menuConsultarCliente);

        barraMenus.add(menuCliente);

        menuCliente1.setText("Produto");

        menuCadastrarCliente1.setText("Cadastrar Produto");
        menuCadastrarCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarCliente1ActionPerformed(evt);
            }
        });
        menuCliente1.add(menuCadastrarCliente1);

        menuConsultarCliente1.setText("Consultar Produto");
        menuConsultarCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarCliente1ActionPerformed(evt);
            }
        });
        menuCliente1.add(menuConsultarCliente1);

        barraMenus.add(menuCliente1);

        menuCliente2.setText("Venda");

        menuCadastrarCliente2.setText("Venda Produto");
        menuCadastrarCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarCliente2ActionPerformed(evt);
            }
        });
        menuCliente2.add(menuCadastrarCliente2);

        barraMenus.add(menuCliente2);

        menuCliente3.setText("Relatorio");

        menuCadastrarCliente3.setText("Relatorio ");
        menuCadastrarCliente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarCliente3ActionPerformed(evt);
            }
        });
        menuCliente3.add(menuCadastrarCliente3);

        barraMenus.add(menuCliente3);

        setJMenuBar(barraMenus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 530, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarClienteActionPerformed
           //TELA DE INCLUIR CLIENTE  "CadastroCliente"
       if(getCadastroCliente() == null || !cadastroCliente.isDisplayable()){
            cadastroCliente = new IncluirCliente();
            desktopPane.add(getCadastroCliente());
            this.openFrameInCenter (getCadastroCliente());
        }
        getCadastroCliente().toFront();

    }//GEN-LAST:event_menuCadastrarClienteActionPerformed

    private void menuConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarClienteActionPerformed

        // TELA DE PESQUISAR CLIENTE "TelaPesquisarCliente"
        if (telaPesquisarCliente == null || !telaPesquisarCliente.isDisplayable()){
            try {
                telaPesquisarCliente = new PesquisarCliente ();
            } catch (Exception ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            desktopPane.add(telaPesquisarCliente);
            this.openFrameInCenter (telaPesquisarCliente);
        }
        telaPesquisarCliente.toFront ();
             
    }//GEN-LAST:event_menuConsultarClienteActionPerformed

    private void menuCadastrarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarCliente1ActionPerformed
        // TELA DE CADASTRAR  PRODUTO "CadastrProduto"
        if(getCadastroProduto() == null || !cadastroProduto.isDisplayable()){
            cadastroProduto = new CadastrarProduto ();
            desktopPane.add(getCadastroProduto());
            this.openFrameInCenter (getCadastroProduto());
        }
        getCadastroProduto().toFront();
    }//GEN-LAST:event_menuCadastrarCliente1ActionPerformed

    private void menuConsultarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarCliente1ActionPerformed
        //TELA PARA CONSULTAR PRODUTO
        if(telaPesquisarProduto == null || !telaPesquisarProduto.isDisplayable()){
            try {
                telaPesquisarProduto = new TelaPesquisar();
            } catch (Exception ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            desktopPane.add(telaPesquisarProduto);
            this.openFrameInCenter(telaPesquisarProduto);
        }
        telaPesquisarProduto.toFront();
    }//GEN-LAST:event_menuConsultarCliente1ActionPerformed

    private void menuCadastrarCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarCliente2ActionPerformed
        //TELA DE VENDAS DE PRODUTO
        if(telaVenda == null || !telaVenda.isDisplayable()){
            telaVenda = new TelaVenda ();
            desktopPane.add (telaVenda);
            this.openFrameInCenter(telaVenda);
        }
        telaVenda.toFront();
    }//GEN-LAST:event_menuCadastrarCliente2ActionPerformed

    private void menuCadastrarCliente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarCliente3ActionPerformed
        // TELA DE RELATORIO
        if(telaRelatorio == null || !telaRelatorio.isDisplayable()){
            telaRelatorio = new PesquisaRelatorio();
            desktopPane.add(telaRelatorio);
            this.openFrameInCenter (telaRelatorio);
            
        }
        telaRelatorio.toFront();
    }//GEN-LAST:event_menuCadastrarCliente3ActionPerformed

    public void openFrameInCenter(JInternalFrame jif) {

        Dimension desktopSize = getSize();

        Dimension jInternalFrameSize = jif.getSize();

        int width = (desktopSize.width - jInternalFrameSize.width) / 2;
        int height = (desktopSize.height - jInternalFrameSize.height) / 2;

        jif.setLocation(width, height);
        jif.setVisible(true);

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenus;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem menuCadastrarCliente;
    private javax.swing.JMenuItem menuCadastrarCliente1;
    private javax.swing.JMenuItem menuCadastrarCliente2;
    private javax.swing.JMenuItem menuCadastrarCliente3;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenu menuCliente1;
    private javax.swing.JMenu menuCliente2;
    private javax.swing.JMenu menuCliente3;
    private javax.swing.JMenuItem menuConsultarCliente;
    private javax.swing.JMenuItem menuConsultarCliente1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the cadastroProduto
     */
    public CadastrarProduto getCadastroProduto() {
        return cadastroProduto;
    }

    

}
