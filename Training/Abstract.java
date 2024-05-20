abstract class first {
    void m1(){
        System.out.println("m1");
    }
    abstract void m2();
}
class Second extends first{
    void m2(){
        System.out.println("m2");
    }
}
class Abstract{
    public static void main(String[] args) {
        Second s= new Second();
        s.m1();
        s.m2();
    }
}