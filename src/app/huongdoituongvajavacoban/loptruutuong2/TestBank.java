package app.huongdoituongvajavacoban.loptruutuong2;

class TestBank
{
    public static void main(String args[])
    {
        //Tao mot doi tuong SBI moi.
        Bank b = new SBI();
        //Neu doi tuong la PNB, phuong thuc cua PNB se duoc trieu hoi.
        int interest = b.getRateOfInterest();//Trieu hoi phuong thuc cua SBI.
        System.out.println("ti le lai suat la: " + interest + " %");
    }
}