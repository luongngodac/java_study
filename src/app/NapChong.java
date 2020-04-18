package app;
public class NapChong {

    /*
    Nạp chông phương thức trong Java.
    Nếu một lớp có nhiều phương thức cùng tên nhưng có tham số khác nhau, 
    thì đó là nạp chông phương thức (Method Overloading). Nếu bạn phải thực 
    hiện chỉ một hoạt động, có cùng tên phương thức, thì kỹ thuật này làm tăng tính có thể 
    đọc cho chương trình. Giả sử bạn viết phương thức như a(int, int) cho hai tham
    số, và b(int, int, int) cho ba tham số, thì khi đó điều này có thể gay khó khăn cho 
    bạn cũng như các ltv khác để hiểu hành vi của phương thức, bởi vì tên của 
    nó là khác nhau. Vì thế, chúng ta thực hiện nạp chồng phương thức để
    giúp việc phân tích chương trình nhanh hơn.
    Có hai cách để nạp chồng phương thức trong Java, đó là:
    Bằng việc thay đổi số tham số 
    Bằng việc thay đổi kiểu dữ liệu.
    Ghi chú: Trong Java, nạp chồng phương thức là không thể bằng việc thay dổi kiểu trả về
    của phương thức.
    Ví dụ về nạp chồng phương thức bằng cách thay đổi tham số.
    Trong ví dụ này sử dụng nạp chồng phương thức: phương thức sum đầu tiên thực hiện phép cộng hai số và 
    phương thức sum thứ hai thực hiện phép cộng ba số.
    
    vietJack.com
    */
    // void sum(int a, int b) 
    // {
    //     System.out.println(a + b);
    // }
    // void sum(int a, int b, int c)
    // {
    //     System.out.println(a + b + c);
    // }
    // public static void main(String[] args)
    // {
    //     NapChong obj = new NapChong();
    //     obj.sum(10,10);
    //     obj.sum(10,10,10);
    // }
    /*
    Ví dụ nạp chồng phương thức bằng cách thay dổi kiểu dữ liệu của tham số.
    trong ví dụ này, chúng ta sử dụng nạp chồng phương thức mà khác nhau về kiểu dữ liệu. 
    Phương thức sum đầu tiên nhận lại hai số nguyên và phương thức
    sum thứ hai nhận lại hai số thực double.
    */
    // void sum(int a, int b)
    // {
    //     System.out.println(a + b);
    // }
    // void sum(double a, double b)
    // {
    //     System.out.println(a + b);
    // }
    // public static void main(String args[])
    // {
    //     NapChong obj = new NapChong();
    //     obj.sum(10.5, 10.5);
    //     obj.sum(20, 20);
    // }
    /*
    Ví dụ về nạp chồng phương thức TypePrômtion trong trường hợp lưỡng nghĩa
    Nếu không có kết nối các tham số trong phương thức, và mỗi phương thức 
    promte số tham số giống nhau, thì đó là trường hợp lưỡng nghĩa.

    */
    // void sum(int a, long b)
    // {
    //     System.out.println("Phuong thuc a duoc trieu hoi");
    // }
    // void sum(long a, int b)
    // {
    //     System.out.println("Phuong thuc b duoc trieu hoi.");
    // }
    // public static void main(String args[])
    // {
    //     NapChong obj = new NapChong();
    //     obj.sum(20, 20); // khong co tinh luong nghia o day.
    //     //Overload co the hieu 2 hay nhieu ham cung ten ma khac so luong tham so hoac khac hieu tham so.
    // }=> ket qua buil loi.



}