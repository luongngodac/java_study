package app.huongdoituongvajavacoban.viduvedatetime;

import java.util.Calendar;
import java.util.Formatter;

public class HienThiThoiGianHienTai 
{
    /*
    Hiển thị date và time trong Java
    Miêu tả vấn đề: Cách hiển thị date và time hiện tại trong Java?
    Giải pháp: Ví dụ sau minh họa cách hiển thị date và time hiện tại bởi sử dụng phương
    thức Calender.getInstance() của lớp Calendar và phương thức fmt.format() của lớp
    Formatter trong Java.
    vietJack.com     
    */   
    public static void main(String[] args) 
    {
        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();
        fmt = new Formatter();
        fmt.format("%tc", cal);
        System.out.println(fmt);
    }
}