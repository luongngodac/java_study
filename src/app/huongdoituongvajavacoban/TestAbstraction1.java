package app.huongdoituongvajavacoban;

public class TestAbstraction1 {
    // Kế thừa lớp Abstract trong Java.
    /* Trong ví dụ này, Shape là lớp trừu tượng, trình triển khai của nó được cung cấp
    bởi lớp Rectangle và lớp Circle. Hai lớp này kế thừa lớp trừu tượng Shape.
    file: TestAbstraction1.java.
    */
    //trong tinh huong nay, trinh trien khai duoc cung cap boiai do, vi du: nguoi su dung
    //trong tinh huong nay, phuong thuc duoc goi boi lap trinh vien hoac nguoi dung.
    public  static void main(String args[])
    {
        Shape s = new Circle1();
        //trong tinh huong nay, doi tuong duoc cung cap thong qua phuong thuc,
        //chang han nhu getShape();
        s.draw();
    }
}


//lop truu tuong Shape.
abstract class Shape
{
    abstract void draw();
}
//trong tinh huong nay, trinh trien khai duoc cung cap boiai do, vi du: nguoi su dung
class Rectangle1 extends Shape
{
    void draw()
    {
        System.out.println("Ve hinh chu nhat.");
    }
}  
class Circle1 extends Shape
{
    void draw()
    {
        System.out.println("Ve hinh tron");
    }
}
//trong tinh huong nay, phuong thuc duoc goi boi lap trinh vien hoac nguoi dung.

