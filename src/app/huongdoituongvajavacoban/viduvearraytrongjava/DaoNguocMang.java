package app.huongdoituongvajavacoban.viduvearraytrongjava;

import java.util.ArrayList;
import java.util.Collections;

public class DaoNguocMang 
{
    /*
    Đảo ngược một Mảng (Array) trong Java
    Miêu tả vấn đề: Cách đảo ngược một Mảng (Array) trong Java?
    Giải pháp:
    Ví dụ sau minh họa cách đảo ngược một danh sách Mảng(Array) bởi sử dụng phương thức
    Collections.reverse(ArrayList) trong Java.      
    vietJack.com
    */
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("L");
        arrayList.add("U");
        arrayList.add("O");
        arrayList.add("N");
        arrayList.add("G");
        System.out.println("Before Reverse Order: " + arrayList);
        Collections.reverse(arrayList); //
        System.out.println("After Reverse Order: " + arrayList);
    }

}