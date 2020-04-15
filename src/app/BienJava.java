package app;

public class BienJava {
    //ví dụ: ở đay tuổi là biến local, nó được định nghĩa bên trong phương thức tuoiCon()
    // và phạm vi của nó được gới hạn chỉ trong phương thức này.
    public void tuoiCon(){
        int tuoi = 0;
        tuoi = tuoi + 10;
        System.out.println("Tuoi con la: " + tuoi);
    }
    public static void main(String args[]){
        BienJava test = new BienJava();
        test.tuoiCon();
    }




    /*
    ví dụ về khai báo và khởi tạo biến hợp lệ trong Java:
    int a, b, c; // khai báo ba biến kiểu int là a, b, c.
    int a = 5, b =7; //ví dụ về khởi tạo biến.
    byte A = 11; // khởi tạo một biến kiểu byte tên là A.
    double pi = 3.14159; // khai báo và gắn một giá trị của PI,
    char nam = 'b' // biến nam được khởi tạo với giá trị 'b'.
    Biến local trong Java:
    Các biến được khai báo trong các phương thức, constructor, hoặc khối. 
    Các biến được tạo khi phương thức, constructor hoặc khối được nhập và biến bị hủy
    khi phương thức, constructor hoặc khối kết thúc.
    Chỉ định truy cập (access modifier) có thẻ không được sử dụng cho 
    các biến local.
    Các biến local chỉ nhìn thấy trong phương thức, constructor hoặc khối được khai báo.
    Các biến local được thực thi nội bộ.
    Không có giá trị mặc định nào cho các biến local, vì thế các biến local nên được khai báo và 
    một giá trị khởi tạo nên được gán trước khi sử dụng.

    
    */
}