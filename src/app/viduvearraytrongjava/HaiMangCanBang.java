package app.viduvearraytrongjava;

import java.util.Arrays;

public class HaiMangCanBang 
{
    /* 
    Kiểm tra tính bằng của hai Mảng(Array) trong Java
    Miêu tả vấn đề: Cách kiểm tra hai Mảng(Array) có bằng hay không trong Java?
    Giải pháp:
    Ví dụ sau minh họa cách sử dụng phương thức equals() của Array trong Java
    để kiểm tra hai Mảng (Array) có bằng hay không.
    vietJack.com
    */
    public static void main(String[] args) throws Exception
    {
        int[] ary = {1, 2, 3, 4, 5, 6};
        int[] ary1 = {1, 2, 3, 4, 5, 6};
        int[] ary2 = {1, 2, 3, 4};
        System.out.println("Is array 1 equal to array 2??" 
        + Arrays.equals(ary, ary1));
        System.out.println("Is array 1 equal to array 3??" 
        + Arrays.equals(ary, ary2));
    }
}