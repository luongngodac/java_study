package app.viduvedatetime;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeNgonNguKhac 
{
    /*Hiển thị time trong các ngôn ngữ khác nhau
    Giải pháp: Ví dụ sau minh họa cách sử dụng lớp Date Format trong Java để hiển thị thời gian trong 
    ngôn ngữ Italian.
    vietJack.com
    */

    public static void main(String[] args) throws Exception 
    {
        Date d1 = new Date();
        System.out.println("today is " + d1.toString());
        Locale localeItalian = new Locale("it");
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localeItalian);
        System.out.println("today is " + df.format(d1));
    }

}