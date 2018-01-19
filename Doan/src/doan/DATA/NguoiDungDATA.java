/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan.DATA;

import doan.*;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class NguoiDungDATA extends SQLConnect{
    String table;
    public NguoiDungDATA()
    {
        super();
        table="nguoidung";
    }
     public NguoiDungDATA(String h, String u, String p, String data,String table) {
        super(h, u, p, data);
        this.table=table;
    }
    public ResultSet selectAll()
    { 
        rs=this.executeQuery("SELECT * FROM "+table +" ORDER BY MATK ASC");
        return rs;
    }
    public int Them(NguoiDungDTO ngdung)
    {   
       String qry="Insert into "+table+" values(";
        qry+="'"+ngdung.MATK+"',"+"'"+ngdung.BIDANH+"',"+"'"+ngdung.TENNGDUNG+"',";
        qry+="'"+ngdung.SODT+"',"+"'"+ngdung.EMAIL+"',"+"'"+ngdung.PHAI+"',"+"'"+ngdung.NGAYSINH+"')";
        //System.out.print(qry);
        int i=this.executeUpdate(qry);
        return i;
    }
    public int Sua(NguoiDungDTO ngdung) 
    {      int i = 0;
        if(Timgiatricuthe("MATK","MATK",ngdung.MATK)==null) 
            i=Them(ngdung);
        else
        { String qry="Update "+table+" set ";
        qry+="BIDANH="+"'"+ngdung.BIDANH+"',"+"TENNGDUNG="+"N'"+ngdung.TENNGDUNG+"',";
        qry+="SODT="+"'"+ngdung.SODT+"',"+"EMAIL="+"'"+ngdung.EMAIL+"',"+"NGAYSINH="+"'"+ngdung.NGAYSINH+"',";
        qry+="PHAI="+"'"+ngdung.PHAI+"'";
        qry+="where MATK="+"'"+ngdung.MATK+"'";
        //System.out.println(qry);
        i=this.executeUpdate(qry);
       
        }
         return i;
    }
    public ResultSet Timkiem(String Thuoctinh,String giatri)
    {
        String qry="SELECT * FROM "+table+" where "; 
        qry+=Thuoctinh+" ='"+giatri+"'";
        //System.out.print(String.valueOf(qry));
        rs=this.executeQuery(qry);
        try {
            rs.next();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Ko co dữ liệu");
        } 
        return rs; 
    }
    public ResultSet Timkiemtuoi(String namsinh)
    {
        String qry="SELECT * FROM "+table+" where YEAR(NGAYSINH)='"+namsinh+"'"; 
        
        //System.out.print(String.valueOf(qry));
        rs=this.executeQuery(qry);
        try {
            rs.next();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Ko co dữ liệu");
        } 
        return rs; 
    }
    public ResultSet Timkiemdotuoi(String namsinh1,String namsinh2)
    {
        String qry="SELECT * FROM "+table+" where YEAR(NGAYSINH) BETWEEN'"+namsinh2+"' AND '"+namsinh1+"'"; 
        
        System.out.print(String.valueOf(qry));
        rs=this.executeQuery(qry);
        try {
            rs.next();
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
}
