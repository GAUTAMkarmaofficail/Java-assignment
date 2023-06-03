/*
18) Create class Product (pid, price, quantity) with parameterized constructor.Create a main function in different class (say XYZ) and perform following task:
Accept five product information from user and store in an array
Find Pid of product with highest price.
Create method (with array of product’s object as argument) in XYZ class to calculate and return total amount spent on all products. (amount spent on single product=price of product * quantity of product).
*/
import java.util.Scanner;
class Product{
    private int pid;
    private int price;
    private int qty;
    public Product(int pid, int price, int qty){
        this.pid = pid;
        this.price = price;
        this.qty = qty;
    }
    public int getPid(){
        return pid;
    }
    public int getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }
}
class TestMain{
    public static void showProducts(Product p[]){
        for(Product product : p){
            System.out.println(product.getPid()+"\t"+product.getPrice()+"\t"+product.getQty());
        }
    }
    
    public static int getTotalAmountSpent(Product p[]){
        int totalAmount = 0;
        for(Product product : p){
            totalAmount = totalAmount + product.getPrice() * product.getQty();
        }
        return totalAmount;
    }
    public static int getIdOfMaxPriceProduct(Product p[]){
        int maxPrice = p[0].getPrice();
        int maxId = p[0].getPid();
        for(int i=1; i<p.length; i++){
            if(p[i].getPrice() > maxPrice){
                maxPrice = p[i].getPrice();
                maxId = p[i].getPid();
            }
        }
        return maxId;
    }
    public static void main(String args[]){
        Product p[]  = new Product[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<p.length; i++){
            System.out.println("Enter the Details "+(i+1)+" product");
            
            System.out.println("Enter Pid");
            int pid = sc.nextInt();
            System.out.println("Enter price");
            int price = sc.nextInt();
            System.out.println("Enter Qty");
            int qty = sc.nextInt();
            
            p[i] = new Product(pid,price,qty);
        }
        TestMain.showProducts(p);
        int id = TestMain.getIdOfMaxPriceProduct(p);
        int totalAmount = TestMain.getTotalAmountSpent(p);
        
        System.out.println("Highest price wale product ka id "+id);
        System.out.println("Total Amount Spent "+totalAmount);
    }
}
