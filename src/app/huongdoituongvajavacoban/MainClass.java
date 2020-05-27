package app.huongdoituongvajavacoban;

public class MainClass {
    public static void main(String args[]){
        OverLoad t = new OverLoad(0);
        t.info();
        t.info("overloaded method");
        // overloaded constructor;
        new OverLoad();
    }
}