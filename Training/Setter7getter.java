public class Setter7getter {
    public static void main(String[] args) {
        Emp.setID(107);
        Emp.setName("Amar");
        Emp.setSalary(4600);
        Emp e= new Emp();
        e.setAdd("Mangal bazar");
        System.out.println(e.getAdd());
        System.out.println(Emp.getName());
        test t1 = new test(10, 20);
        test t2 = new test(370, 489);
        System.out.println(t1);
        System.out.println(t2);
    }
}
class Emp{
    private static int ID;
    private static String Name;
    private static double Salary;
    private String Add;

    public static void setID(int Id){
        Emp.ID =Id;
    }
    
    public static void setName(String Name){
        Emp.Name =Name;
    }

 static void setSalary(double Salary){
    Emp.Salary =Salary;
}
public static String getName(){//name of the class is used here
    return Emp.Name;
}
public void setAdd(String Add){//setting instant private variable 
    this.Add=Add;
}
public String getAdd(){//getting instant private varaiable this is used for instant varaible
    return this.Add;
}
}


class test{
    private int a,b;
    public test(int a,int b){
        this.a=a;
        this.b=b;
    }
    public String toString(){//this will be displayed if we will try to print t1 and t2 object and it display without calling
        return this.a +" "+this.b;
    }
}
