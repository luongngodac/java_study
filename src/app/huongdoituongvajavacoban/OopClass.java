package app.huongdoituongvajavacoban;

public class OopClass {



    /*
    Đối tượng và (class trong java)
    Object - Đối tượng là thực thể mang tính vật lý cũng như mang tính logic,
    trong khi lớp chỉ là thực thể logic. Đối tượng có các trạng thái và hành vi
    Ví dụ: Một dog có trạng thái là color, name, breed (dòng dõi) và cũng có các hành vi:
    Wag(vẩy đuôi), bark (sủa), eat (ăn). Một đối tượng là một instance (ví dụ, trường hợp )
    của một lớp.
    Class: Một lớp là một nhóm các đối tượng mà có các thuộc tính chung. Lớp là một 
    Template hặc bản thiết kế từ đó đối tượng được tạo. 
    Đối tượng trong Java
    Đó là một thực thể có trạng thái và hành vi, ví dụ như bàn, ghế, con mèo, xe con ..
    Nó có thể mang tính vật lý hoặc logic. Ví dụ về logic là Banking System.
    Một đối tượng có 3 đặc trưng sau: trạng thái, hành vi và nhận diện
    Trạng thái : biểu diễn giá trị của một đối tượng
    Hành vi: biểu diễn hành vi (tính năng ) của một đối tượng như gửi tiền vào, 
    rút tiền ra, ...
    Nhận diện: việc nhận diện đối tượng được triển khai thông qua một ID duy nhất.
    giá trị của ID không thể nhìn thấy với người dùng bên ngaoif. Nhưng 
    nó được sử dụng nội tại bởi JVM để nhận diện mỗi đối tượng một cách duy nhất.
    Ví dụ: Bút là một đối tượng. Nó có tên là Thiên Long, có màu trắng... được xem 
    như là trạng thái của nó. Nó được sử dụng để viết, do đó viết là hành vi của nó.
    Đối tượng là sự thể hiện (Instance ) của một lớp. Lớp là một Template 
    hoặc bản thiết kế từ đó đối tượng được tạo. Vì thế đối tượng là Instance (kết quả)
    của một lớp.
    Lớp trong Java:
    Một lớp là một nhóm các đối tượng mà có các thuộc tính chung.
    Lớp là một Template(bản mẫu) hoặc bản thiết kế từ đó đối tượng được tạo. Một lớp trong 
    Java có thể bao gồm: 
    Thành viên dữ liệu; Phương thức; Constructor ; Block; Lớp và interface.
    Cú pháp để khai báo một lớp : => xuống dưới
     Một lớp có thể chừa bất kỳ loại biến sau:
     Biến Local: Các biến được định nghĩa bên trong các phương thức, cóntructor
     hoặc block code được gọi là biến Local. Biến này sẽ được khai báo và khởi tạo
     bên trong phương thức và biến này sẽ bị hủy khi phương thức đã hoàn thành.
     Biến Instance: Các biến instance là các biến trong một lớp nhưng ở bên ngoài 
     phương thức nào. Những biến này được khởi tạo khi lớp này được tải.
     Các biến instance có thể được truy cập từ bên trong bất kỳ phương thức, constructor hoặc 
     khối nào của lớp cụ thể đó.
     Biến Class: Các biến class là các biện được khai báo với một lớp, bên ngoài bất kỳ phương thức nào, với từ khóa static
    Phương thức trong Java
    Trong Java, một phương thức là khá giống hàm, được sử dụng để trưng bày hành vi của một đối tượng.
    Phương thức giúp code tăng tính tái sử dụng và tối ưu hóa code.
    Từ khóa new được sử dụng để cấp phát bộ nhớ tạm tại runtime.
    Constructor trong java: 
    Khi bàn luận về các lớp, một trong những chủ đề quan trọng là các constructor. Mỗi
    lớp có một constructor. Nếu chúng ta không viết một constructor một cách rõ ràng cho một
    lớp thì bộ biên dịch Java xây dựng một constructor mặc định cho lớp đó.
    Mỗi khi một đối tượng mới được tạo ra, it nhất một constructor sẽ được gọi.
    Quy tắc chính cảu các constructor là chúng có cùng tên như lớp đó. Một lớp 
    có thể có nhiều hơn một constructor.
    Tạo một đối tượng trong Java:
    Trong Java, từ khóa new được sử dụng để tạo một đối tượng mới.
    Có ba bước khi tạo một đối tượng từ lớp:
    Khai báo: Một khai báo biến với một tên biến với một loại đối tượng.
    Cài đặt: Từu khó new đưuọc sử dung để tạo đối tượng.
    Khởi btaoj: Từ khóa new được theo sau bởi một lời gọi một constructor. gọi hàm này
    khởi tạo đối tượng mới.
    Truy cập các biến instance và các phương thức trong Java
    Các biến instance và các phuwogn thức được truy cập thông qua các đối tượng
    được tạo. Để truy cập một biến instance path sẽ là như sau:
    // Đầu tiên, bạn tạo một đối tượng.
    Doituongthamchieu = new Constructor();
    //Sau dó bạn gọi một biến như sau: 
    Doituongthamchieu.TenBien;
    //Bây giờ bạn có thể gọi một phương thức lớp như sau:
    Doituongthamchieu.TenPhuongThuc();







    vietJack 15/4/2020
    */

       // //cú pháp để khai báo một lớp:
    // class ten_lop{
    //     thanh_vien_du_lieu;
    //     phuong_thuc;
    // }

    // //Ví dụ đơn giản về Lớp và Đối tượng  trong Java.
    // int id; // thanh vien du lieu (cung la bien instance)
    // String name;// thanh vien du lieu(cung la bien instance)
    // public static void main(String args[]){
    //     Student1 s1 - new Student1();   //tao mot doi tuong Student.
    //     System.out.println(s1.id);
    //     System.out.println(s1.name);
    // }

    //Ví dụ về một constructor
    // public Xecon(){

    // }
    // public Xecon(String ten){
    //     // Constructor này có một tham số là tên. 
    // }
    // Ja va cũng hỗ trợ lớp Singleton trong Java, ở đây sẽ có thể tạo chỉ một instance của một lớp.

    // //ví dụ về tạo một đối tượng
    // public oop_class(String ten){
    //      //Constructor này có một tham số là tên.
    //      System.out.println("Ten xe la: " + ten);
    // }
    // public static void main (String args[]){
    //     //Lenh sau se tao mot doi tuong la Xecuatoi
    //     oop_class XeCuatoi = new oop_class("toyota");
    // }

    //     // ví dụ này giải thích cách để truy cập các biến instance và các phương thức của một lớp.
    // int Giaxe;
    // public oop_class(String ten){
    //     //Construtor nay co mot tham so la ten.
    //     System.out.println("Ten xe la: " + ten);
    // }
    // public void setGia(int gia){
    //     Giaxe = gia;
    // }
    // public int getGia(){
    //     System.out.println ("Gia mua xe la: " + Giaxe);
    //     return Giaxe;
    // }
    // public static void main(String args[]){
    //     //Tao doi tuong
    //     oop_class Xecuatoi = new oop_class("Toyota");
    //     // Goi mot phuong thuc lop de thiet lap gia xe.
    //     Xecuatoi.setGia(10000000);
    //     //Goi mot phuong thuc khac de lay gia xe.
    //     Xecuatoi.getGia();
    //     //Cung co the truy cap bien instance nhu sau:
    //     System.out.println("Gia tri bien: " + Xecuatoi.Giaxe);
    // }
    //     //Ví dụ đối tượng và lớp mà duy trì bản ghi các sinh viên.
    // /*
    // Trong ví dụ này, chúng ta tạo hai đối tượng của lớp Student và khởi
    // tạo giá trị của các đối tượng này bằng việc triệu hồi phương thức insertRecord trên nó.
    // Ở đây chúng ta đang hiển thị trạng thái (dữ liệu) của các đối tượng bằng
    // việc triệu hồi phương thwucs displayInformation.
    // */
    // int rollno;
    // String name;
    // void insertRecord(int r, String n){
    //     //Phuong thuc
    //     rollno = r;
    //     name = n;
    // }
    // void displayInformation(){
    //     System.out.println(rollno + " " + name);//phuong thuc
    // }
    // public static void main(String args[]){
    //     oop_class s1 = new oop_class();
    //     oop_class s2 = new oop_class();

    //     s1.insertRecord(111, "HoangThanh");
    //     s2.insertRecord(222, "Thanh Huong");

    //     s1.displayInformation();
    //     s2.displayInformation();
    // }

    // //Ví dụ khác về lớp và đối tượng trong Java.
    // //Ví dụ khác duy trì các bán ghi của lớp Rectangle. Phần giải thích tương tự như trên:
    // int length;
    // int width;
    // void insert(int l, int w){
    //     length = l;
    //     width = w;
    // }
    // void calculateArea(){
    //     System.out.println(length*width);
    // }
    // public static void main(String args[]){
    //     oop_class r1 = new oop_class();
    //     oop_class r2 = new oop_class();

    //     r1.insert(11, 5);
    //     r2.insert(3, 15);

    //     r1.calculateArea();
    //     r2.calculateArea();
    // }
    /*
    Các cách khác nhau để tạo đối tượng trong Java? Có nhiều cách
    đó là bằng từ khóa new; phương thức newinstance(); phương thức colne(); phương thứcfactory,..
    
    Đối tượng vô danh (annonymous) trong Java.
    Vô danh hiểu đơn giản là không có tên. Một đối tượng mà không có tham chiếu thì được xem như 
    là một đối tượng vô danh. Nếu bạn phải sử dụng một đối tượng hcir một lần,
    thì đối tượng vô danh là một hướng tiếp cận tốt.
    
    */
    // //Caculation
    // void fact(int n){
    //     int fact = 1;
    //     for (int i = 1; i <= n; i++){
    //         fact = fact * i;
    //     }
    //     System.out.println("factorial is " + fact);
    // }
    // public static void main(String args[]){
    //     new oop_class().fact(5);  // goi phuong thuc voi doi tuong vo danh (annonymous.)
    // }

    //Tạo nhiều đối tượng bởi chỉ một kiểu
    //chúng ta có thể tạo nhiều đối tượng chỉ bởi một kiểu như chúng ta thực hiện trong các kiểu gốc. Ví dụ:
        //Rectangle r1 = new Rectangle(), r2 = new Retange(); /// Tao hai doi tượng
    //ví dụ:
    int length;
    int width;
    void insert(int l, int w){
        length = l;
        width = w;
    }
    void caculateArea()
    {
        System.out.println(length*width);
    }
    public static void main(String args[]){
        OopClass r1 = new OopClass(), r2 = new OopClass(); // tao hai doi TenPhuongThuc

        r1.insert(11, 5);
        r2.insert(3, 15);

        r1.caculateArea();
        r2.caculateArea();
    }
     











}

