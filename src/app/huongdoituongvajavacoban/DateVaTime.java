package app.huongdoituongvajavacoban;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateVaTime 
{
    /*
    Date và time trong Java.
    Java cung cấp lớp Date có sẵn trong java.util package, lớp này tóm lược ngày tháng và thời gian hiện tại.
    Lớp Date hỗ trwoj hai constructor. Constructor đầu tiên khởi tạo đối tượng với ngày và thời gian hiện tại.
    Date()
    Constructor sau chấp nhận một tham số bằng số mili giây đã trôi qua từ nửa đêm ngày 1/1/1970.
    Date (long milisec)

    Một khi bạn có một đối tượng Date có sẵn, bạn có thể gọi bất kỳ phương thức hỗ trợ
    nào để thao tác với ngày tháng này:
    1.  Phương thức và Miêu tả: boolean after(Dater)
    Trả về true nếu gọi đối tượng Date chứa một ngày mà chậm hơn ngày đã xác định, nếu không là false
    2. Phương thức và Miêu tả:  boolean beefore(Date date)
    Trả về true nếu gọi đối tượng Date chứa một ngày mà sớm hơn ngày đã xác định, nếu không là false.
    3.  Phương thức và Miêu tả: Object clone()
    Sao chép đối tượng Date đang gọi.
    4.  int compareTo(Date date)
    So sánh giá trị đối tượng đang gọi với giá trị đó của date. Trả về 0 nếu các giá trị này là cân bằng.
    Trả về một giá trị âm nếu đối tượng đang gọi là sớm hơn date. Trả về một giá trị dương 
    nếu đối tượng đang gọi chậm hơn date.
    5.  int compareTo(Object obj)
    Tiến hành tương tự như compareTo(Date) nếu đối tượng của lớp Date. Nếu không thì, nó
    cho một ClassCastException.
    6.  boolean equals(Object date)
    Trả về true nếu đối tượng Date đang gọi chứa thời gian và ngày tháng giông như date đã cho,
    nếu không là false.
    7.  longgetTime()
    Trả về số mili giây đã trôi qua từ 1/1/1970.
    8.  int hasCode()
    Trả về một ãm hóa băm (hash code) cho đối tượng đang gọi.
    9.  void setTime(long time)
    Thiết lập ngày tháng và thời gian như time đã cho, mà biểu diễn một time đã trôi qua
    (giá trị mili giây) từ nửa đêm 1/1/1970.
    10. StringtoString()
    Biến đổi đối tượng Date đang gọi thành một chuỗi và trả về kết quả.
    
    Nhận Date và Time hiện tại trong Java
    Thực sự dễ dàng để nhận date và time hiện tại trong Java. Có thể sử dụng một đối tượng
    Date đơn giản với phương thức toString() để in date và time hiện tại như sau:
    public static void main(String[] args) {
        //Khoi tao mot doi tuong Date
        Date date = new Date();

        //hien thi date va time boi su dung toString()
        System.out.println(date.toString());
    }
    
    So sánh Date trong Java.
    Có 3 cách để so sánh hai date trong Java:
    -Có thể sử dụng getTime() để nhận số mili giây đã trôi qua từ nửa đêm 1/1/1970 
    cho cả hai đối tượng và sau đó so sánh hai giá trị này.
    - Có thể sử dụng các phương thức before(), after() và equals(). Bởi vì ngày 
    thứ 12 ở trước ngày thứ 18, ví dụ new Date(99, 2, 12).before(new Date(99, 2, 18)) trả về true.
    Bạn có thể sử dụng phương thức compareTo(), mà được định nghĩa bởi Comparable 
    interface và được thi hành bởi Date.

    Định dạng Date bởi sử dụng SimpleDateFormat trong Java
    SimpleDateFormat là một lớp cố định (cụ thể) để ddinhjdangj và parese các date theo một phương thức
    nhạy cảm với locale. SimpleDateFormat cho phép bạn bắt đầu bởi việc chọn bất kỳ pttern 
    đã được định nghĩa bởi người dùng cho định dạng date-time. Ví dụ:
    
    public static void main(String[] args) {
        
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("E yyy.MM.dd 'at' hh:mm:ss a zzz");

        System.out.println("Date hien tai: " + format.format(date));
    }
    
    Mã hóa định dạng SimpleDateFormat trong Java.
    Để xác định định dạng thời gian, sử dụng một chuỗi time mãu. Trong pattern này, tất cả chữ cái ASCII được dự
    trữ(dành riêng) như là các ký tự Pattern, mà được định nghĩa như sau:
    Ký tự           Miêu tả  vd: 
    G   Tên mệnh danh của thời đại  AD
    y   năm trong dạng 4 chữ số     2001
    M   Tháng trong năm             July or 07
    d   Ngày trong tháng            10
    h   Giờ trong dạng A.M/P.M(1~12) 12
    H   Giờ trong ngày 0-23         22
    m   Phút trong giờ             30
    s   Giây trong phút             55
    S   Số mili giây                234
    E   Ngày trong tuần             Tuesday 
    D   Ngày trong năm              360
    F   Ngày của tuần trong tháng   2(Web thứ hai trong July)
    w   Tuần trong năm              40
    W   Tuần trong tháng            1
    a   A.M/P.M                     PM
    k   Giờ trong ngày (1~24)       24
    K   Giờ dạng A.M/P.M (0~11)     10
    z   Time zone                   Esatern Standard Time.
    '   Dãy thoát cho văn bản       Dấu giới hạn
    "   Trích dẫn đơn               '

    Định dạng Date sử dụng printf trong Java
    Định dạng date và time có thể được thực hiên bằng một cách đơn giản bởi sử dụng phương thức
    printf trong Java. Bạn sử dụng một định dạng hai chữ cái, bắt đầu với t và kết thúc với một trong
    các ký tự trong bảng dưới. Ví dụ:
    public static void main(String[] args) {
        //khoi tao mot doi tuong Date.
        Date date = new Date();

        //Hien thi date va time boi su dung toString()
        String string = String.format("Date hien tai/Time: %tc", date);

        System.out.println(string);
    }

    Nó sẽ là khá ngờ nghệch nếu bạn phải cung cấp cho date nhiều time để định dạng mỗi phần. 
    Với lý do này, một chuỗi định dạng có thể chỉ dẫn chỉ mục của tham số để được định dạng.
    Chỉ mục phải ngay lập tức theo sau bởi dấu % và nó phải được kết thúc bởi một dấu $. Ví dụ:
    public static void main(String[] args) {
        //Khoi tao mot doi tuong Date
        Date date = new Date();

        //Hien thi date va time boi su dung toString()
        System.out.printf("%1$s %2$tB %2$td, %2$tY", "Date la: ", date);
    }

    Bạn cũng có thể sử dụng ký hiệu <. Nó chỉ dẫn tham số tương tự như trong định dạng trước.
    Ví dụ:
    public static void main(String[] args) {
            //Khoi tao mot doi tuong Date
            Date date = new Date();

            //Hien thi date va time boi su dung toString()
            System.out.printf("%1$s %2$tB %2$<te, %2$<tY", "Date la: ", date);
        }

    Các ký tự biến đổi Date và Time trong Java
    Ký tự       Miêu tả             Ví dụ
    c       Ngày tháng đầy đủ       Mon May 04 09:51:52 CDT 2009
    F   Định dạng ngày ISO 8601     2004-02-09
    D   Định dạng ngày theo U.S.(mothe/day/year)    02/09/2004
    T   Thời gian định dạng 24 giờ  18:05:19
    r   Thời gian dạng 12 giờ       05:05:05 am
    R   Thời gian dạng 24 giờ, không có giây    18:04
    Y   Số năm 4 chứ số (bắt đầu từ 0)  2004
    y   2 số cuối của năm (bắt đầu từ 0)    04
    C   2 số đầu của năm (bắt đầu từ 0)     20
    B   Tên tháng đầy đủ                    February 
    b   Tên tháng viết tắt                  Feb
    m   Tháng dạng 2 chứ số (bắt đầu từ 0)  02
    d   Tháng dạng 2 chứ số (bắt đầu từ 0)  03
    e   Ngày dạng hai chữ số(không bắt đầu từ 0)    9
    A   Tên ngày trong tuần đầy đủ          Monday
    a   Tên ngày trong tuần viết tắt        Mon
    j   Ngày trong năm dạng 3 chữ số (bắt đầu từ 0) 069
    H   Giờ dạng hai chữ số (bắt đầu từ 0), giữa 0 và 23    18
    k   Giờ dạng hai chữ số (không băt đầu từ 0), giữa 0 và 23  18
    l   Giờ dạng hai chữ sô (bắt đầu từ 0) giữa 0 và 12
    I   Giờ dạng hai chữ số (không bắt đầu từ 0), giữa 0 và 12  05
    M   Phút định dạng (bắt đầu từ 0)       05
    S   Giây dạng hai chữ số (bắt đầu từ 0) 19
    L   Mili giây dạng ba chữ số (bắt đầu từ 0) 047
    N   Nano giây đạng 9 chữ số (bắt đầu từ 0)  047000000
    P   Sáng hoặc chiều dạng chữ hoa        PM
    p   Sáng hoặc chiều dạng chữ thường     pm
    z   Offset dạng số RFC 822 từ GMT       -0800
    Z   Time zone                           PST
    s   Số giây từ 1/1/1970 00:00:00 GMT    1078884321
    Q   Số mili giây từ 1/1/1970    GMT     1078884319047

    Có một số lớp hữu ích khác liên quan tới Date và time. (Java Standard Documentation).

    Parse các String vào trong các Date trong Java.
    Lớp SimpleDate Format có một số phương thức bổ sung, đáng kể nhất là parse(),
    mà parse một chuỗi theo chuỗi định dạng được lưu trữ trong đối tượng SimpleDate Format đã cho. Ví dụ:
    public static void main(String[] args) {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");

        String input = args.length == 0 ? "1918-11-11" : args[0];

        System.out.println(input + " Duoc parse thanh dang ");

        Date t;

        try{
            t = ft.parse(input);
            System.out.println(t);
        } catch (ParseException e) {
            System.out.println("Khong the parse duoc boi su dung " + ft);
        }
    }
    
    Đình chỉ chốc lát (sleep for a while) trong Java
    Có thể ngừng bất kỳ chu kỳ thời gian nào từ một mili giây tới một vòng đời lifetime của máy tính.
    Ví dụ, chương trình sau sẽ đình chỉ trong 10 giây:
    public static void main(String[] args) {
        try {
            System.out.println(new Date() + "\n");
            Thread.sleep(5*60*60);//dang dinh chi 18 giay.
            System.out.print(new Date() + "\n");
        } catch (Exception e) {
            System.out.println("Nhan mot exception!");
            //TODO: handle exception
        }
    }
    Đo lường thời gian đã trôi qua trong Java
    Đôi khi, bạn có thể cần đo lường thời gian tại một thời điểm với giá trị mili giây.
    Chúng ta viết lại ví dụ trên như sau:
    public static void main(String[] args) {
        try {
            long start = System.currentTimeMillis();
            System.out.println(new Date() + "\n");
            Thread.sleep(5*60*10);
            System.out.println(new Date() + "\n");
            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println("Khac nhau la: " + diff);
        } catch (Exception e) {
            System.out.println("Nhan mot exception!");
            //TODO: handle exception
        }
    }
    Lớp GregorianCalendar trong Java
    GregorianCalendar là một sự bổ sung cụ thể của một lớp Calendar mà thực hiện lịch
    Gregorian chuẩn. Ở đây không đề cập lớp Calendar trong loạt bài này, bạn có thể
    tìm hiểu nó trong văn kiện chuẩn của Java.
    Phương thức getInstance() của Calendar trả về một GregorianCalendar được khởi tạo với date và time hiện
    tại theo localde và time zone mặc định.
    GregorianCalendar định nghĩa hai trường: AD và BC. Chúng biểu diễn hai thời đại
    được định nghĩa bởi GregorianCalendar.
    Cũng có một số constructor cho các đối tượng GregorianCalendar:
    1   GregorianCalendar()
    Xây dụng một GregorianCalendar mặc định bởi sử dụng time hiện tại trong time zone
    mặc định với locale mặc định
    2   GregorianCalendar(int year, int month, int date)
    Xây dựng một GregorianCalendar với thiết lập date đã cho trong time zone mặc định với locale mặc định.
    3.  GregorianCalendar(int year, int month, int date, int hour, int minute)
    Xây dựng một GregorianCalendar với thiết lập date và time đã cung cấp cho time zone mặc định với locale mặc định.
    4.  GregorianCalendar(int year, int month, int date, int hour, int minute, int second)
    Xây dựng một GregorianCalendar với thiết lập date và time đã cung caapscho time zone mặc định với locale mặc định
    5.  GregorianCalendar(Locale aLocale)
    Xây dựng một GregorianCalendar trên cơ sở time hiện tại trong time zone mặc định
    với locale đã cho.
    6.  GregorianCalendar(TimeZone zone)
    Xây dựng một GregorianCalendar trên cơ sở tỉme hiện tại trong time zone đã cung cấp 
    với locale mặc định.
    7.  GregorianCalendar(TimeZone zone, Locale aLocale)
    Xây dựng một GregorianCalendar trên cơ sở time hiện tại trong time zone đã cung cấp với locale đã cho.
    
    Dưới đây liệt kê một số phương thức hỗ trợ hữu ích được cung cấp bởi lớp GregorianCalendar trong Java:
    1.  void add(int field, int amount)
    Thêm số time đã xác định tới trường time đã cung cấp, dựa trên các qui tắc của calendar đó.
    2.  protected void computeFields()
    Biến đổi UTC dạng mili giây thành các giá trị trường time.
    3.  protected void computeTime()
    Override các giá trị biến đổi trường time thành UTC dạng mili giây
    4.  bollean equals(Object obj)
    So sánh GregorianCalendar với một tham chiếu đối tượng
    5.  int get(int field)
    Nhận giá trị cho một trường time đã cung cấp.
    6.  int getActualMaximum(int field)
    Trả về giá trị lớn nhất mà trường này có thể có, đã cung cấp date hiện tại.;
    7.  int getActualMinimum(int field)
    Trả về giá trị nhỏ nhất mà trường này có thể có, đã cung cấp date hiện tại.
    8.  int getGreatestMinimum(int field)
    Trả về giá trị tối thiểu cao nhất cho trường đã cung cấp nếu nó biến đổi.
    9.  Date getGregorianChange()
    Nhận date thay đổi theo Gregorian Calendar
    10. int getLeastMaximum(int field)
    Trả về giá trị tối đa thấp nhát cho trường đã cung cấp nếu nó biến đổi.
    11. int getMaximum(int field)
    Trả về giá trị tối đa cho trường đã cung cấp
    12. Date getTime()
    Trả về giá trị tối đa cho trường đã cung cấp.
    13. long getTimeInMillis()
    Nhận time hiện tại của Calendar này dạng long
    14. TimeZone getTimeZone()
    Nhận time zone.
    15. int getMinimum(int field)
    Trả về giá trị tối thiểu cho trường đã cung cấp
    16. int hashCode()
    Override mã hóa băm.
    17. boolean isLeapYear(int year)
    Xác định nếu năm đã cho là một leap year
    18. void roll(int field, boolean up)
    Cộng hoặc trừ một đơn vị đơn của time trên trường time đã cho mà không thay đổi
    các trường lớn hơn.
    19. void set(itn field, int value)
    Thiết lập trường time với giá trị đã cho.
    20. void set(int year, int month, int date)
    Thiết lập các giá trị cho các trường year, month, và date.
    21. void set(int year, int month, int date, int hour, int minute)
    Thiết lập các giá trị cho các trường year, month, date, hour và minute.
    22. void set(int year, int month, int date, int hour, int minute, int second)
    Thiết lập các giá trị cho các trường year, month, date, hour, minute, second.
    23. void setGregorianChange(Date date)
    Thiết lập ngày thay đổi theo GregorianCalendar
    24. void setTime(Date date)
    Thiết lập time hiện tại của Calendar này với Date đã cho
    25. void setTimelnMillis(long millis)
    Thiết lập time hiện tại của Calendar này từ giá trị long đã cho.
    26. void setTimeZone(TimeZone value)
    Thiết lập time zone với giá trị time zone đã cho.
    27. String toString()
    Trả về một biểu diễn chuổi của calendar này
    Ví dụ:
    vietJack.com
    */
    public static void main(String[] args) {
        String months[] = {
            "Jan", "Feb", "Mar", "Apr",
            "May", "Jun", "Jul", "Aug",
            "Sep", "Oct", "Nov", "Dec"
        };

        int year;
        //Tao mot Gregorian calendar duoc khoi tao
        //voi date va time hien tai trong locale va timezone mac dinh
        GregorianCalendar gCalendar = new GregorianCalendar();
        // Hien thi thong tin date va time hien tai.
        System.out.print("Date: " );
        System.out.print(months[gCalendar.get(Calendar.MONTH)]);
        System.out.print(" " + gCalendar.get(Calendar.DATE) + " " );
        System.out.println(year = gCalendar.get(Calendar.YEAR));
        //
        System.out.print("Time: " + gCalendar.get(Calendar.HOUR) + ":"
            + gCalendar.get(Calendar.MINUTE) + ":" + gCalendar.get(Calendar.SECOND));

        //Kiem tra xem year hien tai co phai la leap year khong(nam nhuan)
        if(gCalendar.isLeapYear(year)){
            System.out.println("\n Year hien tai la mot leap year");
        }
        else {
            System.out.println("\n Year hien tai khong la mot leap year");
        }
    }   
    

    
    



}