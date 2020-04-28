package app;


public class Salary extends TinhTruuTuong{

    /*
    Kế thừa lớp Abstract trong Java, chúng ta có thể kế thừa lớp TinhTruuTuong theo cách thông thường như file: 
    Salary.java. 
    */
    private double salary; // Anual salary
    public Salary(String name, String address, int number, double salary)
    {
        super(name, address, number);
        setSalary(salary);
    }
    public void mailCheck()
    {
        System.out.println("Ben trong mailCheck cua Salary class ");
        System.out.println("Gui mail kiem tra toi " + getName() + " voi salary la " + salary);
    }
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double newSalary)
    {
        if(newSalary >= 0.0)
        {
            salary = newSalary;
        }
    }
    public double computePay()
    {
        System.out.println("Tinh toan luong tra cho " + getName());
        return salary/52;
    }

}