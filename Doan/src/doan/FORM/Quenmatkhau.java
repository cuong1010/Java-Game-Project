/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package doan.FORM;

import javax.swing.JOptionPane;
import doan.BUS.*;

import doan.TaiKhoanDTO;


public class Quenmatkhau extends javax.swing.JFrame {

    
   QuenMK qmk=new QuenMK();
   
    public Quenmatkhau() {
        initComponents();
    
        txtMK2.setVisible(false);txtMK.setVisible(false);txtcfrMK.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbQMK = new javax.swing.JLabel();
        lbMK2 = new javax.swing.JLabel();
        txtMK2 = new javax.swing.JPasswordField();
        lbMKM = new javax.swing.JLabel();
        txtMK = new javax.swing.JPasswordField();
        lbNLMK = new javax.swing.JLabel();
        txtcfrMK = new javax.swing.JPasswordField();
        btnXacnhan = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        lbTK = new javax.swing.JLabel();
        txtTK = new javax.swing.JTextField();
        btnKiemTra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbQMK.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbQMK.setText("Quên mật khẩu");

        lbMK2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbMK2.setText("Mật khẩu 2:");

        lbMKM.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbMKM.setText("Mật khẩu mới:");

        lbNLMK.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNLMK.setText("Nhập lại mật khẩu:");

        btnXacnhan.setText("Xác nhận");
        btnXacnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacnhanActionPerformed(evt);
            }
        });

        btnHuy.setText("Huỷ");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        lbTK.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbTK.setText("Tên tài khoản:");

        txtTK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTKKeyPressed(evt);
            }
        });

        btnKiemTra.setText("Kiểm tra");
        btnKiemTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKiemTraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbQMK, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(189, 189, 189))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbNLMK)
                            .addComponent(lbMKM)
                            .addComponent(lbMK2)
                            .addComponent(lbTK))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnXacnhan)
                                .addGap(18, 18, 18)
                                .addComponent(btnHuy))
                            .addComponent(txtMK2)
                            .addComponent(txtMK)
                            .addComponent(txtcfrMK, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(txtTK, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnKiemTra)
                        .addGap(46, 46, 46))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbQMK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTK, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTK, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKiemTra, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMK2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMK2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMKM, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcfrMK, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNLMK, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        lbQMK.getAccessibleContext().setAccessibleParent(jPanel1);
        txtcfrMK.getAccessibleContext().setAccessibleDescription("");
        btnXacnhan.getAccessibleContext().setAccessibleParent(jPanel1);
        btnHuy.getAccessibleContext().setAccessibleParent(jPanel1);

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

    private boolean NullValue()
    {
         if(
            txtTK.getText().length()==0 || String.valueOf(txtMK.getPassword()).length()==0|| 
            String.valueOf(txtMK2.getPassword()).length()==0||String.valueOf(txtcfrMK.getPassword()).length()==0
            ) 
         {
              JOptionPane.showMessageDialog(null, "Có ô bị bỏ trống");
             return true;
         }      
        return false;
     }
    
    private boolean Nhaplai()
    {   String MK=String.valueOf(txtMK.getPassword());
        String NLMK=String.valueOf(txtcfrMK.getPassword());
        if(MK.equals(NLMK)) return true;
        else 
        {
            JOptionPane.showMessageDialog(null,"Mật khẩu và nhập lại mật khẩu ko trùng");
            return false;
        }
    }
    
    private void btnXacnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacnhanActionPerformed
        if(!NullValue())
        {
        TaiKhoanDTO acc=new TaiKhoanDTO();
        if(Nhaplai()) 
        {
            acc.TENTK=txtTK.getText();
            acc.MK2=String.valueOf(txtMK2.getPassword());
            acc.MK=String.valueOf(txtMK.getPassword());
            if(qmk.SuaMK(acc)) this.dispose();
        }
        }
        
    }//GEN-LAST:event_btnXacnhanActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
      this.dispose();
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnKiemTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKiemTraActionPerformed
   
        if(!qmk.KTTK(txtTK.getText()))
           JOptionPane.showMessageDialog(null, "Tài khoản này ko tồn tại");
        else 
        {
        lbMK2.setVisible(false);lbNLMK.setVisible(false);lbMKM.setVisible(false);
        lbMK2.setVisible(true);lbNLMK.setVisible(true);lbMKM.setVisible(true);
        txtMK2.setVisible(true);txtMK.setVisible(true);txtcfrMK.setVisible(true);
         btnXacnhan.setEnabled(true);
        }
    }//GEN-LAST:event_btnKiemTraActionPerformed

    private void txtTKKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTKKeyPressed
         btnXacnhan.setEnabled(false);
    }//GEN-LAST:event_txtTKKeyPressed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quenmatkhau().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnKiemTra;
    private javax.swing.JButton btnXacnhan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbMK2;
    private javax.swing.JLabel lbMKM;
    private javax.swing.JLabel lbNLMK;
    private javax.swing.JLabel lbQMK;
    private javax.swing.JLabel lbTK;
    private javax.swing.JPasswordField txtMK;
    private javax.swing.JPasswordField txtMK2;
    private javax.swing.JTextField txtTK;
    private javax.swing.JPasswordField txtcfrMK;
    // End of variables declaration//GEN-END:variables
}
