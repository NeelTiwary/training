public class concrete {
    void m1(){
        System.out.println("m1");
    }
    void m2(){
        System.out.println("m2");
    }
}
class program{
    public static void main(String[] args) {
        concrete c =new concrete();
        c.m1();
        c.m2();
    }
}
