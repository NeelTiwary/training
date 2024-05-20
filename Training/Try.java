import java.util.*;
public class Try {
    public static void main(String[] args) {
        try{
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c=a/b;
        }
        //catch (ArithmeticException e){
        //    System.out.println("Exception");
        //}
        //catch(InputMismatchException e){
        //    System.out.println("exception");
        //}instead of above two we can directly write that 
        catch(Exception e){
            System.out.println("error toh mil hea gaya input dene mae milla hai ish baar");
        }
    }
}
