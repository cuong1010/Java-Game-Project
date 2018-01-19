/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan.DATA;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import doan.TaiKhoanDTO;

/**
 *
 * @author PC
 */
public class TaiKhoanDATA extends SQLConnect{
    
    String table;
    public TaiKhoanDATA()
    {
        super();
        table="taikhoan";
    }
    
    public TaiKhoanDATA(String h, String u, String p, String data,String table) {
        super(h, u, p, data);
        this.table=table;
    }
   
    public ResultSet selectAll()
  { 
    rs=this.executeQuery("SELECT * FROM "+table +" ORDER BY MATK ASC");
    return rs;
  }
    public int Them(TaiKhoanDTO acc) 
    {
        String qry="Insert into "+table+" values(";
        qry+="'"+acc.MATK+"',"+"'"+acc.TENTK+"',"+"'"+acc.MK+"',";
        qry+="'"+acc.MK2+"',"+"'"+acc.TRANGTHAI+"',"+"'"+acc.NGDK+"')";
        //System.out.print(qry);
        int i=this.executeUpdate(qry);
        return i;
    }
    public int Sua(TaiKhoanDTO acc) 
    {      int i = 0;
         String qry="Update "+table+" set ";
        qry+="TENTK="+"'"+acc.TENTK+"',"+"MATKHAU="+"'"+acc.MK+"',";
        qry+="MATKHAU2="+"'"+acc.MK2+"',"+"NGDK="+"'"+acc.NGDK+"'";
        qry+="where MATK="+"'"+acc.MATK+"'";
        //System.out.print(qry);
        i=this.executeUpdate(qry);
        return i;
    }
    public int Sua(String Cot,String Giatri,String Cotdk,String Giatridk) 
    {    int i = 0;
         String qry="Update "+table+" set ";
        qry+=Cot+"='"+Giatri+"'";
        qry+="where "+Cotdk+"="+"'"+Giatridk+"'";
        //System.out.print(qry);
        i=this.executeUpdate(qry);
        return i;
    }
    public int Khoa(boolean k,TaiKhoanDTO acc)
    {   String s;
        if(k==true) s="KHOA";
        else s="KHONG KHOA";
        int i=0;
        String qry="Update "+table+" set TRANGTHAI='"+s+"'";
        qry+="where MATK="+"'"+acc.MATK+"'";
        //System.out.print(qry);
        i=this.executeUpdate(qry);
        return i;
    }
  public ResultSet Timkiem(String Thuoctinh,String giatri) 
  { 
      
     String qry="SELECT * FROM "+table+" where "; 
     qry+=Thuoctinh+"='"+giatri+"'";
     //System.out.print(String.valueOf(qry));
     rs=this.executeQuery(qry);
      try {
            rs.next();//thieu next k dc
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Ko co dữ liệu");
        } 
      return rs; 
  }
  public ResultSet Timkiemtheokhoanggiatri(String Thuoctinh1,String giatri1,String Thuoctinh2,String giatri2) 
  { 
      
     String qry="SELECT * FROM "+table+" where "; 
     qry+=Thuoctinh1+">='"+giatri1+"'"+" AND ";
     qry+=Thuoctinh2+"<='"+giatri2+"'";
     //System.out.print(String.valueOf(qry));
     rs=this.executeQuery(qry);
      try {
            rs.next();//thieu next k dc
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Ko co dữ liệu");
        } 
      return rs; 
  }
   public String Timgiatricuthe(String Thuoctinhcanlay,String Thuoctinh,String giatri) 
  { 
      
        Timkiem(Thuoctinh,giatri);
        String s = null;
        try {
            //System.out.print(rs.getString(colum));
            s=rs.getString(Thuoctinhcanlay);
        } catch (SQLException ex) {
            return null;
        }
    return s;
  }
   public String Login(String TK,String MK) 
   {    
       String s;
       String qry="Select * from "+table+" where TENTK='"+TK+"' AND MATKHAU='"+MK+"'";
       //System.out.print(qry);
        rs=this.executeQuery(qry);
        try {
            rs.next();
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Ko co dữ liệu");
        }
        try {
            s=rs.getString("MATK");
        } catch (SQLException ex) {
          return null;
        }
        return s;
   }
}
    
