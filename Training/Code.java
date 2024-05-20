import java.util.*;
public class Code{
    public static void main(String[] args){
        Test.fun();
        Test1 t =new Test1();
        t.fun();
        First.fun();
        Second.fun();
        Scanner sc = new Scanner(System.in);
        First1 f1 = new First1();
        Second1 s1 = new Second1();
        f1.fun();
        s1.fun();
        System.out.println("enter two numbers to be added:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Add.nums(a, b);
    }
    }



    class Test
    {
    public static void fun(){
    System.out.println("Hello all");
    }
    }


    class Test1{
public void fun(){
System.out.println("Hello all");
}
}

class First{
    public static void fun(){
    System.out.println("First fun");
    }
    }
    class Second{
    public static void fun(){
    System.out.println("Secound fun");
    }
}

class First1{
    public void fun(){
    System.out.println("First fun");
    }
    }
    class Second1{
    public void fun(){
        System.out.println("Secound fun");
    }
    }


    class Add{
        public static void nums(int a, int b)
        {
            System.out.println("sum is: " + (a+b));
        }
        }

        