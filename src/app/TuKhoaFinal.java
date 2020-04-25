package app;



public class TuKhoaFinal extends Bike
{
    /*
    Từ khóa final trong Java.
    Từ khóa final trong Java được sử dụng để hạn chế người dùng. Từ khóa
    final có thể được sử dụng trong nhiều ngữ cảnh: với biến, với phương thức và với lớp.
    Từ khóa final  có thể được áp dụng với các biến, một biến final mà không có giá trị
    nào được gọi là biến final trống hoặc biến final không được khởi tạo. Nó chỉ có 
    thể được khởi tạo trong Constructor. Biến final trống cũng có thể là static mà
    sẽ chỉ được khởi tạo trong khối satic.
        Biến final trong Java.
    Nếu bạn tạo bất cứ biến nào là final, bạn sẽ không thay đổi giá trị của biến final
    (nó sẽ là hằng số).
    Ví dụ của biến final trong Java.
    Giả sử có một biến final có tên là speedlimit, chúng ta thay đổi giá trị của
    biến này, nhưng nó không thể bị tahy đổi bởi vì một khi biến final đã được
    gán giá trị thì không bao giờ bị thay đổi.
    */
    // final int speedlimit = 90; //bien final
    // void run()
    // {
    //     speedlimit = 400;
    // }
    // public static void main(String args[])
    // {
    //     TuKhoaFinal obj = new TuKhoaFinal();
    //     obj.run();
    // }//phan cuoi cua lop.
    // vay nen chương trình không thể chạy vì biến fianl đã được gán giá trị.
    /*Phương thưc final trong Java
        Nếu bạn tạo bất cứ phương thức nào là final, thì bạn không thể ghi đè nó.
        Ví dụ của phương thức final.
    */
    // void run()
    // {
    //     System.out.println("Chay an toan voi 100kmph");
    // }
    // public static void main(String args[])
    // {
    //     TuKhoaFinal honda = new TuKhoaFinal();
    //     honda.run();
    // }
    //Cái này cũng không thể chạy do bạn không thể ghi đè nó, đã nói ở trên = =  =>
    
    /*
    Lớp final trong Java: 
    Nếu bạn tạo bất cứ lớp nào là final thì bạn không thể kế thừa nó.
    */
    // void run()
    // {
    //     System.out.println("Chay an toan voi 100kmph");
    // }
    // public static void main(String args[])
    // {
    //     TuKhoaFinal honda = new TuKhoaFinal();
    //     honda.run();
    // }
        // no cung se khong chay 

    //câu hỏi: Phương thức final có được kế thừa không?
    //Có phương thức final được kế thừa nhưng bạn không thể ghi đè nó, ví dụ:
    // public static void main(String args[])
    // {
    //     new TuKhoaFinal().run();
    // }
    /*
        Câu hỏi: Biến final trống hoặc không được khởi tạo là gì?
    Một biến final mà không được khởi tạo tại thời điểm khai báo được gọi là biến
    final trống. Nếu bạn muốn tạo một biến mà được khởi tạo tại thời điểm tạo
    đối tượng và một khi nó đã đươck khởi tạo thì không thể bị thay đổi, thì biến final trống
    là hữu ích trong trường hợp này. Ví dụ như số thẻ PAN CARD của một nhân viên.
    Nó chỉ có thể dduowwj khởi tạo trong Constructor. Sau đây là ví dụ về biến final trống:
    int id;
    String name;
    final String PAN_CARD_NUMBER;
    ...
        câu hỏi: Chúng ta có thể khởi tạo biến final trống không?
    Có nhưng chỉ trong constructor. Ví dụ:
    */
    // final int speedlimit; // bien final trong.
    // TuKhoaFinal()
    // {
    //     speedlimit = 70;
    //     System.out.println(speedlimit);
    // }
    // public static void main(String args[])
    // {
    //     new TuKhoaFinal();
    // }
    /*
        Biến static final trống trong java.
    Một biến static final mà không được khởi tạo tại thời điểm khai báo thì đó là 
    biến static trống. Nó chỉ có thể được khởi tạo trong khối static.
    Dưới đây là ví dụ về biến static final trống trong Java.
    */
    // static final int data;//bien satic final trong
    // static{data = 50;}
    // public static void main(String args[])
    // {
    //     System.out.println(TuKhoaFinal.data);
    // }
    
    //Câu hỏi: Tham số final là gì?
    //Nếu bạn khai báo bất cứ tham số nào là final, thì bạn không thể thay đổi giá trị của nó.
    int cube(final int n)
    {
        n = n + 2;// khong the thay doi khi n la final.
        n *n * n;
    }
    public static void main(String args[])
    {
        TuKhoaFinal b = new TuKhoaFinal();
        b.cube(5);
    }
    //tất nhiên chương trình trên là lỗi vì có buil được đâu haha.
    //Cau hoi: Chúng ta có thể khai báo một constructor final không?
    //Trả lồi không bởi vì constructor không bao giờ được kế thừa.


    //vietJack.com

}

class Bike//câu hỏi: Phương thức final có được kế thừa không?; vd 1 vd 2
{
    final void run()
    {
        System.out.println("running");
    }
}

// final class Bike{}