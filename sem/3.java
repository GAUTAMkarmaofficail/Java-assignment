import java.util.Scanner;

class Main{
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     
      System.out.println("Please Enter Your Roll no"); 
         int roll = 1234;
         
         int c,dbms,math,ds,os,total=0,cut=0;
        String a="Pass",b="Fail",res,at=" ",cc="ATKT";
        String cat,dbmsat,mat,dsat,osat,status,clat,pcat,pcpat;
        status=cat=dbmsat=mat=dsat=osat=clat=pcat=pcpat=" ";
        
         
     System.out.println("Enter 6 Subjects And 2 Practicle marks");
     System.out.println("        Marks \n 1)  Maths Marks\n 2)  English Marks\n 3)  Statatisties\n 4)  DCA\n 5)  PC software Theory\n 6)  C Language Theory\n       Practicles \n 1)  PC software Practicle \n 2)  C Language Practicle ");
     System.out.println();
      
       int  marks[] = new int[8];
       int  atkt[] = new int[8];
       String sub[] = new String[8];
       
         sub[0]="Maths                ";
         sub[1]="English              ";
         sub[2]="Statatisties         ";
         sub[3]="DCA                  ";
         sub[4]="PC software Theory   ";
         sub[5]="C Language Theory    ";
         sub[6]="PC software Practicle";
         sub[7]="C Language Practicle ";

     for(int i=0; i<8; i++)
         {  
            System.out.println("Enter  "+(i+1)+" "+sub[i]+" marks");
              marks[i] = sc.nextInt();
          } 
  
      System.out.println("\t\t\tD.A.V.V"); 
       System.out.println("--------------------------------------------------------------------"); 
       System.out.println("Name : Cheeku Singh");
    
       System.out.println("Roll no : "+roll); 
       System.out.println("---------------------------------------------------------------------"); 

       System.out.println("\n");
       
       if (marks[0]<=17)
       {
          cat=cc;
          atkt[0]=1;
          cut++;
       }
       
       if (marks[1]<=17)
       {
          dbmsat=cc;
          atkt[1]=1;
           cut++;
       }
       
       if (marks[2]<=17)
       {
          mat=cc;
         atkt[2]=1;
          cut++;
       }
       
       if (marks[3]<=17)
       {
          dsat=cc;
          atkt[3]=1;
           cut++;
       }
       
       if (marks[4]<=17)
       {
          osat=cc;
          atkt[4]=1;
           cut++;
       }
       
       if (marks[5]<=17)
       {
          pcat=cc;
          atkt[5]=1;
           cut++;
       }
       
       if (marks[6]<=8)
       {
          pcpat=cc;
          atkt[6]=1;
           cut++;
       }
       
       if (marks[7]<=8)
       {
          clat=cc;
          atkt[7]=1;
           cut++;
       }
             
       for(int i=0;i<6;i++)
       {
         if(atkt[i]==1)
         {
         System.out.println(sub[i]+"       :\t"+marks[i]+"/50"+"\t\t\tATKT");
         }
       else
       {
       System.out.println(sub[i]+"       :\t"+marks[i]+"/50"+"\t\t\t");
       }      
       }
              
       for(int i=6;i<8;i++)
       {
         if(atkt[i]==1)
         {
         System.out.println(sub[i]+"       :\t"+marks[i]+"/25"+"\t\t\tATKT");
         }
       else
       {
       System.out.println(sub[i]+"       :\t"+marks[i]+"/25"+"\t\t\t");
       }      
       }
       
               for(int i=0; i<8;i++)
               total+= marks[i];
  
     if(cut==1 || cut==2)
       {
       status="Atkt";
       }
       else if(cut>=3) 
       {
       status="Fail";
       }
       else{
       status="Pass";
       }   
  //---------------------------------------------------------------------------------------------     
        System.out.println("--------------------------------------------------------------------"); 
       System.out.println("Total\t\t\t       "+total+"/350"+"\t\t\t"+status);
       System.out.println();
       System.out.println("--------------------------------------------------------------------"); 
 
      if(cut<3)
        {
        System.out.println("\t\tYou have ATKT in "+cut+" Subject");
       System.out.println("\t\t Congrats You are Promated to 2nd Sam");
         }
       else {
         System.out.println("\t\tYou have ATKT in "+cut+" Subject");
          System.out.println("\t\t Not You are Promated to 2nd Sam");
          }
System.out.println("--------------------------------------------------------------------");  
             
 //---------------------------------------------------------------------------------------------
}}
