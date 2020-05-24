package app.viduvedatetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DinhDangGiay 
{
    /*
    Miêu tả vấn đê: Cách định dạng giây trong Java?
    Giải pháp: Ví dụ sau minh họa cách định dạng giây bởi sử dụng SimpleDateFormat('ss') constructor và
    phương thức sdf.format(date) của lớp SimpleDateFormat trong Java.
    vietJack.com
    */

    public static void main(String[] args) 
    {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("ss");
        System.out.println("seconds in ss format: " + sdf.format(date));    
    }

}