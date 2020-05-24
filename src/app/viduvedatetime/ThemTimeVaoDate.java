package app.viduvedatetime;

import java.util.*;
import java.util.Calendar;

public class ThemTimeVaoDate 
{
    /*
    Thêm time tới Date trong Java
    Miêu tả vấn đề
    Cách thêm time(ngày, năm, giây) tới Date trong Java?
    Giải pháp
    Ví dụ sau minh họa cách thêm time tới một date bởi sử dụng phương thức 
    add() của Calendar trong Java.
    vietJack.com
    */

    public static void main(String[] args) throws Exception
    {
        Date d1 = new Date();
        Calendar c1 = Calendar.getInstance();
        c1.setTime(d1);
        System.out.println("today is " + d1.toString());
        c1.add(Calendar.MONTH, 1);
        System.out.println("date after a moth will be " + c1.getTime().toString());
        c1.add(Calendar.HOUR, 7);
        System.out.println("date after a 7 hours will be " + c1.getTime().toString());
        c1.add(Calendar.YEAR, 3);
        System.out.println("date after 3 years will be " + c1.getTime().toString());

    }

}