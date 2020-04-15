package app;
public class HelloWorld {
    public static void main(String args[]) {
        System.out.println("Hello World");
        
    }
}
/* Phân tích chương trình Java đầu tiên:
    Từ khóa class được sử dụng để khai báo một lớp trong Java.
    Từ khóa public là một Access Modifer mà biểu diễn tính nhìn thấy
    nghĩa rằng nó là nhìn nhất với tất cả.
    static là một từ khóa, mà nếu chúng ta khai báo bất cứ phương thức
    nào là static thì nó còn được gọi là phương thức tĩnh hoặc phương thức
    static. Lợi thế chủ yếu của phương thức static là không cần thiết tạo đối 
    tượng để triệu hồi phương thức static. Phương thức main được thực thi bời JVM, 
    vì không cần thiết tạo một đối tượng để gọi phương thức main. Việt này giúp tiết 
    kiệm bộ nhớ.
    void là kiểu trả về của phương thức, nghĩa là phương thức không trả về bất cứ giá trị nào.
    main tượng trung cho khởi động chương trình
    String[] args được sử dụng cho tham số dòng lệnh. Bạn sẽ tìm hiểu chúng sau.
    System.out.println() được sử dụng như là lệnh in.
    Để biên dịch và chạy chương trình , vào cmd: đầu tiên vào thư mục hiện tại,
    với vd: c:\new. Viết ở đây: 
    Để biên dịch, gõ javac Simple.java
    Để thực thi, gõ java Simple.
    // khi chạy một chương trình thì trong thời gian runtime có các bước:
    class file => classloader => Bytecode verifier => Interpreter => Runtime => Hardware.
    trong đó: Classloader: đây là hệ thống con của JVM được sử dụng để tải class file.
    Bytecode Vertifier: Kiểm tra các đoạn code để xem có hay không các phần 
    code không hợp lệ có truy cập không hợp lệ tới các đối tượng
    Interpreter: Đọc ByteCode Stream, sau đó thực thi các chỉ thị.
    * Có thể lưu một source file bởi một tên  khác ngoài tên lớp . 
    * Có thể có nhiều lớp trong một source file.
    //Cú pháp Java cơ bản:
    Chúng ta có thể coi chương trình Java như một tập hợp các đối tượng mà có 
    thể trao đổi lẫn nhau dùng các phương thức. Dưới đây là một số định nghĩa cơ bản của lớp 
    đối tượng, phương thức cũng như biến trong Java:
    Đối tượng: Đối tượng có các trạng thái và hành vi. Ví dụ một con chó có các
    trạng thái của màu da, tên tuổi, thức ăn cũng như các hành vi như sủa, ăn , vẫy đuôi
    Lớp Một lớp có thể được định nghĩa như một bản thiết kế, mẫu mà có thể mô tả 
    các trạng thái, hành vi của một đối tượng mà nó hỗ trợ.
    Phương thức: Một phương thức đơn giản là một hành vi. Một lớp có thể bao gồm nhiều phương thức.
    Trong mỗi phương thức cõ nhuwgnx phép toán logic, dữ liệu được xử lý và tất cả các hành động được thực thi.
    Biến: mỗi đối tượng có một tập các biến duy nhất. Mỗi trạng thái của đối tượng 
    được khởi tạo bởi các giá trị và gán với những biến.
    Cú pháp cơ bản trong Java:
    Về chương trình Java, khi bạn đặt tên cho bất cứ thành phần nào, 
    bạn cần tuân theo qui ước đặt tên của chugns. Qui ước đặt tên trong Java là một qui tắc 
    cần khi theo quyết định đặt tên nào cho định danh (Identifiler) của mình, chẳng 
    hạn như đặt tên cho lớp, package, biến, hằng, phuwogn thwucs, ... Nhưng nó
    không bắt buộc để bạn phải theo. Vì thế nó được gọi là qui ước chứ không phải qui tắc
    Java là chương trình phân biệt chữ hoa chữ thường, điều đó có nghĩa là VIETJACK 
    và vietjack mang những ý nghĩa khác nhau trong Java.
    Tên Class: Tất cả các tên Class trong Java nên viết hoa chữ cái đầu tiên như là một danh từ.
    nếu không viết hoa thì câc trình IDE sẽ cảnh báo bạn( tất nhiên là Jav avaanx chấp nhận 
    nếu cố tình viết hoa chữ cái đầu tiên)
    Ví dụ class System
    Tên Interface  Nên bắt đầu với chữ hoa và là một tính từ: ví dụ Runnable,...
    Tên phương thức - tất cả các tên phuwogn thức nên bắt đầu với chữ thường và là một động từ.
    ví dụ: public void action Performed()
    Tên biến: nên bắt đầu với những chữ thường vd: firstName, orderNumber ...
    Tên package- Nên bắt đầu với chữ thường, ví dụ: java, lang, sql, util...
    Tên hằng - Nên bắt đầu với chữ hoa, ví dụ: RED, YELLOW, MAX_pRIORITY ...
    Tên file chuwogn trình- tên file nên giống hệt tên class.
    Khi bạn lưu file nên sử dụng tên class và thêm hậu tố '.java'
    public static void main (String args[]) - Chương trình Java bắt đầu bởi phương thức
    main () cho tất cả các chương trình J2SE.
    Định danh (Indentifer) trong Java:
    Tất cả các thành phần cảu Java đều yêu cầu tên. Tên được sử dụng với các class,
    biến cũng như phương thức được gọi là Định danh (Identifier).
    Trong Java, có vài điểm quan trọng dưới đây bạn phải ghi nhớ với định danh (Identifier):
    Tất cả các idenfiler nên bắt đầu với một chữ cái (A tới Z hoặc a tới z) ,
    ký tự ($) hoặc ký tự gạch dưới (_).
    Sau kí tự đầu tiên có thể là bất kỳ ký tự nào.
    Những key word trong Java không thể được sử dụng như một identifier.
    Các identifier phân biệt chữ hoa thường.
    Các trường hợp hợp lệ : tuoi, $tien, gia trị, _1_giatri
    Các trường hợp không hợp lệ: 123abc, -hocphi.
    Modifier trong java:
    Giống các ngôn ngữ khác, bạn có thể sửa đổi các lớp, phương thức,..
    bởi sử dụng các Modifier. Trong Java, có hai laoij Modifier:
    Access Modifier: Bao gồm default, public, protected, private.
    Non-access Modifier: bao gồm final, abstract, strictfp.
    Interface trong Java: 
    Trong ngôn ngữ Java, một interface có thể được định nghĩa như là một 
    contract giữa các đối tượng về cách giao tiếp với nhau. Các 
    interface đóng vai trò thiết yếu khi nó đi với khái niệm về tính kế thừa.
    Một interface định nghĩa các phương thức, các subclass nên sử dụng. Nhưng
    sự thực thi của các phương thức lại hoàn toàn là do các subclass.
    Điểm khác nhau giữa println và print:
    Java hỗ trợ hai lệnh là println và print để in thông tin trên màn hình chuẩn.
    Tuy nhiên giữa hai lệnh này có một điểm khác nhau nhỏ về con trỏ trong hai 
    lệnh. Trong khi lệnh print giữ nguyên vị trí con trỏ trên cùng một dòng lệnh 
    thì println di chuyển con trỏ xuống dòng tiếp theo (tương đương với ký tự 
    newline (dòng mới))
    






    ---vietjack.com bai 5
*/