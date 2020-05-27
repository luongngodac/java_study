package app.huongdoituongvajavacoban.viduvearraytrongjava;

import java.util.Arrays;

public class SoSanhMang 
{
    /*
    So sánh các Mảng(Array) trong Java
    Miêu tả vấn đề: Cách so sánh hai Mảng(Array) trong Java?
    Giải pháp: Ví dụ sau minh họa ách sử dụng phương thức equals() trong Java
    để kiểm tra hai Mảng(Aray) có bằng hay không. 
    vietJack.com
    */   
    public static void main(String[] args) 
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