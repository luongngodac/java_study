package app.viduvearraytrongjava;

import java.util.Arrays;

public class SapXepVaTimKiem 
{
    /*
    Sắp xếp về tìm kiếm trong Mảng (Array) trong Java
    Miêu tả vấn đề
    Cách sắp xếp một Mảng (Array) và tìm kiếm một phần tử trong Mảng (Array) trong Java?
    Giải pháp: 
    Ví dụ sau minh họa cách sử dụng phương thức sort() và binarySearch()
    trong Java để thực hiện tác vụ trên. Phương thức printArray() đã được người sử dụng định nghĩa được sử dụng để hiển thị input
    
    vietJack.com
    */
    public static void main(String args[]) throws Exception
    {
        int array[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        Arrays.sort(array);
        printArray("Sorted array", array);
        int index = Arrays.binarySearch(array, 2);
        System.out.println("Found 2 @ " + index);
    }

    private static void printArray(String message, int array[])
    {
        System.out.println(message + ": [length: " + array.length + "]");
        for (int i = 0; i < array.length; i++)
        {
            if (i != 0)
            {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }
}