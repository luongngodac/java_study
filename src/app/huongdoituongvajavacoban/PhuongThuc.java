package app.huongdoituongvajavacoban;

public class PhuongThuc {

    /*
    Một phương thức trong Java là một tập hợp các lệnh mà được nhóm 
    cùng với nhau để thực hiện một hành động. Ví dụ khi bạn gọi phương thức
    System.out.print, hệ thống thực sự thực thi một vài lệnh để hiển thị
    một thông báo trên bàn điều khiển console
    Bây giờ, bạn sẽ học cách tạo các phương thức cho riêng bạn với hoặc 
    không với các giá trị trả về, gọi một phương thức hoặc không với các  tham số,
    tải các phuowgn thức sử dụng cùng tên, và áp dụng phương thức trừu
    tượng trong thiết kế chương trình.
    Tạo phương thức trong Java
    Xem xét ví dụ sau để giải thích cú pháp của một phương thức
    //public static int tenPhuongThuc(int a, int b)
    // {
    //    //phần thân của phương thức
    //}
    Ở đây: public static: Là modifier; int là kiểu trả về; tenPhuongThuc: Tên phương thức
    a,b: các tham số chính thức.
    int a, int b: Danh sách các tham số.
    Các phương thức cũng còn được biết như các Procedure(thủ tục) hoặc Function(hàm):
    Procedure: Chúng không trả về bất kỳ giá trị nào.
    Function: Chúng trả về giá trị.
    Sự định nghĩa phương thức bao gồm một header và phần thân tương ứng.
    Tương tự sau:
    // modifier kieuTraVe tenPhuongThuc (Danh sach tham so)
    // {
    //     //Thân phương thức
    // }
    Cú pháp trên bao gồm: modifier: Nó định nghĩa kiểu truy cập của phương thức và nó 
    là tùy ý để sử dụng.
    kieuTraVe: Phương thức có thể trả về một giá trị.
    tenPhuongThuc: Đây là tên phương thức.
    Danh sach tham so : Danh sách các tham số, nó là kiểu, thú tự, và số tham số của một
    phương thức. Đây là tùy ý, phương thức có thể không chứa tham số nào.
    Thân Phương Thức: Phần thân phương thức định nghĩa những gì phương thức đó thực hiện các  lệnh

    vietJack.com
    */



    // //Ví dụ code trả về số nhỏ nhất của hai số 
    // public static int minFunction(int n1, int n2)
    // {
    //     int min;
    //     if (n1 > n2)
    //         min = n2;
    //     else    
    //         min = n1;
    //     return min;
    // }
    // public static void main(String args[])
    // {
    //     System.out.println(minFunction(19,13));
    // }
    /*
        Gọi phương thức trong Java.
        Để sử dụng một phương thức, nó nên được gọi. Có hai cách để gọi một phương
        thức, ví dụ: phương thức trả về một giá trị hoặc phương thức không trả về 
        giá trị nào.
        Tiến trình gọi phương thức là đơn giản. Khi một chương trình gọi phương thức
        điều khiển chương trình truyền tín hiệu tới phương thức được gọi.
        Phương thức được gọi này sau đó trả về điều khiển tới caller trong hai điều kiện, khi:
            Lệnh return được thực thi.
            tiến tới dấu ngoặc đóng ở cuối phương thức.
        Phương thức trả về void được xem như là gọi tới một lệnh. Xét ví dụ:
        // System.out.println(" Đây là VietJack.com!");
        Ví dụ sau minh họa về phương thức trả về giá trị:
        // int result = sum(6,9);
    Từ khóa void trong Java:
        Từ khóa void cho phép chúng ta tạo các phương thức mà không trả về giá 
        trị nào. Ở đây, trong ví dụ sau, chúng tat xem xét một phương thức void 
        là Phương thức RankPoints. Phương thức này là một  phương thức void mà không trả về bất kỳ giá trị nào. Gọi tới một phương 
        thức void phải là lệnh, ví dụ như phương thức RanhkPoints(225.7); 
        Nó là một lệnh java mà kết thúc với dấu chấm phẩy như dưới đây:
    */
    // public static void main(String[] args)
    // {
    //     methodRankPoints(225.7);
    // }
    // public static void methodRankPoints(double points)
    // {
    //     if(points >= 202.5)
    //     {
    //         System.out.println("Rank:A1");
    //     }
    //     else    
    //         if(points >= 122.4)
    //         {
    //             System.out.println("Rank:A2");
    //         }
    //         else
    //         {
    //             System.out.println("Rank:A3");
    //         }
    // }
    
    /*
    Truyền các tham số bởi giá trị trong Java.
    Trong khi làm việc dưới tiến trình gọi, các tham số được truyền.
    Điều này nên trong cùng thứ thự như các tham số tương ứng của chúng trong thức.\
    Các tham số có thể được truyền bởi giá trị hoặc bởi tham chiếu.
    Truyền các tham số bởi giá trị nghĩa là gọi một phương thức với một tham số.
    Thông qua điều này, giá trị tham số được truyền tới tham số.
    Ví dụ: Chương trình sau minh họa việc truyền tham số bởi giá trị trong Java.
    Các giá trị của các tham số vãn tồn tại giống như vậy cho dù sau lời gọi phương thức đó.

    */
    // public static void main(String[] args)
    // {
    //     int a = 30;
    //     int b = 45;
    //     System.out.println("Truoc khi trao doi, gia tri cua a = " + 
    //     a + " va b = " + b);
    //     //Trieu hoi phuong thuc hamTraoDoi
    //     hamTraoDoi(a,b);
    //     System.out.println("\n**Bay gio, Truoc va Sau khi trao doi, cac gia tri se giong nhau nhu o duoi day**: ");
    //     System.out.println("Sau khi trao doi, a = " + a + " va b = " + b);

    // }
    // public static void hamTraoDoi(int a, int b)
    // {
    //     System.out.println("Truoc khi trao doi (ben trong phuong thuc), a = " + a 
    //     + "va b = " + b);
    //     //Trao doi gia tri cua hai so.
    //     int c = a;
    //     a = b;
    //     b = c;
    //     System.out.println("Sau khi trao doi (ben trong phuong thuc), a = " + a
    //      + " va b = " + b);
    // }

    /*
    Nạp chồng phương thức (Method overloading) trong Java.
    Khi một lớp có hai hoặc nhiều phương thức cùng tên nhưng khác nhau về tham sô, nó được biết đến
    như là Phương thức overloading. Nó khác với Overriding. Trong overriding, một phương thức có một
    phượng phức khác cùng tên, kiểu, số tham số, ...
    Bạn xem ví dụ sau trước khi tìm các số nhỏ nhất trong kiểu integer. Nếu
    chúng ta muốn tìm số nhỏ nhất ở kiểu double. Thì khi đó khái niệm về Overloading sẽ được giới
    thiệu để tạo hai hoặc nhiều phương thức cùng tên nhưng khác nhau về tham số.
    Ví dụ sau đây giải thích:
    Nạp chồng phương thức làm chương trình có thể đọc được. Ở đây, hai phương
    thức được cung cấp cùng một tên nhưng khác tham số. Số nhỏ nhất từ kiểu integer và kiểu double là kết quả.

    // */
    // public static void main(String[] args)
    // {
    //     int a = 11; 
    //     int b = 6;
    //     double c = 7.3;
    //     double d = 9.4;
    //     int result1 = minFunction(a, b);
    //     //cung ten ham voi tham so khac nhau
    //     double result2 = minFunction(c, d);
    //     System.out.println("Gia tri nho nhat = " + result1);
    //     System.out.println("Gia tri nho nhat = " + result2);
    // }
    // //cho integer.
    // public static int minFunction(int n1, int n2)
    // {
    //     int min;
    //     if (n1 > n2)
    //         min = n2;
    //     else
    //         min = n1;
    //     return min;
    // }
    // //cho double:
    // public static double minFunction(double n1, double n2)
    // {
    //     double min;
    //     if (n1 > n2)
    //         min = n2;
    //     else    
    //         min = n1;
    //     return min;
    // }

    /*
        Sử dụng các tham số dòng lệnh (command-line) trong Java
        Đôi khi bạn muốn truyền thông tin vào trong một chương trình khi bạn chạy nó.
        Điều này được thực hiện bởi việc truyền tham số dòng lệnh tới phương thức main().
        Một tham số dòng lệnh là thông tin mà trực tiếp theo sau tên của chương trình  trên dòng lệnh khi 
        nó được thực thị. Truy cập các tham số dòng lệnh bên trong một chương trình Java là khá dễ dàng.
        Chúng được lưu trữ  như là các chuỗi trong mảng String đã truyền tới main().
        Ví dụ:
        Chương trình sau hiển thị tất cả tham số dòng lệnh mà được gọi tới.( dang error)
    */
    // public static void main(String[] args)
    // {
    //     for(int i=0; i < args.length; i++)
    //     {
    //         System.out.println("args[" + i + "]: " + args[i]);
    //     }
    // }
    // java PhuongThuc this is a commad line 200 -100

    /*
        Construc trong Java
        Một constructor khởi tạo một đối tượng khi nó được tạo. Nó có cùng tên với
        lớp của nó và cú pháp tương tự như một phương thức. Tuy nhiên
        các constructor không có kiểu trả về rõ ràng.
        Một nét đặc trưng là, bạn sẽ sử dụng một constructor để cung cấp các giá trị khởi
        tạo tới các biến instance được định nghĩa bởi lớp, hoặc để thực thi bất kỳ thủ tục khởi đầu
        nào khác được yêu cầu để tạo một đối tượng theo mãu.
        Tất cả các lớp đều có các constructor, dù bạn có hay không định nghĩa nó,
        bởi vì Java tự động cung cấp một constructor mặc định mà khởi tạo tất cả biến
        tahnhf viên về zero. Tuy nhiên, một khi bạn định nghĩa constructor cho riêng bạn,
        thì constructor mặc định sẽ không còn được sử dụng nữa.
        Ví dụ đơn giản mà sử dụng một constructor trong Java.
        Thường thì, bạn sẽ cần một constructor mà chấp nhận một hoặc nhiều hơn tham số.
        Các tham số được thêm tới một constructor theo cách tương tự như chúng 
        được thêm tới một phương thức, vừa khai báo chúng bên trong dấu ngoặc
        đơn ở sau tên của constructor.

    */
    //Ví dụ đơn giản mà sử dụng một constructor trong Java.1
    // // Ban se goi constructor de khoi tao cac doi tuong nhu sau:
    // public static void main(String args[])
    // {
    //     MyClass t1 = new MyClass();
    //     MyClass t2 = new MyClass();
    //     System.out.println(t1.x + " " + t2.x);
    // }
    //Ví dụ đơn giản mà sử dụng một constructor trong Java2
    // public static void main(String args[])
    // {
    //     MyClass t1 = new MyClass( 10 );
    //     MyClass t2 = new MyClass( 20 );
    //     System.out.println(t1.x + " " + t2.x);
    // }

    /*
    Các tham số biến (var - args) trong Java
    JDK 1.5 cho bạn khả năng truyền một số các tham số biến cùng kiểu tới một
    phương thức. Tham số trong phương thức được khai báo như sau:
    tenKieu... tenThamSo.
    Trong khai báo phương thức này, bạn xác định kiểu được cho theo sau bởi một 
    ellipsis(...). Chỉ một tham số độ dài biến có thể được xácđịnh trong một 
    phương thức, và tham số này phải là tham số cuối cùng. Bất kỳ tham số thông
    thường nào phải đặt trước nó.
    Ví dụ:
    */
    public static void main(String args[])
    {
        //goi phuong thuc voi bien args.
        printMax(34, 3, 3, 2, 56.5);
        printMax(new double[]{1, 2, 3});
    }
    public static void printMax( double ... numbers)
    {
        if (numbers.length == 0)
        {
            System.out.println("khong co tham so nao duoc truyen.");
            return;
        }
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] > result)
                result = numbers[i];
        System.out.println("Gia tri max la: " + result);
    }

    /*
    Phương thức finalize() trong Java
    Nó là có thể để định nghĩa một phương thức mà sẽ được gọi ngay trước khi
    hủy một đối tượng bởi Garbage Collector. Phương thức này được gọi là 
    finalize(), nó có thể được sử dụng để chắc chắn rằng một đối tượng hoàn 
    toàn kết thúc.
    Ví dụ, bạn có thể sử dụng finalize() để đảm bảo rằng một open file mà sở hữu bởi
    một đối tượng nào đó đã được đóng.
    Để thêm một finalizer tới một lớp, đơn giản định nghĩa phương thức finalize().java 
    runtime gọi phương thức đó bất cứ khi nào nó chuẩn bị để tái chế một đối tượng của lớp đó.
    Bên trong phương thức finalize(), bạn sẽ xác định những hành động nào phải được thực hiện
    trước khi một đối tượng phá hủy.
    Phương thức finalize() có form chung là:
    protected void finalize()
    {
        //tại đây là phần code kết thúc.

    }
    Ở đây từ khóa protected là một specifier mà ngăn cản việc truy cập
    tới finalize() bởi code được đinh nghãi bên ngoài lớp của nó.
    Nghĩa là, bạn không thể biết khi nào hoặc lúc nào finalize() được thực thi.
    Ví dụ, nếu chương trình của bạn kết thúc trước khi Garbage Collection xuất hiện, finalize ()
    sẽ không thực thi.
    */
}


// //Ví dụ đơn giản mà sử dụng một constructor trong Java.1
// class MyClass
// {
//     int x;
//     //Sau day la constructor.
//     MyClass()
//     {
//         x =10;
//     }
// }

// //Ví dụ đơn giản mà sử dụng một constructor trong Java2
// class MyClass{
//     int x;
//     //Sau day la constructor
//     MyClass(int i)
//     {
//         x = i;
//     }
// }
