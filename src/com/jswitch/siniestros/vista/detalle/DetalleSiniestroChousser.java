/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DetalleSiniestroChousser.java
 *
 * Created on 31/07/2011, 05:10:40 PM
 */
package com.jswitch.siniestros.vista.detalle;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Adrian
 */
public class DetalleSiniestroChousser extends javax.swing.JDialog {

    /** Creates new form DetalleSiniestroChousser */
    public DetalleSiniestroChousser() {
        this.setModal(true);
        initComponents();
        Evento e = new Evento();
        jButton1.addActionListener(e);
        jButton2.addActionListener(e);
        jButton3.addActionListener(e);
        jButton4.addActionListener(e);
        jButton5.addActionListener(e);
        jButton6.addActionListener(e);
        jButton7.addActionListener(e);
        jButton8.addActionListener(e);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(((int) d.getWidth() - this.getWidth()) / 2, ((int) d.getHeight() - this.getHeight()) / 2);

    }

    class Evento implements
            ActionListener {

        public void actionPerformed(ActionEvent e) {
            resp = ((JButton) e.getSource()).getText();
            setVisible(false);
        }
    }
    private String resp = "";
    private String tipos[] = {"APS", "Ayuda Social", "Carta Aval", "Emergencia", "Gastos Funerarios", "Reembolso", "Vida"};

    /**
     * posibles opciones seleccionadas por el analista para ver que tipo de detalle
     * de siniestro desea:
     * <p>
     * -1. Cerrar<br/>
     * &nbsp;0. APS<br/>
     * &nbsp;1. Ayuda Social<br/>
     * &nbsp;2. Carta Aval<br/>
     * &nbsp;3. Emergencia<br/>
     * &nbsp;4. Gastos Funerarios<br/>
     * &nbsp;5. Reembolso<br/>
     * &nbsp;6. Vida<br/>
     * </p>
     * @return selected Option index
     */
    public static int showDialog() {
        DetalleSiniestroChousser d = null;
        try {
            d = new DetalleSiniestroChousser();
            d.setVisible(true);
            for (int i = 0; i < d.tipos.length; i++) {
                if (d.resp.equals(d.tipos[i])) {
                    return i;
                }
            }
        } finally {
            d.dispose();
        }

        return -1;
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setTitle("Tipo de Siniestro");
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(0, 2));

        jButton1.setText("APS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);

        jButton2.setText("Ayuda Social");
        getContentPane().add(jButton2);

        jButton3.setText("Carta Aval");
        getContentPane().add(jButton3);

        jButton4.setText("Emergencia");
        getContentPane().add(jButton4);

        jButton5.setText("Gastos Funerarios");
        getContentPane().add(jButton5);

        jButton6.setText("Reembolso");
        getContentPane().add(jButton6);

        jButton7.setText("Vida");
        getContentPane().add(jButton7);

        jButton8.setText("Cerrar");
        getContentPane().add(jButton8);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    // End of variables declaration//GEN-END:variables
}
