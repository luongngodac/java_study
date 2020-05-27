package app.huongdoituongvajavacoban;

public class BienJava2 {
    //Bien instance này là nhìn thấy cho bất kỳ lớp con nào.
    // public String ten;
    // //Biến học phí là chỉ nhìn thấy cho lớp Student.
    // private double hocphi;
    // //Biến tên được gán trong constructor 
    // public BienJava2(String tenSV){
    //     ten = tenSV;
    // }
    // //Biến học phí được gán một giá trị.
    // public void setHocPhi(double hp){
    //     hocphi = hp;
    // }

    // //Phương thức này in chi tiết về Student.
    // public void inThongTin(){
    //     System.out.println("Họ và tên: " + ten);
    //     System.out.println("Học phí: " + hocphi);
    // }
    // public static void main (String args[])
    // {
    //     BienJava2 sv1 = new BienJava2("Nguyễn Văn Đoàn");
    //     sv1.setHocPhi(4000);
    //     sv1.inThongTin();
    // }
    /*
    Các biến Class/ static trong Java: 
    Các biến class cũng được biết như là các biến static được khai báo với từ khóa 
    static trong một lớp, nhưng ở ên ngoài một phương thức, constructor hoặc một khối.
    Sẽ chỉ có môt bản sao của mỗi biến class cho mỗi lớp, bất chấp việc bao nhiêu đối tượng được tạo từ nó.
    các biến static hiếm khi được sử dugnj, ngoài việc được khai báo như là các hằng số.
    Các hằng số là các bieens mà được khai báo như là các biến static, biến final, biến chung/riêng.
    Các biến hằng số không bao giờ thay đổi từ giá trị khởi tạo của chúng
    Các biến static được lưu giữ trong bộ nhớ static.
    Các biến static được tạo khi chương trình bắt đầu và bị huyer khi chương trình kết thúc
    Tính nhìn thấy là tương tự như các thuộc tính. Tuy nhiên, hầu hết static được khai báo 
    chung khi chúng phải là có sẵn cho việc sử dụng của lớp.
    Giá trị mặc định giống với các thuộc tính. Với các số, giái trị mặc định là 0; với
    boolean là false, với đối tượng là null. Các giá trị có thể được gán trong khi khai báo 
    hoặc trong constructor. Ngoài ra, các giá trị có thể được gán trong các khối khởi tạo static đặc biệt
    ... ví dụ:

    */
       // Bien hocphi la mot bien private static
    private static double hocphi;
    private static final String FACULTY = " Khoa IT";
    public static void main (String args[]){
        hocphi = 4000;
        System.out.println(FACULTY + "hoc phi trung binh: " + hocphi);
    }
}