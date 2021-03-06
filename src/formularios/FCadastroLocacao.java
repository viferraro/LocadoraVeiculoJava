/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import classes.Carro;
import classes.Cliente;
import classes.Locacao;
import dados.DadosCarros;
import dados.DadosClientes;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Vivian
 */
public class FCadastroLocacao extends javax.swing.JDialog {

    private Locacao locacaoTemp = null;
    private boolean alterar = false;

    /**
     * Creates new form FCadastroLocacao
     */
    public FCadastroLocacao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.carregarComboClientes();
        this.carregarComboCarros();
    }

    public Locacao execute() {
        this.setVisible(true);
        return this.locacaoTemp;
    }

    public Locacao execute(Locacao loc) {
        this.alterar = true;
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        campoDataLocacaoFormat.setText(f.format(loc.getDataLocacao()));

        for (Carro carro : DadosCarros.lstCarros) {
            comboCarros.setSelectedItem(carro.informacoes());
        }
        for (Cliente cliente : DadosClientes.lstClientes) {
            comboCliente.setSelectedItem((cliente.informacao()));
        }
        this.locacaoTemp = loc;
        this.setVisible(true);
        return this.locacaoTemp;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaDataLocacao = new javax.swing.JLabel();
        campoDataLocacaoFormat = new javax.swing.JFormattedTextField();
        comboCarros = new javax.swing.JComboBox<>();
        comboCliente = new javax.swing.JComboBox<>();
        etiquetaCadCarro = new javax.swing.JLabel();
        etiquetaCadCliente = new javax.swing.JLabel();
        botaoGravar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        etiquetaDataLocacao.setText("Data da Locação");

        try {
            campoDataLocacaoFormat.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        comboCarros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCarrosActionPerformed(evt);
            }
        });

        comboCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClienteActionPerformed(evt);
            }
        });

        etiquetaCadCarro.setText("Carro");

        etiquetaCadCliente.setText("Cliente");

        botaoGravar.setText("Gravar");
        botaoGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGravarActionPerformed(evt);
            }
        });

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaCadCarro)
                                    .addComponent(comboCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(botaoCancelar)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaCadCliente)
                                    .addComponent(comboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(botaoGravar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiquetaDataLocacao)
                            .addComponent(campoDataLocacaoFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(etiquetaDataLocacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoDataLocacaoFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCadCarro)
                    .addComponent(etiquetaCadCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCarros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoGravar))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboCarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCarrosActionPerformed
        /* if(comboCarros.getSelectedIndex() > -1){
           Carro c = DadosCarros.lstCarros.get(comboCarros.getSelectedIndex());
            if(c != null){                               
               this.locacaoTemp.setCarro(c);
                
                }
            }
         */
    }//GEN-LAST:event_comboCarrosActionPerformed

    private void comboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClienteActionPerformed
        /*if(comboCliente.getSelectedIndex() > -1){
            Cliente p = DadosClientes.lstClientes.get(comboCliente.getSelectedIndex());
            if(p != null){                               
                this.locacaoTemp.setCliente(p);
            }            
        }  */
    }//GEN-LAST:event_comboClienteActionPerformed

    private void botaoGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGravarActionPerformed
        try {
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            Locacao locacao = null;
            if (this.alterar) {
                locacao = this.locacaoTemp;
            } else {
                locacao = new Locacao();
            }
            locacao.setDataLocacao(f.parse(campoDataLocacaoFormat.getText()));
            if (comboCarros.getSelectedIndex() > -1) {
                Carro c = DadosCarros.lstCarros.get(comboCarros.getSelectedIndex());
                if (c != null) {
                   
                    locacao.setCarro(c);

                }
            }
            if (comboCliente.getSelectedIndex() > -1) {
                Cliente p = DadosClientes.lstClientes.get(comboCliente.getSelectedIndex());
                if (p != null) {
                    locacao.setCliente(p);
                }
                this.locacaoTemp = locacao;
                this.setVisible(false);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Não foi possível gravar a locação. \n\n" + ex.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoGravarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
         this.locacaoTemp = null;
        this.setVisible(false);
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void carregarComboClientes() {

        comboCliente.removeAllItems();
        for (Cliente cliente : DadosClientes.lstClientes) {
            comboCliente.addItem(cliente.informacao());
        }
        comboCliente.repaint();
    }

    private void carregarComboCarros() {
        comboCarros.removeAllItems();
        for (Carro carro : DadosCarros.lstCarros) {
            comboCarros.addItem(carro.informacoes());
        }
        comboCarros.repaint();
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
            java.util.logging.Logger.getLogger(FCadastroLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FCadastroLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FCadastroLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FCadastroLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FCadastroLocacao dialog = new FCadastroLocacao(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoGravar;
    private javax.swing.JFormattedTextField campoDataLocacaoFormat;
    private javax.swing.JComboBox<String> comboCarros;
    private javax.swing.JComboBox<String> comboCliente;
    private javax.swing.JLabel etiquetaCadCarro;
    private javax.swing.JLabel etiquetaCadCliente;
    private javax.swing.JLabel etiquetaDataLocacao;
    // End of variables declaration//GEN-END:variables
}
