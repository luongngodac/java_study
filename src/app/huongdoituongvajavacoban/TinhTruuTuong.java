package app.huongdoituongvajavacoban;
//file chua ham main AbstractDemo
public abstract class TinhTruuTuong {
    /*
    Tính trừu tượng trong Java.
    Tính trừu tượng (Abstraction) trong Java hướng đến khả năng tạo một đối 
    tượng trừu tượng trong lập trình hướng đối tượng. Một lớp trừu tượng là môt
    lớp mà không được khởi tạo. Tất cả các chức năng khác của lớp vẫn tồn tại, và
    tất cả các trường, phương thức, và hàm khởi tạo đều được truy cập với một
    cách giống nhau. Bạn không thể tạo một đối tượng với một lớp trừu tượng hóa.
    Nếu một lớp là lớp trừu tượng và nó không được khởi tạo, lớp này không được
    sử dụng trừ khi nó là lớp con.
    //Lớp Abstract trong Java.
    Sử dụng từ khóa abstract để khai báo một lớp abstract. Từ khóa này xuất 
    hiện trước từ khóa class  trong khai báo lớp.
    vietJack.com
    */
    private String name;
    private String address;
    private int number;
    public TinhTruuTuong(String name, String address, int number)
    {
        System.out.println("Xay dung mot Emplyee");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public double computePay()
    {
        System.out.println("Ben trong computePay TinhTruuTuong.");
        return 0.0;
    }
    public void mailCheck()
    {
        System.out.println("gui mail kiem tra toi " + this.name + " " + this.address);

    }
    public String toString()
    {
        return name + " " + address + " " + number;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String newAddress)
    {
        address = newAddress;
    }
    public String getName()
    {
        return name;
    }
    public int getNumber()
    {
        return number;
    }
}
/*
    Kế thừa lớp Abstract trong Java, chúng ta có thể kế thừa lớp TinhTruuTuong theo cách thông thường như file: 
    Salary.java
    Phương thức của lớp Abstract trong Java
    Nếu bạn muốn một lớp chứa một phương thức cụ thế nhưng bạn muốn triển khai
    thực sự phương thức đó để được quyết định bởi các lớp con, thì bạn có thể
    khai báo phương thức đó trong lớp cha ở dạng abstract.
    Từ khóa abstract được sử dụng để khai báo một phương thức dạnh abstract. Một
    phương thức gồm một chữ số, và không có thân phương thức.
    Phương thức abstract sẽ không có định nghĩa, và chữ số của nó được theo sau
    bởi dấu chấm phẩy, không có dấu ngoặc móc ôm theo sau:
        public abstract class Employee
        {
            private String name;
            private String address;
            private int number;
            public abstract double computePay();
            //phan con lai cua dinh nghia class.
        }
    Khai báo một phương thức dạng abstract tạo hai kết quả sau:
    Lớp phải được khai báo abstract. Nếu một lớp chưa một phương thức abstract,
    thì lớp đo cũng phải là abstract.
    Bất kỳ lớp con nào phải hoặc override phương thức abstract hoặc khai báo 
    abstract chính nó.
    Một lớp con mà kế thừa một phương thức abstract phải ghi đè nó. Nếu nó không,
    thì nó phải là abstract và bất kỳ lớp con của chúng phải override nó.
    Cuối cùng, một lớp con phải triển khai phương thức abstract, nếu không thì bạn
    sẽ có một cấu trúc phân cấp của các lớp abastract mà khong thể được khởi tạo.
    Nếu Salary đang kế thừa lớp TinhTruuTuong, thì nó cần triển khai phương thức
    computePay() như sau:
    //Tên file: Salary.java:
        public class Salary extends TinhTruuTuong
        {
            private double salary; // Annual salary.
            public double computePay()
            {
                System.out.pritln("tinh toan luong tra cho " + getName());
                return salary/52;
                
            }
            //Phần còn lại là định nghĩa class
        }

*/