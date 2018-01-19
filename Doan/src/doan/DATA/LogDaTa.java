/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan.DATA;

import doan.LichSuChoiDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class LogDaTa extends SQLConnect
{
    String table,tablediemcao;
    public LogDaTa()
    {
        super();
        table="lichsuchoi";
        tablediemcao="diemcao";
    }
     public LogDaTa(String h, String u, String p, String data,String table,String tablediemcao) {
        super(h, u, p, data);
        this.table=table;
        this.tablediemcao=tablediemcao;
    }
    public int STT()
    {
        String qry="Select MAX(STT) from "+table;
        this.executeQuery(qry);
        try {
            rs.next();
            return rs.getInt(1)+1;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ko có dữ liệu");
        }
        return 0;
    }
    public int ghiLog(LichSuChoiDTO lsc)
    {   
        int i=0;
        String qry="Insert into "+table+" values(";
        qry+="'"+lsc.STT+"',"+"'"+lsc.MATK+"',"+"'"+lsc.MAGAME+"',"+"'"+lsc.DIEM+"',";
        qry+="'"+lsc.NGAYCHOI+"',"+"'"+lsc.TGBATDAU+"',"+"'"+lsc.TGCHOI+"')";
        //System.out.println(qry);
        i=this.executeUpdate(qry);
        return i;
    }
    public int ThemDiemCao(String MATK,String MAGAME,int diem)
    {
        int i=0;
        String qry="Insert into " +tablediemcao+" value(";
        qry+="'"+MATK+"',"+"'"+MAGAME+"',"+"'"+diem+"')";
        i=this.executeUpdate(qry);
        return i;
    }
    public int DiemCao(String MATK,String MAGAME)
    {   
        int i;
        String qry="Select * from "+tablediemcao+" where MATK='"+MATK+"' and MAGAME='"+MAGAME+"'";
        this.executeQuery(qry);
        try {
            rs.next();
            i=rs.getInt("DIEMCAO");
        } catch (SQLException ex) {
            i=Integer.MIN_VALUE;
        }
        return i;
    }
    public int SuaDiemCao(String MATK,String MAGAME,int diem)
    {
         int i=0;
        String qry="Update " +tablediemcao+" set DIEMCAO=";
        qry+="'"+diem+"' where "+"MATK="+"'"+MATK+"' and "+"MAGAME="+"'"+MAGAME+"'";
        i=this.executeUpdate(qry);
        //System.out.println(qry);
        return i;
    }
    public ResultSet XemlschoicuaUser(String MATK)
    {
        String qry="Select TENGAME,DIEM,NGAYCHOI,TGBATDAU,TGCHOI from "+table+",game ";
        qry+="where game.MAGAME="+table+".MAGAME and MATK='"+MATK+"'";
        //System.out.println(qry);
        rs=this.executeQuery(qry);
        return rs;
    }
   
}
