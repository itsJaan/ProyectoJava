/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectojava;

/**
 *
 * @author Javier
 */
public class Registrarte extends javax.swing.JFrame {
    String users [] = new String [5];
    String contra [] = new String [5];
    int pos_act = -1;
    int pos_tot = -1;
    public Registrarte(){
        initComponents();
        btnLogin.setEnabled(false);
    }
    
    public void Registrar(String regis){
        for (int i = 0; i < users.length; i++) {
            if (regis.equalsIgnoreCase(users[i])) {
                txtPass.setText(contra[i]);
                break;
            }
        }
    }
    /**
     * Creates new form Registrarte
     */


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        chklg = new javax.swing.JCheckBox();
        txtUs = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(399, 360));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setText("LOG IN ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 20, 70, 30);

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setText("UserName ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 70, 134, 19);

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setText("Password ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 145, 134, 19);

        chklg.setText("Log in ");
        chklg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chklgActionPerformed(evt);
            }
        });
        getContentPane().add(chklg);
        chklg.setBounds(247, 286, 71, 23);

        txtUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsActionPerformed(evt);
            }
        });
        getContentPane().add(txtUs);
        txtUs.setBounds(10, 100, 191, 30);

        btnRegistrar.setText("Registrar ");
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(10, 225, 118, 23);

        btnLogin.setText("Log In");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(10, 286, 118, 23);

        jLabel4.setText("Debe registrar por lo menos una vez para poder ingesar al juego ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 254, 314, 14);
        getContentPane().add(txtPass);
        txtPass.setBounds(10, 170, 190, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsActionPerformed

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        // TODO add your handling code here:
        pos_tot++;
        pos_act=pos_tot;
        users[pos_act]=txtUs.getText();
        contra[pos_act]=txtPass.getText();
    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void chklgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chklgActionPerformed
        // TODO add your handling code here:
         if (chklg.isSelected()){
          btnLogin.setEnabled(true);
        }
        else{
        btnLogin.setEnabled(false);
        }
    }//GEN-LAST:event_chklgActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        // TODO add your handling code here:
        Menu obj = new Menu();
        obj.setVisible(true);
        dispose();
       /* String us=txtUs.getText();
        String pass=txtPass.getText();
        Players p1= new Players(us, pass); 
        
        p1.Usuarios(us);
        p1.Contrasenas(pass);
       
        /*if(p1.usuario.equals(us)){
            if(p1.contras.equals(pass)){
                Menu obj = new Menu();
                obj.setVisible(true);
                dispose();
            }           
        }*/
    }//GEN-LAST:event_btnLoginMouseClicked

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
            java.util.logging.Logger.getLogger(Registrarte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrarte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrarte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrarte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrarte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JCheckBox chklg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUs;
    // End of variables declaration//GEN-END:variables
}
