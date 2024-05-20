import java.util.*;
class Stack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int size = sc.nextInt();

        int [] stack = new int[size];//array with size 5 index 0,1,2,3,4 stack is vertical array
        //insertion and deletion both aur done from top
        //psuh to insert 
        //pop to delete
        int top=-1;//stores location till which stack is filled

        while (true) {
            System.out.println("1.Push");//putting value in stack
            System.out.println("2.pop");//deletion from stack from top
            System.out.println("3.peep");//display the top element
            System.out.println("4.traverse");//display
            System.out.println("5.exit");

            System.out.println("Enter youe choice");
            int ch= sc.nextInt();

            if(ch==1){
                if (top == size-1) {
                    size=size*2;
                    int[] stk1= new int[size];// new array with double size 
                    for (int i=0;i<=top;i++){
                        stk1[i]=stack[i];//adding arrays all element in first array 
                    }
                    stack=stk1;//then again give stk = stk1 all values
                }
                else{
                    top++;
                    System.out.println("Enter element yo be inserted");
                    int ele =sc.nextInt();
                    stack[top]=ele;//stack[++top]=element can be used instead
                    System.out.println("Element pushed");
                }
            }
            else if (ch==2) {
                if (top == -1){
                    System.out.println("stack is underflow");
                }else{
                    System.out.println("Popped:"+ stack[top]);
                    top--;//deleted for user but information will be persent in thee same location
                }
            }
            else if (ch==3) {
                if (top == -1){
                    System.out.println("stack is underflow");
                }else{
                    System.out.println("Top most element:"+ stack[top]);
                }
            }
            else if(ch==4){
                if (top == -1){
                    System.out.println("stack is underflow");
                }
                else{
                    for(int i=0;i<=top;i++){
                        System.out.println(stack[i]);
                    }
                }
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