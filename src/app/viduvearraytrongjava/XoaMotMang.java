package app.viduvearraytrongjava;

import java.util.ArrayList;

public class XoaMotMang 
{
    /*
    Xóa một mảng Từ Mảng(Array) khác trong Java
    Miêu tả vấn đề: Xóa một mảng từ Mảng(Array) khác trong Java?
    vietJack.com
    */
    public static void main(String[] args) 
    {
        ArrayList oArrayList = new ArrayList();
        ArrayList oArrayList2 = new ArrayList();
        oArrayList2.add(0, "common1");
        oArrayList2.add(1, "common2");
        oArrayList2.add(2, "not common");
        oArrayList2.add(3, "notcommon1");
        oArrayList.add(0, "common1");
        oArrayList.add(1, "common2");
        oArrayList.add(2, "notcommon2");
        System.out.println("Array elements of array1: " + oArrayList);
        System.out.println("Array elements of array2: " + oArrayList2);
        oArrayList.removeAll(oArrayList2);
        System.out.println("Array1 after removing array2 from array 1" + oArrayList);
    }
}