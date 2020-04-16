package app;
enum Car {
    lamborghini, tata, audi, fiat, honda, toyota, ferari;
}
public class EnumSwitch{
    /*
    Sử dụng lệnh enum & switch trong Java.
    Miêu tả vấn đề: Cách sử dụng lệnh enum và switch trong Java?
    Giải pháp: Ví dụ sau minh họa cách kiểm tra phần enum nào được chọn bởi sử dụng
    lệnh switch trong Java.

    vietJack.com
    */
    public static void main(String args[])
    {
        Car c;
        c = Car.ferari;
        switch(c) {
            case lamborghini:
                System.out.println("You choose lambogrhini!");
                break;
            case tata:
                System.out.println("You choose tata");
                break;
            case audi:
                System.out.println("You choose audi!");
                break;
            case fiat:
                System.out.println("You choose fiat");
                break;
            case honda:
                System.out.println("You choose honda");
                break;
            case ferari:
                System.out.println("you choose ferari");
                break;
            default:
                System.out.println("I don't know your car.");
                break;
        }
    }
}