class BasicAccount{
    public String accNum;
    public String fName;
    public String lName;
    public String address;
    public String phoneNum;
    public String dob;
    protected long balance;

    public BasicAccount() {
        // Initialize default values
        accNum = "";
        fName = "";
        lName = "";
        address = "";
        phoneNum = "";
        dob = "";
        balance = 0;
    }
    public String getAccNum(){
        return accNum;
    }

    public BasicAccount(String accNum,String fName, String lName,String add,String phoneNum,String dob)
    {
        accNum=accNum;
        fName=fName;
        lName=lName;
        address=add;
        this.phoneNum=phoneNum;
        this.dob=dob;
        balance=0;
    }

    public String getfName(){
        return fName;
    }
    public String getlName(){
        return lName;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    public void setphoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }
    public String getPhoneNum(){
        return phoneNum;
    }
    public String getDob(){
        return dob;
    }
    public long getBalance(){
        return balance;}

}
class LoanAccount extends BasicAccount{
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
class SavingsAccount extends BasicAccount{
    public void deposit(long amt)
    {
        balance+=amt;
    }
    public void withdraw(long amt)
    {
        balance-=amt;
    }
}
public class Account {
}
