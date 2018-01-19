
package doan.FORM;

import doan.BUS.NgayGio;
import doan.BUS.NguoiDungBus;
import doan.NguoiDungDTO;
import javax.swing.JOptionPane;

public class TTUser extends javax.swing.JFrame {

    NguoiDungBus ngdungbus=new NguoiDungBus();
    public TTUser(NguoiDungDTO ngdung) {
        initComponents();
        Xem(ngdung);
    }
    public void Xem(NguoiDungDTO ngdung)
    {
        
       
        if(ngdung.PHAI.equals("NU")) radNU.setSelected(true);
        lbMATK.setText(ngdung.MATK);
        lbBidanh.setText(ngdung.BIDANH);
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNgay = new javax.swing.JTextField();
        btnCapnhat = new javax.swing.JButton();
        btnTrove = new javax.swing.JButton();
        radNAM = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        radNU = new javax.swing.JRadioButton();
        txtEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTenngdung = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtThang = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNam = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbMATK = new javax.swing.JLabel();
        lbBidanh = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Thông tin");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("/");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Phái");

        txtNgay.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnCapnhat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCapnhat.setText("Cập nhật");
        btnCapnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhatActionPerformed(evt);
            }
        });

        btnTrove.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnTrove.setText("Trở về");
        btnTrove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTroveActionPerformed(evt);
            }
        });

        buttonGroup1.add(radNAM);
        radNAM.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radNAM.setSelected(true);
        radNAM.setText("Nam");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Email");

        buttonGroup1.add(radNU);
        radNU.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radNU.setText("Nữ");
        radNU.setFocusable(false);

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Số điện thoại");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Mã tài khoản");

        txtTenngdung.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtSDT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Bí danh");

        txtThang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Tên người dùng");

        txtNam.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("/");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Ngày sinh");

        lbMATK.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lbBidanh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addComponent(jLabel3))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel7))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(radNAM)
                                    .addGap(18, 18, 18)
                                    .addComponent(radNU))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnCapnhat)
                                    .addGap(20, 20, 20)
                                    .addComponent(btnTrove))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtThang, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtNam, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel11))
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTenngdung, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                        .addComponent(lbBidanh, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                        .addComponent(lbMATK, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMATK, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbBidanh, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenngdung, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(radNAM, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radNU, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtThang, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNam, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTrove, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        lbMATK.getAccessibleContext().setAccessibleName("lbMATK");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhatActionPerformed
       NguoiDungDTO ngdung= new NguoiDungDTO();
       ngdung.MATK=lbMATK.getText();
       ngdung.TENNGDUNG=txtTenngdung.getText();ngdung.BIDANH=lbBidanh.getText();ngdung.EMAIL=txtEmail.getText();
       ngdung.SODT= txtSDT.getText();ngdung.NGAYSINH=txtNgay.getText()+"/"+txtThang.getText()+"/"+txtNam.getText();
       if(!NullValue()) ngdungbus.Sua(ngdung,radNAM.isSelected());
       
    }//GEN-LAST:event_btnCapnhatActionPerformed
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
    private void btnTroveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroveActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnTroveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
           
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapnhat;
    private javax.swing.JButton btnTrove;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbBidanh;
    private javax.swing.JLabel lbMATK;
    private javax.swing.JRadioButton radNAM;
    private javax.swing.JRadioButton radNU;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNam;
    private javax.swing.JTextField txtNgay;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenngdung;
    private javax.swing.JTextField txtThang;
    // End of variables declaration//GEN-END:variables
}
