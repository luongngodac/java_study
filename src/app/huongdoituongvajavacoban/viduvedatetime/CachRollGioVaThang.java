package app.huongdoituongvajavacoban.viduvedatetime;

import java.util.Calendar;
import java.util.Date;

public class CachRollGioVaThang 
{
    public static void main(String[] args) throws Exception
    {
        Date d1 = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d1);
        System.out.println("today is " + d1.toString());
        calendar.roll(Calendar.MONTH, 100);
        System.out.println("date after a month will be " + calendar.getTime().toString());
        calendar.roll(Calendar.HOUR, 7);
        System.out.println("date after 7 hours will be " + calendar.getTime().toString());
    }
    
}