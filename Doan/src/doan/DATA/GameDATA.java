/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan.DATA;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class GameDATA extends SQLConnect {
    String table;
    public GameDATA()
    {
        super();
        table="game";
    }
    public GameDATA(String h, String u, String p, String data,String table) {
        super(h, u, p, data);
        this.table=table;
    }
    public ResultSet Xem(String MAGAME)
    {
        String qry="Select * from "+table+" where ";
        qry+="MAGAME="+"'"+MAGAME+"'";
        //System.out.print(qry);
        rs=this.executeQuery(qry);
        try {
            rs.next();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ko co dữ liệu");
        }
        return rs;
    }
}
