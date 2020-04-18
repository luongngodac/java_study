package app;
public class Constructor{
    /*
    Constructor trong Java.
    là một kiểu phương thức đặc biệt mà được sử dụng để khởi tạo đối tượng.
    Constructor được triệu hồi tại thời gian tạo đối tượng. Nó xây dựng giá trị,
    cung cấp dữ liệu cho đối tượng, đó là lý do nó được gọi là Constructor.
    Khi bàn luận về các lớp, một trong những chủ đề quan trọng là các constructor.
    Mỗi lớp có ít nhất một constructor. Nếu chugns ta không viết một constructor 
    một cách rõ ràng cho một lớp thì bộ biên dịch Java xây dựng một consrtructor 
    mặc định cho lớp đó.
    Mỗi khi một đối tượng mới được tạo ra, ít nhất một construcotr sẽ được gọi. 
    Quy tắc chính của các construtor là chúng có cùng tên như lớp đó. Một lớp có thể có nhiều
    hơn một construtor.
    Sau đây là ví dụ về một construtor 
    public class Xecon{
        public XeCon(){}
        public Xecon(String ten){//constructor nay co mot tham so la ten.}
    }
    Quy tắc để tạo Constructor trong Java:
    Có hai loại Constructor: Loại thứ nhất là Construc mặc định, loại này 
    không có tham số. Và loại thứ 2 là Constructor được tham số hóa.
    Constructor mặc định trong Java. 
    Đây là construc mà không có tham số có cú pháp: 
    ten_lơp(){}
    Trong ví dụ này chúng ta tạo một Constructor không có tham số trong lớp Bike.
    Nó sẽ được triệu hồi tại thời gian tạo đối tượng.
    class Bike1{
        Bike1(){ System.out.println("Bike duoc tao.");}
        public static void main(String args[])
        {Bike1 b = new Bike1();}
    }
    Qui tắc: nếu không có Constructor nào được xác định trong một lớp, thì 
    Complier tự động tạo một Construtor mặc định.
    Mục đích của Constructor mặc định: cung cáp các giá trị mặc định cho đối 
    tượng như 0, null, ... tùy thuộc vào kiểu dữ liệu.
    Ví dụ Construc mặc định mà hiển thị các giá trị mặc định.
    vietJack
    */
    // int id;
    // String name;
    // void display()
    // {
    //     System.out.println(id + " " + name);
    // }
    // public static void main(String args[])
    // {
    //     Constructor s1 = new Constructor();
    //     Constructor s2 = new Constructor();
    //     s1.display();
    //     s2.display();
    // }
    //Giải thích: Trong lớp trên, bạn không tạo bất cứ Construtor nào, ví thế
    //Complier cung cấp cho bạn một Constructor mặc định. Ở đây các giá trị 0 và null được cung cáp bới Constructor mặc định.
    /*
    Constructor được tham số hóa trong Java.
    Một constructor mà có các tham số được gọi là constructor được tham số hóa.
    Constructor được tham số hóa được sử dụng để cung cấp các giá trị khác nhau cho các đối tượng riêng biệt.
    Trong ví dụ này, chúng ta tạo Constructor của lớp Student mà có hai tham số.
    Chúng ta có thể bất cứ tham số nào trong Constructor. 
    
    */
    // int id;
    // String name;
    // Constructor(int i, String n)
    // {
    //     id = i;
    //     name = n;
    // }
    // void display()
    // {
    //     System.out.println(id + " " + name);
    // }
    // public static void main(String args[])
    // {
    //     Constructor s1 = new Constructor(111, "Karan");
    //     Constructor s2 = new Constructor(222, "Aryan");
    //     s1.display();
    //     s2.display();
    // }
    
    /*
    Nạp chồng Constructor trong Java.
    Nạp chồng Constructor là một kỹ thuật trong Java mà trong đó một lớp có thể có
    bất cứ số lượng Constructor nào mà khác nhau về danh sách tham số. Trình 
    biên dịch Compiler phân biệt sự khác nhau giữa các Constructor này bằng việc phân 
    tích số tham số trong danh sách và kiểu của chúng.
    Ví dụ về nạp chồng constructor.   
    */
        // int id;
        // String name;
        // int age;
        // Constructor(int i, String n)
        // {
        //     id = i;
        //     name = n;
        // }
        // Constructor(int i, String n, int a)
        // {
        //     id = i; 
        //     name = n;
        //     age = a;
        // }
        // void display() 
        // {
        //     System.out.println(id + " " + name + " " + age);
        // }
        // public static void main(String args[])
        // {
        //     Constructor s1 = new Constructor(111, "Hoang");
        //     Constructor s2 = new Constructor(222, "thanh", 25);
        //     s1.display();
        //     s2.display();
        // }
    /*
    Điểm khác nhau giữa Constructor và Phương thức trong Java.
    Constructor : Được sử dụng để khởi tạo trạng thái của một đối tượng.
    Constructor phải không có kiểu trả về; được triệu hồi một cách ngầm định.
    Compliler cung cấp một Constructor mặc định nếu bạn không có bất cư Constructor nào.
    Ten Constructor phải giống tên lớp.
    Phương thức: được sử dụng để trưng bày hành vi của một đối tượng; phải có kiểu trả về;
    phương thức phải được triệu hồi một cách tường minh; Phương thức không được cung cấp bởi
    Compiler trong bất cứ trường hợp nào; Tên phương thức có thể giống hoặc không giống tên lớp.
    Copy Constructor trong Java.
    Trong Java không có Copy Constructor như trong C++. Tuy nhiên, bạn có thể sao chép 
    các giá trị của một đối tượng tới đối tượng khác. Có nhiều cách thực hiện việc sao chép các giá trị, đó là:
    Bởi Constructor;
    Bởi gán các giá trị cảu một đối tượng vào trong đối tượng khác.
    Bởi phương thức clone() của Object.
    Trong ví dụ này, chúng ta sao chép các giá trị của một đối tượng vào trong
    đối tượng khác bởi sử dụng Constructor trong Java.
    */
        // int id;
        // String name; 
        // Constructor(int i, String n)
        // {
        //     id = i;
        //     name = n;
        // }
        // Constructor(Constructor s)
        // {
        //     id = s.id;
        //     name = s.name;
        // }
        // void display()
        // {
        //     System.out.println(id + " " + name);
        // }
        // public static void main(String args[])
        // {
        //     Constructor s1 = new Constructor(111, "Hoang");
        //     Constructor s2 = new Constructor(s1);
        //     s1.display();
        //     s2.display();
        // }
    /*
    Sao chép các giá trị không sử dụng Cosntructor.
    Chúng ta có thể sao chép các giá trị của một  đối tượng vào trong đối tượng khác 
    bởi gán các giá trị của đối tượng đó vào trong đối tượng khác. Trong trường hợp này,
    chúng ta không cần tạo Constructor.
    */
    int id;
    String name;
    Constructor (int i, String n)
    {
        id = i;
        name = n;
    }
    Constructor(){}
    void display() 
        {
            System.out.println(id + " " + name);
        }
    public static void main (String args[])
    {
        Constructor s1 = new Constructor(111, "Hoang");
        Constructor s2 = new Constructor();
        s2.id = s1.id;
        s2.name = s1.name;
        s1.display();
        s2.display();
    }
    /*
    có phải constructor trả về giá trị???
    Có, đó là instance (sự thể hiện) của lớp hiện tại. (bạn không thể sư dụng
    kiểu trả về, tuy vậy nó trả về một giá trị.)
    Câu hỏi: Constructor có thể thực hiện các tác vụ khác ngoài khởi tạo không?
    Có, giông như quá trình tạo đối tượng, bắt đầu một Thread, gọi phương thức, ...
    Bạn có thể thực hiện bất cứ hoạt động nào trong Constructor như khi bạn thực
    hiện trong phương thức.
    
    
    */

}