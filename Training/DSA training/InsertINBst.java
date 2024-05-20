import java.util.*;
public class InsertINBst {
    static node3 root= null;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Insert");
            System.out.println("2.Inorder tarversal");
            System.out.println("3.Deletion");
            System.out.println("Enter your choice");
            int ch = sc.nextInt();
            if (ch==1){
                System.out.println("Enter element to be inserted :");

                int ele = sc.nextInt();
                insert(ele);
            }
            else if (ch==2){
                node3 r = root;
                InoderTraverse(r);
            }
            else if(ch==3){
                System.out.println("Enter the element to be ");
                int a = sc.nextInt();
                delete(a);
            }
        }

    }

    static void insert (int ele){
        node3 curr = new node3();
        node3 temp,parent;
        curr.data=ele;
        if (root==null){
            root=curr;
            return;
        }
        else {
            temp =root;
            parent=null;
            while(temp!=null){
                parent=temp;
                if(ele>temp.data){
                    temp=temp.right;
                }
                else{
                    temp = temp.left;
                
                }
            }
            if(ele<parent.data){
                parent.right=curr;
            }
            else{
                parent.left=curr;
            }
            System.out.println("Input Taken...");
        }
        
        }
        static void InoderTraverse(node3 r){
            if(r!=null){
                InoderTraverse(r.left);
                System.out.println(r.data);
                InoderTraverse(r.right);
            }
        }
        static void delete(int a){
            int found=0;
            node3 current = new node3();
            node3 parent = new node3();
            current =root;
            while(current!=null){
                if (current.data==a){
                    found=1;
                }
                else{
                    parent=current;
                    if (a>current.data){
                        current=current.right;
                    }
                    else{
                        current=current.left;
                    }
                }
                
            }
                if (found==0){
                    System.out.println("Element not found tu bata kaise delete karo ");
                }
            if(current.left==null||current.right==null){
                if(current==parent.left){
                    parent.left=null;
                } 
                else{
                    parent.right=null;
                }
                System.out.println("Element deleted:");
            }
            else if(((current.left!=null)||(current.right==null))&&((current.left==null)||(current.right==null))){
                if((current.left!=null)||(current.right==null)){
                    if (current==parent.left){
                        parent.left=current.right;
                        current.left=current.right=null;
                    }
                    else{
                        parent.right=current.right;
                    }
                }
                else{
                    if((current.left==null)||(current.right==null)){
                        if(current==parent.right){
                            parent.right=current.left;
                            current.left=current.right=null;
                        }
                        else{
                            parent.left=current.right;
                            current.left=current.right=null;
                        }
                    }
                }
            }
            else if(current.left!=null && current.right!=null){
                node3 t1;
                t1=current.right;
                if(t1.right==null&& t1.left==null){
                    
                        current.data=t1.data;
                        current.right=t1.right;
                }
                else {
                    
                }
            }
        }
}


class node3 {
    int data;
    node3 left;
    node3 right;
}
