/* 
class Account{
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;

    public Account(String acc, String n, String add, String phno, String dob)
    {
        accNo=acc;
        name=n;
        address=add;
        this.phno=phno;
        this.dob=dob;
        balance=0;
    }
    public String getAccNo(){return accNo;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhno(){return phno;}
    public String getDOB(){return dob;}
    public long getbalance(){return balance;}

    public void setAddress(String ad){address=ad;}
    public void setPhno(String phno){this.phno=phno;}

}
class SavingsAccount extends Account
{
    public void deposit(long amt)
    {
        balance+=amt;
    }
    public void withdraw(long amt)
    {
        balance-=amt;
    }

}
class LoanAccount extends Account
{
    public void payEMI(long amt)
    {
        balance-=amt;
    }
    public void repay(long amt)
    {
        if(balance==amt)
            balance=0;
    }
}

public class BankAccount
{
    public static void main(String args[])
    {
        Account ac=new Account[2];
        ac[0]=new Account("123456789","Ayush Singh","Telibagh lko","6986846969","18-02-2003");
        ac[1]=new Account("987654321","Mahima Tripathi","Sector 5","9936993492","09-02-2003");
        for(Account i:ac)
        {
            System.out.println(i);
        }
        
    }
}
*/