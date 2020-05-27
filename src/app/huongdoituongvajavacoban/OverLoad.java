package app.huongdoituongvajavacoban;
// Chuong trinh nay chay nhờ trên MainClass thôi :D
public class OverLoad {
    /**
      Ví dụ về overload (nạp chồng) phương thức
      Miêu tả vấn đề:
      Cách overload (nạp chồng) phương thức trong Java.
      Giải pháp : Ví dụ sau minh họa cách Overload(nạp chồng) phương thức trong Java
      phụ thuộc vào kiểu và số tham số.


      vietJack 
     */
    int height;
    OverLoad(){
        System.out.println("bricks");
        height = 0;

    }
    OverLoad(int i){
        System.out.println("Building new House that is" + i + "feet tall");
        height = i;
    }
    void info() {
        System.out.println("House is " + height + "feet tall");
    }
    void info(String s){
        System.out.println(s + ": House is" + height + "feet tall");
    }
}
