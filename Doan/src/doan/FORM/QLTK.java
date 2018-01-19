/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan.FORM;

import java.awt.event.*;
import java.sql.*;
import java.util.Calendar;
//import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import doan.BUS.*;
import doan.*;
/**
 *
 * @author PC1
 */
public class QLTK extends javax.swing.JFrame {
    Calendar cal=Calendar.getInstance();
    TaiKhoanBus accbus=new TaiKhoanBus();
    
    public QLTK() {    
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Label4 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Label6 = new javax.swing.JLabel();
        lbMATK = new javax.swing.JLabel();
        txtTK = new javax.swing.JTextField();
        txtMK = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAcc = new javax.swing.JTable();
        Label1 = new javax.swing.JLabel();
        Label5 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        txtNgay = new javax.swing.JTextField();
        btnCapnhat = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnKhoa = new javax.swing.JButton();
        txtMK2 = new javax.swing.JTextField();
        txtThang = new javax.swing.JTextField();
        txtNam = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TTLabel = new javax.swing.JLabel();
        btnChitiet = new javax.swing.JButton();
        btnMoKhoa = new javax.swing.JButton();
        DsTimKiem = new javax.swing.JComboBox<>();
        txtTim1 = new javax.swing.JTextField();
        txtTim2 = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        checkBox = new javax.swing.JCheckBox();
        lbDate1 = new javax.swing.JLabel();
        lbDate2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("QUẢN LÍ ACCOUNTS");
        setBackground(new java.awt.Color(0, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(146, 105));
        setName("FrameQL"); // NOI18N

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        Label4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label4.setText("Trạng thái:");

        Label2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label2.setText("Tài khoản:");

        Label6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Label6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label6.setText("Ngày đăng ký:");

        lbMATK.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbMATK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtTK.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTK.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtMK.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtMK.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tblAcc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblAcc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblAcc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã tài khoản", "Tài khoản", "Mật khẩu", "Mật khẩu 2", "Trạng thái", "Ngày đăng ký"
            }
        ));
        tblAcc.setRowHeight(20);
        tblAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAccMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAcc);

        Label1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label1.setText("Mã tài khoản:");

        Label5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Label5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label5.setText("Mật khẩu:");

        Label3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label3.setText("Mật khẩu 2:");

        txtNgay.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNgay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNgay.setToolTipText("");

        btnCapnhat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCapnhat.setText("Cập nhật");
        btnCapnhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCapnhatMouseClicked(evt);
            }
        });
        btnCapnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhatActionPerformed(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });

        btnKhoa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnKhoa.setText("Khoá");
        btnKhoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKhoaMouseClicked(evt);
            }
        });

        txtMK2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtMK2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtThang.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtThang.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtNam.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNam.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("/");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("/");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        TTLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TTLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnChitiet.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnChitiet.setText("Xem chi tiết");
        btnChitiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChitietActionPerformed(evt);
            }
        });

        btnMoKhoa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnMoKhoa.setText("Mở khoá");
        btnMoKhoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMoKhoaMouseClicked(evt);
            }
        });

        DsTimKiem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DsTimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã tài khoản", "Tên tài khoản", "Trạng thái", "Ngày đăng ký" }));
        DsTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DsTimKiemActionPerformed(evt);
            }
        });

        btnTim.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnTim.setText("Tìm kiếm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        checkBox.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        checkBox.setText("đến");
        checkBox.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        checkBox.setMaximumSize(new java.awt.Dimension(49, 25));
        checkBox.setMinimumSize(new java.awt.Dimension(49, 25));
        checkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxActionPerformed(evt);
            }
        });

        lbDate1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbDate1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDate1.setText("ngày/tháng/năm");

        lbDate2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbDate2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDate2.setText("ngày/tháng/năm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Label3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(btnCapnhat))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(DsTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(lbMATK, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(txtTK, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(txtMK2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(txtTim1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(checkBox, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(lbDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Label4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(TTLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addComponent(Label5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(Label6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(52, 52, 52)
                                                                .addComponent(btnKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(txtThang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(10, 10, 10)
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtNam, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(btnMoKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(29, 29, 29)))))
                                                .addGap(22, 22, 22))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTim2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnTim)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnChitiet))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(lbDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMATK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(TTLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTK, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Label6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Label3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNam, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtThang, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMK2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMoKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChitiet, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DsTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTim1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTim2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDate1)
                    .addComponent(lbDate2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        Label4.getAccessibleContext().setAccessibleDescription("");
        txtTim2.setVisible(false);
        lbDate1.setVisible(false);
        lbDate2.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private boolean NullValue()
    {
         if(
                txtTK.getText().length()==0 || txtMK.getText().length()==0|| txtMK2.getText().length()==0||
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
    
    private void btnCapnhatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCapnhatMouseClicked
         
            tblAcc.setModel(accbus.CapnhatAccount());
   
    }//GEN-LAST:event_btnCapnhatMouseClicked

    private void tblAccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAccMouseClicked
    int i=tblAcc.getSelectedRow();
    lbMATK.setText(tblAcc.getModel().getValueAt(i,0).toString());
    txtTK.setText(tblAcc.getModel().getValueAt(i,1).toString());
    txtMK.setText(tblAcc.getModel().getValueAt(i,2).toString());
    txtMK2.setText(tblAcc.getModel().getValueAt(i,3).toString());
    TTLabel.setText(tblAcc.getModel().getValueAt(i,4).toString());
    String s=(tblAcc.getModel().getValueAt(i,5)).toString(); 
    txtNgay.setText(NgayGio.getDay(s));
    txtThang.setText(NgayGio.getMonth(s));
    txtNam.setText(NgayGio.getYear(s));
    }//GEN-LAST:event_tblAccMouseClicked

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
         TaiKhoanDTO acc=new TaiKhoanDTO();
       acc.TENTK=txtTK.getText();acc.MK=txtMK.getText();acc.MK2=txtMK2.getText();
       acc.NGDK=txtNgay.getText()+"/"+txtThang.getText()+"/"+txtNam.getText(); 
     if(!NullValue())
     {     accbus.ThemTK(acc);
      btnCapnhatMouseClicked(evt);
     }
      
        
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        TaiKhoanDTO acc=new TaiKhoanDTO();
        acc.MATK=lbMATK.getText();
       acc.TENTK=txtTK.getText();acc.MK=txtMK.getText();acc.MK2=txtMK2.getText();
       acc.TRANGTHAI= TTLabel.getText();acc.NGDK=txtNgay.getText()+"/"+txtThang.getText()+"/"+txtNam.getText();
if(!NullValue()) {accbus.SuaTK(acc);
                  btnCapnhatMouseClicked(evt);
                 }
       
    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnKhoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhoaMouseClicked
      TaiKhoanDTO acc=new TaiKhoanDTO();
      acc.MATK=lbMATK.getText();
      accbus.KhoaTK(acc);
       btnCapnhatMouseClicked(evt);
    }//GEN-LAST:event_btnKhoaMouseClicked

    private void btnMoKhoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMoKhoaMouseClicked
         TaiKhoanDTO acc=new TaiKhoanDTO();
      acc.MATK=lbMATK.getText();
      accbus.MoKhoaTK(acc);
       btnCapnhatMouseClicked(evt);
    }//GEN-LAST:event_btnMoKhoaMouseClicked

    private void DsTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DsTimKiemActionPerformed
        if(DsTimKiem.getSelectedIndex()==3) //chon ngay dang ky
        {
          lbDate1.setVisible(true);//hien lbDate1 ở ô tìm 1
          if(checkBox.isSelected()) lbDate2.setVisible(true);//neu den dc chon thi hien lbDate2
          else lbDate2.setVisible(false);//ko dc chọn thi k hiện ra
        }
        else //bam vao cac list khác thi ẩn
        {
            lbDate1.setVisible(false);
            lbDate2.setVisible(false);
        }
    }//GEN-LAST:event_DsTimKiemActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
   if(checkBox.isSelected()) 
       tblAcc.setModel(accbus.TimKiemKhoangGiatri(DsTimKiem.getSelectedIndex(),txtTim1.getText(),txtTim2.getText()));
   else
       tblAcc.setModel(accbus.TimKiem(DsTimKiem.getSelectedIndex(),txtTim1.getText()));
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnChitietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChitietActionPerformed
       new Xemchitiet(lbMATK.getText());
    }//GEN-LAST:event_btnChitietActionPerformed

    private void checkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxActionPerformed
     if(checkBox.isSelected()) 
     {
         lbDate2.setVisible(true);txtTim2.setVisible(true);//phai hien label thi no moi chịu hiện ô
         if(DsTimKiem.getSelectedIndex()!=3)lbDate2.setVisible(false);//nếu nó ko phai ngay dang ký thi ẩn đi ,
         //ko thi giữ nguyen cho nó hiện
     }
     else 
     {
         txtTim2.setVisible(false);lbDate2.setVisible(false);
     }
    }//GEN-LAST:event_checkBoxActionPerformed

    private void btnCapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCapnhatActionPerformed

 public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLTK().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DsTimKiem;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JLabel Label6;
    private javax.swing.JLabel TTLabel;
    private javax.swing.JButton btnCapnhat;
    private javax.swing.JButton btnChitiet;
    private javax.swing.JButton btnKhoa;
    private javax.swing.JButton btnMoKhoa;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDate1;
    private javax.swing.JLabel lbDate2;
    private javax.swing.JLabel lbMATK;
    public javax.swing.JTable tblAcc;
    private javax.swing.JTextField txtMK;
    private javax.swing.JTextField txtMK2;
    private javax.swing.JTextField txtNam;
    private javax.swing.JTextField txtNgay;
    private javax.swing.JTextField txtTK;
    private javax.swing.JTextField txtThang;
    private javax.swing.JTextField txtTim1;
    private javax.swing.JTextField txtTim2;
    // End of variables declaration//GEN-END:variables
}
