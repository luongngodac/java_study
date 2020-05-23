package app;

public class Mang 
{
    /*
    Mảng (Array) trong Java
    [Mảng trong java, Array trong Java, mảng 2 chiều trong Java, mảng đa chiều]
    Thường thì, mảng là một tập hợp các phần tử có kiểu tương tự nhau mà có vị trí ô liền kề. 
    Mảng trong Java là một đối tượng chứa các phần tử có kiểu dữ liệu giống nhau. Nó là một cấu trúc dữ liệu,
    tại đó chúng ta có thể lưu trữ các phần tử tương tự nhau. Chúng ta chỉ có thể 
    lưu trữ một tập hợp cố định các phần tử trong một mảng trong Java.
    Mảng trong Java là dựa trên chỉ mục (index), phần tử đầu tiên của mảng được lưu trữ tại chỉ mục 0.
    Chương hướng dẫn này giưới thiệu cách khai báo các biển mảng, tạo mảng, xử lý các mảng
    bởi sử dụng chỉ mục của các biến, mảng một chiều và mảng đa chiều trong Java.
    Để hiểu sâu hơn về các khái niệm được trình bày trong chương này, vào tham khảo
    package: viduvearraytrongjava.
    Lợi thế của mảng trong Java
    Tối ưu hóa code: từ đó chúng ta có thể thu nhận và sắp xếp dữ liệu một cách dễ dàng.
    Truy cập ngẫu nhiên: chúng ta có thể lấy bất cứ dữ liệu nào ở tại bất cứ vị trí chỉ mục nào
    Hạn chế của mảng trong Java.
    Giới hạn kích cỡ: Chúng ta chỉ có thể lưu trữ kích cỡ cố định số phần tử trong mảng.
    Nó không tăng kích cỡ của nó tại runtime. Để xử lý vấn đề này, Collection Framework được sử dụng trong Java.
    Các kiểu mảng trong Java
    Có hai kiểu mảng trong Java, đó là: Mảng một chiều; Mảng hai chiều
    Khai báo biến mảng trong Java.
    Để sử dụng một mảng trong một chương trình, bạn phải khai báo một biến để tham chiếu mảng, và bạn phải 
    xác định kiểu mảng mà biến có thể tham chiếu. Dưới đây là cú pháp để khai báo một biến mảng:
    Kieu_du_lieu[] Bien_tham_chieu_mang; // cach uu tien.
    hoac
    Kieu_du_lieu Bien_tham_chieu_mang[]; // lam viec nhung khong la cach uu tien.
    Ghi chú: Kieu_du_lieu[] Bien_tham_chieu_mang được ưu thích hơn, cái còn lại xuất phat
    từ ngôn ngữ C/C++ và được chập nhận trong Java.
    Ví dụ: Đoạn code sau là ví dụ minh họa cho cú pháp này:
    double[] BK49;  //cách ưu tiên
    hoac
    double BK49[];  //làm việc nhưng không là ưu tiên.
    Tạo mảng trong Java:
    Bạn có thể tạo một mảng bởi sử dụng toán tử new với cú pháp sau:
    Bien_tham_chieu_mang = new Kieu_du_lieu[Kich_co_mang];
    Lệnh trên thực hiện hai công việc sau:
    Nó tạo một mảng bởi sử dụng new Kieu_du_lieu[Kich_co_mang];
    Nó gán tham chiếu của mảng mới được tạo tới biến Bien_tham_chieu_mang
    Khai báo một biến mảng, tạo một mảng, và gán tham chiếu của mảng tới biến có thể 
    được tổ hợp trong một lệnh, như sau:
    Kieu_du_lieu[] Bien_tham_chieu_mang = new Kieu_du_lieu[Kich_co_mang];
    Cũng có thể tạo các mảng bởi sử dụng cách sau:
    Kieu_du_lieu[] Bien_tham_chieu_mang = {giatri0, giatri1, ..., giatriN};
    Các phần tử mảng được truy cập thông qua index-chỉ mục. Chỉ mục của mảng được tính toán
    tử 0 tới Bien_tham_chieu_mang.length-1
    Ví dụ:
    Lệnh sau khai báo một mảng, BK50, tạo một mảng gồm 10 phần tử với kiểu double và gán tham chiếu 
    tới BK50.
    double[] BK50 = new double[10];
    Mảng một chiều trong Java.
    Bạn theo dõi ví dụ đơn giản sau về mảng một chiều. Ở đây, chúng ta khai báo, khởi tạo và vọc mảng.
    Khi xử lý các phần tử mảng, chúng ta thường sử dụng hoặc vòng lặp for hoặc vòng lặp
    foreeach bởi vì tất cả phần tử trong một mảng là cùng kiểu và kích cỡ mảng đã biết.
    vietJack.com
    public static void main(String[] args) 
    {
        int a[] = new int[5]; // phan khai bao va khoi tao.
        a[0] = 10;
        a[1] = 20;
        a[2] = 70;
        a[3] = 40;
        a[4] = 50;
        //in mang
        for (int i = 0; i < a.length; i++) // length la thuoc tinh cua mang
        {
            System.out.println(a[i]);
        }    
    }
    Truyền mảng tới phương thức trong Java
    Bạn có thể truyền mảng tới phương thức để mà bạn có thể tái sử dụng cùng tính logic của phương thức
    đó trên bất cứ mảng nào. Dưới đây là ví dụ đơn giản dể lấy số nhỏ nhất của một mảng bởi sử dụng phương thức.
    
    static void min(int arr[])
    {
        int min = arr[0];
        for(int i = 1; i < arr.length; i++)
            if(min > arr[i])
                min = arr[i];
        System.out.println(min);

    }
    public static void main(String[] args) 
    {
        int a[] = {33, 3, 4, 5};
        min(a);     // Truyen mang toi phuong thuc.
    }
    Vọng lặp foreach  trong Java.
    JDK 1.5 giới thiệu một vòng lặp for mới được biết với tên gọi foreach hoặc enhanced for, mà cho 
    bạn khả năng "vọc" mảng một cách liên tục mà không cần sử dụng một biến chỉ mục.
    Ví dụ:
    public static void main(String[] args) 
    {
        double[] BK49 = {1.9, 2.9, 3.4, 3.5};
        //In tat ca cac phan tu mang
        for (double element: BK49)
            System.out.println(element);
        
    }
    Trả về một mảng từ một phương thức trong Java
    Một phương thức cũng có thể trả về mảng. Ví dụ, phương thức dưới đây in các
    phần tử trong mảng theo thứ tự ngược lại.
    public static void hamDaoNguoc(int[] list)
    {
        int[] result = new int[list.length];
        //vong lap de dao nguoc mang
        for(int i = 0, j = result.length - 1; i < list.length; i++, j--)
        {
            result[j] = list[i];
        }
        //vong lap foreach de hien thi cac phan tu trong mang dao nguoc.
        for (int a: result)
        {
            System.out.print(a + " ");
        }
    }
    public static void main(String[] args) 
    {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        hamDaoNguoc(arr);    
    }
    Mảng hai chiều và đa chiều trong Java
    Trong trường hợp này, dữ liệu được lưu trữ trong hàng và cột dựa trên chỉ mục.
    Cú pháp để khai báo mảng đa chiều trong Java:
    Kieu_du_lieu[][] Bien_tham_chieu_mang; (hoac)
    Kieu_du_lieu [][]Bien_tham_chieu_mang; (hoac)
    Kieu_du_lieu Bien_tham_chieu_mang[][];(hoac)
    Kieu_du_lieu []Bien_tham_chieu_mang[];
    Bạn có thể khởi tạo mảng đa chiều trong Java, giống như sau:
    int[][] arr = new[3][3];// 3 hang va 3 cot
    Ví dụ về khởi tạo mảng đa chiều trong Java
    arr[0][0] = 1;
    arr[0][1] = 2;
    arr[0][2] = 3;
    arr[1][0] = 4;
    arr[1][1] = 5;
    arr[1][2] = 6;
    arr[2][0] = 7;
    arr[2][1] = 8;
    arr[2][2] = 9;
    Ví dụ sau sẽ khai báo, khởi tạo và in một mảng hai chiều
    public static void main(String[] args) 
    {
        //khai bao va khoi tao mang hai chieu
        int arr[][] ={{1,2,3},{2,4,5},{4,4,5}};
        //in mang hai chieu
        for(int i = 0; i < 3; i++)
        {
            for(int j =  0; j < 3; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }            
    }
    Tên lớp của mảng trong Java là gì.
    Trong Java, mảng là một đối tượng. Với đối tượng Array, một lớp ủy nhiệm được tạo có tên
    có thể thu được bởi phương thức getClass(), getName() trên đối tượng đó.
    Sao chép một mảng trong Java
    Bạn có thể sao chép một mảng này sang mảng khác bởi sử dụng arraycopy của lớp System.
    cú pháp của phương thức arraycopy như sau:
    public static void arraycopy
    (
        Object src, int srcPos, Object dest, int destPos, int length
    )

    Ví dụ của phương thức arraycopy trong Java:
    public static void main(String[] args) 
    {
        char[] copyFrom = {'v', 'o', 'd', 'e', 'n', 't', 'a', 'h', 
            'o', 'r', 'z', 'o', 'n', 't', 'a', 'l'};
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom  , 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }
    //copy mang copyFrom tu vi tri thu 2 den mang copyTo; mang copyTo copy 7 phan tu tiep theo 
    //cua mang copyFrom

    Cộng hai ma trận trong Java.
    Ví dụ sau sẽ thực hiện cộng hai ma trận trong Java:
    vietJack.com
    */
    public static void main(String[] args) 
    {
        //tao hai ma tran
        int a[][] = {{1, 3, 4}, {3, 4, 5}};
        int b[][] = {{1, 3, 4}, {3, 4, 5}};

        //tao ma tran khac de luu giu ket qua phep cong hai ma tran.
        int c[][] = new int[2][3];

        //cong va in tong hai ma tran
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println(); //new line
        }
    }
    /*
    Giới thiệu Lớp Array trong Java.
    Lớp java.untl.Arrays chứa nhiều phương thức static đa dạng để xếp thứ tự và tìm kiếm
    các mảng, so sánh các mảng và điền các phần tử vào mảng.
    1. Phương thức miêu tả:
    public static int binarySeearch(Object[] a, Object key)
    Tìm kiếm mảng của Object(byte, int, double, ...) đã cho với giá trị đã xác định bởi 
    sử dụng thuật toán tìm kiếm nhị phân. Mảng này phải được xếp thứ tự trước khi gọi phương thức này.
    Nó trả về chỉ mục của từ khóa tìm kiếm, nếu nó nằm trong dánh sách, nếu không thì, bằng(-(điểm chèn+1))
    2. Phương thức miêu tả:
    public static boolean equals(long[] a, long[] a2)
    Trả về true nếu hai mảng long đã cho là cân bằng nhau. Hai mảng này được cho là cân bằng
    nếu cả hai mảng chứa cùng số lượng phần tử, và tất cả các cặp phần tử tương ứng của hai mảng là cân 
    bằng. Phương thức tương tự có thể được sử dụng bởi tất cả kiểu dữ liệu gốc khác (byte, short, int, ...)
    3. public static void fill(int[] a, int val)
    Gán giá trị int đã cho tới mỗi phần tử của mảng int đã cho. Phương thức tương tự có thể được sử dụng bởi
    tất cả kiểu dữ liệu gốc khác (byte, short, int, ...)
    4. public static void sort(Object[] a)
    Xếp thứ tự mảng các đối tượng đã cho theo thứ tự tăng dần, theo thứ tự tự nhiên của các phần tử.
    Phương thức tương tự có thể được sử dụng bởi tất cả kiểu dữ liệu gốc khác (byte, short, int, ...)
    
    */


    
    
    
    
}