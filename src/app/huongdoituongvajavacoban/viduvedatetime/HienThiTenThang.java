package app.huongdoituongvajavacoban.viduvedatetime;

import java.util.Calendar;
import java.util.Formatter;

public class HienThiTenThang 
{
    /*
    Hiển thị tên tháng trong Java
    Miêu tả vấn đề: Cách hiển thị tên tháng trong định dạng MMM trong Java?
    Giải pháp Ví dụ sau minh họa cách hiển thị tháng hiện tại trong định dạng MMM bởi sử dụng phương thức
    Calender.getInstance() của lớp Clender và phương thức fmt.format() của lớp Formatter trong Java.
    vietJack.com
    */

    public static void main(String[] args) 
    {
        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();
        fmt = new Formatter();
        fmt.format("%tB %tb %tm", cal, cal, cal);
        System.out.println(fmt);
    }

}