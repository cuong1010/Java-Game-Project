/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan.FORM;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import java.io.*;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import jxl.*;
import jxl.read.biff.BiffException;
import java.awt.event.*;
import java.sql.*;
import java.util.Calendar;
import doan.BUS.*;
import doan.*;
import java.util.Vector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author HOME
 */
public class Thongke extends javax.swing.JFrame {
    XulyThongKe thongke=new XulyThongKe();
    public Thongke() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblThongKe = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbThangBDau = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbThangKThuc = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        btXem = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        cbNgayBDau = new javax.swing.JComboBox<>();
        cbNgayKThuc = new javax.swing.JComboBox<>();
        txtNamBDau = new javax.swing.JTextField();
        txtNamKThuc = new javax.swing.JTextField();
        DSChon = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtMATK = new javax.swing.JTextField();
        radgame1 = new javax.swing.JRadioButton();
        radgame2 = new javax.swing.JRadioButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        Xuatexc = new javax.swing.JMenuItem();
        Nhapexc = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        Print = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblThongKe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Thời điểm thống kê", "MATK", "MAGAME", "TONGDIEM", "TONGTGCHOI", "TONGSLCHOI", "TGIAN1", "TGIAN2"
            }
        ));
        jScrollPane2.setViewportView(tblThongKe);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("ngày");

        jLabel4.setText("tháng");

        cbThangBDau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jLabel5.setText("năm");

        jLabel6.setText("Từ:");

        jLabel7.setText("Đến:");

        jLabel8.setText("ngày");

        jLabel9.setText("tháng");

        cbThangKThuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jLabel10.setText("năm");

        btXem.setText("Thống kê");
        btXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXemActionPerformed(evt);
            }
        });

        jButton1.setText("Trở về");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnLuu.setText("Xem dữ liệu đã thống kê");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        cbNgayBDau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cbNgayKThuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        txtNamBDau.setText("2016");

        txtNamKThuc.setText("2016");

        DSChon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ngay", "Thang", "Nam" }));
        DSChon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DSChonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(DSChon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbNgayBDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbThangBDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNamBDau, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbNgayKThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbThangKThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNamKThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLuu)
                        .addGap(18, 18, 18)
                        .addComponent(btXem)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(cbThangBDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(cbNgayBDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamBDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DSChon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(cbThangKThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(cbNgayKThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamKThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btXem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jLabel1.setText("Mã TK");

        txtMATK.setText("0000000000");

        buttonGroup1.add(radgame1);
        radgame1.setSelected(true);
        radgame1.setText("Game tìm kho báu");

        buttonGroup1.add(radgame2);
        radgame2.setText("Game tìm hình");

        jMenu2.setText("Quan Ly Tai Khoan");
        jMenuBar2.add(jMenu2);

        jMenu5.setText("Excel");

        Xuatexc.setText("Xuat");
        Xuatexc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XuatexcActionPerformed(evt);
            }
        });
        jMenu5.add(Xuatexc);

        Nhapexc.setText("Nhap");
        Nhapexc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NhapexcActionPerformed(evt);
            }
        });
        jMenu5.add(Nhapexc);

        jMenuBar2.add(jMenu5);

        jMenu1.setText("In");

        Print.setText("In");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });
        jMenu1.add(Print);

        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMATK, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(radgame1)
                    .addComponent(radgame2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMATK, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(radgame1)
                        .addGap(18, 18, 18)
                        .addComponent(radgame2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void XuatexcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XuatexcActionPerformed
      WritableWorkbook w;
      JFileChooser chooser = new JFileChooser();
      int i = chooser.showSaveDialog(this);
      if(i==JFileChooser.APPROVE_OPTION)
      {
          File file = new File(chooser.getSelectedFile()+".xls");
          try
          { 
              w=Workbook.createWorkbook(file);
              WritableSheet sheet1 = w.createSheet("Thongke", 1);
              DefaultTableModel model = (DefaultTableModel)tblThongKe.getModel();
              for(int j=0;j<model.getColumnCount();j++)
              {
                jxl.write.Label head = new jxl.write.Label(j,0,(String)tblThongKe.getColumnName(j));
		sheet1.addCell(head);
              }
              for(int j=0;j<model.getRowCount();j++)
              {
                  for(int k=0;k<model.getColumnCount();k++)
                  {
                      jxl.write.Label content = new jxl.write.Label(k,j+1,model.getValueAt(j, k).toString());
                      sheet1.addCell(content);
                  }
             }
              w.write();
              w.close();
              JOptionPane.showMessageDialog(null,"Đã xuất dữ liệu ra Excel thành công");
          }
          catch (IOException e)
          {
             JOptionPane.showMessageDialog(null,"Không thể xuất dữ liệu");
          } catch (WriteException ex) {
              JOptionPane.showMessageDialog(null,"Xảy ra lỗi không thể xuất dữ liệu");
          }
      }
    }//GEN-LAST:event_XuatexcActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
MessageFormat header = new MessageFormat("Thong Ke Diem Choi");
         MessageFormat footer = new MessageFormat("");
        try
        {
            tblThongKe.print(JTable.PrintMode. FIT_WIDTH,header,footer);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Không thể in");
        }
    }//GEN-LAST:event_PrintActionPerformed

    private void NhapexcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NhapexcActionPerformed
        DefaultTableModel modelnm_tuexcel;
        Vector header = new Vector();
        header.add("THOIDIEM");
            header.add("MATK");
            header.add("MAGAME");
            header.add("TONGDIEM");
            header.add("TONGTG");
            header.add("TONGSL");
            header.add("TGIAN1");
            header.add("TGIAN2");
        modelnm_tuexcel = new DefaultTableModel(header,0);
        JFileChooser chooser = new JFileChooser();
        int i = chooser.showOpenDialog(this);
        if(i==JFileChooser.APPROVE_OPTION)
        {
            File xuat = new File(chooser.getSelectedFile().getAbsolutePath());
            try {
                Workbook wb = Workbook.getWorkbook(xuat);
                Sheet s = wb.getSheet(0);
                int row = s.getRows();
                int col = s.getColumns();
                for(int j=1;j<row;j++)
                {
                   Vector dong = new Vector();
                    for(int k=0;k<col;k++)
                    {
                        Cell c = s.getCell(k, j);
                        dong.add(c.getContents());
                    }
                  modelnm_tuexcel.addRow(dong);
                }
                thongke.LuuCSDL(modelnm_tuexcel);
                tblThongKe.setModel(modelnm_tuexcel);
                JOptionPane.showMessageDialog(null, "Đã lấy dữ liệu");
            } 
            catch (IOException ex)
            {
                JOptionPane.showMessageDialog(null, "Không thể lấy dữ liệu");
            } 
            catch (BiffException ex) 
            {
                JOptionPane.showMessageDialog(null, "Không thể lấy dữ liệu");
            }
        }  
    }//GEN-LAST:event_NhapexcActionPerformed

    private void btXemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXemActionPerformed
    String ngaybd=txtNamBDau.getText();
    String ngaykt=txtNamKThuc.getText();
   
         ngaybd+="-"+cbThangBDau.getSelectedItem().toString()+"-"+cbNgayBDau.getSelectedItem().toString();
         ngaykt+="-"+cbThangKThuc.getSelectedItem().toString()+"-"+cbNgayKThuc.getSelectedItem().toString();
     
     
        tblThongKe.setModel(thongke.Xem(txtMATK.getText(),radgame1.isSelected(),DSChon.getSelectedIndex(),ngaybd,ngaykt));
         
    }//GEN-LAST:event_btXemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DSChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DSChonActionPerformed
 if(DSChon.getSelectedIndex()==0) 
        {
          cbNgayBDau.setEnabled(true);
         
          cbNgayKThuc.setEnabled(true);
        
          cbThangKThuc.setEnabled(true);
          cbThangBDau.setEnabled(true);
        }
 
 if(DSChon.getSelectedIndex()==1)
        {
          cbNgayBDau.setEnabled(false);
         cbNgayKThuc.setEnabled(false);
          cbThangKThuc.setEnabled(true);
          cbThangBDau.setEnabled(true);
          
        }
 if(DSChon.getSelectedIndex()==2) 
        {
     
          cbNgayBDau.setEnabled(false);
          cbThangBDau.setEnabled(false);
          cbNgayKThuc.setEnabled(false);
          cbThangKThuc.setEnabled(false);
         
        }
    }//GEN-LAST:event_DSChonActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        tblThongKe.setModel(thongke.XemAllTK());
    }//GEN-LAST:event_btnLuuActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DSChon;
    private javax.swing.JMenuItem Nhapexc;
    private javax.swing.JMenuItem Print;
    private javax.swing.JMenuItem Xuatexc;
    private javax.swing.JButton btXem;
    private javax.swing.JButton btnLuu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbNgayBDau;
    private javax.swing.JComboBox<String> cbNgayKThuc;
    private javax.swing.JComboBox<String> cbThangBDau;
    private javax.swing.JComboBox<String> cbThangKThuc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radgame1;
    private javax.swing.JRadioButton radgame2;
    private javax.swing.JTable tblThongKe;
    private javax.swing.JTextField txtMATK;
    private javax.swing.JTextField txtNamBDau;
    private javax.swing.JTextField txtNamKThuc;
    // End of variables declaration//GEN-END:variables
}
