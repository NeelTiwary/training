public class Bank {
    public static void main(String[] args) {
        Account acc = new Account(5000, "Amar", 1234567);
        System.out.println(acc);
        acc.setName("Ameer");
        System.out.println(acc);
        System.out.println("Balance:"+ acc.getBalance());
        acc.deposit(2000);
        System.out.println(acc);
        acc.withdraw(500);
        System.out.println(acc);
    }
}

class Account{
    private int balance;
    private String name;
    private int pin;
    public Account(int balance,String name, int pin){
        this.balance =balance;
        this.name=name;
        this.pin=pin;
    }
    public String toString(){
        return "Details:"+this.balance+" "+this.name+" "+this.pin;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
    public void setName(String Name){
        this.name = Name;
    }
    public void setPin(int pin){
        this.pin=pin;
    }
    public int getBalance(){
        return this.balance;
    }
    public String getName(){
        return this.name;
    }
    public int getPin(){
        return this.pin;
    }
    public void deposit(int amt){
        this.balance = this.balance+amt;
    }
    public void withdraw(int amt){
        if (this.balance>amt) {
            this.balance=this.balance-amt;
        }
        else{
            System.out.println("Low Balance");
        }
    }
}