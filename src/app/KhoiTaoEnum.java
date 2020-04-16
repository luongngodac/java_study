package app;

enum WellCar {
    lamboghini(900), tata(2), audi(50), fiat(15), honda(12), ferari(22);
    private int price;
    WellCar(int p) 
    {
        price = p;
    }
    int getPrice()
    {
        return price;
    }
}

public class KhoiTaoEnum {
    /*
    Enum constructor trong Java.
    Miêu tả vấn đề: 
    Cách sử dụng enum constructor, biến instance và phương thức trong Java?
    Giải pháp: Ví dụ sau khởi tạo bởi sử dụng một constructor và phương thức
    getPrice() và hiển thị giá trị của enum trong Java.
        vietJack.com
    */
    public static void main(String args[])
    {
        System.out.println("All car prices: ");
        for (WellCar c : WellCar.values())
            System.out.println(c + " costs " + c.getPrice() + " thousand dollars.");
    }

}