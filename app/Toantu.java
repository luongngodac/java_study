package app;

public interface Toantu {



    /*
        Toán tử số học trong Java:cộng trừ nhân chia; chia lấy dư
        phép lượng gia, lượng giảm(giảm giá trị toán hạng đi 1)
        Toán tử quan hệ trong Java: 
        Bằng, không cân bằng, lớn hơn, bé hơn; lớn hơn hoặc bằng, bé hơn hoặc bằng
        Toán tử thao tác bit trong Java:và; tồn tại, loại trừ, toán tử đảo bit;
        toán tử dịch trái, toán tử dịch phải (>> <<) toán tử dịch phải và điền 0 vào chỗ trống >>>
        Toán tử logic trong Java:Và logic, hoặc, phủ định logic.
        Toán tử gán trong Java: gán đơn giản(=); thêm giá trị toán hạng: (+=);
        toán hạng trừ bằng(-=); nhân giá trị toán hạng (*=); chia toán hạng (/=)
        phần lấy dư(%=), (<<=); (>>=) ; (&=); (^=); (|=);
        Toán tử hỗn hợp trong Java: toán tử điều kiện , instanceoftrong Java
        
    
    
    */
    // public static void main(String args[])
    // {
    //     String name = "Doan";
    //     // dưới đây sẽ trả về true nếu name là một kiểu String.
    //     boolean result = name instanceof String;
    //     System.out.println(result);
    // }

    // class Animal{}
    // public class Dog extends Animal {
    //     public static void main(String args[]){
    //         Animal a = new Dog();
    //         boolean result = a instanceof Dog;
    //         System.out.println(result);
    //     }
    // }
    /*
        Thứ tự ưu tiên các toán từ trong Java: 
        Postfix; Unary; Tính nhân; Tính cộng; Dịch chuyển; 
        Quan hệ; Cân bằng; Phép AND bit; Phép XỎ bit; Phép OR bit;
        Phép AND logic; Phép OR logic; Điều kiện; Gán; Dấu phẩy.
    
    */
    
    public static void main(String args[])
    {
        int a, b;
        a = 10;
        b = (a == 1) ? 20:30; //Day la vi du ve toan tu dieu kien.
        System.out.println("Gia tri cua b la: " + b);
        b = (a == 10) ? 20: 30 ;//...
        System.out.println("Gia tri cua b la: " + b);
    }


}