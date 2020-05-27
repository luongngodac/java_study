package app.huongdoituongvajavacoban;

public class LenhBreak {

    /**
     Sử dụng lệnh break trong Java.
     Miêu tả vấn đề:Cách sử dụng lệnh break để nhảy ra khỏi vòng lặp trong một phương thức trong Java?\
     Giải pháp: Xem dưới :D
     vietJack.com 
     */
    public static void main(String args[])
    {
        int intary[] = { 99, 12, 34, 45, 67, 5678, 8990};
        int no = 5678;
        int i = 0;
        boolean found = false;
        for( ; i < intary.length; i++)
        {
            if (intary[i] == no)
            {
                found = true;
                break;
            }
            
        }
        for (int j = 0; j < intary.length; j++)
        {
            System.out.println(intary[j]);
        }
        if (found)
        {
            System.out.println("Found the no: " + no + " at indext: " + i);
        }
        else{
            System.out.println(no + " not found in the array");
        }
    }
}