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

public class Xemtaikhoan extends javax.swing.JFrame {

   
    TaiKhoanBus accbus=new TaiKhoanBus();
    
    public Xemtaikhoan(String MATK) {
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
        txtTENTK = new javax.swing.JTextField();
        lbTenngdung = new javax.swing.JLabel();
        txtMK = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        txtMK2 = new javax.swing.JTextField();
        lbNS = new javax.swing.JLabel();
        txtNgay = new javax.swing.JTextField();
        lbPhai = new javax.swing.JLabel();
        btnCapnhat = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        txtThang = new javax.swing.JTextField();
        txtNam = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RadKoKhoa = new javax.swing.JRadioButton();
        radKhoa = new javax.swing.JRadioButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(930, 143));

        lbThongtin.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbThongtin.setText("THÔNG TIN  TÀI KHOẢN");

        lbMataikhoan.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbMataikhoan.setText("Mã tài khoản:");

        lbMATK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lbBidanh.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbBidanh.setText("Tên tài khoản");

        txtTENTK.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        lbTenngdung.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbTenngdung.setText("Mật khẩu");

        txtMK.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        lbEmail.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbEmail.setText("Mật khẩu 2");

        txtMK2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        lbNS.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbNS.setText("Ngày đăng ký");

        txtNgay.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        lbPhai.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbPhai.setText("Trạng thái");

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

        buttonGroup1.add(RadKoKhoa);
        RadKoKhoa.setSelected(true);
        RadKoKhoa.setText("Ko Khoá");

        buttonGroup1.add(radKhoa);
        radKhoa.setText("Khoá");

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
                    .addComponent(lbNS)
                    .addComponent(lbPhai))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnCapnhat)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                            .addComponent(btnThoat))
                        .addComponent(txtMK2)
                        .addComponent(txtMK)
                        .addComponent(txtTENTK)
                        .addComponent(lbMATK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(RadKoKhoa)
                        .addGap(23, 23, 23)
                        .addComponent(radKhoa)))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbThongtin)
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbThongtin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbMataikhoan)
                    .addComponent(lbMATK, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBidanh)
                    .addComponent(txtTENTK, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTenngdung)
                    .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMK2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmail))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNS)
                    .addComponent(txtThang, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNam, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPhai)
                    .addComponent(RadKoKhoa)
                    .addComponent(radKhoa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhatActionPerformed
      TaiKhoanDTO acc=new TaiKhoanDTO();
       acc.MATK=lbMATK.getText();
       acc.MK=txtMK.getText();acc.TENTK=txtTENTK.getText();acc.MK2=txtMK2.getText();
        acc.NGDK=txtNgay.getText()+"/"+txtThang.getText()+"/"+txtNam.getText();
       if(!NullValue()) accbus.SuaTK(acc,radKhoa.isSelected());
       
    }//GEN-LAST:event_btnCapnhatActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnThoatActionPerformed
     private boolean NullValue()
    {
         if(
                txtMK.getText().length()==0 || txtMK2.getText().length()==0||
                 txtTENTK.getText().length()==0||
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
       TaiKhoanDTO acc=new TaiKhoanDTO();
        acc.MATK=MATK;
        if(!accbus.XemMoKhoa(acc)) radKhoa.setSelected(true);
        lbMATK.setText(acc.MATK);
        txtTENTK.setText(acc.TENTK);
        txtMK.setText(acc.MK);
        txtMK2.setText(acc.MK2);
       
        if(acc.NGDK!=null)
        {   
           
            txtNgay.setText(NgayGio.getDay(acc.NGDK));
            txtThang.setText(NgayGio.getMonth(acc.NGDK));//10 thanh 9.+1 de 10 thanh 10
            txtNam.setText(NgayGio.getYear(acc.NGDK));
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
            java.util.logging.Logger.getLogger(Xemtaikhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Xemtaikhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Xemtaikhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Xemtaikhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Xemtaikhoan("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadKoKhoa;
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
    private javax.swing.JLabel lbTenngdung;
    private javax.swing.JLabel lbThongtin;
    private javax.swing.JRadioButton radKhoa;
    private javax.swing.JTextField txtMK;
    private javax.swing.JTextField txtMK2;
    private javax.swing.JTextField txtNam;
    private javax.swing.JTextField txtNgay;
    private javax.swing.JTextField txtTENTK;
    private javax.swing.JTextField txtThang;
    // End of variables declaration//GEN-END:variables
}
