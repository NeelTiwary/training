import java.util.*;
public class StackInLinkedList {
    static node top;
    public static void main(String[] args) {
        while(true){
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peep");
            System.out.println("4.Display");

            System.out.println("Enter your choice ");
            Scanner sc =new Scanner(System.in);
            int  ch = sc.nextInt();
            if (ch==1){
                System.out.println("Emter the element ");
                int ele = sc.nextInt();
                push(ele);
            }
            else if(ch==2){
                pop();
            }
            else if(ch==3) {
                peek();
            }
        }
    }
    static void push(int ele){
        node temp = new node();
        temp.data=ele;
        temp.next=top;
        top=temp;

    }
    static void pop(){
        if (top==null){
            System.out.println("kuch hai hea nhi");
        }
        else{
            top=top.next;
        }
    }
    static void peek(){
        System.out.println("Peek element:"+top.data);
        
    }
}
class node{
    int data ;
    node next;
}
