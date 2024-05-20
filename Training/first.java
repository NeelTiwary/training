import java.util.*;
class first{
    public static void main(String[] args) {
        System.out.println("hello pankaj jae shree ram");
        //Say.HTA();//STATIC METHOD CAN BE ACCESED USING CLASS NAME
        //clear.EOC();
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter age of the person");
        //int age = sc.nextInt();
        Person p =new Person();
        //p.canCode(age);// calling using object
        System.out.println("Enter the characters");
        char ch = sc.next().charAt(0);
        p.alpha(ch);
    }
}
/**
 * Say
 */
class Say {

    static void HTA(){
        System.out.println("hiii");
        clear c = new clear();
        c.EOC();// object name is c and eoc is accesed using object of the class clear as it is instant method
    }
}

class clear{
    void EOC(){//instanst method
        System.out.println("clear all");
    }
}
class Person{
    void canCode(int age){
        if (age>18) {
            System.out.println("Can code");
        }
        else{
            System.out.println("can not code");
        }
    }
    void alpha(char ch){
        if((ch >='A'&&ch <='Z')||(ch >='a'&&ch <='z')){
            System.out.println("Character");
        }
        else{
            System.out.println("not character");
        }
    }
}