/*
1) Create class Product (pid, price, quantity) with parameterized constructor.Create a main function in different class (say XYZ) and perform following task:
Accept five product information from user and store in an array
Find Pid of product with highest price.
Create method (with array of product’s object as argument) in XYZ class to calculate and return total amount spent on all products. (amount spent on single product=price of product * quantity of product).
*/
import java.util.Scanner;
class Product{
	private String Name;
       private int pid;
    private int price;
    private int qty;
	private String colour;
	private String Brand;
    public Product(String Name,int pid, int   price, int qty,String colour,String Brand ){
        this.Name = Name;
		this.pid = pid;
		this.price = price;
		this.qty = qty;
		this.colour = colour;
		this.Brand = Brand;
        }
    public String getName(){
        return Name;
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
    public String getColour(){
        return colour;
    }
	public String getBrand(){
        return Brand;
    }
   
}
class TestMain{
    public static void showProducts(Product p[]){
              System.out.println("|-----------------------------------------------------------------------------------------------|");
              System.out.println("|product_No\t|product_id\t|product_Price\t|product_Qty\t|product_Colour\t|product_Brand  |");
              System.out.println("|-----------------------------------------------------------------------------------------------|");
        for(Product product : p){
      
            System.out.println("|"+product.getName()+"\t\t|"+product.getPid()+"\t\t|"+product.getPrice()+"\t\t|"+product.getQty()+"\t\t|"+product.getBrand()+"\t\t|"+product.getBrand()+"\t\t|");
        }
            System.out.println("|-----------------------------------------------------------------------------------------------|");
   }
   
    
    public static void main(String args[]){
        Product p[]  = new Product[1];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<p.length; i++){
			/*public Product(String Name,int pid, int price, int qty,String colour,String Brand )*/
            System.out.println("Enter the Details "+(i+1)+" product");
            
            System.out.println("Enter product Name");
            String Name = sc.nextLine();
			System.out.println("Enter Product Pid");
            int pid = sc.nextInt();
			System.out.println("Enter Product Price");
            int price = sc.nextInt();
			System.out.println("Enter Product Quantity");
            int qty = sc.nextInt();
                        System.out.println("Enter Product Colour");
            sc.next();             
            String colour = sc.nextLine();
                        System.out.println("Enter Product Brand");
            String brand = sc.nextLine();
            
            p[i] = new Product(Name,pid,price,qty,colour,brand);
        }
    
    
        TestMain.showProducts(p);
    
    }
}
