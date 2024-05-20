public class HasA {
    public static void main(String[] args) {
        adress a =new adress("amhura","bbsr","odisha");
        emp empl =new emp(101,"ram",100000,a);
        System.out.println("Details:"+ empl);
    System.out.println("Detials:"+ a);
    } 
}
class emp{
    int id;
    String name;
    double salary;
    adress a;
    
    emp(int id , String name,double salary,adress a){
        this.id =id;
        this.name=name;
        this.salary=salary;
        this.a=a;
    }

    public String toString(){
        return "Details"+ id +" "+name+" "+salary+",";
    }
}

class adress{
    String street,city,state;
    adress(String street, String city ,String state){
        this.street=street;
        this.city=city;
        this.state=state;
    }

    public String toString(){
        return "Details "+ street +" "+city+" "+state;
    }
}