package app.huongdoituongvajavacoban.viduvearraytrongjava;

import java.util.Arrays;

public class SapXepVaChen 
{
    /*
    Sắp xếp và chèn trong Mảng (Array) trong Java
    Miêu tả vấn đề: Cách sắp xếp một Mảng (Array) và chèn một phần tử vào Mảng (Aray) trong Java?
    Giải pháp:
    Ví dụ sau minh họa cách sử dụng phương thức sort() và phương thức insertElement()
    được định nghĩa bởi người dùng để sắp xếp một Mảng (Array) và chèn một phần tử vào Mảng (Array) trong Java.
    vietJack.com
    */
    public static void main(String args[]) throws Exception
    {
        int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        Arrays.sort(array);
        printArray("Sort array", array);
        int index = Arrays.binarySearch(array,  1);
        System.out.println("Didn't fine 1 @" + index);
        int newIndex = -index - 1;
        array = insertElement(array, 1, newIndex);
        printArray("With 1 added", array);
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

    private static int[] insertElement(int original[], int element, int index)
    {
        int length = original.length;
        int destination[] = new int[length + 1];
        System.arraycopy(original, 0, destination, 0, index);
        destination[index] = element;
        System.arraycopy(original, index, destination, index + 1,  length - index);
        return destination;
    }

}