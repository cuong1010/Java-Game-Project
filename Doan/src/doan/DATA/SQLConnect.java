/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan.DATA;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PC1
 */
public class SQLConnect {
    String host,username,pass,database;
    Connection connect=null;
    Statement state=null;
    ResultSet rs=null;
    boolean flag=false;
    public SQLConnect()
    {
        host="localhost";
        username="root";
        pass=null;
        database="test";
    }
    public SQLConnect(String h,String u,String p,String data)
    {
        host=h;username=u;pass=p;database=data;
    }
    
    protected boolean driverTest() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return true;
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Ko có Driver");
        }
        return false;
    }
    
    protected Connection getConnect() {
        if(connect == null)
        {
            if(driverTest())
            {
               String url = "jdbc:mysql://" + host + ":3306/" + database+"?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true";
                try {
                    connect = DriverManager.getConnection(url, username, pass);
                    flag=true;
                } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(null, "Không kết nối được database hoặc database không tồn tại");
                }
            }
        }
        else 
        {   
            try {
                this.Close();flag=false;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"Kết nối bị lỗi ko thể đóng kết nối");
            }
            return null;
        }
        return connect;
    }
    
    protected Statement getStatement() {
        try {
            if(this.state == null ? true :this.state.isClosed()){
                connect=this.getConnect();
            if(flag==true) state = connect.createStatement();
            }
        } catch (SQLException ex) {
            Logger.getLogger(SQLConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return state;
    }
    
    public ResultSet executeQuery(String Query)
    {
        try{
            state=this.getStatement();
            if(flag==true)rs =state.executeQuery(Query);

        }catch(Exception e){
           
           JOptionPane.showMessageDialog(null, "CSDL sai hoặc câu truy vấn bị lỗi");
           
       }
        return rs;
    }
    
    public int executeUpdate(String Query)
    {
        int res = Integer.MIN_VALUE;
        try{ 
            state=this.getStatement();
            if(flag==true)res =state.executeUpdate(Query);
        }catch(Exception e){
             return 0;
        }finally{
            try {
                this.Close();
            } catch (Exception ex) {
               JOptionPane.showMessageDialog(null, "Kết nối bị lỗi ko thể đóng kết nối");
            }
        }
        return res;
    }

    
    public void Close() throws Exception{
        if(rs != null){
            rs.close();
            rs = null;
        }
        if(state != null)
        {
            state.close();
            state = null;
        }
        if(this.connect != null)
        {
            this.connect.close();
            this.connect = null;
        }    
    }
   
     
}


