/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan.BUS;
import doan.DATA.*;
import doan.FORM.*;
import doan.*;
import javax.swing.JOptionPane;
public class XulyDangky {
    TaiKhoanBus accbus=new TaiKhoanBus();
    NguoiDungBus ngdungbus=new NguoiDungBus();
    public boolean KTDKTK(String s)
    {
        if(accbus.KtTontai("TENTK",s)) return false;
        else return true;
    }
     public boolean KTDKNGD(String s)
    {
        if(ngdungbus.KtTontai("BIDANH",s)) return false;
        else return true;
    }
     
     public void Tao(TaiKhoanDTO acc,NguoiDungDTO ngdung,boolean phai)
     {
         if(!NgayGio.KTDinhDangNgay(ngdung.NGAYSINH)) JOptionPane.showMessageDialog(null,"Định dạng ngày sai");
         else
         {      
             acc.NGDK=NgayGio.Ngayhientai();
             accbus.ThemTK(acc);
             ngdung.MATK=acc.MATK;
             if(phai) ngdung.PHAI="NAM";else ngdung.PHAI="NU";
             ngdungbus.Them(ngdung);
         }
     }
      public static void main(String args[])
      {
          XulyDangky dk=new XulyDangky();
         System.out.println(NgayGio.NgayThangNamSangNamThangNgay(NgayGio.Ngayhientai()));
      }
}
