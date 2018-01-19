/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan.BUS;

import doan.DATA.ThongKeDATA;
import doan.ThongKeDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class XulyThongKe {
    ThongKeDATA conn=new ThongKeDATA();
    ResultSet rs;
    DefaultTableModel  model;
    public DefaultTableModel Xem(String MATK,boolean game,int loai,String thoigian1,String thoigian2)
    {
        String MAGAME;
        if(game) MAGAME="GAME01";else MAGAME="GAME02";
        if(loai==0) 
        {
            
            rs=conn.TKtheoNgay(MATK, MAGAME, thoigian1, thoigian2);
        }
        if(loai==1) 
        {
             thoigian1=thoigian1.substring(0,7);
            thoigian2=thoigian2.substring(0,7);
            rs=conn.TKtheoThang(MATK, MAGAME, thoigian1, thoigian2);
            
        }
        if(loai==2) 
        {
            
            rs=conn.TKtheoNam(MATK, MAGAME, thoigian1, thoigian2);
            
        }
        ThongKeDTO thongke=new ThongKeDTO();
            addTitle();
            String thoidiem=NgayGio.NgayThangNamSangNamThangNgay(NgayGio.Ngayhientai())+" "+NgayGio.Giohientai();
            try
            {
                while(rs.next())
                {
                Vector v=new Vector();
                v.addElement(thoidiem);thongke.THOIDIEM=thoidiem;
                v.addElement(MATK);thongke.MATK=MATK;
                v.addElement(MAGAME);thongke.MAGAME=MAGAME;
                v.addElement(rs.getInt(1));thongke.TONGDIEM=rs.getInt(1);
                v.addElement(rs.getInt(2));thongke.TONGTGCHOI=rs.getInt(2);
                v.addElement(rs.getInt(3));thongke.TONGSLCHOI=rs.getInt(3);
                v.addElement(thoigian1);thongke.TGIAN1=thoigian1;
                v.addElement(thoigian2);thongke.TGIAN2=thoigian2;
               
                 model.addRow(v);
                }
            }
            catch(SQLException ex)
            {
             JOptionPane.showMessageDialog(null, "Không có dữ liệu hoặc dữ liệu sai");
            }
             conn.addThongKe(thongke);
            return model;
    }
    public void LuuCSDL(DefaultTableModel model)
    {
        ThongKeDTO thongke;
         for(int dong=0;dong<model.getRowCount();dong++)
              {
                      thongke=new ThongKeDTO();
                      thongke.THOIDIEM=model.getValueAt(dong, 0).toString();
                      thongke.MATK=model.getValueAt(dong, 1).toString();
                      thongke.MAGAME=model.getValueAt(dong,2).toString();
                      thongke.TONGDIEM=Integer.valueOf(model.getValueAt(dong, 3).toString());
                      thongke.TONGTGCHOI=Integer.valueOf(model.getValueAt(dong, 4).toString());
                      thongke.TONGSLCHOI=Integer.valueOf(model.getValueAt(dong, 5).toString());
                      thongke.TGIAN1=model.getValueAt(dong, 6).toString();
                      thongke.TGIAN2=model.getValueAt(dong, 7).toString();
                      if(conn.addThongKe(thongke)<=0) JOptionPane.showMessageDialog(null,"Ko thể ghi dòng "+dong+1);
             }
    }
    public void addTitle()
    {
        Vector header = new Vector();
            header.add("THOIDIEM");
            header.add("MATK");
            header.add("MAGAME");
            header.add("TONGDIEM");
            header.add("TONGTG");
            header.add("TONGSL");
            header.add("TGIAN1");
            header.add("TGIAN2");
            model = new DefaultTableModel(header,0);
    }
    public DefaultTableModel XemAllTK()
    {
        rs=conn.XemTK();
        addTitle();
         try
            {
                while(rs.next())
                {
                Vector v=new Vector();
                v.addElement(rs.getString(1));
                v.addElement(rs.getString(2));
                v.addElement(rs.getString(3));
                v.addElement(rs.getInt(4));
                v.addElement(rs.getInt(5));
                v.addElement(rs.getInt(6));
                v.addElement(rs.getString(7));
                v.addElement(rs.getString(8));
                model.addRow(v);
                }
            }
            catch(SQLException ex)
            {
             JOptionPane.showMessageDialog(null, "Không có dữ liệu hoặc dữ liệu sai");
            }
            return model;
    }
}
