package app;

public class GanKetTinhDong extends TheAnimal{
    /*
    Gắn kết tĩnh và Gắn kết động (Dynamic binding) trong Java.
    Binding(gắn kết) là kết nối một lời gọi phương thức tới thân phương thức.
    Có hai kiểu binding là Static Biding hay early binding(gắn kết tĩnh) và Dynamic 
    Binding hay late biding(gắn kết động).
    Trước khi đi vào thảo luận về Binding, chúng ta cần làm rõ Type là gì:
    1. Biến có một kiểu, nó có thẻ là kiểu gốc hoặc kiểu khác (không phải là kiểu gốc.)
    int data = 30;
    Ở đây, biến data  là một kiêu int.
    2. Tham chiếu có một kiểu.
    class Dog{
        public sattic void main(String args[])
        {
            Dog d1; // o day, d1 là kiểu của dog.
        }
    }
    3. Đối tượng có một kiểu. Đối tượng là một instance (sự thể hiện) của lớp 
    Java cụ thể, nhưng nó cũng là một instance của lớp cha.
    class Animal{}
    class Dog extends Animal
    {
        public static void main (String args[])
        {
            Dog d1 = new Dog();
            //ở đây d1 là một sự thể hiện của lớp Dog, nhưng nó cũng làm ột sự thể hiện
            cảu Animal.
        }
    }
    //Gắn kết tính (Static Binding) trong Java.
    Khi kiểu của đối tượng được quyết định tại compile time (bởi Compiler) thiddos
    là static binding.Nếu có bát cứ phương thức private, final hoặc static nòa trong một 
    lớp, thì đó là gán kết tĩnh,. Do đó, không thể có chuyện ghi đè(overrloading) 
    kết quả đối với lạp trình hướng đối tượng trong Static binding.
    Ví dụ về Static Binding:
    class cat
    {
        private void eat()
        {
            System.out.println("cat dang an ...");
        }
        public static void main(String args[])
        {
            Dog d1 = new Dog();
            d1.eat();
        }
    }
    //Gắn kết động (Dynamic Binding) trong Java.
    Khi kiểu của đối tượng được quyết định tại runtime thì đó là gắn kết động
    (Dynamic Binding)
    Ví dụ về Dynamic Binding: 
    Trong ví dụ dưới đây, kiểu đối tượng không thể được quyết định bởi Compiler, bởi
    vì sự thể hiện của Dog cũng là một sự thể hiện của Animal. Vì thế Compiler không
    biết kiểu nào của nó, chỉ biết đến kiểu cơ sở.
    */
    void eat()
    {
        System.out.println("the cat is eatting ... ");
    }
    public static void main(String args[])
    {
        TheAnimal ta = new GanKetTinhDong();
        ta.eat();
    }

}
class TheAnimal
{
    void eat()
    {
        System.out.println("The animal is eatting ... ");
    }
}