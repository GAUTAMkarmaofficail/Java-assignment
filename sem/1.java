import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
       int c,dbms,math,ds,os,total,cut=0;
       String a="Pass",b="Fail",res,at=" ",cc="ATKT";
       String cat,dbmsat,mat,dsat,osat,status;
       
      status=cat=dbmsat=mat=dsat=osat=" ";
       
          System.out.println("Please Enter Your Roll no"); 
       
       int roll =sc.nextInt(); 
  //----------------------------------------------------------------------------------------------     
       System.out.println("Please Enter Your Marks in C Programming");
       c=sc.nextInt();
       System.out.println("Please Enter Your Marks in DBMS");
       dbms=sc.nextInt();
       System.out.println("Please Enter Your Marks in Maths");
       math=sc.nextInt();
       System.out.println("Please Enter Your Marks in Data Science");
       ds=sc.nextInt();
       System.out.println("Please Enter Your Marks in Operating System"); 
       os=sc.nextInt();
       System.out.println("Please Enter Your Marks in C Programming");
       c=sc.nextInt();
    //----------------------------------------------------------------------------------------------   
       
       System.out.println("\t\t\tD.A.V.V"); 
       System.out.println("--------------------------------------------------------------------"); 
       System.out.println("Name : Cheeku Singh");
    
       System.out.println("Roll no : "+roll); 
       System.out.println("---------------------------------------------------------------------"); 
       
  
       System.out.println("\n");
       
       if (c<=33)
       {
          cat=cc;
          
          cut++;
       }
       System.out.println("C programming      :\t"+c+"/100"+"\t\t\t"+cat);
       
       if (dbms<=33)
       {
          dbmsat=cc;
          
           cut++;
       }
       System.out.println("D.B.M.S            :\t"+dbms+"/100"+"\t\t\t"+dbmsat);
       
       if (math<=33)
       {
          mat=cc;
         
          cut++;
       }
       System.out.println("Maths              :\t"+math+"/100"+"\t\t\t"+mat);
       
       if (ds<=33)
       {
          dsat=cc;
    
           cut++;
       }
       System.out.println("Data Science       :\t"+ds+"/100"+"\t\t\t"+dsat);
       
       if (os<=33)
       {
          osat=cc;
           cut++;
       }
       System.out.println("Operating System   :\t"+os+"/100"+"\t\t\t"+osat);
       
      total=c+dbms+math+ds+os;
       
      if(cut==1)
       {
       status="Atkt";
       }
       else if(cut==2) 
       {
       status="Fail";
       }
       else{
       status="Pass";
       }
  //---------------------------------------------------------------------------------------------     
        System.out.println("--------------------------------------------------------------------"); 
       System.out.println("Total\t\t\t"+total+"/500"+"\t\t\t"+status);
       System.out.println("--------------------------------------------------------------------"); 
        
    }
}
