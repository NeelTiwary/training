import java.util.*;
public class QueueDs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int size = sc.nextInt();

        int [] Queue = new int[size];
        final int front=0;//deletion and is fixed
        int rear=0;// insertion and changable

        while (true) {
            System.out.println("1.Enqueue");//putting value in queue
            System.out.println("2.Dequeue");//deletion from queue from front
            System.out.println("3.peep");//display the top element
            System.out.println("4.traverse");//display
            System.out.println("5.exit");

            System.out.println("Enter youe choice");
            int ch= sc.nextInt();

            if(ch==1){
                if (rear==size) {//as it is not starting from -1 it is starting from 0
                        System.out.println("queue overflow");
                }
                else{
                    
                    System.out.println("Enter element yo be inserted");
                    int ele =sc.nextInt();
                    Queue[rear]=ele;//stack[++raer]=element can be used instead
                    System.out.println("Element pushed");
                    rear++;
                }
            }
            else if (ch==2) {
                if (rear == 0){
                    System.out.println("Queue is underflow");
                }else{
                    System.out.println("Popped:"+ Queue[front]);
                    for(int i=0;i<rear-1;i++){
                        Queue[i]=Queue[i+1];
                    }
                    rear--;
                }
            }
            else if (ch==3) {
                if (rear== 0){
                    System.out.println("stack is underflow");
                }else{
                    System.out.println("Peek:"+ Queue[front]);
                }
            }
            else if(ch==4){
                if (rear == 0){
                    System.out.println("stack is underflow");
                }
                else{
                    for(int i=front;i<rear;i++){
                        System.out.println(Queue[i]+" ");
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
