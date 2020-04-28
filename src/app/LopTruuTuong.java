package app;

public class LopTruuTuong extends BikeT
{
    /*
    Lớp trừu tượng-Abstract Class trong Java.
    Một lớp được khai báo với từ khóa abstract được xem như là lớp abstract trong
    Java. Nó có thể có các phương thức abstract hoặc non-abstract. Trước khi
    tìm hiểu về lớp trừu tượng trong Java, bạn càn tìm hiểu tính trừu tượng trong Java là gì.
    Tính trừu tượng(Abstraction) trong Java: 
    là một tiến trình ẩn các chi tiết trình triển khai và chỉ hiển thị tính 
    năng tới người dùng. Nói cách khác, nó chỉ hiện các thứ quan trong tới 
    người dùng và ẩn các chi tiết nội tại, ví dụ để gửi tin nhắn, người dùng chỉ cần soạn tẽt
    và gửi tin. Bạn không biết tiến trình xử lý nội tại về phân phối tin nhắn. Tính trừu
    tượng giúp bạn trọng tâm hơn vào đối tượng thay vì quan tâm đến cách nó thực hiện.
    Lớp abstract trong Java.
    Một lớp được khai báo là abstract thì đó là lớp trừu tượng. Nó cần được kế thừa và phương
    thức của nó được triển khai. Nó không được khởi tạo. 
    Sử dụng từ khóa abstract để khai báo một lớp abstract. Từ khóa này xuất hiện
    trước từ khóa class trong khai báo lớp. Ví dụ:
    abstract class A{}
    Có hai cách để đạt được tính trừu tượng hóa trong Java:
    Lớp abstract (0 đến 100%)
    Interface (100%)
    Phương thức trừu tượng trong Java.
    Một phương thức được khia báo là abstract và không có trình triển khai thì đó là
    phương thức trừu tượng.
    Nếu bạn muốn một lớp chứa một phương thức cụ thể nhưng bạn muốn triển 
    khai thực sự phương thức đó để được quyết định bởi các lớp con, thì bạn có thể
    khai báo phương thức đó trong lớp cha ở dạng abstract.
    Từ khóa abstract được sử dụng để khai báo một phương thức dạng abstract. Một
    phương thức abstract không có thân phương thức.
    Phương thức abstract sẽ không có định nghĩa, được theo sau bởi dấu chấm phẩy,
    không có dấu ngoặc móc ôm theo sau:
    abstract void printStatus(); // Khai báo phương thức với từ khóa abstract và không có thân phương thức.
    //Ví dụ về lớp trừu tượng và phương thức trừu tượng trong Java.
    Trong ví dụ này, BikeT là lớp trừu tượng chỉ chứa một phương thức trừu tượng là run.
    Trình triển khai của nó được cung cấp bởi Honda.
        vietJack.com
    */
    //Lop LopTruuTuong ke thua lop truu tuong Bike.
    void run()
    {
        System.out.println("Dang chay mot cach an toan.");

    }
    //phuong thuc main.
    public static void main(String args[])
    {
        BikeT obj = new LopTruuTuong();
        obj.run();
    }
    // Kế thừa lớp Abstract trong Java.
    /* Trong ví dụ này, Shape là lớp trừu tượng, trình triển khai của nó được cung cấp
    bởi lớp Rectangle và lớp Circle. Hai lớp này kế thừa lớp trừu tượng Shape.
    file: TestAbstraction1.java.
    Khi mình tạo sự thể hiện của lớp Rectangel (tại dòng Shape s = new Circle1();)
    phuong thức draw của lóp Rectangle1 sẽ được triệu hồi.
    Tất nhiên, trong khi lập trình bất cứ ngôn ngữ nào, mỗi Class mà chúng ta tạo ra đều
    phục vụ cho một mục đích cụ thể nào đó. Do đó, bạn nên tạo các Class riêng rẽ trong từng fiel
    đừng làm như trong file TestAbstraction1.java nhé.
    //Ví dụ khác về lớp ké thừa lớp Abstract trong Java.
    Đầu tiên mình có một lớp trừu tượng Bank có phương thức abstract có tên là
    getRateOfnterst() với mục đích để lấy lãi suất của ngân hàng nói chung.
    File Bank.java
    abstract class Bank
    {
        abstract int getRateOfInterest();
    }
    Tiếp đó, mình có hai lớp SBI và PNB đại diện cho tên các ngân hàng và hai lớp
    này kế thừa lớp trừu tuongj Bank ở trên. Vì hai lớp này kế thừa lớp trừu tượng
    BAnk nên cả hai lớp pahir cung cấp trình triển khai cụ thể  cho phuong thức
    getRAteOfInterset().
    File SBI.java
    class SBI extends Bank
    {
        int getRateOfInterest()
        {
            return 7;//bat buoc phai cung cap trinh trien khai getRateOfInterest
        }
    }
    file PNB.java
    class PNB extends Bank
    {
        int getRateOfInterest()
        {
            return 8;//bat buoc phai cung cap trinh trien khai getRateOfInterest().
        }
    }
    Và cuối cùng, lớp TestBank có phương thức main() sẽ có nội dung như sau:
    class TestBank
    {
        public static void main(String args[])
        {
            //Tao mot doi tuong SBI moi.
            Bank b = new SBI();
            //Neu doi tuong la PNB, phuong thuc cua PNB se duoc trieu hoi.
            int interrest = b.getRateOfInterest();//Trieu hoi phuong thuc cua SBI.
            System.out.println("ti le lai suat la: " + interest + " %");
        }
    }
    Lớp trừu tượng có thể có thành viên dữ liệu, phương thức trừu tượng, cóntructor
    và có thể cả phương thức main().
    File Abstraction2.java.
    Qui tắc: Nếu bạn đang kế thừa bất cứ lớp trừu tượng nào mà có phương thức 
    trừu tuongj thì bạn phải cung cấp trình triển khai của các phương thức của 
    lớp trừu tượng này.
    Lớp trừu tượng cũng có thể được sử dụng để cung cấp một số trình triển khai
    của Interface. Trong tình huống này, người dùng cuối cùng không thể bị bắt buộc
    phải ghi đè tất cả phương thức của Interface đó.
    Ghi chú: nếu bạn mới học về Java thì học Interface trước và bỏ qua ví dụ này.
    https://vietjack.com/java/lop_abstract_trong_java.jsp
    Ghi chú: Có thể hỏi về sự khác nhau giữa abstract class và interface. Các bạn nên
    chú ý các phuong thức của interface là abstract 100%, trong abstract class có
    thể có phương thức không phải abstract. Trong thiết kế phần mềm, interface
    thường được dùng để chỉ 2 hay nhiều class cùng làm việc gì đó (ví dụ cùng in Printable)
    trong khi abstract class thường hướng đến quan hệ cha con trong lập trình hướng đối tượng
    có thể đọc thêm tại: 
    */


}
abstract class BikeT
{
    //Lớp trừu tượng LopTruuTuong
    abstract void run();    //phuong thuc truu tuong voi tu khoa abstract.

}