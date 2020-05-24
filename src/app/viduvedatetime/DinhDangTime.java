package app.viduvedatetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DinhDangTime 
{
    /*
    Định dạng Time trong Java
    Miêu tả vấn đề
    Cách định dạng time trong định dạng AM-PM trong Java?
    Giải pháp: ví dụ sau minh họa cách định dạng time bởi sử dụng SimpleDateFormat("HH-mm-ss a")
    constructor và phương thức sdf.format(date) của lớp SimpleDateFormat trong Java.
    vietJack.com
    */    

    public static void main(String[] args) 
    {   
        Date date = new Date();
        String strDateFormat = "HH: mm: ss a";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println(sdf.format(date));
    }
    // Kết quả phụ thuộc vào System time hiện tại  của bạn.
}