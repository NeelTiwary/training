import java.util.*;
public class Cqueue {
    static int cq[],size;
    static int front=-1,rear=-1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int p = sc.nextInt();
        create(p);
        System.out.println("Queue is raedy");
        while(true){
            System.out.println("1.insert");//putting value in stack
            System.out.println("2.delete");//deletion from stack from top
            System.out.println("3.traverse");//display 
            System.out.println("4.exit");
            System.out.println("Enter youe choice");
            int ch= sc.nextInt();

           if (ch==1) {
            System.out.println("Enter element to be inserted");
            int ele = sc.nextInt();
            insert(ele);
           }
           else if (ch==2){
            delete();
           }
           else if(ch==3){
            traverse();
           }
           else if (ch==4){
            System.out.println("programme ended");
            break;
           }
           else{
            System.out.println("wrong output");
           }
        }
    }



    static void create(int n){
        cq= new int[n];
        size=n;

    }
    static void insert(int ele){
        if(isFull()){
            System.out.println("QUEUE IS OVERFLOWN");
        }
        else {
            if (rear==-1) {
                front=rear=0;
            }
            else if(rear == size-1){
                rear=0;
            }
            else{
                rear++;
            }
            cq[rear]=ele;
            System.out.println("Inserted");
        }
    

    }
    static void delete()
    {
        if (isEmpty()){
            System.out.println("Dqueue element deleted");
        }
        else{
            if (rear==front){
                front=rear=-1;
            }
            else if(front ==size-1){
                front=0;
            }
            else{
                front++;
            }
        }
    }
    static void traverse(){
        if(isEmpty()){
           System.out.println("underflow");
        }
        else{
            System.out.println("elements are");
            if(rear>=front){
                for (int i =front;i<=rear;i++){
                    System.out.println(cq[i]);
                }
            }
                else{
                    for(int i =front;i<size-1;i++){
                        System.out.println(cq[i]);
                    }
                    for(int i =0;i<rear;i++){
                        System.out.println(cq[i]);
                    }
                }
            }
        }
    static boolean isFull(){
        if ((front==0&&rear==size-1)||(front == rear+1)){
            return true;
        }
        else 
        return false;
    }
    static boolean isEmpty(){
        if (rear==-1){
        return true;}
        else 
        {
        return false;
        }
    }
}

