/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan.BUS;

import static doan.BUS.GAME.TTGame;
import static doan.BUS.KhoBauBus.MAGAME;
import doan.FORM.GameTimHinh;
import doan.GameDTO;
import doan.LichSuChoiDTO;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.StyleConstants;

public class TimHinhBus extends GAME{
    int caphinh;public boolean move=true;
    final static String MAGAME="GAME02";
    public int x1,y1,x2,y2;
    public TimHinhBus(int m,int n,String MATK)
    {   
        super(m, n,m*n+m/2*8);
        caphinh=(m*n)/2;
        taovitri();
        this.MATK=MATK;
    
    }
    public void taovitri()
    {
        int temp = caphinh;
        Random ran = new Random();
        for (int i = 0; i < dong; i++)
            for (int j = 0; j < cot; j++)
                a[i][j] = 0;
        while (temp > 0)
        {   
            int i = ran.nextInt(dong);
            int j = ran.nextInt(cot);
            if (a[i][j] == 0)//tuc la o chua dc gán hình
            {   
                int k=ran.nextInt(15)+1;//1-15
                a[i][j]=k;
                int u = ran.nextInt(dong);
                int v = ran.nextInt(cot);
                while(a[u][v]!=0)
                {
                    u = ran.nextInt(dong);
                    v = ran.nextInt(cot);
                }
                a[u][v]=k;
               
            }
            else continue;
            temp--;
        }         
    }
    public int getDiem()
    {
        return diem;
    }
    public int getSLCapHinh()
    {
        return caphinh;
    }
    private boolean kt(int x1, int y1,int x2,int y2)
        {
           if(a[x1][y1]==a[x2][y2]) 
           {
            String url="../ICON/hinh"+a[x1][y1]+".jpg";
            GameTimHinh.pn[x1][y1].removeAll();GameTimHinh.pn[x2][y2].removeAll();
            JLabel lb1=new JLabel(loadIcon(url,GameTimHinh.pn[x1][y1].getWidth(),GameTimHinh.pn[x1][y1].getHeight()));
            GameTimHinh.pn[x1][y1].add(lb1);
            JLabel lb2=new JLabel(loadIcon(url,GameTimHinh.pn[x2][y2].getWidth(),GameTimHinh.pn[x2][y2].getHeight()));
            GameTimHinh.pn[x2][y2].add(lb2);
            return true;
           }
           else return false;
        }
    public void chuottrai(int i,int j)
    {   
         String url="../ICON/hinh"+a[i][j]+".jpg";
         GameTimHinh.pn[i][j].setVisible(false);
         JLabel lb=new JLabel(loadIcon(url,GameTimHinh.pn[i][j].getWidth()-5,GameTimHinh.pn[i][j].getHeight()-5));
         GameTimHinh.pn[i][j].removeAll();
         GameTimHinh.pn[i][j].add(lb);GameTimHinh.pn[i][j].setBackground(Color.red);
         GameTimHinh.pn[i][j].setVisible(true);
        diem-=1; 
        if(diem%2!=0) 
        {   
            if(move==false){GameTimHinh.Anhinh(x1,y1);GameTimHinh.Anhinh(x2,y2);move=true;}
            x1=i;y1=j;
        }
        else if(diem%2==0)
        {   
            x2=i;
            y2=j;
            if(kt(x1, y1, x2, y2)) 
            {   
                diem+=4;caphinh--;
                
                if(caphinh==0) {JOptionPane.showMessageDialog(null,"Bạn đã thắng");end();}
            }
            else 
            {
                move=false;
            }
        }
        if(diem==0&&caphinh!=0) {JOptionPane.showMessageDialog(null,"Bạn đã thua");end();}
    }
    void xuat()
    {
       for (int i = 0; i < dong; i++)
       {     for (int j = 0; j < cot; j++)
                System.out.print(a[i][j]+" ");
                System.out.println();
       }
       System.out.println();
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
    public static void main(String[] args) {
     
  }

}
