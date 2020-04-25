package app;

// public class ToanTuInstanceof extends Animal2
public class ToanTuInstanceof
{
    /*
    Toán tử instanceof trong Java.
    Toán từ instanceof trong  Java được sử dụng để kiểm tra xem đối tượng có là
    instance của kiểu cụ thể: lớp hoặc lớp con hoặc interface hay không. Toán tử
    instanceof trong Java còn được biết đến như là toán tử so sánh kiểu bởi vì nó
    so sánh instance với kiểu. Nó trả về true hoặc false. Nếu chúng ta áp dụng 
    toán từ instanceof với bất cứ biến nào mà có giá trị null, thì nó trả vè false.
    Ví dụ đơn giản về taosn từ instanceof trong Java.
    Ví dụ sau kiểm tra xem đối tượng có phải là lớp hiện tại không.
    class Simple{
        public static void main(String args[])
        {
            Simple1 s = new Simple1();
            System.out.println(s instanceof Simple); // true.
        }
    }
    Một đối tượng của kiểu lớp con cũng là một kiểu của lớp cha. Ví dụ, nếu Dog kế thừa
    Animal thì đối tượng Dog có thể được tham chiếu bởi hoặc lớp Dog 
    hoặc lớp Animal.
    ví dụ khác về toán từ instatnceof trong Java.
    class Animal{}
    class Dog1 extends Animal
    {
        //Dog ke thua tu Animal.
        public static void main(String args[])
        {
            Dog1 d = new Dog1();
            System.out.println(d instanceof Animal); // true
        }
    }
    Ví dụ instanceof trong Java với biến mà có giá trị null.
    Nếu chúng ta áp dụng toán từ instanceof với bất cứ biến nòa mà có giá trị null,
    thì nó trả về flase. Trong ví dụ sau, chúng ta áp dụng toán tử instanceof với
    biến có giá trị null.
    class Dog2{
        public static void main(String args[])
        {
            Dog2 d = null;
            System.out.println(d instanceof Dog2);//false.
        }
    }
    Downcasting với toán tử instanceof trong Java.
    Khi kiểu lớp con tham chiếu tới đối tượng của lớp cha, thì đó là downcasting.
    Nếu chungsta thực hiện nó trực tiếp, Compiler sẽ cho một lỗi biên dịch. Nếu
    bạn thực hiện bởi typecasting(ép kiểu) thì ClasCastException được nén tại runtime.
    Dog d = (Dog) new Animal();
    //Bien dich thanh cong nhung ClassCastException bi nen tai runtime.
    Và có thể thực hiện downcasting với íntanceof
    Trong ví dụ sau, bạn sẽ thực hiện downcasting bới toán tử instanceof trong Java.
        vietJack.com
    */
    // static void method(Animal2 a)
    // {
    //     if(a instanceof ToanTuInstanceof)
    //     {
    //         ToanTuInstanceof d = (ToanTuInstanceof)a; // day la downcating.
    //         System.out.println("Bay gio downcasting duoc thuc hien.");
    //     }
    // }
    // public static void main (String [] args)
    // {
    //     Animal2 a = new ToanTuInstanceof();
    //     ToanTuInstanceof.method(a);
    // }
    //Downcating cũng có thể được thực hiện mà không sử dụng toán tử instanceof như sau:
    // static void method (Animal2 a)
    // {
    //     ToanTuInstanceof d = (ToanTuInstanceof)a; //Day la downcasting
    //     System.out.println("Downcasting duoc thuc hien.");
    // }
    // public static void main (String [] args)
    // {
    //     Animal2 a = new ToanTuInstanceof();
    //     ToanTuInstanceof.method(a);
    // }
    /*
     Nhìn lại ví dụ trên, đối tượng thực sự được tham chiếu bởi a là môt đối tượng
    của lớp Dog. Vì thế, neus chúng ta thực hiện downcasting, thì việc đó là ổn , 
    nhưng điểu gì xảy ra nếu húng ta viết: ==> ...
    Animal a = new Animal();
    Dog.method (a);
    //Bây giờ là ClassCastExepton nhưng không trong trường hợp của toán tử instanceof 
        Và có thể thực hiện downcasting với instanceof 


    Sự sử dụng thực sự của instanceof trong Java.
    Ví dụ:  
    */
    public static void main(String args[])
    {
        Printable p = new B();
        Call c = new Call();
        c.invoke(p);
    }
    
}
// class Animal2{}
interface Printable{}
class A1 implements Printable
{
    public void a()
    {
        System.out.println("Phuong thuc a");
    }
}
class B implements Printable
{
    public void b()
    {
        System.out.println("Phuong thuc b");
    }
}
class Call
{
    void invoke(Printable p)
    {
        //Day la upcasting
        if(p instanceof A1)
        {
            A1 a = (A1)p; //Day la downcasting
            a.a();
        }
        if(p instanceof B)
        {
            B b = (B)p; //Day la downcasting
            b.b();
        }
    }//Phan cuoi cua lop Call
}