
package doan.DATA;

import doan.ThongKeDTO;
import java.sql.ResultSet;


public class ThongKeDATA extends SQLConnect {
    String table;
    String tablelog="lichsuchoi";
    public ThongKeDATA()
    {
        super();
        table="thongke";
    }
    
    public ThongKeDATA(String h, String u, String p, String data,String table) {
        super(h, u, p, data);
        this.table=table;
    }
    public ResultSet TKtheoNgay(String MATK,String MAGAME,String thoigian1,String thoigian2)
    {
        String qry="Select Sum(DIEM),SUM(TGCHOI),COUNT(DIEM) ";
        qry+="from lichsuchoi where MATK='"+MATK+"' and MAGAME='"+MAGAME+"' and ";
        qry+="NGAYCHOI BETWEEN '"+thoigian1+"' AND '"+thoigian2+"'";
        System.out.println(qry);
        return this.executeQuery(qry);
        
    }
    public ResultSet TKtheoThang(String MATK,String MAGAME,String thoigian1,String thoigian2)
    {
        String qry="Select Sum(DIEM),SUM(TGCHOI),COUNT(DIEM) ";
        qry+="from lichsuchoi where MATK='"+MATK+"' and MAGAME='"+MAGAME+"' and ";
        qry+="NGAYCHOI BETWEEN '"+thoigian1+"-01' AND '"+thoigian2+"-31'";
        System.out.println(qry);
        return this.executeQuery(qry);
     }
    public ResultSet TKtheoNam(String MATK,String MAGAME,String nam1,String nam2)
    {
        String qry="Select Sum(DIEM),SUM(TGCHOI),COUNT(DIEM) ";
        qry+="from lichsuchoi where MATK='"+MATK+"' and MAGAME='"+MAGAME+"' and ";
        qry+="YEAR(NGAYCHOI) BETWEEN '"+nam1+"' AND '"+nam2+"'";
        System.out.println(qry);
        return this.executeQuery(qry);
    }
    public int addThongKe(ThongKeDTO thongke)
    {
        String qry="Insert into "+table+" values(";
        qry+="'"+thongke.THOIDIEM+"',"+"'"+thongke.MATK+"',"+"'"+thongke.MAGAME+"',";
        qry+="'"+thongke.TONGDIEM+"',"+"'"+thongke.TONGTGCHOI+"',"+"'"+thongke.TONGSLCHOI+"',"+"'"+thongke.TGIAN1+"',"+"'"+thongke.TGIAN2+"')";
        //System.out.print(qry);
        int i=this.executeUpdate(qry);
        return i;
    }
    public ResultSet XemTK()
    {
        rs=this.executeQuery("SELECT * FROM "+table);
        
    return rs;
    }
}
