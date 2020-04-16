package app;

public class Fibonacci
{

    /*
    Tính chuỗi Fibonacci trong Java
    Miêu tả vấn đề: cách sử dụng phương thức để tính chuỗi Fibonacci trong Java.
    Giải pháp: Ví dụ sau minh họa cách sử dụng phương thức để tính
    toán String Fibonacci tới n số trong Java.
    */
    public static long fibonacci(long number)
    {
        if ((number == 0) || (number == 1))
            return number;
        else
        {
            return fibonacci(number -1) + fibonacci(number - 2);

        }
    }
    public static void main(String args[])
    {
        for (int counter = 0; counter <= 10; counter++)
        {
            System.out.printf("Fibonacci of %d is: %d\n", counter, fibonacci(counter));
        }
           
    }





}