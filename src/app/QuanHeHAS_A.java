package app;
class Operation{
    int square (int n){
        return n*n;
    }
}
public class QuanHeHAS_A {
    /*
    Quan hệ HAS-A trong Java.
    Nếu một lớp có một tham chiếu thực thể, thì nó được biết đến như là một lớp có quan hệ HAS-A. 
    Giả sử một tình huống, đối tượng Employee chứa nhiều thông tin như id, name, eamaillID, ...
    Nó gồm một hoặc nhiều đối tượng address mà có thông tin riêng như 
    city, state, contry, zipcode,... như sau:
    class Employee{
        int id;
        String name;
        Address address; /Address la mot lop.
        ...
    }
    Trong tình huống như vậy, Employee có một address là tham chiếu thực thể,
    vì thế mối quan hệ là Employee HAS-S address.
    Tại sao và khi nào sử dụng quan hệ HAS-A.
    Sử dụng quan hệ HAS-A giúp tăng tính tái sử dụng của code. Và khi không 
    có mối quan hệ IS-A, thì quan hệ HAS-A là lựa chọn tốt nhất.
    Tính kế thừa nên chỉ được sử dụng neues mối quan hệ IS-A được duy trì thông qua
    suốt vòng đời của đối tượng có liên quan; nếu không thì, quan hệ HAS-A là
    lựa chọn tốt nhất.
    Ví dụ đơn giản về quan hệ HAS-A trong Java.
    Chúng ta tạo tham chiếu của lớp Operation trong lớp Circle.

    */
    // Operation op;   // quan he HAS-A
    // double pi = 3.14;
    // double area (int radius)
    // {
    //     op = new Operation();
    //     int rsquare = op.square(radius);//tai su dung ode (vi du: uy quyen loi goi phuong thuc).
    //     return pi*rsquare;
    // }
    // public static void main(String args[])
    // {
    //     QuanHeHAS_A q = new QuanHeHAS_A();
    //     double result = q.area(5);
    //     System.out.println(result);
    // }
    /*Ví dụ: Như trong ví dụ trên đã đề cập, Employee có một đối tượng là Address, 
    đối tượng này chứa thông tin riêng như city, state, country,... Trong tình huống
    này ,mối quan hệ là Empoyee HAS-A address*/
    int id;
    String name;
    Address address;
    public QuanHeHAS_A(int id, String name, Address address)
    {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    void display()
    {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }
    public static void main(String[] args)
    {
        Address address1 = new Address("hanoi", "HN", "vietnam");
        Address address2 = new Address("hadong", "HN", "vietnam");

        QuanHeHAS_A e = new QuanHeHAS_A(111, "hoang", address1);
        QuanHeHAS_A e2 = new QuanHeHAS_A(112, "thanh", address2);

        e.display();
        e2.display();
    }
}