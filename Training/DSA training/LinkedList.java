import java.util.*;
public class LinkedList {
    static node root=null;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Append");
            System.out.println("2.Display");
            System.out.println("3.lenght");
            System.out.println("4.Add first");
            System.out.println("5.Add after");
            System.out.println("6.Search");
            System.out.println("7.Delete from front");
            System.out.println("8.Delte after");
            System.out.println("9.swaping values");
            System.out.println("10.exit");

            System.out.println("enter your choice");
            int ch =sc.nextInt();

            if (ch==1) {
                System.out.println("enter element  to be added");
                int ele =sc.nextInt();
                insert(ele);
            }
            else if (ch==2) {
                display();
            }
            else if(ch==3){
                 int size =length();
                 System.out.println("Lenght is :"+size);
            }
            else if(ch==4){
                System.out.println("enter element  to be added");
                int ele =sc.nextInt();
                addFirst(ele);
            }
            else if(ch==5){
                System.out.println("enter element  to be added");
                int ele =sc.nextInt();
                System.out.println("Enter index to be added ");
                int index =sc.nextInt();
                addAfter(ele,index);
            }
            else if (ch==6){
                System.out.println("enter element  to be searched");
                int ele =sc.nextInt();
                int count=search(ele);
                System.out.println("found at "+count);
            }
            else if(ch==7){
                delete();
               }
               else if(ch==8){
                System.out.println("enter location at which you want delete");
                int loc = sc.nextInt();
                deleteAfter(loc);
               }
               else if(ch==9){
                System.out.println("enter two locations to be swaped");
                int loc1 = sc.nextInt();
                int loc2 = sc.nextInt();
                swap(loc1,loc2);
               }
            else if (ch==10) {
                System.out.println("ending programme");
                break;
            }
            else{
                System.out.println("wrong input");
            }
        }
    }

     static void display(){
        node temp=root;
        if (root==null){
            System.out.println("list is empty");
        }
        else{
        while (temp!=null) {
            System.out.println("Element:" +temp.data);
            temp=temp.link;
        }
    }
    }
    static void insert(int ele){
        node temp = new node();
        temp.data=ele;
        if( root ==null){
            root=temp;
        }
        else{
            node temp1 =root;
            while(temp1.link!=null){
                temp1=temp1.link;
            }
            temp1.link=temp;
        }
    }
    static int length(){
        node temp =root;
        int count=0;
        while(temp!=null){
            count++;
        }
        return count;
    }
    static void addFirst(int ele){
        node temp = new node();
        temp.data=ele;
        temp.link=root;
        root=temp;
    }
    static void addAfter(int ele, int index){
        node temp = new node();
        temp.data =ele;
        node temp1=root;
        if(length()<index||length()>0){
            System.out.println("apae se bahar hoo aap");
        }
        else{
            for (int i=0;i<index;i++){
                temp1=temp1.link;
            }
                temp.link=temp1.link;
                temp1.link=temp;
        }
    }
    static int search(int ele){
        int count=0;
        node temp =new node();
        temp = root;
        while (temp!=null) {
            temp.data=ele;
            count++;
            return count;
        }
        return 0;
    }
    static void delete(){
        if (root==null){
            System.out.println("Kuch hoga tab na delete karo ga");
        }
        else {
            node temp =new node();
            temp=root;
            root=temp.link;
            temp.link=null;

        }
    }
    static void deleteAfter(int loc){
        node temp =root;
        for (int i=0;i<loc;i++){
            temp=temp.link;
        }
        node temp1=temp.link;
        temp.link=temp1.link;
        temp1.link=null;
    }
    static void swap(int loc1 , int loc2){
        if ((loc1<length()&&loc1>0)&&(loc2<length()&&loc2>0)){
        node temp=root;
        for (int i=0;i<loc1;i++){
            temp=temp.link;
        }
        node temp2=root;
        for (int i=0;i<loc2;i++){
            temp2=temp2.link;
        }
        int swap;
        swap=temp.data;
        temp2.data=temp.data;
        temp.data=swap;
    }
}
}

class node{
    int data;
    node link;
}
