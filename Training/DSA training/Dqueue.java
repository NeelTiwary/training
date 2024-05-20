import java.util.*;
public class Dqueue {
    static int dq[],size;
    static int front=-1,rear=-1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int p = sc.nextInt();
        create(p);
        System.out.println("DQueue is raedy");
        while(true){
            System.out.println("1.insertFront");//putting value in stack
            System.out.println("2.insertRear");
            System.out.println("3.deleteFront");//deletion from stack from top
            System.out.println("4.deleteRear");
            System.out.println("5.traverse");//display 
            System.out.println("6.Delete first element");
            System.out.println("6.exit");
            System.out.println("Enter youe choice");
            int ch= sc.nextInt();

           if (ch==1) {
            System.out.println("Enter element to be inserted");
            int ele = sc.nextInt();
            insertFront(ele);
           }
           else if (ch==2){
            System.out.println("Enter element to be inserted");
            int ele = sc.nextInt();
            insertRear(ele);
           }
           else if(ch==3){
            deleteFront();
           }
           else if(ch==4){
            deleteRear();
           }
           else if(ch==5){
            traverse();
           }
           else if (ch==6){
            System.out.println("programme ended");
            break;
           }
            
           else{
            System.out.println("wrong output");
           }
        }
    }



    static void create(int n){
        dq= new int[n];
        size=n;

    }
    static void insertFront(int ele){
        if(isFull()) 
            System.out.println("Full ho gaya hai dequeue");
    else{
            if(front==-1){
                front=rear=0;

            }
            else if(front==0){
                front=size-1;
            }
            else{
                front++;
            }
            dq[front]=ele;
            front--;
        }
        }
        static void insertRear(int ele){
            if(isFull()) {
                System.out.println("Full ho gaya hai dequeue");}
            else{
                    if(rear==-1){
                        front=rear=0;
                    }
                    else if(rear==size-1){
                        rear=0;
                    }
                    else{
                        rear++;
                    }
                    dq[rear]=ele;
                    rear++;
                }
        
    }

    
    static void deleteFront()
    {
        if (isEmpty()){
            System.out.println("Noithing to delete");
        }
        else{
            System.out.println("Deleted element:"+dq[front]);
            if(front==rear){
                front=rear=-1;
            }
            else if(front ==size-1 ){
                front=0;
            }
            else{
                front++;
            }
        }
    }
    static void deleteRear()
    {
        if (isEmpty()){
            System.out.println("Noithing to delete");
        }
        else{
            System.out.println("Deleted element:"+dq[front]);
            if(front==rear){
                front=rear=-1;
            }
            else if(rear==0){
                rear=size-1;
            }
            else{
                rear--;
            }
        }
    }
    static void traverse(){
        if(isEmpty()){
            System.out.println("no element to display");
        }
        else{
        System.out.println("Elelments are");
            if (rear>front){
                for(int i=front;i<=rear;i++){
                    System.out.println(dq[i]);
                } 
            }
            else{
                for (int i =front;i<size-1;i++){
                    System.out.println(dq[i]);
                }
                for(int i=0;i<=rear;i++){
                    System.out.println(dq[i]);
                }
            }
        }
    }
    static boolean isFull(){
        if ((front==0 && rear==size-1)||(rear ==size-1))
        return true;
        else 
        return false;
    }
    static boolean isEmpty(){
      if (front==rear-1){
        return true;
      }
      else
      return false;
    }

}

