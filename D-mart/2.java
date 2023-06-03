import java.util.Scanner;
class Main{
public static final String A= "\033[0;33m";
  public static final String B = "\033[0;30m";
    public static void main(String args[])
     
{
        Scanner sc=new Scanner(System.in);


             System.out.println("Enter costumer name ");
             String name=sc.nextLine();
             System.out.println("Enter costumer gender(M/F)");
             char gender=sc.next().charAt(0);

             char escCode = 0x1B;
            int row = 10; int column = 100;


             System.out.println("Enter ITEM 1 name ");
             String i1=sc.next();
             System.out.println("Enter quantity ");
             int q1=sc.nextInt();
             System.out.println("Enter price");
             int p1=sc.nextInt();

             System.out.println("Enter ITEM 2 name ");
             String i2=sc.next();
             System.out.println("Enter quantity ");
             int q2=sc.nextInt();
             System.out.println("Enter price");
             int p2=sc.nextInt();

             System.out.println("Enter ITEM 3 name ");
             String i3=sc.next();
             System.out.println("Enter quantity ");
             int q3=sc.nextInt();
             System.out.println("Enter price");
             int p3=sc.nextInt();

             System.out.println("Enter ITEM 4 name ");
             String i4=sc.next();
             System.out.println("Enter quantity ");
             int q4=sc.nextInt();
             System.out.println("Enter price");
             int p4=sc.nextInt();

             System.out.println("Enter ITEM 5 name ");
             String i5=sc.next();
             System.out.println("Enter quantity ");
             int q5=sc.nextInt();
             System.out.println("Enter price");
             int p5=sc.nextInt();

             System.out.println("Enter ITEM 6 name ");
             String i6=sc.next();
             System.out.println("Enter quantity ");
             int q6=sc.nextInt();
             System.out.println("Enter price");
             int p6=sc.nextInt();

             System.out.println("Enter ITEM 7 name ");
             String i7=sc.next();
             System.out.println("Enter quantity ");
             int q7=sc.nextInt();
             System.out.println("Enter price");
             int p7=sc.nextInt();

             System.out.println("Enter ITEM 8 name ");
             String i8=sc.next();
             System.out.println("Enter quantity ");
             int q8=sc.nextInt();
             System.out.println("Enter price");
             int p8=sc.nextInt();

             System.out.println("Enter ITEM 9 name ");
             String i9=sc.next();
             System.out.println("Enter quantity ");
             int q9=sc.nextInt();
             System.out.println("Enter price");
             int p9=sc.nextInt(); 

              System.out.println("Enter ITEM 10 name ");
              String i10=sc.next();
              System.out.println("Enter quantity ");
              int q10=sc.nextInt();
              System.out.println("Enter price");
              int p10=sc.nextInt();
             
             int ds=0,ds2=0,ds3=0;
           
            if(q1>4){
              
              ds=((q1*p1)-((q1*p1)/100)*5);


              }
             if(q5>=1)
{

ds2=((q5*p5)-((q5*p5)/100)*10);
}
            if(q10>=1)
{

ds3=((q10*p10)-((q10*p10)/100)*15);
}

float gst,to1,apbill,dpbill,to2;
apbill=(q1*p1)+(q2*p2)+(q3*p3)+(q4*p4)+(q5*p5)+(q6*p6)+(q7*p7)+(q8*p8)+(q9*p9)+(q10*p10);
dpbill=ds+(q1*p1)+(q2*p2)+(q3*p3)+(q4*p4)+(ds2)+(q6*p6)+(q7*p7)+(q8*p8)+(q9*p9)+(ds3);
gst=(apbill*10)/100f;

String M="Ladger Wallet"; 
String F="Cadeberry",gift="",bag="";
if(gender=='F'||gender=='f')
gift=F;
if(gender=='M'||gender=='m')
gift=M;
System.out.println("Did you carry bag to customer press (Y) otherwise press (N)");
char ch1=sc.next().charAt(0);
String y="YES",n="NO";
if(ch1=='y'||ch1=='Y')
bag=y;
else
bag=n;
 float yes=0.00f;
if(bag==y)
 yes=10.00f;

to1=apbill+gst+yes;
to2=gst+dpbill+yes;





             System.out.print(String.format("%c[%d;%df",escCode,row,column));
             System.out.println(B+A+"WELCOME TO D-MARK");
	   
             System.out.println(B+A+"********************************************************************************************************************************|");
             System.out.println(B+A+"NAME:"+name+"\t\t\t\t\t\t\t\t\t\tDATE :22/09/2022                                                                               |");
             System.out.println(B+A+"********************************************************************************************************************************|");
             System.out.println(B+A+"Item Name\t\t\t\tQuantity\t\t\t\tPrice\t\t\t\tTotal\t\t\t\tAfter-Discount\t\t\t\t|");
             System.out.println(B+A+i1+"\t\t\t\t"+q1+"\t\t\t\t"+p1+"\t\t\t\t"+(q1*p1)+"rs"+"\t\t\t\t"+ds+"\t\t\t\t|");
             System.out.println(A+i2+"\t\t\t\t"+q2+" \t\t\t\t"+p2+"\t\t\t\t"+(q2*p2)+"rs"+"\t\t\t\t"+(q2*p2)+"\t\t\t\t|");
             System.out.println(B+A+i3+"\t\t\t\t"+q3+"\t\t\t\t"+p3+"\t\t\t\t"+(q3*p3)+"rs"+"\t\t\t\t"+(q3*p3)+"\t\t\t\t|");
             System.out.println(B+A+i4+"\t\t\t\t"+q4+"\t\t\t\t"+p4+"                       "+(q4*p4)+"rs"+"          "+(q4*p4)+"      |");
             System.out.println(B+A+i5+"\t\t\t\t"+q5+"\t\t\t\t"+p5+"	                "+(q5*p5)+"rs"+"          "+ds2+"          |");
             System.out.println(B+A+i6+"\t\t\t\t"+q6+"\t\t\t\t"+p6+"	                "+(q6*p6)+"rs"+"          "+(q6*p6)+"      |");
             System.out.println(B+A+i7+"\t\t\t\t"+q7+"\t\t\t\t"+p7+"	                "+(q7*p7)+"rs"+"          "+(q7*p7)+"      |");
             System.out.println(B+A+i8+"\t\t\t\t"+q8+"                      "+p8+"	                "+(q8*p8)+"rs"+"          "+(q8*p8)+"      |");
             System.out.println(B+A+i9+"\t\t\t\t"+q9+"                      "+p9+"	                "+(q9*p9)+"rs"+"          "+(q8*p8)+"      |");
             System.out.println(B+A+i10+"\t\t\t\t"+q10+"                     "+p10+"	                "+(q10*p10)+"rs"+"        "+ds3+"      |");
             System.out.println(B+A+"********************************************************************************************************************************|");
             System.out.println(B+A+"                                                                                           AP                          DP       |");
             System.out.println(B+A+"                                                                                       "+apbill+"                  "+dpbill+"   |");
             System.out.println(B+A+"Gift :-" +gift+"                                                                          0.00                         0.00     |");

             System.out.println(B+A+"Carry Bag :"+bag+"                                                                       "+yes+"                     "+yes +"   |");
             System.out.println(B+A+"GST (10%)                                                                                "+gst +"                    "+gst +"   |");
 



             System.out.println(B+A+"*********************************************************************************************************************************|");
             System.out.println(B+A+"                                                                                          "+to1+"                       "+to2+"  |");
             System.out.println(B+A+"                                                          THANK YOU                                                              |");
             System.out.println(B+A+"                                                         VISIT AGAIN                                                             |");
             System.out.println(B+A+"                                                           D-MART                                                                |");



             System.out.println(B+A+"*********************************************************************************************************************************|");
  }
}


