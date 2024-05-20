//import javax.sound.sampled.SourceDataLine;

public class dayTwo {
    public static void main(String[] args) {
        //System.out.println(text.a);
        //System.out.println(text.b);
        System.out.println(text.getA());
        text.setA(10);
        System.out.println(text.getA());
    }
}
class text{
    //static int a;
    private static int a;
    static void setA(int a){//seters set values of a 
        text.a=a;
    }
    static int getA(){//return value of the a 
        return text.a;
    }
}
