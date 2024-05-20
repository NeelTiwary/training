interface f{
    void m1();
    void m2();
}
class sec implements f{
public void m1(){
    System.out.println("m1");
}
public void m2(){
    System.out.println("m2");
}
}

public class Inter {
    public static void main(String args[]){
        f f= new sec();
        f.m1();
        f.m2();
    }
}
