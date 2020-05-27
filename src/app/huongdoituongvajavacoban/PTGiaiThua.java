package app.huongdoituongvajavacoban;
public class PTGiaiThua {

    /*
    Tính giai thừa trong Java.
    Miêu tả vấn đề: cách sử dụng phương thức để tính giai thừa trong Java.
    giải pháp: 
    Ví dụ sau minh hạo cách sử dụng phương thức để tính giai thừa
    của 9 số trong Java.
    vietJack.com
    
    */
    public static void main(String args[])
    {
        for (int counter = 0; counter <= 10; counter ++)
        {
            System.out.printf("%d! = %d\n", counter, factorial(counter));
        }
    }
    public static long factorial (long number)
    {
        if (number <= 1)
        {
            return 1;
        }
        else
        {
            return number * factorial(number - 1);
        }
    }


}