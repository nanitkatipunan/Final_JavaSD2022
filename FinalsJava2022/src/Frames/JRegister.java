/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Controller1.*;
import javax.swing.JOptionPane;

/**
 *
 * @author mariscalyu_SD2022
 */
public class JRegister extends javax.swing.JFrame {

    static String user, pass;

    public JRegister(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public static String getUser() {
        return user;
    }

    public static void setUser(String user) {
        JRegister.user = user;
    }

    public static String getPass() {
        return pass;
    }

    public static void setPass(String pass) {
        JRegister.pass = pass;
    }

    /**
     * Creates new form JRegister
     */
    public JRegister() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userT = new javax.swing.JLabel();
        lnameT = new javax.swing.JLabel();
        fnameT = new javax.swing.JLabel();
        passT = new javax.swing.JLabel();
        ageT = new javax.swing.JLabel();
        userF = new javax.swing.JTextField();
        lnameF = new javax.swing.JTextField();
        fnameF = new javax.swing.JTextField();
        ageF = new javax.swing.JTextField();
        regSignUp = new javax.swing.JButton();
        regSingIn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        passF = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Register");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(155, 155, 155))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        userT.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        userT.setText("User Name");

        lnameT.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lnameT.setText("Last Name");

        fnameT.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        fnameT.setText("First Name");

        passT.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        passT.setText("Password");

        ageT.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ageT.setText("Age");

        regSignUp.setBackground(new java.awt.Color(153, 153, 255));
        regSignUp.setText("Sign Up");
        regSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regSignUpMouseClicked(evt);
            }
        });

        regSingIn.setBackground(new java.awt.Color(153, 153, 255));
        regSingIn.setText("Sign In");
        regSingIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regSingInMouseClicked(evt);
            }
        });

        jLabel2.setText("Already have an account ?");

        passF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(regSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(regSingIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(197, 197, 197))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userT)
                    .addComponent(lnameT)
                    .addComponent(fnameT)
                    .addComponent(ageT)
                    .addComponent(passT))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(userF)
                    .addComponent(lnameF)
                    .addComponent(fnameF)
                    .addComponent(ageF)
                    .addComponent(passF, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(userT))
                                    .addComponent(userF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lnameT))
                            .addComponent(lnameF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fnameT))
                    .addComponent(fnameF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passT)
                    .addComponent(passF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ageT)
                    .addComponent(ageF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(regSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addComponent(regSingIn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regSignUpMouseClicked
        // TODO add your handling code here:
        user = userF.getText();
        pass = passF.getText();
        String fname = fnameF.getText();
        String lname = lnameF.getText();
        String age1 = ageF.getText();

        Controller acc = new Controller();

        if (acc.registerVerification(user, fname, lname, pass, age1) == true) {
            JOptionPane.showMessageDialog(rootPane, "Successfully registered!");
            this.setVisible(false);
            JLogin log = new JLogin();
            log.setVisible(true);
        }else{
            this.setVisible(true);
        }

//        Statement stmt = null;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/luciferpharmacy", "root", "");
//            stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT * FROM `account` WHERE username='" + user + "'");
//
//            if (rs.next()) {
//                JOptionPane.showMessageDialog(rootPane, "Username already existed!", "Error", JOptionPane.ERROR_MESSAGE);
//            } else {
//                System.out.println("successfully connected");
//                if (user.length() > 0 && pass.length() >= 8 && fname.length() > 0 && lname.length() > 0) {
//                    try {
//                        age = Integer.parseInt(ageF.getText());
//                        ageF.requestFocusInWindow();
//                    } catch (NumberFormatException z) {
//                        JOptionPane.showMessageDialog(rootPane, "Numbers Only", "Error", JOptionPane.ERROR_MESSAGE);
//                        ageF.setText("");
//                        ageF.requestFocusInWindow();
//                        //return;
//                    }
//                    if (age >= 18 && age <= 150) {
//                        String sql = "INSERT INTO `account`(`username`, `lname`, `fname`, `password`, `age`) VALUES ('" + user + "','" + lname + "','" + fname + "','" + pass + "'," + age + ")";
//                        stmt.executeUpdate(sql);
//                        JOptionPane.showMessageDialog(rootPane, "Customer Successfully Registered");
//                        JLogin login = new JLogin();
//                        login.setVisible(true);
//                        this.setVisible(false);
//                        con.close();
//
//                    } else {
//                        System.out.println(age);
//                        JOptionPane.showMessageDialog(rootPane, "We don't accept Minors", "Error", JOptionPane.ERROR_MESSAGE);
//                        System.out.println(age);
//                    }
//
//                } else {
//                    JOptionPane.showMessageDialog(rootPane, "Fill Up Everything & Password must be at least 8 characters", "Error", JOptionPane.ERROR_MESSAGE);
//                }
//            }
//
//        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
//            System.out.println(e);
//        }

    }//GEN-LAST:event_regSignUpMouseClicked

    private void passFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFActionPerformed

    private void regSingInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regSingInMouseClicked
        // TODO add your handling code here:
        JLogin log = new JLogin();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regSingInMouseClicked

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
            java.util.logging.Logger.getLogger(JRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JRegister().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageF;
    private javax.swing.JLabel ageT;
    private javax.swing.JTextField fnameF;
    private javax.swing.JLabel fnameT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lnameF;
    private javax.swing.JLabel lnameT;
    private javax.swing.JPasswordField passF;
    private javax.swing.JLabel passT;
    private javax.swing.JButton regSignUp;
    private javax.swing.JButton regSingIn;
    private javax.swing.JTextField userF;
    private javax.swing.JLabel userT;
    // End of variables declaration//GEN-END:variables
}
