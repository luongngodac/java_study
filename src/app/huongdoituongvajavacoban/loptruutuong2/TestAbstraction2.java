package app.huongdoituongvajavacoban.loptruutuong2;

public class TestAbstraction2 
{
    public static void main(String args[])
    {
        BikeL obj = new Honda();
        obj.run();
        obj.changeGear();
    }
}
//vi du ve lop abstract ma co than phuong thuc
abstract class BikeL
{
    BikeL()
    {
        System.out.println("Bike duoc tao");

    }
    abstract void run();
    void changeGear()
    {
        System.out.println("gear duoc thay doi.");
    }
}
class Honda extends BikeL
{
    void run()
    {
        System.out.println("dang chay mot cach an toan.");
    }
}