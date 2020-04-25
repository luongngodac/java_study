package app;

import java.util.ArrayList;
import java.util.Vector;

public class TuKhoaInstanceOf {
    

    /**
     Từu khóa instanceOf trong Java.
     Miêu tả vấn đề: Cách hiển thị lớp Object bởi sử dụng từ khóa
     instanceOf trong Java?
     Giải pháp: Ví dụ sau minh họa cách sử dụng phương thức displayObjectClass()\
     trong Java để hiển thị lớp Object mà đã được truyền trong phương thức này.
     vietJack.com

     */
    public static void main(String args[])
    {
        Object testObject = new ArrayList();
        displayObjectClass(testObject);
    }
    public static void displayObjectClass(Object o)
    {
        if ( o instanceof Vector)
            System.out.println("Object was an instance of the class java.util.Vector");
        else if (o instanceof ArrayList)
                System.out.println("Object was an instance of the class java.until.:ArrayList.");
            else 
                System.out.println("Object was an instance of the " + o.getClass());
    }
}