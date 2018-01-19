/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package doan.FORM;
import doan.*;
import doan.BUS.*;
import java.sql.Date;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Xemchitiet extends javax.swing.JFrame {

   
    NguoiDungBus ngdungbus=new NguoiDungBus();
    
    public Xemchitiet(String MATK) {
        initComponents();
        setVisible(true);
        Xem(MATK);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        lbThongtin = new javax.swing.JLabel();
        lbMataikhoan = new javax.swing.JLabel();
        lbMATK = new javax.swing.JLabel();
        lbBidanh = new javax.swing.JLabel();
        txtBidanh = new javax.swing.JTextField();
        lbTenngdung = new javax.swing.JLabel();
        txtTenngdung = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lbSDT = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        lbNS = new javax.swing.JLabel();
        txtNgay = new javax.swing.JTextField();
        lbPhai = new javax.swing.JLabel();
        btnCapnhat = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        txtThang = new javax.swing.JTextField();
        txtNam = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RadNam = new javax.swing.JRadioButton();
        RadNu = new javax.swing.JRadioButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(930, 143));

        lbThongtin.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbThongtin.setText("THÔNG TIN  CÁ NHÂN");

        lbMataikhoan.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbMataikhoan.setText("Mã tài khoản:");

        lbMATK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lbBidanh.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbBidanh.setText("Bí danh:");

        txtBidanh.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        lbTenngdung.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbTenngdung.setText("Tên người dùng:");

        txtTenngdung.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        lbEmail.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbEmail.setText("Email:");

        txtEmail.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        lbSDT.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbSDT.setText("Số điện thoại:");

        txtSDT.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        lbNS.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbNS.setText("Ngày sinh:");

        txtNgay.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        lbPhai.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbPhai.setText("Phái:");

        btnCapnhat.setText("Cập nhật");
        btnCapnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhatActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        txtThang.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtNam.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("/");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("/");

        buttonGroup1.add(RadNam);
        RadNam.setSelected(true);
        RadNam.setText("Nam");

        buttonGroup1.add(RadNu);
        RadNu.setText("Nữ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbMataikhoan)
                    .addComponent(lbTenngdung)
                    .addComponent(lbBidanh)
                    .addComponent(lbEmail)
                    .addComponent(lbSDT)
                    .addComponent(lbNS)
                    .addComponent(lbPhai))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnCapnhat)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                            .addComponent(btnThoat))
                        .addComponent(txtEmail)
                        .addComponent(txtTenngdung)
                        .addComponent(txtBidanh)
                        .addComponent(lbMATK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSDT)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtThang, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNam)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RadNam)
                        .addGap(23, 23, 23)
                        .addComponent(RadNu)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbThongtin)
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbThongtin)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbMataikhoan)
                    .addComponent(lbMATK, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBidanh)
                    .addComponent(txtBidanh, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTenngdung)
                    .addComponent(txtTenngdung, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNS)
                    .addComponent(txtThang, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNam, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPhai)
                    .addComponent(RadNam)
                    .addComponent(RadNu))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhatActionPerformed
       NguoiDungDTO ngdung= new NguoiDungDTO();
       ngdung.MATK=lbMATK.getText();
       ngdung.TENNGDUNG=txtTenngdung.getText();ngdung.BIDANH=txtBidanh.getText();ngdung.EMAIL=txtEmail.getText();
       ngdung.SODT= txtSDT.getText();ngdung.NGAYSINH=txtNgay.getText()+"/"+txtThang.getText()+"/"+txtNam.getText();
       if(!NullValue()) ngdungbus.Sua(ngdung,RadNam.isSelected());
       
    }//GEN-LAST:event_btnCapnhatActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnThoatActionPerformed
     private boolean NullValue()
    {
         if(
                txtTenngdung.getText().length()==0 || txtEmail.getText().length()==0|| txtSDT.getText().length()==0||
                 txtBidanh.getText().length()==0||
//kt co 1 gia tri ô nhập ngày bị rỗng
                txtNgay.getText().length()==0||
                txtThang.getText().length()==0||
                txtNam.getText().length()==0 
            ) 
         {
              JOptionPane.showMessageDialog(null, "Có ô bị bỏ trống");
             return true;
         }
       
        return false;
            
     }
    public void Xem(String MATK)
    {
        NguoiDungDTO ngdung=new NguoiDungDTO();
        ngdung.MATK=MATK;
        if(!ngdungbus.Xem(ngdung)) RadNu.setSelected(true);
        lbMATK.setText(ngdung.MATK);
        txtBidanh.setText(ngdung.BIDANH);
        txtTenngdung.setText(ngdung.TENNGDUNG);
        txtEmail.setText(ngdung.EMAIL);
        txtSDT.setText(ngdung.SODT);
        if(ngdung.NGAYSINH!=null)
        {   
           
            txtNgay.setText(NgayGio.getDay(ngdung.NGAYSINH));
            txtThang.setText(NgayGio.getMonth(ngdung.NGAYSINH));//10 thanh 9.+1 de 10 thanh 10
            txtNam.setText(NgayGio.getYear(ngdung.NGAYSINH));
        }
    }
    
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
            java.util.logging.Logger.getLogger(Xemchitiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Xemchitiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Xemchitiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Xemchitiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Xemchitiet("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadNam;
    private javax.swing.JRadioButton RadNu;
    private javax.swing.JButton btnCapnhat;
    private javax.swing.JButton btnThoat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbBidanh;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbMATK;
    private javax.swing.JLabel lbMataikhoan;
    private javax.swing.JLabel lbNS;
    private javax.swing.JLabel lbPhai;
    private javax.swing.JLabel lbSDT;
    private javax.swing.JLabel lbTenngdung;
    private javax.swing.JLabel lbThongtin;
    private javax.swing.JTextField txtBidanh;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNam;
    private javax.swing.JTextField txtNgay;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenngdung;
    private javax.swing.JTextField txtThang;
    // End of variables declaration//GEN-END:variables
}
