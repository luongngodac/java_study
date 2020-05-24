package app.viduvedatetime;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DinhDangQuocGia 
{
    /*
        Hiển thị time trong định dạng quốc gia khác nhau trong Java?
        Giải pháp: Ví dụ sau minh họa cách sử dụng lớp Local và DateFormat trong Java 
        để hiển thị date trong định dạng của các quốc gia khác nhau.
        vitJack.com
    */
    public static void main(String[] args) throws Exception
    {
        Date d1 = new Date();
        System.out.println("today is " + d1.toString());
        Locale localeItatilan = new Locale("it", "ch");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, localeItatilan);
        System.out.println("today is in Italian Language in Switzerland Format: " + dateFormat.format(d1));

    }
        
    
}