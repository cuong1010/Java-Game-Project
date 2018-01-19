/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan.BUS;


import com.sun.xml.internal.fastinfoset.util.CharArray;
import java.awt.RenderingHints;
import java.text.*;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author PC
 */
public class NgayGio {
    static Calendar c=Calendar.getInstance();
     static int year;//=c.get(Calendar.YEAR);
     static int day ;//=c.get(Calendar.DAY_OF_MONTH);
     static int month; //= c.get(Calendar.MONTH)+1;
     static int hour;// = c.get(Calendar.HOUR_OF_DAY);
     static int minute;// = c.get(Calendar.MINUTE);
     static  int second;// = c.get(Calendar.SECOND);
     static String Day,Month;
     static void Chuanhoaday(int d,int m)
     {
         if(d<10) Day="0"+d;else Day=""+d;
         if(m<10) Month="0"+m;else Month=""+m;
     }
     static String Chuanhoaday(String s)
     {
         if(s.charAt(1)<'0'||s.charAt(1)>'9') s="0"+s;
        if(s.charAt(4)<'0'||s.charAt(4)>'9')
        {
            String temp=s.substring(0,3);temp+="0"+s.substring(3);
            s=temp;
        }
        //System.out.println(s);
        return s;
     }
     static void setDate()
     {
        year =c.get(Calendar.YEAR);
        day = c.get(Calendar.DAY_OF_MONTH);
        month = c.get(Calendar.MONTH)+1;
     }
     public static String getDay(String s)
     {
        return s.substring(0,2);
     }
     public static String getMonth(String s) 
     {
         
        return s.substring(3,5);
     }
     public static String getYear(String s) 
     {
       return  s.substring(6,10);
     }
    public static String Ngayhientai()
    {
        c=Calendar.getInstance();
        setDate();
        Chuanhoaday(day,month);
        return Day+"/"+Month+"/"+year;
       
    }
    public static String Giohientai()
    {
        c=Calendar.getInstance();
        hour = c.get(Calendar.HOUR_OF_DAY);
        minute = c.get(Calendar.MINUTE);
        second = c.get(Calendar.SECOND);
        return hour+":"+minute+":"+second;
    }
    public static String NamThangNgaySangNgayThangNam(Date d)//load tu csdl len
    {
        c.setTime(d);
        setDate();
        Chuanhoaday(day,month);
        return Day+"/"+Month+"/"+year;
    }
    public static String NgayThangNamSangNamThangNgay(String s) //dua xuong csdl
    {
        s=Chuanhoaday(s);
        return getYear(s)+"/"+getMonth(s)+"/"+getDay(s);
    }
    public static boolean KTDinhDangNgay(String s)
     {
         s=Chuanhoaday(s);
        day=Integer.valueOf(getDay(s));
         month=Integer.valueOf(getMonth(s));
         year=Integer.valueOf(getYear(s));
         if(year>Integer.valueOf(getYear(Ngayhientai()))) return false;
         if(month>=13) return false;
         else 
          if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) 
         {if(day<=31) return true;}
         else if(month!=2)
         {
         if(day<=30) return true;
         }
        else
        {
            if(year%4==0 && day<=29) return true; 
            else if(day<=28) return true;
        }
         return false;
     }
    public static long Thoigianchoitulucbatdau()
    {
       long i= System.currentTimeMillis()-c.getTimeInMillis();
       return TimeUnit.MILLISECONDS.toSeconds(i);
    }
    public static void main(String[] args) throws ParseException {
        String qry="Update " +"tablediemcao"+" set DIEMCAO=";
        qry+="'"+"diem"+"' where "+"MAGAME="+"'"+"MAGAME"+"',"+"DIEMCAO="+"'"+"diem"+"'";
        //i=this.executeUpdate(qry);
        System.out.println(qry);
    
  }
}
