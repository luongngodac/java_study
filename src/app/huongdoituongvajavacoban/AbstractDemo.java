package app.huongdoituongvajavacoban;

public class AbstractDemo {
    


    // public static void main(String args[])
    // {
    //     // /*Phan sau la khong duoc phep va se tao mot err*/
    //     // TinhTruuTuong e = new TinhTruuTuong("Geogre W.", "Houston, TX", 43);
    //     // System.out.println("\n goi mailCheck boi su dung tham chieu den TinhTruuTuong---");
    //     // e.mailCheck();
        
    //     TinhTruuTuong e = new TinhTruuTuong("John Adams", "Boston, MA", 2, 2400.00);
  
  
    //     System.out.println("\n Goi mailCheck boi su dung tham chieu Employee --");
    //     e.mailCheck();
    // }
    /*
        Khi biên dịch lớp trên, bạn sẽ nhận một lỗi:
        Employee.java:46: Employee is abstract; cannot be instantiated
        Vậy nên, ở đây, chúng ta không thể tạo một Empoyee mới, nhưng nếu chúng ta
        tạo một đối tượng Salary mới, đối tượng Salary này sẽ kế thừa 3 trường, 7 
        phương thức từ TinhTruuTuong.  
    */
    public static void main(String [] args)
    {
        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        TinhTruuTuong e = new Salary("Jhohn Adams", "Boston, MA", 2, 2400.00);

        System.out.println("Goi mailCheck boi su dung tham chieu Salary--");
        s.mailCheck();

        System.out.println("\nGoi mailCheck boi su dung tham chieu TinhTruuTuong");
        e.mailCheck();
    }


}
