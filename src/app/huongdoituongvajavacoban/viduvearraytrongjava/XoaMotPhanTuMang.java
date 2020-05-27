package app.huongdoituongvajavacoban.viduvearraytrongjava;

import java.util.ArrayList;

public class XoaMotPhanTuMang 
{
    /*
    Xóa một phần tử trong Mảng(Array) trong Java
    Miêu tả vấn đề: Cách xóa một phần của Mẩng(Array) trong Java
    Giải pháp:
    Ví dụ sau minh họa cách xóa một phần tử từ Mảng (Array) trong Java.
    vietJack.com
    */
    public static void main(String[] args) 
    {
        ArrayList objArray = new ArrayList<>();
        objArray.clear();
        objArray.add(0, "0th element");
        objArray.add(1, "1st element");
        objArray.add(2, "2nd element");
        System.out.println("Array before reoving an element " + objArray);
        objArray.remove(1);
        objArray.remove("0 th element");
        System.out.println("Array after removing an element " + objArray);
    }
}