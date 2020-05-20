package app.viduvearraytrongjava;

public class KeThuaMang 
{
    /*
    Kế thừa một Mảng(Array) trong Java
    Giải pháp: Ví dụ sau minh họa cách kế thừa một Mảng(Array) sau khi khởi tạo 
    bằng việc tạo một Mảng(Array) mới trong Java.
    vietJack.com
    */
    public static void main(String[] args) 
    {
        String[] names = new String[] {"Vodenta", "October", "Data", "Email" };
        String[] extended = new String[6];
        extended[4] = "Toggle";
        extended[5] = "Abstract";
        System.arraycopy(names, 0, extended, 0, names.length);
        for (String str : extended)
        {
            System.out.println(str);
        }
    }
}