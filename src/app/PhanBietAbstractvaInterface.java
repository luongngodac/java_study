package app;

public class PhanBietAbstractvaInterface 
{
    /*
    Phân biệt lớp abstract và Interface trong java.
    Cả lớp abstract và Interface được sử dụng để thu được tính trừu tượng, từ đó
    chúng ta cóa thể khai báo các phương thức trừu trượng. Cả lớp trừu tượng và
    Interface không thể được khởi tạo, nhưng cũng có các điểm khác nhau giữa lớp
    trừu tượng và Interface như sau:
    Lớp trừu tượng:
     1. Lớp trừu tượng có thể có các phương thức abstract và non-abstract
     2. Lớp trừu tượng không hỗ trợ đa kế thừa
     3. Lớp trừu tượng có thể có các biến final, non-final, static và non-static.
     4. Lớp trừu tượng có thể có phương thức static, phương thức main và constructor 
     5. Từ khóa abstract được sử dụng để khai báo lớp trừu tượng.
     6. Lớp trừu tượng có thể cung cấp trình triển khai của Interface
     Ví dụ: public abstract class Shape{public abstract void draw();}
    Interface:
     1. Interface chỉ có thể có phương thức abstract
     2. Interface hỗ trợ đa kế thừa
     3. Interface chỉ có các biến static và final
     4. Interface không thể có phương thức static, main hoặc constructor 
     5. Từ khóa interface được sử dụng để khai báo interface.
     6. Interface không cung cấp trình triển khai cụ thể của lớp abstract.
     Ví dụ: public interface Drawable{void draw();}
    Về cơ bản, lớp trừu tượng đạt được trừu tượng hóa một phần
    (từ 0 đến 100%) trong khi đó Interface có thể đạt được trừu tượng hóa hoàn toàn(100%)
    Ví dụ về lớp trừu tượng và Interface trong Java.
    vietJack.com 
    
    */
    public static void main(String args[])
    {
        A2 a = new M2();
        a.a();
        a.b();
        a.c();
        a.d();
    }

}
//Tạo interface mà có 4 phương thức a,b,c,d
interface A2
{
    void a();
    void b();
    void c();
    void d();
}
//tao lop abstract ma cung cap trinh trien khai cua mot phuong thuc cua A interface
abstract class B2 implements A2
{
    public void c()
    {
        System.out.println("Toi la C");
    }
}
class M2 extends B2
{
    public void a()
    {
        System.out.println("Toi la a");
    }
    public void b()
    {
        System.out.println("Toi la b");
    }
    public void d()
    {
        System.out.println("Toi la d");
    }
}