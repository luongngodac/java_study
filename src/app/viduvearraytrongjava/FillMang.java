package app.viduvearraytrongjava;

import java.util.Arrays;

public class FillMang 
{
    /*
    Fill Mảng(Array) trong Java
    Miêu tả vấn đề: Cách fill(khởi tạo ngay lập tức) một Mảng(Array) trong Java?
    Giải pháp: Ví dụ sau minh họa cách fill (khởi tạo tất cả phần tử  của Mảng (Array) ngay lập tức)
    một Mảng(Array) bởi sử dụng Array.fill(arayname, value) và 
    Array.fill(arrayname, staring index, ending index, value) của lớp Java Util  trong Java.
    vietJack.com
    */
    public static void main(String[] args) 
    {
        int array[] = new int[6];
        Arrays.fill(array, 100);
        for (int i = 0, n = array.length; i < n; i++)
        {
            System.out.println(array[i]);
        }
        System.out.println();
        Arrays.fill(array, 3, 5, 50);// 3: vi tri phan tu bat dau; 5: vi tri ket thuc.
        for (int i = 0, n = array.length; i < n; i++)
        {
            System.out.println(array[i]);
        }
    }
}