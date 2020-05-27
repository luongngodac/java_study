package app.huongdoituongvajavacoban;

public class ForForeach {
    /*
    Sử dụng vòng lặp for & foreach trong Java.
    Miêu tả vấn đề: Cách sử dụng vòng lặp for và foreach để thiển thị các phần tử trong một 
    mảng(Array) trong Java?
    Giải pháp: 
    Ví dụ sau minh họa cách hiển thị một Mảng (Array) integer bởi 
    sử dụng vòng lặp for và vòng lặp foreach trong java.

    */
    public static void main(String[] args)
    {
        int []intary = {1, 2, 3, 4};
        forDisplay(intary);
        foreachDisplay(intary);
    }
    public static void forDisplay(int[] a) 
    {
        System.out.println("Display an array using for loop");
        for ( int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " " );
        }
        System.out.println();
    }
    public static void foreachDisplay(int[] data)
    {
        System.out.println("Display an array using for each loop.");
        for (int a : data)//data la bien.
        {
            System.out.print(a + " ");
        }
    }

}