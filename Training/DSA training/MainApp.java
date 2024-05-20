import java.util.*;
public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter intial capacity:");
        int n=sc.nextInt();
        stack.create(n);
        System.out.println("Static is ready");
        
        while (true) {
            System.out.println("1.Push");//putting value in stack
            System.out.println("2.pop");//deletion from stack from top
            System.out.println("3.peep");//display the top element
            System.out.println("4.traverse");//display
            System.out.println("5.exit");

            System.out.println("Enter youe choice");
            int ch= sc.nextInt();
        if(ch==1){
            System.out.println("Enter Element to stack");
            int element =sc.nextInt();
            stack.push(element);
        }
        else if (ch==2) {
            int item = stack.pop();
            if(item==-1){
                System.out.println("Stack is underflown");
            }
            else{
                System.out.println("popped"+ item);
            }
        }
        else if (ch==3) {
            int item = stack.pop();
            if(item==-1){
                System.out.println("Stack is underflown");
            }
            else{
                System.out.println("top element"+ item);
            }
        }
        else if(ch==4){
            stack.traverse();
        }
        else if(ch==5){
            System.out.println("End of program");
            break;
        }
        else{
            System.out.println("Invalid choice");
        }
    }
    }
}


class stack{
    static int[] stk;
    static int top=-1;
    static int size;
    static int[]stk1;
    static void create(int n){
        size = n;
        stk = new int [size];
    }
    static void push(int ele){
        if(isFull()){
            size=size*2;
            stk1= new int[size];// new array with double size 
            for (int i=0;i<=top;i++){
                stk1[i]=stk[i];//adding arrays all element in first array 
            }
            stk=stk1;//then again give stk = stk1 all values
        }
            
            top++;
            stk[top]=ele;
            System.out.println("Element pushed");
    }

    static int pop(){
        if(isEmpty()){
            return -1;
        }
        else {
            return stk[top--];
        }
    }

    static int peek(){
        if(isEmpty()){
            return -1;
        }
        else {
            return stk[top];
        }
    }

    static void traverse(){
        if (isEmpty()) {
            System.out.println("Underflown");
        }
        else{
            System.out.println("Stack Elements");
            for(int i=0;i<=top; i++ ){
                System.out.println(stk[i]+" ");
            }
        }
    }

    static Boolean isFull(){
        if (top==size-1){
            return true;
        }
        else{
            return false;
        }
    }


    static Boolean isEmpty(){
        if (top==-1){
            return true;
        }
        else{
            return false;
        }
    }
}