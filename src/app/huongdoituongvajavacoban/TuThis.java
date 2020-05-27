package app.huongdoituongvajavacoban;

public class TuThis {
    /*
    Từ khóa this trong Java.
    Có nhiều cách sử dụng từ khóa this trong Java, this là một biến tham chiều 
    mà tham chiếu tới đối tượng hiện tại.
    Sử dụng từ khóa this trong Java.
    Trong Java, từ khóa this có 6 cách sử dụng, như sau:
    Từ khóa this có thể được sử dụng để tham chiếu biến instance của lớp.
    this() có thể được sử dụng để triệu hồi Constructor của lớp hiện tại.
    Từ khóa this có thể được sử dụng để triệu hội ngầm định phương thức lớp hiện tại.
    Từ khóa this có thể được truyền như là một tham số trong lời gọi phương thức.
    Từ khóa this có thể được truyền như là một tham số trong lời gọi Constructor.
    Từ khóa this cũng có thể được sử dụng để trả về instance của lớp hiện tại.
    Đề nghị: Nếu bạn mới học về Java thì bạn nên chỉ theo dõi hai cách sử dụng của 
    từ khóa this.
        Từ khóa this có thể được sử dụng để tham chiếu biến instance của lớp hiện tại.
    Nếu có tính lưỡng tính giữa biến instance và tham số, thì từ khóa this xử lý vấn 
    đề này. Đầu tiên, chúng ta theo dõi ví dụ để hiểu vấn đề xảy ra khi không sử dụng từ khóa thí.
    trong ví dụ dưới đây, tham số và biến instance là giống nhau, và đó là lý do tại soa chúng 
    ta sử dụng từ khóa this để phân biệt giữa các biến cục bộ và các biến instance.
    */ 
        // int id;
        // String name;
        // TuThis(int id, String name)
        // {
        //     id = id;
        //     name = name;
        // }
        // void display()
        // {
        //     System.out.println(id + " " + name);
        // }
        // public static void main(String args[])
        // {
        //     TuThis s1 = new TuThis(111, "Hoang");
        //     TuThis s2 = new TuThis(222, "Thanh");
        //     s1.display();
        //     s2.display();
        // }
    //Xử lý vấn đề trên bởi từ khóa this trong Java.
        // int id;
        // String name;
        // TuThis(int id, String name)
        // {
        //     this.id = id;
        //     this.name = name;
        // }
        // void display()
        // {
        //     System.out.println(id + " " + name);
        // }
        // public static void main(String args[])
        // {
        //     TuThis s1 = new TuThis(111, "Hoang");
        //     TuThis s2 = new TuThis(222, "Thanh");
        //     s1.display();
        //     s2.display();
        // }
    // Nếu biến cục bộ và biến instance là khác nhau, thì không cần thiết sử dụng
    //khóa thí như trong chương trình sau đây:
        // int id;
        // String name;
        // TuThis(int i, String n)
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
        //     TuThis e1 = new TuThis(111, "Hoang");
        //     TuThis e2 = new TuThis(222, "Thanh");
        //     e1.display();
        //     e2.display();
        // }
    /*
    this() có thể được sử dụng để triệu hồi constructor của lớp hiện tại.
    Lời gọi this() constructor có thể được sử dụng để triệu hồi Constructor của lớp
    hiện tại. Hướng tiếp cận này là tốt hơn nếu bạn có nhiều Constructor trong lớp và 
    muốn tái sử dụng Constructor đó.
    Chương trình dưới đây ví dụ lời gọi this() constructor (constructor chaining)
    */
    int id;
    String name;
    TuThis()
    {
        System.out.println("Constructor cua lop hien tai: ");
    }
    TuThis(int id, String name)
    {
        this (); // no duoc su dung de constructor cua lop hien tai
        this.id = id;
        this.name = name;
    }
    void display()
    {
        System.out.println(id + " " + name);
    }
    public static void main(String args[])
    {
        TuThis e1 = new TuThis(111, "Hoang");
        TuThis e2 = new TuThis(22, "Thanh");
        e1.display();
        e2.display();
    }
    //Còn 4 cách còn lại chưa nên học - thầy Tuyền said: 
}