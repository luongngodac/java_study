package app.huongdoituongvajavacoban;

public class TinhKeThua{
    /*
    Tính kế thừa trong Java - Từ khóa extends và implements 
    trong Java.
    Tính kế thừa trong Java là một kỹ thuật mà trong đó một đối tượng thu được tất cả
    thuộc tính và hành vi của đối tượng cha. Ý tưởng đằng sau tính kế thừa trong
    Java là bạn có thể tạo các lớp mới mà được xây dựng dựa trên các lớp đang tồn tại.
    Khi bạn kế thừa từ một lớp đang tồn tại, bạn có thể tái sử dụng các phương thức
    và các trường hợp của lớp cha, và bạn có thể tái sử dụng các phương thức và 
    các trường của lớp cha, và bạn cũng có thể bổ sung thêm các phương thức
    và các trường khác. Tính kế thừa biểu diễn mối quan hệ IS-A, còn được gọi
    là mối quan hệ cha-con.
    Khi ta nói về tính kế thừa, từ khóa thường xuyên nhất được sử dụng là 
    extends trong java và implements trong java. Những từ khóa này có thể định 
    nghĩa một kiểu là loại IS-A của loại khác. Sử dụng những từ khóa, chúng ta có thể
    khóa extends của lớp con để có thể kế thừa các thuộc tính của lóp cha trừ 
    các thuộc tính private của lớp cha.
    Tại sao sử dụng tính kế thừa trong Java?
    Để ghi đè phương thức(Method Overriding), do đó có thể thu được tính đa hình
    tại runtime.
    Để tăng tính tái sử dụng của code.
    Cú pháp kế thừa trong Java:
    class ten_lop_con extends ten_lop_cha
    {
        // Cac phuong thuc va cac truong.
    }
    Từ khóa extends chỉ rằng bạn đang tạo một lớp mới mà kế thừa từ một lớp đang 
    tồn tại. Trong Java, một lớp mà được kế thừa gọi là một lớp cha. Lớp
    mới được gọi là lớp con.
    Trong ví dụ sau, TinhKeThua là lớp con và Employee là lớp cha. Mối quan hệ
    giữa hai lớp là Programmer IS-A Employee. Nghĩa là TinhKeThua là một kiểu của Employee.
        class Employee{
            float salary = 40000;
        }
        class TinhKeThua extends Employee{
            int bonus = 10000;
            public static void main(String args[])
            {
                TinhKeThua p = new TinhKeThua();
                System.out.println("Luong lap trinh vien la: " + p.salary);
                System.out.println("Programmer Bonus is  " + p.bonus);
            }
        }
    Các loại kế thừa trong Java:
    Trên cơ sở các lớp thì có 3 loại kế thừa trong Java, đó là single (đơn), multievel
    (nhiều tầng) và hierarchical (có cấu trúc). Trong lập trình Java, đa kêt thừa (multiple)
    và kế thừa lai (hybird) chỉ được hỗ trợ thông qua Interface. Chúng ta sẽ
    tìm hiểu về interface trong chương sau đó.
    Ghi chú: Đa kế thừa không được hỗ trợ trong Java thông qua lớp. Khi một lớp kế thừa 
    từ nhiều lớp, thì đây là đa kế thừa.
    Câu hỏi: tại sao đa kế thừa không được hỗ trợ trong Java thông qua lớp?
    Trả lời: Để giảm tính phức tạp và làm đơn giản hóa ngôn ngữ, đa kế thừa không 
    được hỗ trợ trong Java. Giả sử có tính huống có 3 lớp là A, B, C. Lớp C kế
    thừa lớp A và B. Nếu các lớp A và B có cùng phương thức và bạn gọi nó từ đối tượng
    lớp con, thì điều này gây là tính lưỡng nghĩa là để gọi phương thức của lớp A hoặc lớp B.
    Bởi vid compile time eror thì tốt hơn là runtime eror, Java sẽ thông báo
    một compile time eror nếu bạn kế thừa 2 lớp. Do dó, dù bạn có hay không có cùng
    phương thức hay khác phương thức thì đó cũng lầ một lỗi tại compile time.
    Từ khóa implements được sử dụng bởi các lớp mà kế thừa từ Interface.
    Interface có thể không bao giờ được kế thừa bởi các lớp.
    Từ khóa instanceof trong Java;
    Quan hệ HAS-A trong Java:
    Có những quan hệ chủ yếu dựa vào cách sử dụng. Nó xác định có hya không 
    một lớp cụ thể HAS-A. Quan hệ này giúp chúng ta giảm được dư thừa trong
    code cũng như tránh các bug. 
    Một đặc điểm quan trọng nữa phải ghi nhớ là Java chỉ hỗ trợ kế thừa đơn. 
    Điều này nghĩa là một lớp không thể kế thừa từ nhiều hơn một lớp. Do đó, đoạn
    code như thế này không hợp lệ:
    public class C extends A,B {}
    Mặc dù vậy một lớp vẫn có thể implement một hoặc nhiều interface. 
    Điều này loại bỏ khả năng không thể kế thừa trong Java.
    
    */


}