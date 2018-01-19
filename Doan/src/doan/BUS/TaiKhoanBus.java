/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan.BUS;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import doan.DATA.*;
import doan.FORM.*;
import doan.TaiKhoanDTO;

/**
 *
 * @author PC1
 */
public class TaiKhoanBus
{
   TaiKhoanDATA conn = new TaiKhoanDATA();
  
   ResultSet rs;
  DefaultTableModel  model;
    private int Demslchuso(int n)
    {   int d=0;
        while(n!=0)
        {
            n=n/10;
            d++;
        }
        return d;
    }
    public boolean Login(TaiKhoanDTO acc) 
    {
       acc.MATK=conn.Login(acc.TENTK,acc.MK);
         if(acc.MATK==null)  JOptionPane.showMessageDialog(null,"Sai tài khoản hoặc mật khẩu");
         else 
         {   
             if(conn.Timgiatricuthe("TRANGTHAI","MATK",acc.MATK).equals("KHOA"))
             JOptionPane.showMessageDialog(null,"Tài khoản đã bị khoá");
             else
             {   if(acc.MATK.equals("0000000000")) new Admin();
                 else 
                 new User(acc.MATK).setVisible(true);
             return true;
             }
         }
         return false;
    }
    public void addQLTKTitle()
    {
            Vector header = new Vector();
            header.add("Mã tài khoản");//tua de cot cua jtable
            header.add("Tài khoản");
             header.add("Mật khẩu");//tua de cot cua jtable
            header.add("Mật khẩu 2");
           header.add("Trạng thái");//tua de cot cua jtable
            header.add("Ngày đăng ký");
          model = new DefaultTableModel(header,0);     
}
    public DefaultTableModel CapnhatAccount()
    {   
            rs=conn.selectAll();
            addQLTKTitle();
            Vector v = new Vector();
       try {
           while (rs.next()) {
               v = new Vector();
               v.addElement(rs.getString(1));
               v.addElement(rs.getString(2));
               v.addElement(rs.getString(3));
               v.addElement(rs.getString(4));
               v.addElement(rs.getString(5));
               v.addElement(NgayGio.NamThangNgaySangNgayThangNam(rs.getDate(6)));
               model.addRow(v);    
           }
       } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Không có dữ liệu");
       }
        
           return model;
    }    
    public String newID()
    {   
        
        String s = null;
        try {
            rs=conn.selectAll();
            while(rs.next())
            {
                s=rs.getString("MATK");
            }
          int d=(Integer.parseInt(s)+1);
          s=s.substring(0,s.length()-Demslchuso(d))+d;
          //System.out.println(s);
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null,"Ko the tao ID mới");
        }
    return s;
    }
    public boolean KtTontai(String TT,String s) 
    {   
        if(conn.Timgiatricuthe(TT, TT, s)!=null) return true;///
        return false;
    }
    public boolean KtTrung(String TT1,String giatri1,String TT2,String giatri2) 
    {   /*TT2 va giatri2 la bien trong dieu kien where
        TT1 la cot trong select
        giatri1 la giatri can so sanh
        */
        if(giatri1.equals(conn.Timgiatricuthe(TT1,TT2,giatri2))) return true;          
            return false;
    }    
    public void ThemTK(TaiKhoanDTO acc)  
    {   acc.TRANGTHAI="KHONG KHOA";
            if(KtTontai("TENTK",acc.TENTK))
                    JOptionPane.showMessageDialog(null, "Đã có tài khoản này");
          if(!NgayGio.KTDinhDangNgay(acc.NGDK)) JOptionPane.showMessageDialog(null,"Định dạng ngày sai");
           else //Ko co tai khoan tim dc
            {
                acc.NGDK=NgayGio.NgayThangNamSangNamThangNgay(acc.NGDK);
                acc.MATK=newID();
                if(conn.Them(acc)>0)
                JOptionPane.showMessageDialog(null, "Them tài khoản thanh cong");
                else
                JOptionPane.showMessageDialog(null,"Thêm thất bại"); 
            }
       } 
    public void SuaTK(TaiKhoanDTO acc)
    {
       if(!NgayGio.KTDinhDangNgay(acc.NGDK)) JOptionPane.showMessageDialog(null,"Định dạng ngày sai");
       else{ 
          acc.NGDK=NgayGio.NgayThangNamSangNamThangNgay(acc.NGDK);
          if(conn.Sua(acc)>0)
          JOptionPane.showMessageDialog(null,"Sửa thành công");
          else  JOptionPane.showMessageDialog(null,"Tài khoản bị trùng");
       }
        
    }
    public void SuaTK(TaiKhoanDTO acc,boolean Trangthaikhoa)
    {
       if(!NgayGio.KTDinhDangNgay(acc.NGDK)) JOptionPane.showMessageDialog(null,"Định dạng ngày sai");
       else{ 
           if(Trangthaikhoa &&acc.MATK.equals("0000000000")) JOptionPane.showMessageDialog(null,"Ko thể khoá tài khoản này");
           else
           {    conn.Khoa(Trangthaikhoa,acc);
                acc.NGDK=NgayGio.NgayThangNamSangNamThangNgay(acc.NGDK);
                if(conn.Sua(acc)>0)
                JOptionPane.showMessageDialog(null,"Sửa thành công");
                else  JOptionPane.showMessageDialog(null,"Tài khoản bị trùng");
           
           }
       }
        
    }
    public void KhoaTK(TaiKhoanDTO acc)
    {
        if(acc.MATK.equals("0000000000"))JOptionPane.showMessageDialog(null,"Ko thể khoá tài khoản này");
        else 
        {    int chon=JOptionPane.showConfirmDialog(null,"Bạn có chắc chắn muốn khoá tài khoản này","Xác nhận khoá",0);
            if(chon==0){
            if(conn.Khoa(true,acc)>0) JOptionPane.showMessageDialog(null,"Đã khoá");
            else JOptionPane.showMessageDialog(null,"Xảy ra lỗi khoá thất bại");
            } 
        }
    }
    public void MoKhoaTK(TaiKhoanDTO acc)
    {
       if(acc.MATK.equals("0000000000"))JOptionPane.showMessageDialog(null,"Tài khoản này luôn được mở khoá");
        else 
        {   int chon=JOptionPane.showConfirmDialog(null,"Bạn có chắc chắn muốn mở khoá tài khoản này","Xác nhận mở khoá",0);
            if(chon==0){
            if(conn.Khoa(false,acc)>0) JOptionPane.showMessageDialog(null,"Đã mở khoá");
            else JOptionPane.showMessageDialog(null,"Xảy ra lỗi mở khoá thất bại");
            }
        }
    }
   
    public DefaultTableModel TimKiem(int chon,String giatri)
    {
        String Cot = null;
        if(chon==0) Cot="MATK";
        if(chon==1) Cot="TENTK";
        if(chon==2) Cot="TRANGTHAI";
        if(chon==3) {Cot="NGDK";giatri=NgayGio.NgayThangNamSangNamThangNgay(giatri);}
        rs=conn.Timkiem(Cot, giatri);
        addQLTKTitle();
       try {
          do
           {
              Vector v = new Vector();
               v.addElement(rs.getString(1));
               v.addElement(rs.getString(2));
               v.addElement(rs.getString(3));
               v.addElement(rs.getString(4));
               v.addElement(rs.getString(5));
               v.addElement(NgayGio.NamThangNgaySangNgayThangNam(rs.getDate(6)));
               model.addRow(v);     
           }while(rs.next());
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Không tìm dc hoặc dữ liệu tìm ko hợp lệ");
       }
       return model;
    }
     public DefaultTableModel TimKiemKhoangGiatri(int chon,String giatri1,String giatri2)
    {
        String Cot = null;
        if(chon==0) Cot="MATK";
        if(chon==1) Cot="TENTK";
        if(chon==2) Cot="TRANGTHAI";
        if(chon==3) {
            Cot="NGDK";giatri1=NgayGio.NgayThangNamSangNamThangNgay(giatri1);
           giatri2=NgayGio.NgayThangNamSangNamThangNgay(giatri2);
        }
        rs=conn.Timkiemtheokhoanggiatri(Cot,giatri1,Cot,giatri2);
        addQLTKTitle();
       try {
          do
           {
              Vector v = new Vector();
               v.addElement(rs.getString(1));
               v.addElement(rs.getString(2));
               v.addElement(rs.getString(3));
               v.addElement(rs.getString(4));
               v.addElement(rs.getString(5));
               v.addElement(NgayGio.NamThangNgaySangNgayThangNam(rs.getDate(6)));
               model.addRow(v);     
           }while(rs.next());
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Không tìm dc hoặc dữ liệu tìm ko hợp lệ");
       }
       return model;
    }
     public boolean XemMoKhoa(TaiKhoanDTO acc)
     {
         rs=conn.Timkiem("MATK",acc.MATK);
        try {
            acc.TENTK=rs.getString("TENTK");
            acc.MK=rs.getString("MATKHAU");
            acc.MK2=rs.getString("MATKHAU2");
            acc.NGDK=NgayGio.NamThangNgaySangNgayThangNam(rs.getDate("NGDK"));
            acc.TRANGTHAI=rs.getString("TRANGTHAI");
            if(acc.TRANGTHAI.equals("KHOA")) return false;
            
        
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Ko thể lấy thông tin tài khoản");
          
        }
        return true;
     }
}

