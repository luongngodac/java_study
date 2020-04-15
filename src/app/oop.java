package app;

public class Oop {

    /*
    Khái niệm hướng đối tượng (OOP) trong Java
    Object(đối tượng) nghĩa là một thực thể trong thế giới thực, chẳng hạn như
    quả bóng, con bò, ... Lập trình hướng đối tượng là một phương pháp để 
    thiết kế một chương trình bởi sử dụng các lớp và các đối tượng. Nó làm 
    đơn giản hóa việc duy trì và phát triển phần mềm bằng việc cung cấp một số khái niệm: 
    Đối tượng: Một thực thể có trạng thái và hành vi. NÓ có thể mang tính vật lý hoặc logic.
    Lớp: Một tập hợp các đối tượng, nó là một thực thể logic.
    Tính kế thừa: Khi một đối tượng đạt được các thuộc tính và các hành vi của đối tượng cha,
    thì đó là tính kế thừa. Điều này lamf tăng tính tái sử dụng cho code.
    Nó được sử dụng để đạt được tính đa hình tại runtime.
    Tính đa hình: Khi một  tác vụ được thực hiện theo nhiều cách khác nhau được gọi là tính đa hình.
    Tính trừu tượng: Đó là ẩn các chi tiết nội tại và hiển thị tính năng.
    Tính bao đóng: là gắn kết code và dữ liệu cùng nhau vào trong một đơn vị unit đơn.

    
    vietJack.com
    */

    // // vi du ve tao mot doi tuong.
    // public oop(String ten){
    //     // Constructor nay co mot tham so la ten
    //     System.out.println("Ten xe la: " + ten );
    
    // }
    // public static void main(String args[]){
    //     // Lenh sau se tao mot doi tuong la xe cua toi
    //     oop Xecuatoi = new oop( "toyota");
    // }
// vi du nay giai thich cach de truy cap bien instance va cac phuong thuc cua 1 lop.
    int Giaxe;
    public Oop(String ten){
        // Contructor nay co mot tham so la ten.
        System.out.println("Ten xe la : " + ten );
    
    }
    public void setGia( int gia){
        Giaxe = gia;

    }
    public int getGia(){
        System.out.println("Gia mua xe la: " + Giaxe);
        return Giaxe;
    }
    public static void main(String args[]){
        //tao doi tuong
        Oop Xecuatoi = new Oop("Toyouta");
        //goi mot phuong jthuc lop de thiet lap gia xe.
        Xecuatoi.setGia(10000000);
        // Goi mot phuong thuc lop de thiet lap gia xe.
        Xecuatoi.getGia();
        //truy cap bien instance :
        System.out.println("Gia tri bien: " + Xecuatoi.Giaxe);
    }




}