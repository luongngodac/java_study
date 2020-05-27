package app.huongdoituongvajavacoban;

public class Varargs {
    /*
    Sử dụng varargs với phương thức trong Java.
    Miêu tả vấn đề: CÁch tạo một phương thức lấy tham số đọ dài biến như
    là một input trong Java?
    Giải pháp: Ví dụ sau minh họa cách tạo phương thức sumvarargs()
    mà lấy biến int như là một tham số trả về tổng các tham số như là một input
    trong Java.
    vietJack.com
    */
    static int sumvarargs(int ... intArrays)
    {
        int sum, i;
        sum = 0;
        for (i = 0; i < intArrays.length; i++)
        {
            sum += intArrays[i];
        }
        return(sum);
    }
    public static void main(String[] args)
    {
        int sum = 0;
        sum = sumvarargs(new int[]{10,111,33});
        System.out.println("The sum of the numbers is: " + sum);
    }

}