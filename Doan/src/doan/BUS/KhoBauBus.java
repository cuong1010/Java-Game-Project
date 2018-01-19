/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan.BUS;

import doan.FORM.GameTimKhoBau;
import doan.GameDTO;
import doan.LichSuChoiDTO;
import java.awt.Dimension;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.StyleConstants;

public class KhoBauBus extends GAME{
    int ruong;
    final static String MAGAME="GAME01";
    public KhoBauBus(int m,int n,String MATK)
    {   
        super(m, n,(m+n-1+3)*100);
        ruong=(m*n)/3;
        taobando();
        this.MATK=MATK;
    }
    public void taobando()
    {
        int temp = ruong;
        Random ran = new Random();
        for (int i = 0; i < dong; i++)
            for (int j = 0; j < cot; j++)
                a[i][j] = 0;
        while (temp != 0)
        {
            int i = ran.nextInt(dong);
            int j = ran.nextInt(cot);
            if (a[i][j] != 1)//1 tuc la co kho bau
                {
                    if (i == 0 || j == 0||(i==dong-1 &&j==cot-1)) continue;
                    a[i][j] = 1; temp--;
                }
                else continue;
        }         
    }
    public int getDiem()
    {
        return diem;
    }
    public int getRuong()
    {
        return ruong;
    }
    private int kt(int i, int j)
        {
            if (a[i][j] == 1) return -1;
            else
            {
                int count = 0;
                if (i - 1 >= 0 && a[i - 1][ j] == 1) count++;//tren
                if (i - 1 >= 0 && j + 1 < cot && a[i - 1][ j + 1] == 1) count++;//cheo phai tren
                if (j + 1 < cot && a[i][ j + 1] == 1) count++;//phai
                if (i + 1 < dong && j + 1 < cot && a[i + 1][ j + 1] == 1) count++;//cheo phai duoi
                if (i + 1 < dong && a[i + 1][ j] == 1) count++;//duoi
                if (i + 1 < dong && j - 1 >= 0 && a[i + 1][ j - 1] == 1) count++;//cheo trai duoi
                if (j - 1 >= 0 && a[i][ j - 1] == 1) count++;//trai
                if (i - 1 >= 0 && j - 1 >= 0 && a[i - 1][ j - 1] == 1) count++;//cheo trai tren
                return count;
            }
        }
    public void chuottrai(int i,int j)
    {
        int u=kt(i,j);
         String url="../ICON/"+u+".jpg";
            GameTimKhoBau.b[i][j].setVisible(false);
            JLabel lb=new JLabel(loadIcon(url,GameTimKhoBau.pn[i][j].getWidth(),GameTimKhoBau.pn[i][j].getHeight()));
            GameTimKhoBau.pn[i][j].removeAll();
            GameTimKhoBau.pn[i][j].add(lb);
        if(u==-1) {JOptionPane.showMessageDialog(null,"Bạn đã thua");end();}
        else
        {  
            diem=diem-100;
            if(diem <0) {JOptionPane.showMessageDialog(null,"Bạn đã thua");end();}
        }
    }
    public void chuotphai(int i,int j)
    {
        int u=kt(i,j);
        String url="../ICON/"+u+".jpg";
            GameTimKhoBau.b[i][j].setVisible(false);
            JLabel lb=new JLabel(loadIcon(url,GameTimKhoBau.pn[i][j].getWidth(),GameTimKhoBau.pn[i][j].getHeight()));
            GameTimKhoBau.pn[i][j].removeAll();
            GameTimKhoBau.pn[i][j].add(lb);
        if(u!=-1) {JOptionPane.showMessageDialog(null,"Bạn đã thua");end();}
        else
        {   
            diem+=300;
            
            ruong--;if(ruong==0) 
            {
                JOptionPane.showMessageDialog(null,"Chúc mừng bạn đã tìm đủ số kho báu");
                end=true;
            }
        }
    }
    void xuat()
    {
       for (int i = 0; i < dong; i++)
       {     for (int j = 0; j < cot; j++)
                System.out.print(a[i][j]+" ");
                System.out.println();
       }
    }
    protected void end()
    {
       thoigianchoi=NgayGio.Thoigianchoitulucbatdau();
       end=true;
       savelichsuchoi(MAGAME);
       CapnhatDiemCao(MATK, MAGAME, diem);
    }
   public static GameDTO XemTTGame()
    {
        return TTGame(MAGAME);
    }
    public static void main(String[] args) 
    {
      
    }
}
