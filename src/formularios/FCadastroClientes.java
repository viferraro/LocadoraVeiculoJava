/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import classes.Cliente;
import classes.PessoaFisica;
import classes.PessoaJuridica;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Vivian
 */
public class FCadastroClientes extends javax.swing.JDialog {

    private Cliente clienteTemp = null;
    private boolean alterar = false;

    /**
     * Creates new form FCadastroClientes
     */
    public FCadastroClientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public Cliente execute() {
        this.setVisible(true);
        return this.clienteTemp;
    }

    public Cliente execute(Cliente c) {

        this.alterar = true;
        campoNome.setText(c.getNome());
        campoEndereco.setText(c.getEndereco());
        if (c instanceof PessoaFisica) {
            PessoaFisica x = (PessoaFisica) c;
            campoCpfOuCnpj.setText(x.getCPF());
            campoCnh.setText(x.getCNH());
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            campoDtNascimOuDesconto.setText(f.format(x.getDataNascimento()));
            this.clienteTemp = c;
        } else {
            PessoaJuridica y = (PessoaJuridica) c;
            campoCpfOuCnpj.setText(y.getCNPJ());
            campoCnh.setText(y.getCNHResponsavel());
            campoDtNascimOuDesconto.setText(y.getDescontoLocacao());
            this.clienteTemp = c;
        }

        this.setVisible(true);
        return this.clienteTemp;
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
        etiquetaNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        etiquetaEndereco = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        botaoRadioPF = new javax.swing.JRadioButton();
        botaoRadioPJ = new javax.swing.JRadioButton();
        etiquetaCpfCnpj = new javax.swing.JLabel();
        etiquetaCnh = new javax.swing.JLabel();
        etiquetaDtNascimento = new javax.swing.JLabel();
        botaoGravar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        campoDtNascimOuDesconto = new javax.swing.JFormattedTextField();
        campoCpfOuCnpj = new javax.swing.JFormattedTextField();
        campoCnh = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Clientes");

        etiquetaNome.setText("Nome");

        etiquetaEndereco.setText("Endereço");

        buttonGroup1.add(botaoRadioPF);
        botaoRadioPF.setSelected(true);
        botaoRadioPF.setText("Pessoa Física");
        botaoRadioPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRadioPFActionPerformed(evt);
            }
        });

        buttonGroup1.add(botaoRadioPJ);
        botaoRadioPJ.setText("Pessoa Jurídica");
        botaoRadioPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRadioPJActionPerformed(evt);
            }
        });

        etiquetaCpfCnpj.setText("CPF");

        etiquetaCnh.setText("CNH");

        etiquetaDtNascimento.setText("Data de Nascimento");

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

        try {
            campoDtNascimOuDesconto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            campoCpfOuCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            campoCnh.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaNome)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaCpfCnpj)
                    .addComponent(campoCpfOuCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botaoCancelar)
                        .addGap(93, 93, 93)
                        .addComponent(botaoGravar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoCnh, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoDtNascimOuDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaCnh)
                                .addGap(159, 159, 159)
                                .addComponent(etiquetaDtNascimento)))
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaEndereco)
                            .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoRadioPF)
                            .addComponent(botaoRadioPJ))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNome)
                    .addComponent(etiquetaEndereco)
                    .addComponent(botaoRadioPF))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(botaoRadioPJ)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCpfCnpj)
                    .addComponent(etiquetaCnh)
                    .addComponent(etiquetaDtNascimento))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCpfOuCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoDtNascimOuDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoGravar))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.clienteTemp = null;
        this.setVisible(false);
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoRadioPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRadioPJActionPerformed
        if (botaoRadioPJ.isSelected()) {
            etiquetaCpfCnpj.setText("CNPJ");
            etiquetaCnh.setText("CNH do Responsável");
            etiquetaDtNascimento.setText("Desconto na Locação");

            MaskFormatter mask = null;

            try {
                mask = new MaskFormatter("##.###.###/####-##");
            } catch (ParseException ex) {
                Logger.getLogger(FCadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
            DefaultFormatterFactory dff = new DefaultFormatterFactory(mask);
            campoCpfOuCnpj.setFormatterFactory(dff);
            try {
                mask = new MaskFormatter("##%");
            } catch (ParseException ex) {
                Logger.getLogger(FCadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
            DefaultFormatterFactory dff2 = new DefaultFormatterFactory(mask);
            campoDtNascimOuDesconto.setFormatterFactory(dff2);
        }

    }//GEN-LAST:event_botaoRadioPJActionPerformed

    private void botaoRadioPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRadioPFActionPerformed
        if (botaoRadioPF.isSelected()) {
            etiquetaCpfCnpj.setText("CPF");
            etiquetaCnh.setText("CNH");
            etiquetaDtNascimento.setText("Data de Nascimento");
            MaskFormatter mask = null;

            try {
                mask = new MaskFormatter("###.###.###/##");
            } catch (ParseException ex) {
                Logger.getLogger(FCadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
            DefaultFormatterFactory dff = new DefaultFormatterFactory(mask);
            campoCpfOuCnpj.setFormatterFactory(dff);
            try {
                mask = new MaskFormatter("##/##/####");
            } catch (ParseException ex) {
                Logger.getLogger(FCadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
            DefaultFormatterFactory dff2 = new DefaultFormatterFactory(mask);
            campoDtNascimOuDesconto.setFormatterFactory(dff2);
        }
    }//GEN-LAST:event_botaoRadioPFActionPerformed

    private void botaoGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGravarActionPerformed
        try {
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");

            Cliente cliente = null;
            if (botaoRadioPF.isSelected()) {
                if (this.alterar) {
                    cliente = this.clienteTemp;
                } else {
                    cliente = new PessoaFisica();
                }

                PessoaFisica x = (PessoaFisica) cliente;
                x.setCPF(campoCpfOuCnpj.getText().replace(".", "").replace("/", "").trim());
                x.setDataNascimento(f.parse(campoDtNascimOuDesconto.getText()));
                x.setCNH(campoCnh.getText());
            } else if (botaoRadioPJ.isSelected()) {
                if (this.alterar) {
                    cliente = this.clienteTemp;
                } else {
                    cliente = new PessoaJuridica();
                }
                ((PessoaJuridica) cliente).setCNPJ(campoCpfOuCnpj.getText().replace(".", "").replace("-", "").replace("/", "").trim());
                ((PessoaJuridica) cliente).setCNHResponsavel(campoCnh.getText());
                ((PessoaJuridica) cliente).setDescontoLocacao(campoDtNascimOuDesconto.getText());
            }

            cliente.setNome(campoNome.getText());
            cliente.setEndereco(campoEndereco.getText());

            this.clienteTemp = cliente;
            this.setVisible(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Não foi possível gravar pessoa. \n\n" + ex.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoGravarActionPerformed

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
            java.util.logging.Logger.getLogger(FCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FCadastroClientes dialog = new FCadastroClientes(new javax.swing.JFrame(), true);
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
    private javax.swing.JRadioButton botaoRadioPF;
    private javax.swing.JRadioButton botaoRadioPJ;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField campoCnh;
    private javax.swing.JFormattedTextField campoCpfOuCnpj;
    private javax.swing.JFormattedTextField campoDtNascimOuDesconto;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoNome;
    private javax.swing.JLabel etiquetaCnh;
    private javax.swing.JLabel etiquetaCpfCnpj;
    private javax.swing.JLabel etiquetaDtNascimento;
    private javax.swing.JLabel etiquetaEndereco;
    private javax.swing.JLabel etiquetaNome;
    // End of variables declaration//GEN-END:variables
}
