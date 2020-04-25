package app;

// public class DaHinh extends Bike1
// {
//     /*
//         Đa hình trong Java. 
//         Tính đa hình trong Java là một khái niệm mà từ đó chúng ta có thể thực hiện
//         một hành động đơn theo nhiều cách khác nhau. Tính đa hình được suy ra từ 
//         hai từ Hy Lạp là Poly và Morphs. Poly nghĩa là nhiều và morphs có nghĩa là hình,dạng.
//         có hai kiểu đa hình trong Java: Đa hình tại compile time và đa hình tại
//         runtime. Chúng ta có thể thực hiện tính đa hình trong Java bởi nạp chồng phương thức 
//         và ghi đè phương thức.
//         Nếu bạn nạp chồng phương thức staic trong Java, thì đó là ví dụ về đa hình tại 
//         compile time. Ở chương này chúng ta sẽ tập trung vào đa hình tại runtime trong Java.
//         Điều quan trọng để biết là có cách nào truy cập một đối tượng qua các biến
//         tham chiếu. Một biến tham chiếu có thể chỉ là một kiểu. Khi được khai báo, kiểu của 
//         biến tham chiếu này không thể thay đổi.
//         Biến tham chiếu có thể dược gán cho những đối tượng khác được cung cấp mà 
//         không thực hiện khai báo final. Kiểu của biến tham chiếu sẽ xác định phương thức
//         mà có thể được triệu hồi trên đối tượng.
//         Một biến tham chiếu có thể được hướng đến bất kì đối tượng với kiểu khai báo
//         hoặc bất kì kiểu con nào của kiểu khai báo. Một biến tham chiếu có thể được khai báo như
//         là một class hoặc một interface.
//         Đa hình tại runtime trong Java.
//         Đa hình tại runtime là một tiến trình mà trong đó là một lời gọi tới phương thức
//         được ghi đè được xử lý tại runtime thay vì tại compile time. Trong tiến
//         trình này, một phương thức được ghi đè được gọi thông qua biến tham chiếu
//         của một lớp cha. Việc quyết định phương thức được gọi là dựa trên đối tượng
//         nào đang được tham chiếu bởi biến tham chiếu.
//         Trước khi tìm hiểu về đa hình tại runtime, chúng ta cùng tìm hiểu về Upcasting.
//         Upcasting là gì: Khi biến tham chiếu của lớp cha tham chiếu tới đối tượng của lớp con, thì đó là 
//         Upcasting. Ví dụ:
//         class A{}
//         class B extends A[]
//         A a  = new B(); // day la upcasting.
//         Ví dụ về đa hình tại runtime trong Java.
//         Trong ví dụ, chúng ta tạo hai lớp Bike1 và DaHinh. Lớp DaHinh kế thừa lớp Bike
//         và ghi đè phương thức run() của nó. Chúng ta gọi phương thức run bởi biến
//         tham chiếu của lớp cha. Khi ó tham chiếu tới đối tượng của lớp con và
//         phương thức lớp con ghi đè phương thức của lớp cha, phương thức lớp con 
//         được triệu hồi tại runtime.
//         Khi việc gọi phương thức được quyết định bởi JVM chứ không phải Compiler,
//         vì thế đó là đa hình tại runtime.
//         vietJack.com
//     */
//     void run()
//     {
//         System.out.println("Chay an toan voi 60 km/ h");
//     }
//     public static void main(String args[])
//     {
//         Bike1 b = new DaHinh();//day la upcasting.
//         b.run();
//     }

// }

// class Bike1
// {
//     void run()
//     {
//         System.out.println("dang chay");
//     }
// }

/*
    Ví dụ thực về đa hình tại runtime trong Java.
    Giả sử Bank là một lớp cung cấp phương thức đề lấy lãi suất. Nhưng lãi 
    suất lại khác nhau giữa từng ngân hàng. Ví dụ, các ngân hàng VCB, AGR và CTG có thể
    cung cấp các lãi suất lần lượt là 8%, 7% và 9%. (Ví dụ này cũng có trong chương 
    ghi đè phương thức nhưng không có Upcasting.)
*/
// class Bank1
// {
//     int getRateOfInterest()
//     {
//         return 0;
//     }
// }
// class VCB1 extends Bank1
// {
//     int getRateOfInterest()
//     {
//         return 8;
//     }
// }
// class AGR1 extends Bank1
// {
//     int getRateOfInterest()
//     {
//         return 7;
//     }
// }
// class CTG1 extends Bank1
// {
//     int getRateOfInterest()
//     {
//         return 9;
//     }
// }
// class DaHinh
// {
//     public static void main(String args[])
//     {
//         Bank1 b1 = new VCB1();
//         Bank1 b2 = new AGR1();
//         Bank1 b3 = new CTG1();
//         System.out.println("VCB1 lai suat la: " + b1.getRateOfInterest() + "%");
//         System.out.println("AGR1 lai suat la: " + b2.getRateOfInterest() + "%");
//         System.out.println("CTG1 lai suat la: " + b3.getRateOfInterest() + "%");
//     }

// }
/*
    Đa hình tại runtime trong Java với thành viên dữ liệu:
    Phương thức bị ghi đè không là thành viên dữ liệu, vì thế đa hình tại runtiem
    không thể có được bởi thành viên dữ liệu. Trong ví dụ sau đây, cả hai lớp có
    một thành vien dữ liệu là speedlimit, chúng ta truy cập thành viên dữ liệu bởi
    biến tham chiếu của lớp cha mà tham chiếu tới đối tượng lớp con. Khi chúng ta truy cập
    thành viên viên dữ liệu không bị ghi đè, thì nó sẽ luôn luôn truy cập thành viên dữ liệu của lớp cha.
    Qui tắc: Đa hình tại runtime không thể có được bởi thành viên dữ liệu.
*/
    // class Bike2{
    //     int speedlimit = 90;
    // }
    // public class DaHinh extends Bike2
    // {
    //     int speedlimit = 150;
    //     public static void main(String args[])
    //     {
    //         Bike2 obj = new DaHinh();
    //         System.out.println(obj.speedlimit);//90
    //     }
    // }
/* Đa hình tại runtime trong java với kế thừa nhiều tầng (Multilevel)
        Ví dụ sau:
*/
// class Animal
// {
//     void eat()
//     {
//         System.out.println("an");
//     }
// }
// class Dog extends Animal
// {
//     void eat()
//     {
//         System.out.println("an hoa qua");
//     }
// }
// class BabayDog extends Dog
// {
//     void eat()
//     {
//         System.out.println("uong sua");
//     }
//     public static void main(String args[])
//     {
//         Animal a1, a2, a3;
//         a1 = new Animal();
//         a2 = new Dog();
//         a3 = new BabayDog();

//         a1.eat();
//         a2.eat();
//         a3.eat();
//     }
// }
//va:
class Animal1
{
    void eat()
    {
        System.out.println("animal dang an ... ");
    }
}
class Dog1 extends Animal1
{
    void eat()
    {
        System.out.println("dog dang an...");
    }
}
class BabyDog1 extends Dog1
{
    public static void main(String args[])
    {
        Animal1 a4 = new BabyDog1();
        a4.eat();
    }
}
//Vì BabyDog1 không ghi đè phương thức eat(), do đó phương thức eat() 
//của lớp Dog1() được triệu hồi, tương thự nếu Dog không ghi đè tiếp phương thức eat()
//thì phương thức eat() của lớp Animal1 được triệu hồi.