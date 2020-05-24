package app.viduvedatetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DinhDangMMMM 
{
    /*
    Định dạng tháng trong Java
    Miêu tả vấn đề: Cahcs định dạng tháng trong Java?
    giải pháp: Ví dụ sau minh họa cách định dạng tháng bởi sử dụng 
    SimpleDateFormat('MMMM')constructor và phương thức sdf.format(date) của lớp
    SimpleDateFormat trong Java.
    vietJack.com
    */
    public static void main(String[] args) 
    {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM")  ;
        System.out.println("Current Month in MMM format: " + sdf.format(date));
    }

}