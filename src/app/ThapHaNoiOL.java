package app;

public class ThapHaNoiOL {

    /*
    Giải bài toán Tháp Hà Nội (Tower of Hanoi) trong Java
        Miêu tả vấn đề: Cách sử dụng phương thức để giải bài toán Tháp Hà Nội trong Java.
        giải pháp: Ví dụ sau minh họa cách sử dụng phương thức để giải bài toán Tháp Hà nội cho 3 đĩa trong Java?

     vietJack     
    */
    public static void main(String[] args){
        int nDisks = 3;
        doTowers(nDisks, 'A', 'B', 'C');
    }
    public static void doTowers(int topN, char from, char inter, char to){
        if (topN == 1){
            System.out.println("Disk 1 from " + from + " to " + to);
        }else{
            doTowers(topN -1 , from, to, inter);
            System.out.println("Disk " + topN + " from " + from + " to " + to);
            doTowers(topN-1, inter, from, to);
        }
    }
}