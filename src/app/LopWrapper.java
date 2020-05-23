package app;

public class LopWrapper 
{
    /*
    Lớp Wrapper trong Java
    Lớp Wrapper trong Java cung cấp kỹ thuật để chuyển đổi gốc primitive thành đối tượng và từ đối tượng
    thành kiểu gốc. từ J2SE 5.0, đặc điểm autoboxing và unboxing sẽ tự động chuyển đổi
    primitive thành object(là outoboxing) và từ object tahnhf primive(là unboxing). Một trong 8 lớp
    của java.lang package là lớp Wrapper trong Java. Dưới đây liệt kê danh sách 8 lớp Wrapper:
    Kiểu gốc        Lớp Wrapper
    boolean     Boolean
    char        Character
    byte        Byte
    short       Short
    int         Integer
    long        Long
    float       Float
    double      Double


    */
    //Vi du chuyen doi tu kieu goc Primitive thanh Wrapper
    public static void main(String[] args) 
    {
        //chuyen doi int thanh Integer
        int a = 20; 
        Integer i = Integer.valueOf(a); //chuyen doi int thanh Integer.
        Integer j = a; // Day la auto boxing, bay gio compiler se viet la Integer.valueOf(a)
        
        System.out.println(a + " " + i + " " + j);
        //Chuyen doi Wrapper thanh kieu goc Primitive
        //Chuyen doi Integer thanh int
        Integer b = new Integer(3);
        int t = b.intValue();//chuyen doi Integer thanh int
        int k = b;  // day la unboxing, bay gio compiler se viet la a.intValue()

        System.out.println(b + " " + t + " " + k);
    }
}