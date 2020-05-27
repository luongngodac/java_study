package app.huongdoituongvajavacoban;

public class LopObject {
    /*
    Lớp Object trong Java
    Theo mặc định, lớp Object là lớp cha của tất cả các lớp trong Java. Nói cách khác, nó là lớp cao nhất của Java.
    Lớp Object là khá lợi ích nếu bạn muốn tham chiếu bất cứ đối tượng nào có kiểu mà bạn không biết.
    Chú ý rằng biến tham chiếu của lớp cha có thể tham chiếu tới đối tượng lớp con, và được gọi là Upcasting.
    Theo dõi ví dụ sau, có phương thức getObject() mà trả về một đối tượng nhưng có có thể là bất cứ kiểu nào như Employee, Student,...
    Chúng ta có thể sử dụng tham chiếu lớp Object để tham chiếu đối tượng đó. Ví dụ:
    Object obj=getObject(); // Chúng ta khong biết đổi tượng nào sẽ được trả về từ phương thức này.
    Lớp Object cung cấp một số hành vi chung cho tất cả đối tượng, chẳng hạn như đối tượng
    có thể được so sánh, có thể được mô phỏng, có thể được thông báo, ...
    Phương thức của lớp Object trong Java
    Dưới đây liệt kê một số phương thức mà Object cung cấp, đó là:
    Phương thức: public final ClassgetClass()
    Miêu tả: Trả về đối tượng lớp Class của đối tượng này. Lớp Class có thể được sử dụng để lấy metadata của lớp này.
    
    Phương thức: public int hashCode()
    Trả về hashcode cho đối tượng này
    
    Phương thức: public boolean equals(Object obj)
    So sánh đối tượng đã cho với đối tượng này
    
    Phương thức: protected Object clone()throws CloneNotSupportedException
    Tạo và trả về bản sao(bản mô phỏng) của đối tượng này

    Phương thức: public String toString()
    Trả về biểu diễn chuỗi của đối tượng này

    Phương thức: public void notify()
    Thông báo Thread đơn, đợi trên monitor của đối tượng này

    Phương thức: public final void notifyAll()
    Thông báo tất cả Thread, đợi trên monitor của đối tượng này

    Phương thức: public final void wait(longtimeout)throws InterruptedExption
    Làm cho Thread hiện tại đợi trong khoảng thời gian là số mili giây cụ thể, tới khi Thread khác thông báo
    (triệu hồi phương thức notify() hoặc noifyAll())

    Phương thức: public final void wait()throws InterruptedExption
    Làm cho Thread hiện tại đợi trong khoảng thời gian là số mili giây và nano cụ thể, tới khi Thread
    khác thông báo (triệu hồi phương thức notify() hoặc notifyAll())

    Phương thức:protected void finalize()throws Throwable
    Được triệu hồi bởi Garbage Collector trước khi đối tượng bị dọn rác.

    Ps(Post Script): Lớp Object là một lớp mặc định của Java và lớp đặc biệt. Tất cả các class khác trong Java phải kế thừa nó.
    Nhưng để cho gọn chúng ta hay ẩn đi, ví dụ không cần viết class Student extends Object, thực tế là vẫn mặc định extends.
    vietJack.com
    */
    
}