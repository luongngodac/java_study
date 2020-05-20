package app.viduvearraytrongjava;

public class GhiMang 
{
    /*
    Ghi một Mảng(Array) tới output console (bảng điều khiển) trong Java
    Miêu tả vấn đề: Cách ghi một Mảng(Array) các chuỗi tới output console trong Java.
    Giải pháp: Ví dụ sau minh họa cách ghi các phần tử của một Mảng(Array) tới output console 
    thông qua vòng lặp trong Java    
    vietJack.com
    */
    public static void main(String[] args) 
    {
        String[] greeting = new String[3];// tuong ung voi so phan tu cua mang can ghi.
        greeting[0] = "This is the greeting";
        greeting[1] = "for all the readers from";
        greeting[2] = "Java Source.";
        for (int i = 0; i < greeting.length; i++)
        {
            System.out.print(greeting[i] + " ");
        }
    }

}