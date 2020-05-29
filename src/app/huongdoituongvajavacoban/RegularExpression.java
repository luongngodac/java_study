package app.huongdoituongvajavacoban;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    /*
    Regular Expression trong Java
    Java cung cấp java.util.regix package cho pattern so khớp với các Regular Expression. Các
    Regular Expression trong Java là tương tự đối với ngôn ngữ lập trình Perl.
    Một Regular Expression là một dãy liên tục của các ký tự đặc biệt mà giúp bạn so khớp hoặc tìm kiếm
    chuỗi hoặc tạp hợp các chuỗi khác, sử dụng một cú pháp riêng biệt trong một pattern.
    Chúng có thể được sử dụng để tìm, chỉnh sửa và theo tác text và dữ liệu.
    
    Gói java.util.regex chủ yếu chứa 3 lớp sau:
    Lớp Pattern: Một đối tượng Pattern là một phép biểu diễn được biên dịch của một 
    Regular Expression. Lớp Pattern không cung cấp một public constructor nào. Để tạo một pttern, bạn
    đầu tiên phải gọi một trong các phương thức biên dịch static chung của nó, mà sau đó sẽ trả vè một đốitượng Pattern.
    Những phương thức này chấp nhận một Regular Expression như là tham số đầu tiên.
    Lớp Matcher: Một đối tượng Matcher là phương tiện mà thông dịch pattern và thực hiện so khớp 
    các hoạt động với một chuỗi đầu vào. Như lớp Pattern, Matcher không định nghĩa một 
    public contructor nào. Bạn nhận được một đối tượng Matcher bằng việc gọi phương thức matcher 
    trên một đối tượng Pattern. 
    PatternSyntaxException: Một đối tượng PatternSyntaxException là một exception(ngoại lệ)
    chưa được kiểm tra mà chỉ dẫn một lỗi cú pháp trong mẫu Regular Expression .

    Capture các Group trong Java
    Capturing Groups là một cách coi nhiều ký tự như là một đơn vị đơn. Chúng được tạo bằng việc xác định vị trí
    của các ký tựu để được nhóm vào trong một tập hợp các dấu ngoặc đơn chứa các chữ cái là
    "d", "o", "g".
    Capturing Groups được đánh số bởi việc tính toán số dấu ngoặc đơn mở từ trái quá phải. Ví dụ, trong Expression ((A)(B(C))) có 4 nhóm:
    ((A)(B(C)))
    (A)
    (B(C))
    (C)

    Để tìm bao nhiêu group có mặt trong Expression đó, bạn gọi phương thức groupCount trên một đối tượng Matcher. Phương thức groupCount trả về một int minh họa
    số Capturing Groups có mặt trong mẫu của đối tượng Matcher.
    Cũng có một group đặc biệt, là group 0, mà luôn luôn biểu diễn toàn bộ expression. Group này không được bao gồm
    trong kết quả của phương thức groupCount.
    Ví dụ minh họa cách để tìm một chuỗi chữ số từ chuỗi chữ - số đã cho:
    public static void main(String[] args) {
        //String để được quét để tìm pattern.
        String line = "VietJack xin chao cac ban. Day la vi du ve Regex! 1000 0USD";
        String pattern = "(.*)(\\d+)(.*)";
        
        //Tao mot doi tuong Pattern
        Pattern r = Pattern.compile(pattern);

        //Tao doi tuong matcher.
        Matcher m = r.matcher(line);
        if (m.find( )){
            System.out.println("Gia tri duoc tim thay la: " + m.group(0));
            System.out.println("Gia tri duoc tim thay la: " + m.group(1));
            System.out.println("Gia tri duoc tim thay la: " + m.group(2));            
        } else {
            System.out.println("Khong co ket noi");
        }
    }

    Cú pháp cho Regular Expression trong Java
    Bảng dưới đây liệt kê tất cả các cú pháp siêu ký tự cho Regular Expression có sẵn trong Java.
    Subxpression        So khớp
    ^               So khớp với phần bắt đầu của dòng (line)
    $   So khớp với phần cuối cùng của dòng
    .   So khớp với bất kỳ ký tự đơn nào ngoại trừ newline (dòng mới). Sử dụng tùy
        chọn m cũng cho phép nó so khớp với newline(dòng mới)
    [...]   So khớp với bất kỳ ký tự đơn nào trong dấu ngoặc vuông
    [^...]  So khớp với bất kỳ ký tự đơn nào không trong dấu ngoặc vuông.
    \A      Phần bắt đầu của cả chuỗi
    \z      Phần cuối của cả chuỗi
    \Z      Phần cuối của cả chuỗi
    re*     So khớp với 0 hoặc nhiều sự xuất hiện của expression đặt trước
    re{n,m} So khớp với ít nhất n và nhiều nhất m lần xuất hiện của Expression đặt trước.
    a|b     So khớp với hoặc a hoặc b
    (re)    Nhóm các Regular Expression và ghi nhớ text đã so khớp
    (?:re)  Nhóm các Regular Expression mà không ghi nhớ text đã so khớp
    (?>re)  So khớp với patter đọc lập mà không truy tích ngược (backtrack)
    \w      So khớp với các ký tự từ
    \W      So khớp với các ký tự không phải từ
    \s      So khớp với khoảng trống trằng. Tương đương [\t\n\r\f].
    \S      So khớp với các ký tự thông thường là khoảng trống trắng.
    \d      So khớp với các chữ số. Tương đương với [0-9].
    \D      So khớp với ký tự không là chữ số.
    \A      So khớp với phần bắt đầu của chuỗi
    \Z      So khớp với phần kết thúc của chuỗi. Nếu một newline (dòng mới) tồn tại,
            nó so khớp với ngay trước newline(dòng mới).
    \z      So khớp với phần kết thúc của chuỗi
    \G      So khớp với điểm, nơi mà so khớp cuối cùng kết thúc
    \n      Tham chiếu ngược để capture group số "n"
    \b      So khớp với các giới hạn từ bên ngoài dấu ngoặc vuông. So khớp với phím lùi
            (0x08) khi ở trong dấu ngoặc vuông.
    \B      So khớp các giới hạn không phải từ
    \n,\t,etc      So khớp với các newline(dòng mới), cariage return, tab, ...
    \Q      Thoát (trích dẫn) tất cả ký tự tới \E
    \E      Kết thúc trích dẫn bắt đầu từ \Q
    
    Các phương thức của lớp Matcher trong Java
    Dưới đây là danh sách các phương thức hữu ích:
    
    Các phương thức về Index trong Java
    Các phương thức về index cung cấp các giá trị chỉ mục hữu ích giúp tìm kiếm sự 
    so khớp chính xác trong chuỗi đầu vào.
    1.  public int start()  
    Trả về chỉ mục bắt đầu của so khớp trước.
    2.  public int start(int group)
    Trả về chỉ mục bắt đầu của dãy phụ được nắm bắt bởi group đã cho trong hoạt động so khớp trước.
    3.  public int end()
    Trả về offset sau ký tự cuối cùng được so khớp.
    4.  pubicl int end(int group)
    Trả về ofset sau ký tự cuối cùng của dãy phụ được nắm bắt bởi group đã cho trong hoạt động so khớp trước.

    Các phương thức Study trong Java
    Các phương thức Study duyệt lại chuỗi input và trả về Boolean chỉ rằng có hay không pattern được tìm thấy.
    1.  public boolean lookingAt()
    So khớp với dãy input, bắt đầu từ khu vực đó, với pattern
    2.  public boolean find()
    Tìm dãy tiếp theo của dãy input mà so khớp với pattern
    3.  public boolean find(int start)
    Đặt lại Matcher này và sau đó cố gắng tìm dãy tiếp theo của dẫy input mà so
    khớp với pattern, bắt đầu từ chỉ mục đã xác định.
    4.  public boolean matches()
    So khớp với toàn bộ khu vực tới pattern
    
    Các phương thức thay thế vị trí trong Java
    Các phương thức này rất hữu ích để thay thế text trong một chuỗi input:
    Phương thức và Miêu tả:
    1.  public Matcher appendReplacement(StringBuffer sb, String replacement)
    Triển khai một bước phụ thêm và thay thế có giới hạn
    2.  public StringBuffer appendTail(StringBuffer sb)
    Triển khai một bước phụ thêm-và-thay thế không giới hạn
    3.  public String replaceAll(String replacement)
    Thay thế mỗi dãy phụ của dãy input mà so khớp pattern với chỗi thay thế đã cho
    4.  public String replaceFirst(String replacement)
    Thay thế dãy phụ đầu tiên của dãy input mà so khớp pattern với chuỗi thay thế đã cho.
    5.  public static String quoteReplacement(String s)
    Trả về một String thay thế cho String đã xác định. PHương thức này tạo một String mà sẽ làm 
    việc như là một sự thay thế literal trong phương thức appendReplacement của lớp Matcher.

    Ví dụ về Metacharacter
    public static void main(String[] args) {
        System.out.println("Cac metacharacter d....");//d nghia la ky so (digit)

        System.out.println(Pattern.matches("\\d", "abc"));//false(non-digit)
        System.out.println(Pattern.matches("\\d", "1"));    //true(digit va xuat hien 1 lan)
        System.out.println(Pattern.matches("\\d", "4443")); //false (digit nhung xuat hien nhieu hon mot lan)
        System.out.println(Pattern.matches("\\d", "323abc"));   //false (digit va char)

        System.out.println("Cac metacharacter D....");//D nghia la khong phai ky so (non-digit)

        System.out.println(Pattern.matches("\\D", "abc"));  //false(non-digit nhung xuat hien nhieu hon mot lan)
        System.out.println(Pattern.matches("\\D", "1"));    //false(digit)
        System.out.println(Pattern.matches("\\D", "4443")); //false(digit)
        System.out.println(Pattern.matches("\\D", "323abc"));   //false(digit va char)
        System.out.println(Pattern.matches("\\D", "m"));    //true(non-digit va xuat hien mot lan)

        System.out.println("Cac metacharacter D voi quantifier....");
        
        System.out.println(Pattern.matches("\\D*", "mak")); //true(non-digit va co the xuat hien 0 hoac nhieu lan)
    }

    Các phương thức start và end trong Java
    Ví dụ sau tính toán số lần mà từ "play" xuất hiện trong chuỗi input.
    private static final String REGEX = "\\bplay\\b";
    private static final String INPUT = "play play play football tennis play";
    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);   // lay mot doi tuong matcher
        int count = 0;
        while(m.find()){
            count ++;
            System.out.println("So ket noi: " + count);
            System.out.println("start(): " + m.start());
            System.out.println("end(): " + m.end());
        }
    }

    Bạn có thể thấy rằng ví dụ này sử dụng các giới hạn từ để đảm bảo rằng chữ cái "p" "l" "a" "y" không đơn thuần
    là một chuỗi phụ trong một từ dài hơn. Nó cũng cung cấp một số thông tin hữu ích về nơi nào trong 
    chuỗi input xuất hiện sự so khớp.
    Phương thức start trả về chỉ mục bắt đầu của dãy phụ được nắm chặt bởi group đã cho trong hoạt động so khớp trước, 
    và phương thức end trả về chỉ mục của ký tự cuối cùng được so khớp, cộng với 1.

    Các phương thức matches và lookingAt trong Java
    Ca hai phương thức matches và lookingAt so khớp một dãy input với một pattern. Tuy nhiên,
    sự khác nhau ở đây là phương thức matches yêu cầu toàn bộ dãy input để được so khớp, trong khi 
    phương thức lookingAt thì không.
    Cả hai phương thức luôn luôn bắt đâu tại điểm bắt đầu của chuỗi input. Dưới đây là ví dụ:
    private static final String REGEX = "it";
    private static final String INPUT = "itttttttttttgaphot";
    private static Pattern pattern;
    private static Matcher matcher;
    
    public static void main(String[] args) {
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(INPUT);

        System.out.println("REGEX hien tai la: " + REGEX);
        System.out.println("INPUT hien tai la: " + INPUT);

        System.out.println("lookingAt(): " + matcher.lookingAt());
        System.out.println("matches(): " + matcher.matches());
    }

    Các phương thức replaceFirst và replaceAll trong Java
    Các phương thức replaceFirst và replaceAll trong Java thay thế text mà
    so khớp với một Regular Expression đã cho. Như tên của chúng ta đã cho biết, 
    phương thức replaceFirst thay thế sự xuất hiện so khớp đầu tiên, trong khi phương thức
    replaceAll thay thế tất cả so khớp.
    Ví dụ:
    private static String REGEX = "HaDong";
    private static String INPUT = "HaDong o mien Tay." +
        "HaDong la thanh pho cua BinhDuong";
    private static String REPLACE = "BinhDuong";
    
    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        //lay mot doi tuong matcher
        Matcher m = p.matcher(INPUT);
        INPUT = m.replaceAll(REPLACE);
        System.out.println(INPUT);
    }

    Các phương thức appendReplacement va appendTail trong Java
    Lớp Matcher cũng cung cấp hai phương thức appendReplacement và appendTail để thay thế văn bản.
    Ví dụ:
    vietJack.com
    */
    private static String REGEX = "a*b";
    private static String INPUT = "aabfooaabfooabfoob";
    private static String REPLACE = "-";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        //lay mot doi tuong matcher.
        Matcher m = p.matcher(INPUT);
        StringBuffer sb = new StringBuffer();
        while(m.find()){
            m.appendReplacement(sb, REPLACE);
        }
        m.appendTail(sb);
        System.out.println(sb.toString());
    }
    /*
    Các phương thức lớp PatternSyntaxException trong Java
    Một lớp PatternSyntaxException là một exception chưa được kiểm tra mà chỉ dẫn 
    lỗi cú pháp (syntax eror) trong một mẫu Regular Expression. Lớp PatternSyntaxException cung
    cấp các phương thức sau để giúp bạn xác định cái gì gây ra lỗi.
    Phương thức và miêu tả:
    1.  public String getDescription()
        Thu nhận sự miêu tả về lỗi.
    2.  public int getIndex()
        Thu nhận chỉ mục của lỗi
    3.  public String getPattern()
        Thu nhận mẫu Regular Expression sai sót.
    4. public String getMessage()
    Trả về một chuỗi nhiều dòng chứa sự mô tả về syntax eror và chỉ mục của nó, mẫu Regular Expression 
    sai sót, và chỉ dẫn có thể nhìn thấy của chỉ mục lỗi trong pattern đó.
    
    */
    

    
    
    
    
    
}