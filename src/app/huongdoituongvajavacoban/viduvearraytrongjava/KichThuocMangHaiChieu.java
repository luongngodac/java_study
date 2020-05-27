package app.huongdoituongvajavacoban.viduvearraytrongjava;
public class KichThuocMangHaiChieu 
{
    /*
    Kích thước Mảng hai chiều trong Java
    Miêu tả vấn đề: Cách xác định giới hạn trên(kích thước) của Mảng (Array) hai chiều trong Java?
    Giải pháp: Ví dụ sau minh họa cách xác định giới hạn trên của Mảng (Array) hai chiều 
    bởi sử dụng phương thước arrayname.length trong Java.
    vietJack.com 
    */
    public static void main(String args[])
    {
        String [][] data = new String [2][5];
        System.out.println("Dimension 1: " + data.length);
        System.out.println("Dimension 2: " + data[0].length);
    }
    
}