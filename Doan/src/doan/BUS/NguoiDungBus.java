/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan.BUS;

import doan.DATA.*;
import doan.*;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NguoiDungBus {
    NguoiDungDATA conn = new NguoiDungDATA();
    ResultSet rs;
    DefaultTableModel  model;
    public boolean exist=false;
    
    public boolean Xem(NguoiDungDTO ngdung)
    {
        rs=conn.Timkiem("MATK",ngdung.MATK);
        try {
            ngdung.BIDANH=rs.getString("BIDANH");
            ngdung.TENNGDUNG=rs.getString("TENNGDUNG");
            ngdung.EMAIL=rs.getString("EMAIL");
            ngdung.SODT=rs.getString("SODT");
            ngdung.NGAYSINH=NgayGio.NamThangNgaySangNgayThangNam(rs.getDate("NGAYSINH"));
            ngdung.PHAI=rs.getString("PHAI");
            
            exist=true;
        if(ngdung.PHAI.equals("NU")) return false;
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Tài khoản này ko có thông tin người dùng");
          exist=false;
        }
        return true;
    }
   public void Sua(NguoiDungDTO ngdung,boolean phai)
    {   
          if(phai) ngdung.PHAI="NAM";else ngdung.PHAI="NU";
          if(!NgayGio.KTDinhDangNgay(ngdung.NGAYSINH))JOptionPane.showMessageDialog(null,"Định dạng ngày sai");
          else
          { ngdung.NGAYSINH=NgayGio.NgayThangNamSangNamThangNgay(ngdung.NGAYSINH);
              if(conn.Sua(ngdung)>0) JOptionPane.showMessageDialog(null,"Sửa thành công");
            else  JOptionPane.showMessageDialog(null,"Bí danh bị trùng");
          }
        
    }
    public boolean KtTontai(String TT,String s) 
    {   
        if(conn.Timgiatricuthe(TT, TT, s)!=null) return true;
        return false;
    }
    public void Them(NguoiDungDTO ngdung)  
    {  ngdung.NGAYSINH=NgayGio.NgayThangNamSangNamThangNgay(ngdung.NGAYSINH);
       if(conn.Them(ngdung)>0)
       JOptionPane.showMessageDialog(null, "Thêm người dùng thành công");
       else
       JOptionPane.showMessageDialog(null,"Thêm thất bại"); 
     }
    public void addQLNDTitle()
    {
            Vector header = new Vector();
            header.add("Mã tài khoản");//tua de cot cua jtable
            header.add("Bí danh");
            header.add("Họ và tên");//tua de cot cua jtable
            header.add("Số điện thoại");
            header.add("Email");
           header.add("Giới tính");//tua de cot cua jtable
            header.add("Ngày sinh");
          model = new DefaultTableModel(header,0);     
}
    public DefaultTableModel CapnhatNguoidung()
    {
          rs=conn.selectAll();
            addQLNDTitle();
            Vector v = new Vector();
       try {
           while (rs.next()) {
               v = new Vector();
               v.addElement(rs.getString(1));
               v.addElement(rs.getString(2));
               v.addElement(rs.getString(3));
               v.addElement(rs.getString(4));
               v.addElement(rs.getString(5));
                v.addElement(rs.getString(6));//sua lai la lay checkbox lu vao bang,nguoc lai
               v.addElement(NgayGio.NamThangNgaySangNgayThangNam(rs.getDate(7)));
               model.addRow(v);    
           }
       } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Không có dữ liệu hoặc dữ liệu sai");
       }
        
           return model;
    }
     public DefaultTableModel Timkiem(int chon,String giatri)
    {
        String Cot = null;
        if(chon==0) Cot="MATK";
        if(chon==1) Cot="BIDANH";
        if(chon==2) {
           giatri=String.valueOf(Integer.valueOf(NgayGio.getYear(NgayGio.Ngayhientai()))-Integer.valueOf(giatri));
           rs=conn.Timkiemtuoi(giatri);
                }
        if(chon==3) Cot="PHAI";
        
        if(chon!=2)rs=conn.Timkiem(Cot, giatri);
        addQLNDTitle();
       try {
          do
           {
              Vector v = new Vector();
               v.addElement(rs.getString(1));
               v.addElement(rs.getString(2));
               v.addElement(rs.getString(3));
               v.addElement(rs.getString(4));
               v.addElement(rs.getString(5));
                v.addElement(rs.getString(6));
               v.addElement(NgayGio.NamThangNgaySangNgayThangNam(rs.getDate(7)));
               model.addRow(v);     
           }while(rs.next());
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Không tìm dc hoặc dữ liệu tìm ko hợp lệ");
       }
       return model;
    }
     public DefaultTableModel TimkiemKhoangGiatri(int chon,String giatri1,String giatri2)
    {
        String Cot = null;
        if(chon==0) Cot="MATK";
        if(chon==1) Cot="BIDANH";
        if(chon==2) {
           giatri1=String.valueOf(Integer.valueOf(NgayGio.getYear(NgayGio.Ngayhientai()))-Integer.valueOf(giatri1));
            giatri2=String.valueOf(Integer.valueOf(NgayGio.getYear(NgayGio.Ngayhientai()))-Integer.valueOf(giatri2));
            rs=conn.Timkiemdotuoi(giatri1, giatri2);
                }
         if(chon==3) Cot="PHAI";
       
        if(chon!=2)rs=conn. Timkiemtheokhoanggiatri(Cot,giatri1,Cot,giatri2);
        addQLNDTitle();
       try {
          do
           {
              Vector v = new Vector();
               v.addElement(rs.getString(1));
               v.addElement(rs.getString(2));
               v.addElement(rs.getString(3));
               v.addElement(rs.getString(4));
               v.addElement(rs.getString(5));
                v.addElement(rs.getString(6));
               v.addElement(NgayGio.NamThangNgaySangNgayThangNam(rs.getDate(7)));
               model.addRow(v);     
           }while(rs.next());
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Không tìm dc hoặc dữ liệu tìm ko hợp lệ");
       }
       return model;
    }
     public DefaultTableModel XemLSChoiUser(String MATK)
     {
         LogDaTa xem=new LogDaTa();
         rs=xem.XemlschoicuaUser(MATK);
         Vector header = new Vector();
            header.add("Tên game");
            header.add("Điểm");
            header.add("Ngày chơi");
            header.add("Thời gian bắt đầu");
            header.add("Thời gian chơi");
            model = new DefaultTableModel(header,0);
            try
            {
                while(rs.next())
                {
                Vector v=new Vector();
                v.addElement(rs.getString(1));
                v.addElement(rs.getInt(2));
                v.addElement(NgayGio.NamThangNgaySangNgayThangNam(rs.getDate(3)));
                v.addElement(rs.getString(4));
                v.addElement(rs.getInt(5));
                 model.addRow(v);
                }
            }
            catch(SQLException ex)
            {
             JOptionPane.showMessageDialog(null, "Không có dữ liệu hoặc dữ liệu sai");
            }
            return model;
     }
    public int XemDiemCao(String MATK,boolean game1)
    {
        LogDaTa conn=new LogDaTa();
        if(game1) return conn.DiemCao(MATK,"GAME01");
        else return conn.DiemCao(MATK,"GAME02");
    }
}
