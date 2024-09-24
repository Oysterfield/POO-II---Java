/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ufsc.ctc.ine.ine5404.gerenciamento_empresas.view;

import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ufsc.ctc.ine.ine5404.gerenciamento_empresas.model.Empresa;

/**
 *
 * @author cancian
 */
public class FramePrincipal extends javax.swing.JFrame {

	/**
	 * Creates new form FramePrincipal
	 */
	public FramePrincipal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuArquivoNovo = new javax.swing.JMenuItem();
        menuArquivoAbrir = new javax.swing.JMenuItem();
        menuArquivoSalvar = new javax.swing.JMenuItem();
        menuArquivoFechar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuArquivoSair = new javax.swing.JMenuItem();
        menuEmpresa = new javax.swing.JMenu();
        menuEmpresaNova = new javax.swing.JMenuItem();
        menuEmpresaEditar = new javax.swing.JMenuItem();
        menuEmpresaListar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuArquivo.setText("Arquivo");

        menuArquivoNovo.setText("Novo");
        menuArquivo.add(menuArquivoNovo);

        menuArquivoAbrir.setText("Abrir");
        menuArquivo.add(menuArquivoAbrir);

        menuArquivoSalvar.setText("Salvar");
        menuArquivo.add(menuArquivoSalvar);

        menuArquivoFechar.setText("Fechar");
        menuArquivo.add(menuArquivoFechar);
        menuArquivo.add(jSeparator1);

        menuArquivoSair.setText("Sair");
        menuArquivoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArquivoSairActionPerformed(evt);
            }
        });
        menuArquivo.add(menuArquivoSair);

        jMenuBar1.add(menuArquivo);

        menuEmpresa.setText("Empresa");

        menuEmpresaNova.setText("Nova");
        menuEmpresaNova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEmpresaNovaActionPerformed(evt);
            }
        });
        menuEmpresa.add(menuEmpresaNova);

        menuEmpresaEditar.setText("Editar");
        menuEmpresaEditar.setEnabled(false);
        menuEmpresaEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEmpresaEditarActionPerformed(evt);
            }
        });
        menuEmpresa.add(menuEmpresaEditar);

        menuEmpresaListar.setLabel("Listar");
        menuEmpresaListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEmpresaListarActionPerformed(evt);
            }
        });
        menuEmpresa.add(menuEmpresaListar);

        jMenuBar1.add(menuEmpresa);

        jMenu3.setText("Setor");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Colaborador");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuArquivoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArquivoSairActionPerformed
        // TODO add your handling code here:
		this.setVisible(false);
    }//GEN-LAST:event_menuArquivoSairActionPerformed

    private void menuEmpresaNovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEmpresaNovaActionPerformed
        // TODO add your handling code here:
		DialogEmpresa form = new DialogEmpresa(this, true);
		form.setVisible(true);
		// a janela de diálogo modal foi escondida
		Empresa retorno = form.getModalResult();
		if (retorno != null) {
			empresa = retorno;
		}
		menuEmpresaEditar.setEnabled(retorno != null);
    }//GEN-LAST:event_menuEmpresaNovaActionPerformed

    private void menuEmpresaEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEmpresaEditarActionPerformed
        // TODO add your handling code here:
		DialogEmpresa form = new DialogEmpresa(this, true);
		form.setModel(empresa);
		form.setVisible(true);
		// a janela de diálogo modal foi escondida
		Empresa retorno = form.getModalResult();
		if (retorno != null) {
			empresa = retorno;
		}
		menuEmpresaEditar.setEnabled(retorno != null);
    }//GEN-LAST:event_menuEmpresaEditarActionPerformed

    private void menuEmpresaListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEmpresaListarActionPerformed
        // TODO add your handling code here:
        ListaEmpresas lista = new ListaEmpresas();
        lista.setVisible(true);
    }//GEN-LAST:event_menuEmpresaListarActionPerformed
	
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
			java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new FramePrincipal().setVisible(true);
			}
		});
	}

	private Empresa empresa;
        private final ArrayList<Empresa> empresas = new ArrayList<>();
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuItem menuArquivoAbrir;
    private javax.swing.JMenuItem menuArquivoFechar;
    private javax.swing.JMenuItem menuArquivoNovo;
    private javax.swing.JMenuItem menuArquivoSair;
    private javax.swing.JMenuItem menuArquivoSalvar;
    private javax.swing.JMenu menuEmpresa;
    private javax.swing.JMenuItem menuEmpresaEditar;
    private javax.swing.JMenuItem menuEmpresaListar;
    private javax.swing.JMenuItem menuEmpresaNova;
    // End of variables declaration//GEN-END:variables
}
