
import java.awt.Image;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Expences extends javax.swing.JFrame {

    /**
     * Creates new form Inventory
     */
    public Expences() {
        initComponents();
        
        Image icon = new ImageIcon(this.getClass().getResource("/icon.png")).getImage();
        this.setIconImage(icon);
        
        try {
            
            ResultSet rs = dbcon.SEARCH("SELECT * FROM expences");
            while(rs.next()){
                
                String id = rs.getString("id");
                String date = rs.getString("date");
                String cat = rs.getString("category");
                String amount = rs.getString("amount");
                String discription = rs.getString("discription");
               
                Vector v = new Vector();
                v.add(id);
                v.add(date);
                v.add(cat);
                v.add(amount);
                v.add(discription);
               
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.addRow(v);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        print_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        search_txt = new javax.swing.JTextField();
        edit_btn = new javax.swing.JButton();
        remove_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        back_btn = new javax.swing.JButton();
        category_combo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Expences");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        print_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        print_btn.setForeground(new java.awt.Color(255, 255, 255));
        print_btn.setText("PRINT");
        print_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        print_btn.setContentAreaFilled(false);
        print_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_btnActionPerformed(evt);
            }
        });
        jPanel1.add(print_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, 150, 45));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SEARCH");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        search_txt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        search_txt.setForeground(new java.awt.Color(255, 255, 255));
        search_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        search_txt.setOpaque(false);
        search_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_txtKeyReleased(evt);
            }
        });
        jPanel1.add(search_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 79, 370, 40));

        edit_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        edit_btn.setForeground(new java.awt.Color(255, 255, 255));
        edit_btn.setText("EDIT");
        edit_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        edit_btn.setContentAreaFilled(false);
        edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnActionPerformed(evt);
            }
        });
        jPanel1.add(edit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 160, 50));

        remove_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        remove_btn.setForeground(new java.awt.Color(255, 255, 255));
        remove_btn.setText("REMOVE");
        remove_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        remove_btn.setContentAreaFilled(false);
        remove_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_btnActionPerformed(evt);
            }
        });
        jPanel1.add(remove_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 160, 50));

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DATE", "CATEGORY", "AMOUNT", "DISCRIPTION"
            }
        ));
        jTable1.setRowHeight(28);
        jTable1.setRowMargin(5);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 1080, -1));

        back_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        back_btn.setForeground(new java.awt.Color(255, 255, 255));
        back_btn.setText("BACK");
        back_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        back_btn.setContentAreaFilled(false);
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        jPanel1.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 700, 150, 45));

        category_combo.setBackground(new java.awt.Color(153, 153, 153));
        category_combo.setEditable(true);
        category_combo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        category_combo.setForeground(new java.awt.Color(0, 0, 0));
        category_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "WATER BILL", "ELECTRICITY BILL", "SALARY PAYMENT", "REPAIRS", "CASUALS", "OTHER", "EMPTY" }));
        category_combo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        category_combo.setOpaque(false);
        category_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category_comboActionPerformed(evt);
            }
        });
        jPanel1.add(category_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 132, 370, 40));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CATEGORY");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("------ EXPENCES ------");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, -1, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LAKY_COMPUTER SHOP");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Lakshitha Madushan - Java. All Rights Reserved (c), 2023");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 760, 620, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank.png"))); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void remove_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_btnActionPerformed
        // TODO add your handling code here:
        try {
            int r = jTable1.getSelectedRow();
            String delr = jTable1.getValueAt(r, 0).toString(); // 0 veni row
            dbcon.IUD("DELETE FROM expences WHERE `id` = '"+delr+"'");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.removeRow(r);
            JOptionPane.showMessageDialog(this, "Row Deleted Successfulll!","DONE",JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_remove_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
        Owner_Menu on = new Owner_Menu();
        on.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    private void print_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_btnActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("LAKSHITHA SOFTWARE JAVA (C) All Rights");
        MessageFormat footer = new MessageFormat("Thank You!!!");
        
        try {
            jTable1.print(JTable.PrintMode.NORMAL,header,footer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_print_btnActionPerformed

    private void search_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_txtKeyReleased
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
         String txt = search_txt.getText();
         TableRowSorter <DefaultTableModel> trs = new TableRowSorter<DefaultTableModel>(dtm);
         jTable1.setRowSorter(trs);
         trs.setRowFilter(RowFilter.regexFilter(txt));
    }//GEN-LAST:event_search_txtKeyReleased

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        // TODO add your handling code here:
         try {
            int r = jTable1.getSelectedRow();
            
            String id = jTable1.getValueAt(r, 0).toString();
            String date = jTable1.getValueAt(r, 1).toString();
            String category = jTable1.getValueAt(r, 2).toString();
            String amount = jTable1.getValueAt(r, 3).toString();
            String discription = jTable1.getValueAt(r, 4).toString();
            
            dbcon.IUD("UPDATE expences SET `date` = '"+date+"' WHERE `id` = '"+id+"' ");
            //dbcon.IUD("UPDATE expences SET `category` = '"+category+"' WHERE `id` = '"+id+"' ");
            dbcon.IUD("UPDATE expences SET `amount` = '"+amount+"' WHERE `id` = '"+id+"'");
            dbcon.IUD("UPDATE expences SET `discription` = '"+discription+"' WHERE `id` = '"+id+"'");
            
            JOptionPane.showMessageDialog(this,"Row Update Successfully!","DONE",JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_edit_btnActionPerformed

    private void category_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category_comboActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            ResultSet rs = dbcon.SEARCH("SELECT * FROM expences WHERE `category` = '"+String.valueOf(category_combo.getSelectedItem())+"'");
            while(rs.next()){
                String id = rs.getString("id");
                String date = rs.getString("date");
                String cat = rs.getString("category");
                String amount = rs.getString("amount");
                String discription = rs.getString("discription");                
               
                Vector v = new Vector();                
                v.add(id);
                v.add(date);
                v.add(cat);
                v.add(amount);
                v.add(discription);
                
                dtm.addRow(v);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_category_comboActionPerformed

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
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel bg;
    private javax.swing.JComboBox<String> category_combo;
    private javax.swing.JButton edit_btn;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton print_btn;
    private javax.swing.JButton remove_btn;
    private javax.swing.JTextField search_txt;
    // End of variables declaration//GEN-END:variables

}
