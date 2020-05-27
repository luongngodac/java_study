package app.huongdoituongvajavacoban;

public class Label {
    /*
    Sử dụng Label trong phương thức trong Java.
    Miêu tả vấn đề: Cách sử dụng Label trong một phương thức Java?
    Giải pháp: Ví dụ sau minh họa cách nhảy tới một Label cụ thể khi gặp lệnh
    continue hoặc break trong một vòng lặp trong Java.
       vietJack.com
    */
    public static void main(String[] args)
    {
        String strSearch = "This is the string in which you have to search for a substring.";
        String substring = "substring1";
        boolean found = false;
        int max = strSearch.length() - substring.length();
        testlbl:
        for (int i =0; i <= max; i++)
        {
            int length = substring.length();
            int j = i;
            int k = 0;
            while (length-- != 0)
            {
                if(strSearch.charAt(j++) != substring.charAt(k++))
                {
                    continue testlbl;
                }
            }
            found = true;
            break testlbl;
        }
        if (found)
        {
            System.out.println("Found the substring.");
        }
        else{
            System.out.println("did not find the substing in the string.");
        }
    }
}