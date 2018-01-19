/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan.FORM;

import doan.BUS.NgayGio;
import doan.BUS.NguoiDungBus;
import doan.DATA.NguoiDungDATA;
import doan.NguoiDungDTO;
import doan.TaiKhoanDTO;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author DIEM DO
 */
public class QLND extends javax.swing.JFrame {

    NguoiDungBus ngdungbus=new NguoiDungBus();
     NgayGio ngaygio=new NgayGio();
    public QLND() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lbBD = new javax.swing.JLabel();
        lbHoTen = new javax.swing.JLabel();
        txtTenngdung = new javax.swing.JTextField();
        lbSDT = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        radNam = new javax.swing.JRadioButton();
        radNu = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtNgay = new javax.swing.JTextField();
        lbNgay = new javax.swing.JLabel();
        txtThang = new javax.swing.JTextField();
        lbThang = new javax.swing.JLabel();
        txtNam = new javax.swing.JTextField();
        btnCapnhat = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXem = new javax.swing.JButton();
        btnTimkiem = new javax.swing.JButton();
        DsTimkiem = new javax.swing.JComboBox<>();
        txtTu = new javax.swing.JTextField();
        checkDen = new javax.swing.JCheckBox();
        txtDen = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbnguoidung = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        lbMatk = new javax.swing.JLabel();
        lbMaTK = new javax.swing.JLabel();
        lb = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        lbMATK = new javax.swing.JLabel();
        txtBiDanh = new javax.swing.JTextField();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(146, 105));

        lbBD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbBD.setText("Bí danh:");

        lbHoTen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbHoTen.setText("Tên người dùng:");

        txtTenngdung.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbSDT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbSDT.setText("Số điện thoại:");

        txtSDT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbEmail.setText("Email:");

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Giới tính:");

        buttonGroup1.add(radNam);
        radNam.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radNam.setText("Nam");

        buttonGroup1.add(radNu);
        radNu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radNu.setText("Nữ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Ngày sinh:");

        txtNgay.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbNgay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbNgay.setText("/");

        txtThang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbThang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbThang.setText("/");

        txtNam.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnCapnhat.setText("Cập nhật");
        btnCapnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhatActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXem.setText("Xem Tài Khoản");
        btnXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemActionPerformed(evt);
            }
        });

        btnTimkiem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnTimkiem.setText("Tìm kiếm");
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });

        DsTimkiem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DsTimkiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã tài khoản", "Bí danh", "Tuổi", "Giới tính" }));

        txtTu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTuActionPerformed(evt);
            }
        });

        checkDen.setText("đến");
        checkDen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDenActionPerformed(evt);
            }
        });

        txtDen.setVisible(false);
        txtDen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tbnguoidung.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã tài khoản", "Bí danh", "Họ và tên", "Số điên thoại", "Email", "Gioi tính", "Ngày sinh"
            }
        ));
        tbnguoidung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbnguoidungMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbnguoidung);

        lb1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb1.setText("Mã tài khoản:");

        lbMATK.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtBiDanh.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                    .addComponent(lbMatk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbMaTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(143, 143, 143))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbMATK, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(376, 376, 376))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbSDT)
                                        .addComponent(lbEmail)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(lbHoTen))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtSDT, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTenngdung, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(radNam)
                                            .addGap(18, 18, 18)
                                            .addComponent(radNu)
                                            .addGap(236, 236, 236))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lbNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtThang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(lbThang, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(13, 13, 13)
                                            .addComponent(txtNam, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(29, 29, 29)
                                            .addComponent(btnCapnhat)
                                            .addGap(34, 34, 34))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(43, 43, 43)
                                            .addComponent(lbBD)
                                            .addGap(18, 18, 18)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(31, 31, 31)
                                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                            .addComponent(btnXem)
                                            .addGap(85, 85, 85))
                                        .addComponent(txtBiDanh, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(DsTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTu, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(checkDen)
                        .addGap(18, 18, 18)
                        .addComponent(txtDen, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbMatk)
                        .addComponent(lbMaTK)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lb))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMATK, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBiDanh, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenngdung, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHoTen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSDT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmail))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radNam)
                            .addComponent(jLabel1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radNu)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNgay)
                    .addComponent(txtThang, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNam, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbThang)
                    .addComponent(jLabel2))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapnhat)
                    .addComponent(btnSua)
                    .addComponent(btnXem))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DsTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkDen)
                    .addComponent(txtDen, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiem))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkDenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDenActionPerformed
        
    if(checkDen.isSelected())
        {
            checkDen.setVisible(false);
        txtDen.setVisible(true);//phai hien label thi no moi chịu hiện ô
         checkDen.setVisible(true);
        }
    else txtDen.setVisible(false);
     
    }//GEN-LAST:event_checkDenActionPerformed

    private void txtTuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTuActionPerformed

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        if(checkDen.isSelected())
        tbnguoidung.setModel(ngdungbus.TimkiemKhoangGiatri(DsTimkiem.getSelectedIndex(),txtTu.getText(),txtDen.getText()));
        else
        tbnguoidung.setModel(ngdungbus.Timkiem(DsTimkiem.getSelectedIndex(),txtTu.getText()));

    }//GEN-LAST:event_btnTimkiemActionPerformed

    private void btnXemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemActionPerformed
      
        new Xemtaikhoan(lbMATK.getText());

    }//GEN-LAST:event_btnXemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        NguoiDungDTO ngdung= new NguoiDungDTO();
       ngdung.MATK=lbMATK.getText();
       ngdung.TENNGDUNG=txtTenngdung.getText();ngdung.BIDANH=txtBiDanh.getText();ngdung.EMAIL=txtEmail.getText();
       ngdung.SODT= txtSDT.getText();ngdung.NGAYSINH=txtNgay.getText()+"/"+txtThang.getText()+"/"+txtNam.getText();
       if(!NullValue()) ngdungbus.Sua(ngdung,radNam.isSelected());
        btnCapnhatActionPerformed(evt);
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnCapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhatActionPerformed
        tbnguoidung.setModel(ngdungbus.CapnhatNguoidung());
    }//GEN-LAST:event_btnCapnhatActionPerformed

    private void tbnguoidungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbnguoidungMouseClicked
        int i=tbnguoidung.getSelectedRow();
    lbMATK.setText(tbnguoidung.getModel().getValueAt(i,0).toString());
    txtBiDanh.setText(tbnguoidung.getModel().getValueAt(i,1).toString());
    txtTenngdung.setText(tbnguoidung.getModel().getValueAt(i,2).toString());
    txtSDT.setText(tbnguoidung.getModel().getValueAt(i,3).toString());
    txtEmail.setText(tbnguoidung.getModel().getValueAt(i,4).toString());
       
    String phai=(tbnguoidung.getModel().getValueAt(i,5).toString());
    if(phai.equals("NAM")) radNam.setSelected(true);
    else radNu.setSelected(true);
    String s=(tbnguoidung.getModel().getValueAt(i,6)).toString(); 
    txtNgay.setText(NgayGio.getDay(s));
    txtThang.setText(NgayGio.getMonth(s));
    txtNam.setText(NgayGio.getYear(s));
    }//GEN-LAST:event_tbnguoidungMouseClicked

     private boolean NullValue()
    {
         if(
                txtTenngdung.getText().length()==0 || txtEmail.getText().length()==0|| txtSDT.getText().length()==0||
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
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLND().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DsTimkiem;
    private javax.swing.JButton btnCapnhat;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnXem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox checkDen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lbBD;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbHoTen;
    private javax.swing.JLabel lbMATK;
    private javax.swing.JLabel lbMaTK;
    private javax.swing.JLabel lbMatk;
    private javax.swing.JLabel lbNgay;
    private javax.swing.JLabel lbSDT;
    private javax.swing.JLabel lbThang;
    private javax.swing.JRadioButton radNam;
    private javax.swing.JRadioButton radNu;
    private javax.swing.JTable tbnguoidung;
    private javax.swing.JTextField txtBiDanh;
    private javax.swing.JTextField txtDen;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNam;
    private javax.swing.JTextField txtNgay;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenngdung;
    private javax.swing.JTextField txtThang;
    private javax.swing.JTextField txtTu;
    // End of variables declaration//GEN-END:variables
}
