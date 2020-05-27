package app.huongdoituongvajavacoban.viduvearraytrongjava;

import java.util.Arrays;
import java.util.Collections;

public class TimKiemMang 
{
    /*
    Tìm kiếm min và max trong Mảng (Array) trong Java
    Miêu tả vấn đề: Cách tìm phần tử nhỏ nhất và lớn nhất trong một Mảng (Array) trong Java?
    Giải pháp: Ví dụ sau minh họa các tìm phần tử nhỏ nhất và lớn nhất trong một Mảng
    (Array) bởi sử dụng phương thức: Collection.max() và Collection.min() trong Java.       
    vietJack.com
    */
    public static void main(String[] args) {
        Integer[] numbers = {8, 2, 7, 1, 4, 9, 5};
        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));
        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);
    }
}