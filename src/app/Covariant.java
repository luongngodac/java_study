package app;

public class Covariant extends A{
    /*
    Kiểu trả về covariant trong java
    Kiểu trả về covariant xác định rằng kiểu trả về có thể thay đổi trong lớp con
    Tức là một phương thức có thể trả về kiểu hẹp hơn khi phương thức đó được
    override ở class con. Trước Java5, nó không thể ghi đè bất cứ phương thức nào
    bằng cách thay đổi kiểu trả vè. Nhưng bây giờ, từ Java5, nó có thể ghi đè phương
    thức bằng cách thay đổi kiểu trả về nếu lớp con ghi đề bất cứ phương 
    thức bằng cách thay đổi kiểu trả về nếu lớp con ghi đè bất cứ phương thức nào mà 
    có kiểu trả về là không phải kiểu gốc. Bạn theo dõi ví dụ đơn giản sau:

    */
    Covariant get()
    {
        return this;
    }
    void message()
    {
        System.out.println("Chao mung den voi kieu tra ve convariant.");
    }
    public  static void main (String args[])
    {
        new Covariant().get().message();
    }
    /*Trong ví dụ này, kiểu trả về của phương thức get() cảu lớp A là A,
    nhưng kiểu trả về của phương thức get() của lớp B là B. Cả hai phương thức có
    kiểu trả về khác nhau và nó là ghi đè phương thức. Đây còn được biết 
    đến như là kiểu trả về covariant.
    */
}

class A
{
    A get()
    {
        return this;
    }
}