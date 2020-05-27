package app.huongdoituongvajavacoban.viduvedatetime;

import java.text.DateFormat;
import java.util.Date;

public class HienThiDateDinhDangKhac 
{
    /*
    Hiển thị Date trong định dạng khác nhau trong Java.
    Giải pháp: sử dụng phương thức DateFormatSymbols().getWeekdays() của lớp
    DateFormatSymbols trong Java.
    */
    public static void main(String[] args) 
    {
        Date date = new Date(1000000000L);    
        
        DateFormat[] dateFormats = new DateFormat[6];
        dateFormats[0] = DateFormat.getInstance();
        dateFormats[1] = DateFormat.getDateInstance();
        dateFormats[2] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dateFormats[3] = DateFormat.getDateInstance(DateFormat.FULL);
        dateFormats[4] = DateFormat.getDateInstance(DateFormat.LONG);
        dateFormats[5] = DateFormat.getDateInstance(DateFormat.SHORT);

        for (DateFormat dFormat : dateFormats)
            System.out.println(dFormat.format(date));

    }
}