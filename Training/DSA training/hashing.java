import java.util.*;
public class hashing {
    static int size=5;
    static node[] hashMap= new node[size];
    //node root;
    public static void main(String[] args) {
        while (true) {
            System.out.println("1.Insert");
            System.out.println("2.Search");
            System.out.println("3.exit");
            System.out.println("enter your choice ");
            Scanner sc = new Scanner(System.in);
            int c= sc.nextInt();

            if (c==1){
                System.out.println("enter data to be inserted ");
                int ele= sc.nextInt();
                node temp =new node();
                temp.data=ele;
                int mod = ele%size;
                if (hashMap[mod]==null){
                hashMap[mod]=temp;
                }
                else{
                    node curr =hashMap[mod];
                    while (curr.link!=null){
                        curr= curr.link;
                    }
                    curr.link=temp;
                }
            }
            else if(c==2){
                System.out.println("enter element to be searched ");
            }
        }
    }
}
class node{
    int data;
    node link ;
}
