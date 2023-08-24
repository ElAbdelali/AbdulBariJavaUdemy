class Product{
    private String itemNum;
    private String name;
    private double price;
    private short qty;

    public String getItemNum() {
        return itemNum;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        price = price;
    }

    public short getQty() {
        return qty;
    }

    public void setQty(short qty) {
        qty = qty;
    }
    public Product(String itemNo)
    {
        itemNo=itemNo;
    }
    public Product(String itemNum, String name){
        itemNum = itemNum;
        this.name = name;
    }
    Product(String itemNum, String name, double price, short qty){
        itemNum = itemNum;
        this.name = name;
        setPrice(price);
        setQty(qty);
    }

}
class Customer{
    private String custId;
    private String name;
    private String address;
    private String phno;

    public Customer(String custId,String name)
    {
        this.custId=custId;
        this.address=name;
    }
    public Customer(String custId,String name,String address,String phno)
    {
        this.custId=custId;
        this.address=name;
        setAddress(address);
        setPhno(phno);
    }

    public String getCustId(){return custId;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhno(){return phno;}

    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }


}
public class CustomerChallenge {
    public static void main(String[] args) {

    }
}
