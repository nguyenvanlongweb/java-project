/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;

/**
 *
 * @author nguye
 */
public class ViewMain extends javax.swing.JFrame {

    /**
     * Creates new form viewMain
     */
    public ViewMain() {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());

        } catch (Exception e) {
        }
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPaneMain = new javax.swing.JTabbedPane();
        viewPanelProduct1 = new view.ViewPanelProduct();
        viewPanelCategory1 = new view.ViewPanelCategory();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        tabPaneMain.addTab("Sản phẩm", viewPanelProduct1);
        tabPaneMain.addTab("Loại sản phẩm", viewPanelCategory1);

        getContentPane().add(tabPaneMain);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    // public static void main(String args[]) {
    // /* Set the Nimbus look and feel */
    // //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code
    // (optional) ">
    // /* If Nimbus (introduced in Java SE 6) is not available, stay with the
    // default look and feel.
    // * For details see
    // http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
    // */
    // try {
    // for (javax.swing.UIManager.LookAndFeelInfo info :
    // javax.swing.UIManager.getInstalledLookAndFeels()) {
    // if ("Nimbus".equals(info.getName())) {
    // javax.swing.UIManager.setLookAndFeel(info.getClassName());
    // break;
    // }
    // }
    // } catch (ClassNotFoundException ex) {
    // java.util.logging.Logger.getLogger(viewMain.class.getName()).log(java.util.logging.Level.SEVERE,
    // null, ex);
    // } catch (InstantiationException ex) {
    // java.util.logging.Logger.getLogger(viewMain.class.getName()).log(java.util.logging.Level.SEVERE,
    // null, ex);
    // } catch (IllegalAccessException ex) {
    // java.util.logging.Logger.getLogger(viewMain.class.getName()).log(java.util.logging.Level.SEVERE,
    // null, ex);
    // } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    // java.util.logging.Logger.getLogger(viewMain.class.getName()).log(java.util.logging.Level.SEVERE,
    // null, ex);
    // }
    // //</editor-fold>
    //
    // /* Create and display the form */
    // java.awt.EventQueue.invokeLater(new Runnable() {
    // public void run() {
    // new viewMain().setVisible(true);
    // }
    // });
    // }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane tabPaneMain;
    private view.ViewPanelCategory viewPanelCategory1;
    private view.ViewPanelProduct viewPanelProduct1;
    // End of variables declaration//GEN-END:variables

    public ViewPanelCategory getViewPanelCategory1() {
        return viewPanelCategory1;
    }

    public ViewPanelProduct getViewPanelProduct1() {
        return viewPanelProduct1;
    }
}
