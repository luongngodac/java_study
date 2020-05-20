package app.viduvearraytrongjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NhapHaiMang 
{
    /*
    Nhập hai Mảng(Array) trong Java
    Miêu tả vấn đề: Cách sát nhập các Mảng(Array) trong Java?
    Giải pháp: Ví dụ sau minh họa cách nhập hai Mảng (Array) thành một Mảng
    (Array) đơn bởi sử dụng phương thức ist.Addall(array1.asList(array2)) của lớp 
    List và phương thức Arrays.toString() của lớp Array trong Java.
    vietJack.com
    */
    public static void main(String[] args) 
    {
        String a[] = {"L", "U", "O"};
        String b[] = {"N", "G"};
        List list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();
        System.out.println(Arrays.toString(c));
    }
}