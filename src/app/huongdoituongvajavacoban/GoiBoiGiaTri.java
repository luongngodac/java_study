package app.huongdoituongvajavacoban;

public class GoiBoiGiaTri 
{
    /*
    Gọi bởi giá trị trong Java
    Chỉ có gọi bởi giá trị trong Java, không có gọi bởi tham chiếu. Nếu chúng ta gọi một phương thức đang
    truyền một giá trị, thì đó là gọi bởi giá trị. Các thay đổi đang được thực hiện trong phương thức được gọi,
    sẽ không bị tác động trong phương thức đang gọi.
    Ví dụ về gọi bởi giá trị trong Java
    Trong trường hợp gọi bởi giá trị, giá trị ban đầu sẽ không bị thay đổi. Ví dụ:   
    int data = 50;

    void change(int data)
    {
        data = data + 100; //Cac thay doi se chi o trong bien cuc bo
    }
    public static void main(String[] args) 
    {
        GoiBoiGiaTri op = new GoiBoiGiaTri();

        System.out.println("Truoc khi thay doi " + op.data);
        op.change(500);
        System.out.println("Sau khi thay doi " + op.data);
    }

    Ví dụ khác về gọi bởi giá trị trong Java.
    trong gọi bởi tham chiếu, giá trị ban đầu bị thay đổi nếu chúng ta tạo thay đổi trong phương thức được gọi.
    Nếu chúng ta truyền đối tượng thay cho bất cứ giá trị kiểu gốc nào, thì giá trị ban đầu sẽ bị thay đổi.
    Trong ví dụ này, chúng ta đang truyền đối tượng như alf giá trị. 
    
    vietJack.com
    */
    int data = 50;
    void change(GoiBoiGiaTri op)
    {
        op.data = op.data + 100; //Cac thay doi se la trong bien instatnce
    }
    public static void main(String[] args) 
    {
        GoiBoiGiaTri op = new GoiBoiGiaTri();
        System.out.println("truoc khi thay doi: " + op.data);
        op.change(op); // truyen doi tuong
        System.out.println("Sau khi thay doi: " + op.data);
    }
    
}