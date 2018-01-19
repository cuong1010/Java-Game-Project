/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan.FORM;

import doan.BUS.*;
import doan.GameDTO;
import doan.NguoiDungDTO;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

import javax.swing.*;

/**
 *
 * @author PC
 */
public class GameTimHinh extends javax.swing.JFrame {
    
   GameDTO game=new GameDTO();
    static int dong=12,cot=10;
    public static JButton[][] b=new JButton[dong][cot];
    TimHinhBus timhinh;
    int chon;
    public static JPanel[][] pn=new JPanel[dong][cot];
    String MATK;
    NoidungGameTH nd=new NoidungGameTH();
    HuongdanGameTH hd=new HuongdanGameTH();
    public GameTimHinh(String MATK) {
     try {
        UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
    }
    catch(Exception ex) { }
        initComponents();
        this.MATK=MATK;
        Showgame();
    }
    public void Showgame()
    {
        NguoiDungBus ngdungbus=new NguoiDungBus();
        NguoiDungDTO ngdung=new NguoiDungDTO();
        ngdung.MATK=MATK;
        ngdungbus.Xem(ngdung);
        lbUser.setText(ngdung.BIDANH);
        //game
        game=timhinh.XemTTGame();
        lbGame.setText(game.TENGAME);
    }
    private void addGame()
    {
        jPanel1.setLayout(new GridLayout(dong,cot,1,1));
        for(int i=0;i<dong;i++)
        for(int j=0;j<cot;j++)
        {
            pn[i][j]=new JPanel();
            pn[i][j].setLayout(new GridLayout(1,1));
           
            b[i][j]=new JButton();
            b[i][j].setVisible(false);
            b[i][j].addMouseListener(new MouseAdapter() {
                   public void mouseReleased(java.awt.event.MouseEvent evt) {
                        mouseEvent(evt);
                }
                });
            pn[i][j].add(b[i][j]); 
            jPanel1.add(pn[i][j]); 
        }
    }
    private void NewGame(int d,int c)
    {
        
        for(int i=0;i<dong;i++)
        for(int j=0;j<cot;j++)
        {   
           pn[i][j].removeAll();
           pn[i][j].setBackground(Color.WHITE);
           pn[i][j].setVisible(false);
           pn[i][j].setVisible(true);
          b[i][j].setEnabled(true);
            pn[i][j].add(b[i][j]); 
        }
        hideButton();
        showButton(d,c);
    }
    private void SelectMode(int chon)
    {
        if(chon==1)  
        {
            btnDe.setBackground(new Color(135,206, 250));
            btnTB.setBackground(new Color(255, 255, 255));
            btnKho.setBackground(new Color(255, 255, 255));
           
        }
         if(chon==2)  
        {
            btnTB.setBackground(new Color(135,206, 250));
            btnDe.setBackground(new Color(255, 255, 255));
            btnKho.setBackground(new Color(255, 255, 255));
        }
         if(chon==3)  
        {
            btnKho.setBackground(new Color(135,206, 250));
            btnDe.setBackground(new Color(255, 255, 255));
            btnTB.setBackground(new Color(255, 255, 255));
        }
         if(chon==0)  
        {
            btnKho.setBackground(new Color(255,255, 250));
            btnDe.setBackground(new Color(255, 255, 255));
            btnTB.setBackground(new Color(255, 255, 255));
        }
          btnBegin.setEnabled(true);
    }
    public static void Anhinh(int x,int y)
    {
        
        pn[x][y].removeAll();pn[x][y].setVisible(false);
        pn[x][y].setVisible(true);pn[x][y].add(b[x][y]);
    }
    
   
    private void showButton(int dong,int cot)
    {
        for(int i=0;i<dong;i++)
        for(int j=0;j<cot;j++)
        {
            b[i][j].setVisible(true);
            
        }
    }
    private void hideButton()
    {
        for(int i=0;i<dong;i++)
        for(int j=0;j<cot;j++)
        {
            b[i][j].setVisible(false);
        }
    }
    private void DisableButton()
    {
        for(int i=0;i<dong;i++)
        for(int j=0;j<cot;j++)
        {
            b[i][j].setEnabled(false);
        }
    }
    public void mouseEvent(MouseEvent evt)
    {
        for(int i=0;i<12;i++)
        for(int j=0;j<10;j++)
        {   
            if(timhinh.end) DisableButton();
            else
            {   if(evt.getButton()==1 && evt.getSource()==b[i][j]&&evt.getClickCount()==1) 
                {timhinh.chuottrai(i, j);}
               
                lbDiem.setText(String.valueOf(timhinh.getDiem()));
                lbCaphinh.setText(String.valueOf(timhinh.getSLCapHinh()));
                
            }
         
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnBegin = new javax.swing.JButton();
        btnDe = new javax.swing.JButton();
        btnTB = new javax.swing.JButton();
        btnKho = new javax.swing.JButton();
        btnHD = new javax.swing.JButton();
        btnND = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        lbDiem = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbGame = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbCaphinh = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(347, 101));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
        );

        jPanel1.setPreferredSize(new Dimension(425,525));

        jPanel3.setBackground(java.awt.Color.yellow);
        jPanel3.setPreferredSize(new java.awt.Dimension(240, 433));

        btnBegin.setText("Bắt đầu");
        btnBegin.setEnabled(false);
        btnBegin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeginActionPerformed(evt);
            }
        });

        btnDe.setBackground(new java.awt.Color(255, 255, 255));
        btnDe.setText("Dễ");
        btnDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeActionPerformed(evt);
            }
        });

        btnTB.setBackground(new java.awt.Color(255, 255, 255));
        btnTB.setText("Trung bình");
        btnTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTBActionPerformed(evt);
            }
        });

        btnKho.setBackground(new java.awt.Color(255, 255, 255));
        btnKho.setText("Khó");
        btnKho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoActionPerformed(evt);
            }
        });

        btnHD.setBackground(new java.awt.Color(255, 255, 255));
        btnHD.setText("Hướng dẫn");
        btnHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHDActionPerformed(evt);
            }
        });

        btnND.setBackground(new java.awt.Color(255, 255, 255));
        btnND.setText("Nội dung");
        btnND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNDActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(255, 255, 255));
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        lbDiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbDiem.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Điểm :");

        lbGame.setFont(new java.awt.Font("Ravie", 0, 16)); // NOI18N
        lbGame.setForeground(new java.awt.Color(0, 0, 255));
        lbGame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGame.setText("TÊN GAME");

        lbUser.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lbUser.setForeground(new java.awt.Color(204, 0, 51));
        lbUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUser.setText("jLabel2");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Số cặp hình");

        lbCaphinh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbCaphinh.setForeground(new java.awt.Color(179, 29, 36));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lbGame, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnND, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnHD, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnKho, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnTB, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDe, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnBegin, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbCaphinh, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbGame, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbUser, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCaphinh, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBegin, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDe, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTB, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnKho, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHD, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnND, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );

        addGame();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBeginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeginActionPerformed
       
       int i=0,j=0;
        SelectMode(0);
       if(chon==1) {i=5;j=6;}
       if(chon==2) {i=10;j=9;}
       if(chon==3) {i=12;j=10;}
       NewGame(i,j);
       btnBegin.setEnabled(false);
       timhinh=new TimHinhBus(i,j,MATK);
       lbDiem.setText(String.valueOf(timhinh.getDiem()));
       lbCaphinh.setText(String.valueOf(timhinh.getSLCapHinh()));
    }//GEN-LAST:event_btnBeginActionPerformed

    private void btnDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeActionPerformed
       chon=1;SelectMode(chon);
       
    }//GEN-LAST:event_btnDeActionPerformed

    private void btnTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTBActionPerformed
        chon=2;SelectMode(chon);
    }//GEN-LAST:event_btnTBActionPerformed

    private void btnKhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoActionPerformed
         chon=3;SelectMode(chon);
    }//GEN-LAST:event_btnKhoActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
       try 
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }
        catch(Exception ex) { }
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHDActionPerformed
     hd.setVisible(true);
    }//GEN-LAST:event_btnHDActionPerformed

    private void btnNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNDActionPerformed
        nd.setVisible(true);
    }//GEN-LAST:event_btnNDActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameTimHinh("0000000000").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBegin;
    private javax.swing.JButton btnDe;
    private javax.swing.JButton btnHD;
    private javax.swing.JButton btnKho;
    private javax.swing.JButton btnND;
    private javax.swing.JButton btnTB;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbCaphinh;
    private javax.swing.JLabel lbDiem;
    private javax.swing.JLabel lbGame;
    private javax.swing.JLabel lbUser;
    // End of variables declaration//GEN-END:variables

    
}
