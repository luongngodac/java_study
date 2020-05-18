package app;
class NhanBanDoiTuong implements Cloneable
{
    /*
    Nhân bản đối tượng trong Java
    Nhân bản đối tượng là một cách để tạo một bản sao của một đối tượng. Để thực hiện mục đích này,
    bạn sử dụng phương thức clone(). Java.lang.Cloneable Interface phải được triển khai bởi lớp mà 
    có đối tượng cần nhân bản chúng ta muốn tạo. Nếu bạn không triển khai Cloneable Interface,
    phương thức clone() sẽ tạo CloneNoSupportedException.
    Phương thức clone() được định nghĩa trong lớp Object. Cú pháp của phương thức clone() như sau:
    protected Object clone() throws CloneNotSupportedException
    Tại sao sử dụng phương thức clone() trong Java?
    Phương thức clone() tiết kiệm các trình xử lý phụ để tạo bản nhân bản của một đối tượng.
    Nếu bạn thực hiện nó bởi từ khóa new, điều này sẽ tốn nhiều tiến trình xử lý hơn, và đó là 
    lý do tại sao chúng ta sử dụng nhân bản đối tượng
    Ví dụ:
    Theo dõi ví dụ đơn giản sau về nhân bản đối tượng với phương thức clone() trong Java:
    vietJack.com
    */
    int rollno;
    String name;
    NhanBanDoiTuong(int rollno, String name)
    {
        this.rollno = rollno;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException 
    {
        return super.clone();
    }

    public static void main(String args[])
    {
        try
        {
            NhanBanDoiTuong s1 = new NhanBanDoiTuong(101, "hoang");

            NhanBanDoiTuong s2 = (NhanBanDoiTuong)s1.clone();

            System.out.println(s1.rollno + " " + s1.name);
            System.out.println(s2.rollno + " " + s2.name);
        }
        catch(CloneNotSupportedException c){}
    }
    /*
    Trong ví dụ trên, các biến tham chiếu đều có cùng giá trị. Vì thế, phương thức clone() sao chép các giá trị của một đối tượng
    sang đối tượng khác. Do đó, chúng ta không cần viết code t.ường minh để sao chép giá tri
    từ đối tượng này sang đối tượng khác.
    Nếu bạn tạo đối tượng khác với từ khóa new và gán giá trị của đối tượng khác cho nó, thì điều này tốn nhiều tiến trình 
    xử lý hơn trên đối tượng này. Do đó để tiết kiệm các tiền trình xử lý phụ, chúng ta nên sử dụng phương thức clone()
    */

}