package app.viduvedatetime;

import java.text.DateFormatSymbols;

public class TenCacNgayTrongTuan 
{
    /*
    Hiển thị tên ngày trong tuần trong Java.
    Miêu tả vấn đề: Cách hiển thị ngày trong tuần trong Java?
    Giải pháp: ví dụ sau minh họa cahs hiển thị ngày trong tuần trong định dạng viết tắt bởi sử dụng phương thức
    DateFormatSymbols().getWeekdays() của lớp DateFormatSymbols trong Java.
    vietJack.com
    */

    public static void main(String[] args) 
    {
        String[] weeksdays = new DateFormatSymbols().getWeekdays();
        for (int i = 1; i < (weeksdays.length ); i++)
        {
            String weekday = weeksdays[i];
            System.out.println("weekday = " + weekday);
        }
    }

}