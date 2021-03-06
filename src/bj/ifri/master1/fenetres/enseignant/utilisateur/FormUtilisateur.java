/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bj.ifri.master1.fenetres.enseignant.utilisateur;

import bj.ifri.master1.emploi.modele.Dao;
import bj.ifri.master1.emploi.modele.Utilisateur;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author imandine
 */
public class FormUtilisateur extends javax.swing.JFrame  {
    
    private String mode /*modification , creation*/ ;
    private static Utilisateur courant;

    /**
     * Creates new form parametres
     */
    public FormUtilisateur() {
        initComponents();
    }

    public FormUtilisateur(String mode) {
        this.mode = mode;
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initComponents();
    }
    
    public FormUtilisateur(String mode, Utilisateur utilisateur) {
        
        this.courant = utilisateur;
        this.mode = mode;
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        
        initComponents();
         if("modification".equals(mode)){
            login.setText(utilisateur.getLogin());
            login.setEnabled(false);
            nom.setText(utilisateur.getNom());
            prenom.setText(utilisateur.getPrenom());
            motpasse.setText(utilisateur.getMotpasse());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
 regenerated by the FormUtilisateur Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        login = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        prenom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        motpasse = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Login :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel2.setText("Nom:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 100, -1));
        getContentPane().add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 340, -1));

        jButton3.setText("Enregistrer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));
        getContentPane().add(prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 350, -1));

        jLabel3.setText("Prenom:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));
        getContentPane().add(motpasse, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 350, -1));

        jLabel5.setText("Mot de passe :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Gestion des utilisateurs");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        if( "".equals( login.getText().trim()) ){
            JOptionPane.showMessageDialog(this, "Le loginest obligatoire");
            return;
        }
        if( "".equals( nom.getText().trim()) ){
            JOptionPane.showMessageDialog(this, "Le nom est obligatoire");
            return;
        }
        if( "".equals( prenom.getText().trim()) ){
            JOptionPane.showMessageDialog(this, "Le prenom est obligatoire");
            return;
        }
        if( "".equals( motpasse.getText().trim()) ){
            JOptionPane.showMessageDialog(this, "Le mot de passe est obligatoire");
            return;
        }
        
        switch(mode){
            case "creation" : 
                try {
                    // TODO add your handling code here:
                    Dao.Connect();
                    Connection connection = Dao.getConnection();

                    String query = "INSERT INTO \"utilisateur\" VALUES(?,?,?,?)";
                    PreparedStatement pst = connection.prepareStatement(query);
                    pst.setString(1, login.getText());
                    pst.setString(2, nom.getText());
                    pst.setString(3, prenom.getText());
                    pst.setString(4, motpasse.getText());
                    int result = pst.executeUpdate();
                } catch (SQLException ex) {
                    Logger.getLogger(FormUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
                }   
                break;
            case "modification": 
                try {
                Dao.Connect();
                Connection connection = Dao.getConnection();
                    String query = "UPDATE \"utilisateur\" SET nom = ?, prenom = ?, motpasse=? WHERE login = ?";
                    PreparedStatement pst = connection.prepareStatement(query);
                    pst.setString(2, nom.getText());
                    pst.setString(3, prenom.getText());
                    pst.setString(4, motpasse.getText());
                    pst.setString(1, login.getText());
                    int result = pst.executeUpdate();
                } catch (SQLException ex) {
                    Logger.getLogger(FormUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
        }
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
 

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUtilisateur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField login;
    private javax.swing.JTextField motpasse;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField prenom;
    // End of variables declaration//GEN-END:variables

}
