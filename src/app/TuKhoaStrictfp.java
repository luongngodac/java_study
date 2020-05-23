package app;

public class TuKhoaStrictfp 
    {
    /*
    Từ khóa strictfp trong Java
    Từ khóa strictfp bảo đảm rằng bạn sẽ lấy cùng kết quả trên mỗi nền tảng
    nếu bạn thực hiện các hoạt động trong giá trị số thực dấu chấm động. Phần sau dấu thập phân Precision
    có thể khác nhau giữa các nền tảng, và đó là lý do tại sao ngôn ngữ lập trình Java cung cấp từ khóa strictfp,
    để mà bạn có thể nhận được cùng kết quả trên mỗi nền tảng. Vì thế, bây giờ bạn sẽ có sự điều khiển tốt hơn với các
    phép toán về số thực.
    Code hợp lệ cho từ khóa strictfp trong Java
    Từ khóa strictfp có thể được áp dụng trên các phương thức, các lớp và interface.
    strictfp class A{} //strictfp ap dung tren lop
    //#
    strictfp intercface M{} // strictfp ap dung tren interface
    #
    class A
    {
        strictfp void m(){}//strictfp ap dung tren phuong thuc.
    }
    Code không hợp lệ cho từ khóa strctfp trong Java.
    Từ khóa strictfp không thể được áp dụng trên các phương thức trừu tượng,
    các biến hoặc các constructor.
    class B
    {
        strictfp abstract void m(); //su dung to hop khong hop le cua cac modifier.
    }

    class B
    {
        strictfp int data = 10; // modifier strictfp khong duoc phep o day
    }
     
    class B
    {
        strictfp B(){}  // modifier strictfp khong duoc cho phep o day.
    }

    */    
}