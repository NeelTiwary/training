
import java.util.*;
public class StringToInteger {
    public static void main(String[] args) {
        try{
        String s="abc";
        int a=Integer.parseInt(s);
        System.out.println(a);
        }
        catch(Exception e){
            System.out.println("exception occured");
        }
    }
}
