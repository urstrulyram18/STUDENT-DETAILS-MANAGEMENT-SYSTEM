/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.details.management.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class teacherdetails extends javax.swing.JFrame {

    /**
     * Creates new form teacherdetails
     */
    Connection conn=null;
    public teacherdetails() {
        initComponents();
        conn =DBconnect.connect();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        regno = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        branch = new javax.swing.JComboBox<>();
        phno = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        year = new javax.swing.JComboBox<>();
        cgpa = new javax.swing.JTextField();
        attendance = new javax.swing.JTextField();
        town = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Registration no ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 70, 116, 35);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 120, 116, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Branch");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 180, 116, 32);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("Gender");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 250, 116, 27);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Phone No");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 330, 116, 30);

        regno.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.add(regno);
        regno.setBounds(270, 70, 137, 35);

        name.setBackground(new java.awt.Color(102, 255, 255));
        name.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(name);
        name.setBounds(270, 130, 137, 30);

        branch.setBackground(new java.awt.Color(51, 255, 255));
        branch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        branch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "IT", "ECE" }));
        jPanel1.add(branch);
        branch.setBounds(270, 190, 97, 32);

        phno.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.add(phno);
        phno.setBounds(270, 330, 137, 30);

        gender.setBackground(new java.awt.Color(51, 255, 255));
        gender.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel1.add(gender);
        gender.setBounds(270, 250, 78, 27);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setText("Year");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(580, 60, 111, 37);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("CGPA");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(580, 120, 111, 37);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setText("Attendance");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(580, 180, 111, 33);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 204, 0));
        jLabel9.setText("City/Town");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(580, 260, 111, 28);

        year.setBackground(new java.awt.Color(51, 255, 255));
        year.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jPanel1.add(year);
        year.setBounds(760, 60, 89, 38);

        cgpa.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.add(cgpa);
        cgpa.setBounds(760, 119, 89, 30);

        attendance.setBackground(new java.awt.Color(51, 255, 255));
        attendance.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(attendance);
        attendance.setBounds(760, 180, 89, 33);

        town.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.add(town);
        town.setBounds(760, 260, 100, 29);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(450, 410, 91, 32);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\w2.jpg")); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 0, 970, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 973, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String r=regno.getText();
        String n=name.getText();
        String b;
        b = String.valueOf(branch.getSelectedItem());
        String g;
        g = String.valueOf(gender.getSelectedItem());
        String y;
        y = String.valueOf(year.getSelectedItem());
        String p=phno.getText();
        String a=attendance.getText();
        String c=cgpa.getText();
        String t=town.getText();
        try
        {
            String q="INSERT INTO `table`(`regno`, `name`, `branch`, `gender`, `phoneno`, `year`, `cgpa`, `city`, `attendance`) VALUES ('"+r+"','"+n+"','"+b+"','"+g+"','"+p+"','"+y+"','"+c+"','"+t+"','"+a+"')";
            PreparedStatement pst=conn.prepareStatement(q);
            pst.execute();
            JOptionPane.showMessageDialog(rootPane,"Data Inserted");
            Home h=new Home();
            setVisible(false);
            h.setVisible(true);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(rootPane,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(teacherdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teacherdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teacherdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teacherdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new teacherdetails().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField attendance;
    private javax.swing.JComboBox<String> branch;
    private javax.swing.JTextField cgpa;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phno;
    private javax.swing.JTextField regno;
    private javax.swing.JTextField town;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
