package app;

public class Static {
    /*
    Từ khóa static trong Java:
    Từ khóa static trong Java được sử dụng chính để quản trị bộ nhớ. Chúng ta có 
    thể áp dụng từ khóa static với biến (cũng được gọi là biến lớp, biến class),
    phương thức (cũng được gọi là phương thức lớp.), khối các lớp được lặp. Từ khóa
    static thuộc về lớp chứ không thuộc về instance (sự thể hiện) của lớp.
    Biến static trong Java.
    Khi bạn khai báo một biến là static, thì biến đó được gọi là biến tĩnh, hay biến static.
    Biến static có thể được sử dụng để tahm chiếu thuộc tính chung của tất cả đối tượng (mà 
    không là duy nhất cho mỗi đối tượng), ví dụ như tên công tuy của nhân viên,
    tên trường học của các sinh viên...
    Biến static lấy bộ nhớ chỉ một lần trong Class Area tại thời gain tải lớp đó.
    Lợi thế của biến static:
    Biến static giúp bộ nhớ chương trình của bạn được sử dụng hiểu quả hơn
    (tiết kiệm bộ nhớ.)
    Ví đụ về biến static trong Java.
    
    */
    // int rollno;
    // String name;
    // static String college = "Bach Khoa";
    // Static(int r, String n)
    // {
    //     rollno = r;
    //     name = n;
    // }
    // void display()
    // {
    //     System.out.println(rollno + " " + name + " " + college);

    // }
    // public static void main(String args[])
    // {
    //     Static s1 = new Static(111, "Hoang");
    //     Static s2 = new Static(222, "Thanh");
    //     s1.display();
    //     s2.display();
    // }

    /*
    Chương trình Counter mà không sử dụng biến static:
    Trong ví dụ, chúng ta tạo một biến instance có tên count mà được tăng lên trong constructor .
    Khi biến instance này lấy bộ nhớ tại thời điểm tạo đối tượng, mỗi đối
    tượng sẽ có bản sao của biến instance đó, nếu nó được tăng lên, nó sẽ 
    không phản ánh các đối tượng khác. Vì thế mỗi đối tượng sẽ có giá trị 1 trong biến count.
      
    */
    // int count = 0; //se lay bo nho (memory) khi bien instance duoc tao.
    // //Ket qua thuc hien chuong trinh hien ra 3 so 1 o 3 dong.
    // Static()
    // {
    //     count ++;
    //     System.out.println(count);
    // }
    // public static void main(String args[])
    // {
    //     Static c1 = new Static();
    //     Static c2 = new Static();
    //     Static c3 = new Static(); 
    // }
    /*
    Phương thức static trong Java.
    Nếu bạn áp dụng từ khóa static với bất cứ phương thức nào, thì phương thức đó
    được gọi là phương thức static.
    Một phương thức static thuộc lớp chứ không phải đối tượng của lớp.
    Một phương thức static có thể được triệu hồi mà không cần tạo một instance của một lớp.
    Phương thức static có thể truy cập thành viên dữ liệu static và có thể thay đổi giá 
    trị của nó.
    */
    //Chuong trinh thay đổi thuộc tính chung của tất cả đối tượng(trường static): con in sai do Static trung mat voi ten lop roi.
    // int rollno;
    // String name;
    // static String college = "Bach Khoa";
    // static void change()
    // {
    //     college = "QuocGia";
    // }
    // Static(int r, String n)
    // {
    //     rollno = r;
    //     name = n;
    // }
    // void display() 
    // {
    //     System.out.println(rollno + " " + " " + college);
    // }
    // public static void main(String[] args)
    // {
    //     Static.change();
    //     Static s1 = new Static (111, "hoang");
    //     Static s2 = new Static (222, "thanh");
    //     Static s3 = new Static (333, "nam");
    //     s1.display();
    //     s2.display();
    //     s3.display();
    // }

}