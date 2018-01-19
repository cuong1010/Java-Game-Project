/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan.FORM;

import doan.BUS.NguoiDungBus;
import doan.BUS.TaiKhoanBus;

/**
 *
 * @author HOME
 */
public class Admin extends javax.swing.JFrame {

    TaiKhoanBus accbus=new TaiKhoanBus();
    NguoiDungBus ngdungbus=new NguoiDungBus();
    String MATK="0000000000";
    QLND ngdung =new QLND();
    QLTK tk=new QLTK();
   ChonGame game=new ChonGame(MATK);
   Thongke thongke=new Thongke();
    public Admin() 
    {
        initComponents();
        setVisible(true);        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbAdmin = new javax.swing.JLabel();
        btnQLTK = new javax.swing.JButton();
        btnQLNG = new javax.swing.JButton();
        btnThongke = new javax.swing.JButton();
        btnChoigame = new javax.swing.JButton();
        btnĐX = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(480, 120));

        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbAdmin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbAdmin.setText("Admin");
        lbAdmin.setName(""); // NOI18N

        btnQLTK.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnQLTK.setText("Quản lí Tài khoản");
        btnQLTK.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnQLTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLTKActionPerformed(evt);
            }
        });

        btnQLNG.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnQLNG.setText("Quản lí Người dùng");
        btnQLNG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLNGActionPerformed(evt);
            }
        });

        btnThongke.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnThongke.setText("Thống kê");
        btnThongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongkeActionPerformed(evt);
            }
        });

        btnChoigame.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnChoigame.setText("Chơi game");
        btnChoigame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChoigameActionPerformed(evt);
            }
        });

        btnĐX.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnĐX.setText("Đăng xuất");
        btnĐX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnĐXActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnChoigame, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQLNG)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnQLTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnĐX, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnThongke, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lbAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbAdmin)
                .addGap(18, 18, 18)
                .addComponent(btnQLTK, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQLNG, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThongke, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnChoigame, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(btnĐX, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
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

    private void btnQLTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLTKActionPerformed
       tk.dispose();
        tk=new QLTK();
        tk.setVisible(true);
    }//GEN-LAST:event_btnQLTKActionPerformed

    private void btnQLNGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLNGActionPerformed
       ngdung.dispose();
       ngdung=new QLND();
        ngdung.setVisible(true);
    }//GEN-LAST:event_btnQLNGActionPerformed

    private void btnChoigameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChoigameActionPerformed
        game.dispose();
        game=new ChonGame(MATK);
        game.setVisible(true);
    }//GEN-LAST:event_btnChoigameActionPerformed

    private void btnThongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongkeActionPerformed
        thongke.dispose();
        thongke=new Thongke();
        thongke.setVisible(true);
    }//GEN-LAST:event_btnThongkeActionPerformed

    private void btnĐXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnĐXActionPerformed
        new Login();ngdung.dispose();tk.dispose();game.dispose();thongke.dispose();this.dispose();
    }//GEN-LAST:event_btnĐXActionPerformed
   
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChoigame;
    private javax.swing.JButton btnQLNG;
    private javax.swing.JButton btnQLTK;
    private javax.swing.JButton btnThongke;
    private javax.swing.JButton btnĐX;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAdmin;
    // End of variables declaration//GEN-END:variables
}
