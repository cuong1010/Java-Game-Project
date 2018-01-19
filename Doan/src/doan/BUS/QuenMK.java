/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan.BUS;

import doan.DATA.TaiKhoanDATA;
import doan.TaiKhoanDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author PC1
 */
public class QuenMK {
    TaiKhoanDATA conn=new TaiKhoanDATA();
    TaiKhoanBus accbus=new TaiKhoanBus();
    public boolean KTTK(String s)
    {
       return accbus.KtTontai("TENTK", s);
    }
  public boolean SuaMK(TaiKhoanDTO acc)
    {
        if(accbus.KtTrung("MATKHAU2",acc.MK2,"TENTK",acc.TENTK))
            if(conn.Sua("MATKHAU",acc.MK,"TENTK",acc.TENTK)>0) 
            {
                JOptionPane.showMessageDialog(null,"Đổi mật khẩu thành công");
                return true;
            }
            else JOptionPane.showMessageDialog(null,"Xảy ra lỗi đổi mật khẩu thất bại");
        else JOptionPane.showMessageDialog(null,"Mật khẩu 2 ko đúng");
        return false;
    }
}
