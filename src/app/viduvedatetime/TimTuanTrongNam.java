package app.viduvedatetime;

import java.util.Calendar;
import java.util.Date;

public class TimTuanTrongNam 
{
    /*
    Tìm tuần trong năm trong Java
    vietJack.com
    */
    public static void main(String[] args) throws Exception
    {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println("today is " + calendar.WEEK_OF_YEAR + " week of the year");
        System.out.println("today is a " + calendar.DAY_OF_MONTH + " month of the year");
        System.out.println("today is a " + calendar.WEEK_OF_YEAR + " week of the month");
    }
    
}