/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ufsc.ctc.ine.ine5404.gerenciamento_empresas.view;

/**
 *
 * @author Win10
 */
public class DialogEnderecoEmpresa extends javax.swing.JDialog {

    /**
     * Creates new form DialogEnderecoEmpresa
     */
    public DialogEnderecoEmpresa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jDialog1 = new javax.swing.JDialog();
        buttonOkEndereco = new javax.swing.JButton();
        buttonCancelarEndereco = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        logradouroEndereco = new javax.swing.JLabel();
        textLogradouro = new javax.swing.JTextField();
        numeroEndereco = new javax.swing.JLabel();
        textNumero = new javax.swing.JTextField();
        bairroEndereco = new javax.swing.JLabel();
        complementoEndereco = new javax.swing.JLabel();
        textBairro = new javax.swing.JTextField();
        textComplemento = new javax.swing.JTextField();
        cepEndereco = new javax.swing.JLabel();
        textCEP = new javax.swing.JTextField();
        cidadeEndereco = new javax.swing.JLabel();
        textCidade = new javax.swing.JTextField();
        ufEndereco = new javax.swing.JLabel();
        textUF = new javax.swing.JTextField();
        paisEndereco = new javax.swing.JLabel();
        textPais = new javax.swing.JTextField();

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonOkEndereco.setText("Ok");
        buttonOkEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOkEnderecoActionPerformed(evt);
            }
        });

        buttonCancelarEndereco.setText("Cancelar");
        buttonCancelarEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarEnderecoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        logradouroEndereco.setText("Logradouro:");

        numeroEndereco.setText("Número:");

        bairroEndereco.setText("Bairro:");

        complementoEndereco.setText("Complemento:");

        cepEndereco.setText("CEP:");

        cidadeEndereco.setText("Cidade:");

        ufEndereco.setText("UF:");

        paisEndereco.setText("País:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logradouroEndereco)
                            .addComponent(numeroEndereco))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNumero)
                            .addComponent(textLogradouro)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(complementoEndereco)
                        .addGap(20, 20, 20)
                        .addComponent(textComplemento))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bairroEndereco)
                        .addGap(66, 66, 66)
                        .addComponent(textBairro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cepEndereco)
                        .addGap(76, 76, 76)
                        .addComponent(textCEP))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cidadeEndereco)
                        .addGap(60, 60, 60)
                        .addComponent(textCidade))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ufEndereco)
                        .addGap(83, 83, 83)
                        .addComponent(textUF))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(paisEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(textPais, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logradouroEndereco)
                    .addComponent(textLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroEndereco)
                    .addComponent(textNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bairroEndereco)
                    .addComponent(textBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(complementoEndereco)
                    .addComponent(textComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cepEndereco)
                    .addComponent(textCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidadeEndereco)
                    .addComponent(textCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ufEndereco)
                    .addComponent(textUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paisEndereco)
                    .addComponent(textPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(buttonOkEndereco)
                .addGap(36, 36, 36)
                .addComponent(buttonCancelarEndereco)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonOkEndereco)
                    .addComponent(buttonCancelarEndereco))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOkEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOkEnderecoActionPerformed
        // TODO add your handling code here:
        try {
            model = new Endereco(textLogradouro.getText(), textNumero.getText(), textBairro.getText(), textComplemento.getText(), textCEP.getText(), textCidade.getText(), textUF.getText(), textPais.getText());
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(DialogEnderecoEmpresa.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Ô Ixtepô, preenche tudo aí");
        }
    }//GEN-LAST:event_buttonOkEnderecoActionPerformed

    private void buttonCancelarEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarEnderecoActionPerformed
        // TODO add your handling code here:
        model = null;
        this.setVisible(false);
    }//GEN-LAST:event_buttonCancelarEnderecoActionPerformed

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
            java.util.logging.Logger.getLogger(DialogEnderecoEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogEnderecoEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogEnderecoEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogEnderecoEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogEnderecoEmpresa dialog = new DialogEnderecoEmpresa(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel bairroEndereco;
    private javax.swing.JButton buttonCancelarEndereco;
    private javax.swing.JButton buttonOkEndereco;
    private javax.swing.JLabel cepEndereco;
    private javax.swing.JLabel cidadeEndereco;
    private javax.swing.JLabel complementoEndereco;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logradouroEndereco;
    private javax.swing.JLabel numeroEndereco;
    private javax.swing.JLabel paisEndereco;
    private javax.swing.JTextField textBairro;
    private javax.swing.JTextField textCEP;
    private javax.swing.JTextField textCidade;
    private javax.swing.JTextField textComplemento;
    private javax.swing.JTextField textLogradouro;
    private javax.swing.JTextField textNumero;
    private javax.swing.JTextField textPais;
    private javax.swing.JTextField textUF;
    private javax.swing.JLabel ufEndereco;
    // End of variables declaration//GEN-END:variables
}
