class first{
    void d(){
        System.out.println("Hello duniya");
    }
}

class secound extends first{
    void d2(){
        System.out.println("hn Duniya");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        secound s = new secound();
        s.d2();
        s.d();
    }
}
//abstract class can have both concerete method and abstract method abstract class haves 
        //concrete has body whereas all normal methods are conceret but abstract method has a key abstract before it 
        //abstract method dont have any defination or body