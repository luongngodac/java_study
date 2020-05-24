package app.viduvedatetime;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;

public class HienThiCacThangTrongDinhDangVietTat 
{
    /*
    Hiển thị tháng trong định dạng viết tắt trong java.
    Miêu tả vấn đề: Cách hiển thị tháng trong định dạng viết tắt trong Java?
    Giải pháp: ví dụ sau minh họa cách hiển thị tháng trong định dạng viết tắt bởi sử dụng
    phương thức DateFormatSymobls().getShortMonths() của lớp DateFormatSymbols trong Java.
    
    vietJack.com
    */    

    public static void main(String[] args) 
    {
        String[] shortMonths = new DateFormatSymbols()
        .getShortMonths();
        for (int i = 0; i < (shortMonths.length - 1); i++)
        {
            String shortString = shortMonths[i];
            System.out.println("shortMonth = " + shortString);
        }
    }
}