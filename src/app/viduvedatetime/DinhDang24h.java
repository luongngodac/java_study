package app.viduvedatetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DinhDang24h 
{
    /*
    Miêu tả vấn đề:
    Cách định dạng time trong định dạng 24 h trong Java?
    Giải pháp: ví dụ sau minh họa cách định dạng time trong định dạng 24h( 00:00-24:00) bởi sử dụng phương thức
    sdf.format(date) của lớp SimpleDateFormat trong Java.
    */
    public static void main(String[] args) 
    {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("h");    
        System.out.println("Hour in h format: " + sdf.format(date));
    }
}