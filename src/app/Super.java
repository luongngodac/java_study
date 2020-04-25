package app;

// public class Super extends Vehicle{
public class Super extends Person{
    /*
    Từ khóa super trong Java l
    từ khóa super trong java là một biến tham chiếu mà được sử dụng để tham 
    chiếu đến đối tượng lớp cha gần nhât. Bất cứ khi nào bạn tạo instance(sư thể hiện)
    của lớp con,  một instance của lớp cha được tạo ngầm định, được tham chiếu bởi biến super.
        Sự sử dụng của từ khóa super trong Java.
    super được sử dụng để tham chiếu biến instance của lớp cha gần nhất.
    super() được sử dụng để triệu hồi Constructor của lớp cha gần nhất.
    super được sử dụng để triệu hồi phương thức của lớp cha gần nhất.
    Phần tiếp theo, chúng ta sẽ tìm hiểu chi tiết từng sự sử dụng của từ 
    khóa super trong Java.
supper được để tham chiếu biến instance của lớp cha gần nhất
    Vấn đề xảy ra nếu không có từ khóa supper:
    // class Vehicle{
    //     int speed = 50;
    // }
    // class Bike extends Vehicle{
    //     int speed = 100;
    //     void display(){
    //         System.out.println(speed); // see in speed cua Bike.
    //     }
    //     public static void main(String args[])
    //     {
    //         Bike3 b = new Bike3();
    //         b.display();
    //     }
    // }
    Trong ví dụ trên, cả hai lớp Vehicle và Bike có cùng thuộc tính speed chung.
    Biến instatnce củ lớp hiện tại được tham chieeusbowir instance theo mặc định,
    nhưng mình phải tham chiếu tới biến instance của lớp cha, và đó là tại sao
    chúng ta sử dụng từ khóa super để phân biệt giữa biến instance của lớp cha
    và biến instance của lớp hiện tại.
        Xử lý vấn đề với từ khóa super trong Java:
    Trong ví dụ dưới đây, cả hai lớp Vehicle và Bike có cùng thuộc tính speed chung.
    Biến instance của lớp hiện tại được tham chiếu bởi instance theo mắc định,
    nhưng mình phải tham chiếu tới biến instance của lớp cha, và đó là tại sao chúng ta 
    sử dụng từ khóa super để phân biệt giữa biến instance của lớp cha
    và biến instance của lớp hiện tại.
    vietJack.com
    */
    // int speed = 100;
    // void display()
    // {
    //     System.out.println(super.speed); // bay gio se in speed cuar Behicle
    // }
    // public static void main(String args[])
    // {
    //     Super b = new Super();
    //     b.display();
    // }
        //xư lý từ khóa supper trong Java.
    // int speed = 100;
    // void display()
    // {
    //     System.out.println(super.speed);//bay gio se in speed cuar Behicle.
    // }
    // public static void main(String args[])
    // {
    //     Super b = new Super();
    //     b.display();
    // }

    /**
    super() được sử dụng để triệu hồi constructor của lớp cha gần nhất.
     */
    // Super()
    // {
    //     super();//se trieu hoi constructor cua lop cha.
    //     System.out.println("Bike duoc tao.");
    // }
    // public static void main(String args[])
    // {
    //     Super b = new Super();
    // }
    //goi lop Class vehicle o duoi
    /*
    Ghi chú: super() được tự động thêm vào trong mỗi Constructor của lớp bởi Compiler.
    Qua các chương trước, chúng ta đã biết rằng constructor mặc định được cung 
    cấp bởi compiler nhưng nó cũng thêm super() cho lệnh đầu tiên. Nếu bạn đang tạo
    constructor cho riêng mình và bạn không có this() hoặc super() như là lệnh
    đầu tiên, thì Compiler sẽ cung cấp bởi super() như là lệnh đầu tiên của Constructor đó.
    Một ví dụ khác về từ khóa super, trong ví dụ này super() được cung cấp ngầm
    định bởi Compiler.
    //goi lop Class vehicle o duoi
    */
    // int speed;
    // Super(int speed)
    // {
    //     this.speed = speed;
    //     System.out.println(speed);
    // }
    // public static void main(String args[])
    // {
    //     Super b = new Super(10);
    // }
/*
super được sử dụng để triệu hồi phương thức của lớp cha gần nhất.
    Từ khóa super cũng có thể được sử dụng để triệu hồi phương thức 
    lớp cha gần nhât. Nó nên được sử dụng trong lớp con mà có chứa cùng 
    phương thức như lớp cha, như trong ví dụ sau:
    //gọi lớp Person ở dưới.

*/
    // void message()
    // {
    //     System.out.println("Chao mung ban den voi Java");
    // }
    // void display()
    // {
    //     message(); // se trieu hoi phuong thuc message() cuar lop hien tai.
    //     super.message(); //se trieu hoi phuong thuc cua lop cha.
        
    // }
    // public static void main(String args[])
    //     {
    //         Super s = new Super();
    //         s.display();
    //     }
    /*
    Trong ví dụ trên, cả hai lớp Super và Person cùng có phương thức mesage(),
    nếu chúng ta gọi phương thức mesage() từ lớp Super, nó sẽ gọi
    phương thức mesage() của lớp Super chứ không phải của lớp Person bởi
    vì ưu tiên cục bộ.
    Trong tính huống mà không có phương thức nào của lớp con giống lớp cha thì không 
    cần sử dụng từ khóa super. Trong ví dụ dưới đây, phương thức mesage()
    sẽ được triệu hồi từ lớp Super, nhưng lớp Super không có message() này,
    vì thế bạn có thể trực tiếp gọi phương thức message().
    ví dụ chương trình không cần từ khóa super:
    */
    void display()
    {
        message(); // se trieu hoi phuong thuc message() cua lop cha.
    }
    public static void main(String args[])
    {
        Super si = new Super();
        si.display();
    }

}


//tham chieu den bien instance cua lop cha gan nhat.
// class Vehicle
// {
//     int speed = 50;
// }
// vi du 2  va 3
// class Vehicle
// {
//     Vehicle() 
//     {
//         System.out.println("Vehicle duoc tao.");
//     }
// }
//
class Person
{
    void message()
    {
        System.out.println("Chao mung.");
    }

}