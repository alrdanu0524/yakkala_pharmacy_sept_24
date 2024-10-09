/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easypos;

import DB.MC_DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author hello
 */
public class exp_item extends javax.swing.JFrame {

    /**
     * Creates new form exp_item
     */
    public exp_item() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-home-24.png"))); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Today");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButton1MousePressed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(204, 204, 0));
        jRadioButton2.setText("This Month's Expiring Items");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(204, 0, 0));
        jRadioButton3.setText("Expired Items");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(51, 255, 51));
        jRadioButton4.setText("Coming 14 Days Expire Items");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Code", "Name", "Supplier", "Cost", "MRP", "Sale", "Qty", "Reorder", "Type", "Location", "Expired"
            }
        ));
        jTable1.setRowHeight(35);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(2).setMinWidth(300);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(300);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(300);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        new Dashboard_001().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jRadioButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MousePressed
        tbLoadToDay();
    }//GEN-LAST:event_jRadioButton1MousePressed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        tbLoadThisMonth();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        tbExpiredItems();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        tbLast10Days();
    }//GEN-LAST:event_jRadioButton4ActionPerformed
    
    private void tbLast10Days() {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formattedToday = today.format(formatter);

// Get the date 14 days from today
        LocalDate fourteenDaysFromToday = today.plusDays(14);
        String formattedFourteenDaysFromToday = fourteenDaysFromToday.format(formatter);

        try {
            // Adjust the SQL query to get items where the expiration date is within the next 14 days
            String s_sales_qu = "SELECT * FROM stock WHERE expire_date BETWEEN '" + formattedToday + "' AND '" + formattedFourteenDaysFromToday + "'";
            ResultSet rs = MC_DB.search_dataQuery(s_sales_qu);
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector<String> v = new Vector<>();
                v.add(rs.getString("id"));
                v.add(rs.getString("code"));
                v.add(rs.getString("name"));
                v.add(rs.getString("supplier"));
                double cost = rs.getDouble("buy_price");
                double mrp = rs.getDouble("market_price");
                double sale = rs.getDouble("sell_price");
                String formattedCost = String.format("%.2f", cost);
                String formattedMRP = String.format("%.2f", mrp);
                String formattedSale = String.format("%.2f", sale);
                v.add(formattedCost);
                v.add(formattedMRP);
                v.add(formattedSale);
                v.add(rs.getString("qty"));
                v.add(rs.getString("reorder"));
                v.add(rs.getString("type"));
                v.add(rs.getString("rack"));
                v.add(rs.getString("expire_date"));
                dtm.addRow(v);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                MC_DB.myConnection().close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    private void tbExpiredItems() {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

// Get yesterday's date
        LocalDate yesterday = today.minusDays(1);
        String formattedDate = yesterday.format(formatter);

        try {
            // Adjust the SQL query to get items where the expiration date is before yesterday
            String s_sales_qu = "SELECT * FROM stock WHERE expire_date < '" + formattedDate + "'";
            ResultSet rs = MC_DB.search_dataQuery(s_sales_qu);
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
               Vector<String> v = new Vector<>();
                v.add(rs.getString("id"));
                v.add(rs.getString("code"));
                v.add(rs.getString("name"));
                v.add(rs.getString("supplier"));
                double cost = rs.getDouble("buy_price");
                double mrp = rs.getDouble("market_price");
                double sale = rs.getDouble("sell_price");
                String formattedCost = String.format("%.2f", cost);
                String formattedMRP = String.format("%.2f", mrp);
                String formattedSale = String.format("%.2f", sale);
                v.add(formattedCost);
                v.add(formattedMRP);
                v.add(formattedSale);
                v.add(rs.getString("qty"));
                v.add(rs.getString("reorder"));
                v.add(rs.getString("type"));
                v.add(rs.getString("rack"));
                v.add(rs.getString("expire_date"));
                dtm.addRow(v);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                MC_DB.myConnection().close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    private void tbLoadThisMonth() {
        LocalDate toDay = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate firstDayOfMonth = toDay.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastDayOfMonth = toDay.with(TemporalAdjusters.lastDayOfMonth());

        String day1 = firstDayOfMonth.format(formatter);
        String day2 = lastDayOfMonth.format(formatter);

        try {

            ResultSet rs = MC_DB.search_dataQuery("SELECT * FROM stock WHERE expire_date BETWEEN '" + day1 + "' AND '" + day2 + "'");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            while (rs.next()) {
                 Vector<String> v = new Vector<>();
                v.add(rs.getString("id"));
                v.add(rs.getString("code"));
                v.add(rs.getString("name"));
                v.add(rs.getString("supplier"));
                double cost = rs.getDouble("buy_price");
                double mrp = rs.getDouble("market_price");
                double sale = rs.getDouble("sell_price");
                String formattedCost = String.format("%.2f", cost);
                String formattedMRP = String.format("%.2f", mrp);
                String formattedSale = String.format("%.2f", sale);
                v.add(formattedCost);
                v.add(formattedMRP);
                v.add(formattedSale);
                v.add(rs.getString("qty"));
                v.add(rs.getString("reorder"));
                v.add(rs.getString("type"));
                v.add(rs.getString("rack"));
                v.add(rs.getString("expire_date"));
                dtm.addRow(v);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                MC_DB.myConnection().close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    
    private void tbLoadToDay() {

        LocalDate toDay = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formattedDate = toDay.format(formatter);
        try {
            String s_sales_qu = "SELECT * FROM stock WHERE expire_date = '" + formattedDate + "'";
            ResultSet rs = MC_DB.search_dataQuery(s_sales_qu);
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {

                Vector v = new Vector();
                 v.add(rs.getString("id"));
                v.add(rs.getString("code"));
                v.add(rs.getString("name"));
                v.add(rs.getString("supplier"));
                double cost = rs.getDouble("buy_price");
                double mrp = rs.getDouble("market_price");
                double sale = rs.getDouble("sell_price");
                String formattedCost = String.format("%.2f", cost);
                String formattedMRP = String.format("%.2f", mrp);
                String formattedSale = String.format("%.2f", sale);
                v.add(formattedCost);
                v.add(formattedMRP);
                v.add(formattedSale);
                v.add(rs.getString("qty"));
                v.add(rs.getString("reorder"));
                v.add(rs.getString("type"));
                v.add(rs.getString("rack"));
                v.add(rs.getString("expire_date"));
                dtm.addRow(v);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                MC_DB.myConnection().close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

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
            java.util.logging.Logger.getLogger(exp_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(exp_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(exp_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(exp_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new exp_item().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
