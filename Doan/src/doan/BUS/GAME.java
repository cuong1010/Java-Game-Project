/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan.BUS;


import static doan.BUS.KhoBauBus.MAGAME;
import doan.DATA.*;
import doan.GameDTO;
import doan.LichSuChoiDTO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
public abstract class GAME {
    int dong,cot,ruong,diem;int [][]a;
    String Ngaybatdau;
    String Giobatdau;
    long thoigianchoi;
    LogDaTa conn=new LogDaTa();
    String MATK;
    public boolean end=false;
    public GAME(int m,int n,int diem)
    {
        dong=m;
        cot=n;
        this.diem=diem;
        a=new int[m][n];
        Ngaybatdau=NgayGio.Ngayhientai();
        Giobatdau=NgayGio.Giohientai();
        
    }
    protected Icon loadIcon(String linkImage, int k, int m) {
        /*linkImage là tên icon, k kích thước chiều rộng mình muốn,m chiều dài và hàm này trả về giá trị là 1 icon.*/
   try {
            BufferedImage image = ImageIO.read(getClass().getResource(linkImage));
           ImageIcon icon= new ImageIcon(image.getScaledInstance(k,m,image.SCALE_SMOOTH));
          return icon;
        } catch (IOException ex) {
           ex.printStackTrace();
        }
    return null;
    }
    protected static GameDTO TTGame(String MAGAME)
    {
        GameDATA conn=new GameDATA();
        GameDTO game=new GameDTO();
        ResultSet rs;
        rs=conn.Xem(MAGAME);
        try{
        game.MAGAME=rs.getString(1);
        game.TENGAME=rs.getString(2);
        game.HUONGDAN=rs.getString(3);
        game.NOIDUNG=rs.getString(4);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"GAME ko co thong tin");
        }
        return game;
    }
    protected void savelichsuchoi(String MAGAME) {
        LichSuChoiDTO lichsu=new LichSuChoiDTO();
        lichsu.STT=conn.STT();
        lichsu.MATK=MATK;
        lichsu.MAGAME=MAGAME;
        lichsu.DIEM=diem;
        lichsu.NGAYCHOI=NgayGio.NgayThangNamSangNamThangNgay(Ngaybatdau);
        lichsu.TGBATDAU=Giobatdau;
        lichsu.TGCHOI=thoigianchoi;
        if(conn.ghiLog(lichsu)<=0) JOptionPane.showMessageDialog(null,"Xảy ra lỗi k thể luu lịch sử chơi");
    }
    protected void CapnhatDiemCao(String MATK,String MAGAME,int diem)
    {
        if(diem>conn.DiemCao(MATK, MAGAME))
        {
            if(conn.SuaDiemCao(MATK, MAGAME, diem)<=0)
                if(conn.ThemDiemCao(MATK, MAGAME, diem)<=0)
                    JOptionPane.showMessageDialog(null,"Xảy ra lỗi k thể cập nhật điểm cao");
        }
    }
    abstract void chuottrai(int i,int j);
    
    
}
