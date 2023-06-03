import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
       int total=0,cut=0,sem=1;
 int cut1=0,year=1;
       String a="Pass",b="Fail",res,at=" ",cc="ATKT";
       String cat,dbmsat,mat,dsat,osat,status,c1,p1,p2;
        
      status=cat=dbmsat=mat=dsat=osat=c1=p1=p2=" ";
       int x[]=new int[8];
        int atkt[]=new int[8];
       
        String at0[]=new String[8];
          System.out.println("Please Enter Your Roll no"); 
        
         int roll =sc.nextInt(); 
        String sub[]=new String[8];
         System.out.println(" FIRST SEM SUBJECT IS ->");
        sub[0]="| Fundamentals of IT & Computers(T)                ";
        sub[1]="| Digital Electronics(T)                           ";
        sub[2]="| Basic Mathematics(T)                             ";
        sub[3]="| math2(T)                                         ";
        sub[4]="| EnglishCommunication(T)                          ";
        sub[5]="| C Language Lab(T)                                ";
        sub[6]="| 1 Pratical of c(P)                               ";
        sub[7]="| 2 Pratical of digital(P)                         ";
   System.out.println("Please Enter marks(P)"); 
     
           System.out.println("* Fundamentals of IT & Computers\n* Digital Electronics\n* Basic Mathematics\n* math2\n* EnglishCommunication\n* C Language Lab\n* 1 Pratical of c\n* 2 Pratical of digital ");
do{
 System.out.println();
 System.out.println();
 System.out.println("Please Enter marks of 1 sem");
 System.out.println();
 for(int i=0;i<8;i++)
   
  {
   System.out.println("Please Enter marks of : "+(i+1)+" sub"); 
   x[i]=sc.nextInt();
  }
//for(int i=0;i<8;i++)
  // System.out.println(" "+x[0]);
       
           System.out.println("|---------------------------------------------------------------------------------|");
           System.out.println("|\t\t\t\t\tD.A.V.V\t\t\t\t          |");  
           System.out.println("|\t\t\t\t\t sem"+sem+"\t\t\t\t          |"); 

           System.out.println("|---------------------------------------------------------------------------------|");
           System.out.println("|Name : Cheeku Singh                                                              |");
    
           System.out.println("|Roll no : "+roll+  "                                                            \t  |"); 
           System.out.println("|---------------------------------------------------------------------------------|"); 
       
       //System.out.println("----------------------------------------------------------------------------------|");
      // System.out.println("----------------------------------------------------------------------------------|");
      // System.out.println("\n");
      for(int i=0;i<6;i++)
       {
         if(x[i]<=17)
           {
            cut++;
            atkt[i]=1;
            at0[i]=sub[i];
           }
         
        }
           for(int i=6;i<8;i++)
       {
         if(x[i]<=8)
           {
            cut++;
            atkt[i]=1;
           at0[i]=sub[i];
           }
         
        }   
       for(int i=0;i<6;i++)
       {
         if(atkt[i]==1)
         {
         System.out.println(sub[i]+":\t"+x[i]+"/50"+"\t\tATKT      |");
         }
       else
       {
       System.out.println(sub[i]+":\t"+x[i]+"/50"+"\t\t\t  |");
       }      
       }
              
       for(int i=6;i<8;i++)
       {
         if(atkt[i]==1)
         {
         System.out.println(sub[i]+":\t"+x[i]+"/25"+"\t\tATKT      |");
         }
       else
       {
       System.out.println(sub[i]+":\t"+x[i]+"/25"+"\t\t\t  |");
       }      
       }
       
               for(int i=0; i<8;i++)
               total+= x[i];
      if(cut==2||cut==1)
       {
       status="ATKT";
       sem++;
       }
       else if(cut>=3) 
       {
       status="FAIL";
       sem++;
       }
       else{
       status="PASS";
       sem++;
       }
  //---------------------------------------------------------------------------------------------     
          System.out.println("|---------------------------------------------------------------------------------|");
       System.out.println("| Total\t\t\t\t\t\t\t"+total+"/350"+"\t\t"+status+  "      |");
        System.out.println("|---------------------------------------------------------------------------------|");
       if(cut>3) 
       {
       System.out.println("|\t\t\t \tYou have ATKT in "+cut+ " subject \t\t\t  |"); 
       System.out.println("|\t\t\t\t   Promoted to "+sem+ " sem \t\t\t\t  |");
        }
       else 
    {      
        System.out.println("|\t\t\t \tYou have ATKT in "+cut+ " subject \t\t\t  |"); 
        System.out.println("|\t\t\t\t   Promoted to "+sem+ " sem \t\t\t\t  |");
      
    }
        System.out.println("|---------------------------------------------------------------------------------|");












      
       int x1[]=new int[8+cut];
      int atkt1[]=new int[8];
        
        
        String sub1[]=new String[8];
        System.out.println(" SECOND SEM SUBJECT IS ->");
        sub1[0]=" Operating Systems and Fundamentals(T)              ";
        sub1[1]=" EnglishCommunication(T)                            ";
        sub1[2]=" Organizational Behaviour(T)                        ";
        sub1[3]=" C Language Advanced Concepts(T)                    ";
        sub1[4]=" Advanced Mathematics(T)                            ";
        sub1[5]=" Advanced C Programming Lab(T)                      ";
        sub1[6]=" 1 Pratical (p)                                     ";
        sub1[7]=" 2 Pratical (P)                                     ";
        //sub1[]=" 2 Pratical (P)                         ";
   //System.out.println("Please Enter marks(P)"); 
     
           System.out.println("1) Operating Systems and Fundamentals\n 2) EnglishCommunication\n3) Organizational Behaviour\n4) C Language Advanced Concepts\n5) Advanced Mathematics\n6) Advanced C Programming Lab \n7) 1 Practical\n 8) 2 Practical");
 System.out.println();
  System.out.println("Please Enter marks of 2 sem");
 System.out.println();

 for(int i=0;i<x1.length;i++)
  {
   System.out.println("Please Enter marks of : "+(i+1)+" sub"); 
   x1[i]=sc.nextInt();
  }
System.out.println("|---------------------------------------------------------------------------------|");
           System.out.println("|\t\t\t\t\tD.A.V.V\t\t\t\t          |");  
           System.out.println("|\t\t\t\t\t sem"+sem+"\t\t\t\t          |"); 

           System.out.println("|---------------------------------------------------------------------------------|");
           System.out.println("|Name : Cheeku Singh                                                              |");
    
           System.out.println("|Roll no : "+roll+  "                                                            \t  |"); 
           System.out.println("|---------------------------------------------------------------------------------|"); 
       System.out.println("\n");
      for(int i=0;i<6;i++)
       {
         if(x1[i]<=17)
           {
            cut1++;
            atkt1[i]=1;
           }
         
        }
           for(int i=6;i<8;i++)
       {
         if(x1[i]<=8)
           {
            cut1++;
            atkt1[i]=1;
           }
         
        }   
       for(int i=0;i<6;i++)
       {
         if(atkt1[i]==1)
         {
         System.out.println(sub1[i]+":\t"+x1[i]+"/50"+"\t\tATKT");
         }
       else
       {
       System.out.println(sub1[i]+":\t"+x1[i]+"/50"+"\t\t");
       }      
       }
              
       for(int i=6;i<8;i++)
       {
         if(atkt1[i]==1)
         {
         System.out.println(sub1[i]+":\t"+x1[i]+"/25"+"\t\tATKT");
         }
       else
       {
       System.out.println(sub1[i]+":\t"+x1[i]+"/25"+"\t\t\t");
       }      
       }
 for(int i=0;i<8;i++)
       {
         if(atkt[i]==1)
         {
         System.out.println(at0[i]+":\t"+x1[i]+"/50"+"\t\t");
         }
       
       }
      
       total=0;
      
               for(int i=0; i<x1.length;i++)

               total+= x1[i];
      if(cut1==2||cut1==1)
       {
       status="ATKT";
       sem++;
      
       year++;
       }
       else if(cut1>=3) 
       {
       status="Sem back";
       sem++;
       
      year++;
       }
       else{
       status="Pass";
       sem++;
      
  year++;
       }
  //--------------------------------------------------------------------------------------------    
        System.out.println("--------------------------------------------------------------------"); 
       System.out.println("Total\t\t\t\t\t"+total+"/350"+"\t\t\t"+status);
       System.out.println("--------------------------------------------------------------------");
       if(cut1>3) 
       {
       System.out.println("\t\t You have ATKT in "+cut1+ " subject \t\t"); 
       System.out.println("\t\t not Promoted to "+year+ " year due to ATKT\t"); }
       else 
    {      
       System.out.println("\t\t You have ATKT in "+cut1+ " subject \t\t");
       //System.out.println("\t\t Congrats Promoted to "+sem+ " Sem\t\t"); 
       System.out.println("\t\t Congrats Promoted to "+year+ " year\t\t"); 
      
    }
System.out.println("*************************************************************************");
}while(cut1>3);
/********************************************************************************************************************************************************************************************************/

/************************************************************************************************************************************************/
        int total1=0,cut2=0,sem3=3;
 int cut3=0,year1=2;
      // String a="Pass",b="Fail",res,at=" ",cc="ATKT";
      // String cat,dbmsat,mat,dsat,osat,status,c1,p1,p2;
        
      //status=cat=dbmsat=mat=dsat=osat=c1=p1=p2=" ";
       int x3[]=new int[8];
        int atkt3[]=new int[8];
       
        String at1[]=new String[8];
       //   System.out.println("Please Enter Your Roll no"); 
       
       //  int roll =sc.nextInt(); 
        String sub3[]=new String[8];
        System.out.println(" THIRD SEM SUBJECT IS ->");
        sub3[0]=" Database Management Systems(T)                    ";
        sub3[1]=" Open Source Technology(T)                         ";
        sub3[2]=" Software Engineering(T)                           ";
        sub3[3]=" Web-Based Applications(T)                         ";
        sub3[4]=" DBMS and Web Technology Lab                       ";
        sub3[5]="  DBMS1 and Web Technology Lab                     ";
        sub3[6]=" 1 Pratical3 of c(P)                               ";
        sub3[7]=" 2 Pratical3 of digital(P)                         ";
   //System.out.println("Please Enter marks(P)"); 
     
           System.out.println("1) Database Management Systems\n2) Open Source Technology\n3) Software Engineering\n4) Web-Based Applications\n5) DBMS and Web Technology Lab\n6) DBMS1 and Web Technology Lab\n7) 1 Pratical3 of c\n8) 2 Pratical3 of digital ");
do{
 System.out.println();

 System.out.println("Please Enter marks of 3 sem");
 System.out.println();
 System.out.println();
 for(int i=0;i<8;i++)
  {
   System.out.println("Please Enter marks of : "+(i+1)+" sub"); 
   x3[i]=sc.nextInt();
  }
       
System.out.println("|---------------------------------------------------------------------------------|");
           System.out.println("|\t\t\t\t\tD.A.V.V\t\t\t\t          |");  
           System.out.println("|\t\t\t\t\t sem"+sem+"\t\t\t\t          |"); 

           System.out.println("|---------------------------------------------------------------------------------|");
           System.out.println("|Name : Cheeku Singh                                                              |");
    
           System.out.println("|Roll no : "+roll+  "                                                            \t  |"); 
           System.out.println("|---------------------------------------------------------------------------------|"); 
       System.out.println("\n");
      for(int i=0;i<6;i++)
       {
         if(x3[i]<=17)
           {
            cut2++;
            atkt3[i]=1;
            at1[i]=sub3[i];
           }
         
        }
           for(int i=6;i<8;i++)
       {
         if(x3[i]<=8)
           {
            cut2++;
            atkt3[i]=1;
           at1[i]=sub3[i];
           }
         
        }   
       for(int i=0;i<6;i++)
       {
         if(atkt3[i]==1)
         {
         System.out.println(sub3[i]+":\t"+x3[i]+"/50"+"\t\tATKT");
         }
       else
       {
       System.out.println(sub3[i]+":\t"+x3[i]+"/50"+"\t\t");
       }      
       }
              
       for(int i=6;i<8;i++)
       {
         if(atkt3[i]==1)
         {
         System.out.println(sub3[i]+":\t"+x3[i]+"/25"+"\t\tATKT");
         }
       else
       {
       System.out.println(sub3[i]+":\t"+x3[i]+"/25"+"\t\t\t");
       }      
       }
       
               for(int i=0; i<8;i++)
               total1+= x3[i];
      if(cut2==2||cut2==1)
       {
       status="ATKT";
       sem3++;
       }
       else if(cut2>=3) 
       {
       status="Sem back";
       sem3++;
       }
       else{
       status="Pass";
       sem3++;
       }
  //---------------------------------------------------------------------------------------------     
        System.out.println("--------------------------------------------------------------------"); 
       System.out.println("Total\t\t\t\t\t"+total1+"/350"+"\t\t\t"+status);
       System.out.println("--------------------------------------------------------------------");
       if(cut2>3) 
       {
       System.out.println("\t\t You have ATKT in "+cut2+ " subject \t\t"); 
       System.out.println("\t\t Not Promoted to "+sem3+ " sem due to ATKT\t"); }
       else 
    {      
       System.out.println("\t\t You have ATKT in "+cut2+ " subject \t\t");
       System.out.println("\t\t Congrats Promoted to "+sem3+ " sem\t\t"); 
      
    }
System.out.println("*************************************************************************");















      
       int x4[]=new int[8+cut2];
      int atkt4[]=new int[8];
        
        
        String sub4[]=new String[8];
      System.out.println(" FOUR SEM SUBJECT IS ->");
        sub4[0]=" Web Designing(T)                                   ";
        sub4[1]=" Data Structures(T)                                 ";
        sub4[2]=" Introduction to Linux(T)                           ";
        sub4[3]=" C Language Advanced Concepts(T)                    ";
        sub4[4]=" Elective(T)                                        ";
        sub4[5]=" Advanced C Programming Lab(T)                      ";
        sub4[6]=" 1 Pratical (p)                                     ";
        sub4[7]=" 2 Pratical (P)                                     ";
        //sub1[]=" 2 Pratical (P)                         ";
   //System.out.println("Please Enter marks(P)"); 
     
           System.out.println("1)Web Designing\n 2)Data Structures\n3) Introduction to Linux\n4)Object-Oriented Programming\n5) Elective \n6) Advanced C Programming Lab \n7) 1 Practical\n 8) 2 Practical");

 System.out.println("Please Enter marks of 4 sem");
 for(int i=0;i<x4.length;i++)
  {
   System.out.println("Please Enter marks of : "+(i+1)+" sub"); 
   x4[i]=sc.nextInt();
  }
System.out.println("|---------------------------------------------------------------------------------|");
           System.out.println("|\t\t\t\t\tD.A.V.V\t\t\t\t          |");  
           System.out.println("|\t\t\t\t\t sem"+sem+"\t\t\t\t          |"); 

           System.out.println("|---------------------------------------------------------------------------------|");
           System.out.println("|Name : Cheeku Singh                                                              |");
    
           System.out.println("|Roll no : "+roll+  "                                                            \t  |"); 
           System.out.println("|---------------------------------------------------------------------------------|"); 
       System.out.println("\n");
      for(int i=0;i<6;i++)
       {
         if(x4[i]<=17)
           {
            cut3++;
            atkt4[i]=1;
           }
         
        }
           for(int i=6;i<8;i++)
       {
         if(x4[i]<=8)
           {
            cut3++;
            atkt4[i]=1;
           }
         
        }   
       for(int i=0;i<6;i++)
       {
         if(atkt4[i]==1)
         {
         System.out.println(sub4[i]+":\t"+x4[i]+"/50"+"\t\tATKT");
         }
       else
       {
       System.out.println(sub4[i]+":\t"+x4[i]+"/50"+"\t\t");
       }      
       }
              
       for(int i=6;i<8;i++)
       {
         if(atkt4[i]==1)
         {
         System.out.println(sub4[i]+":\t"+x4[i]+"/25"+"\t\tATKT");
         }
       else
       {
       System.out.println(sub4[i]+":\t"+x4[i]+"/25"+"\t\t\t");
       }      
       }
 for(int i=0;i<8;i++)
       {
         if(atkt3[i]==1)
         {
         System.out.println(at1[i]+":\t"+x4[i]+"/50"+"\t\t");
         }
       
       }
      
       total1=0;
      
               for(int i=0; i<x4.length;i++)

               total1+= x4[i];
      if(cut3==2||cut3==1)
       {
       status="ATKT";
       sem3++;
      
       year1++;
       }
       else if(cut1>=3) 
       {
       status="Sem back";
       sem3++;
       
      year1++;
       }
       else{
       status="Pass";
       sem3++;
      
  year1++;
       }
  //--------------------------------------------------------------------------------------------    
        System.out.println("--------------------------------------------------------------------"); 
       System.out.println("Total\t\t\t\t\t"+total1+"/350"+"\t\t\t"+status);
       System.out.println("--------------------------------------------------------------------");
       if(cut>3) 
       {
       System.out.println("\t\t You have ATKT in "+cut3+ " subject \t\t"); 
       System.out.println("\t\t Not Promoted to "+year1+ " year due to ATKT\t"); }
       else 
    {      
       System.out.println("\t\t You have ATKT in "+cut3+ " subject \t\t");
       //System.out.println("\t\t Congrats Promoted to "+sem+ " Sem\t\t"); 
       System.out.println("\t\t Congrats Promoted to "+year1+ " year\t\t"); 
      
    }
System.out.println("*************************************************************************");
}while(cut3>3);
/************************************************************************************************************************************************************************/
        int total2=0,cut4=0,sem4=5;
 int cut5=0,year2=3;
      // String a="Pass",b="Fail",res,at=" ",cc="ATKT";
      // String cat,dbmsat,mat,dsat,osat,status,c1,p1,p2;
        
      //status=cat=dbmsat=mat=dsat=osat=c1=p1=p2=" ";
       int x5[]=new int[8];
        int atkt5[]=new int[8];
       
        String at2[]=new String[8];
       //   System.out.println("Please Enter Your Roll no"); 
       
       //  int roll =sc.nextInt(); 
        String sub5[]=new String[8];
   System.out.println(" FIVTH SEM SUBJECT IS ->");
        sub5[0]=" Database Management Systems(T)                    ";
        sub5[1]=" Open Source Technology(T)                         ";
        sub5[2]=" Software Engineering(T)                           ";
        sub5[3]=" Web-Based Applications(T)                         ";
        sub5[4]=" DBMS and Web Technology Lab                       ";
        sub5[5]="  DBMS1 and Web Technology Lab                     ";
        sub5[6]=" 1 Pratical3 of c(P)                               ";
        sub5[7]=" 2 Pratical3 of digital(P)                         ";
  // System.out.println("Please Enter marks(P)"); 
     
           System.out.println("1) Database Management Systems\n2) Open Source Technology\n3) Software Engineering\n4) Web-Based Applications\n5) DBMS and Web Technology Lab\n6) DBMS1 and Web Technology Lab\n7) 1 Pratical3 of c\n8) 2 Pratical3 of digital ");
do{
 System.out.println();
 System.out.println("Please Enter marks of 5 sem");
 System.out.println();
 for(int i=0;i<8;i++)
  {
   System.out.println("Please Enter marks of : "+(i+1)+" sub"); 
   x5[i]=sc.nextInt();
  }
       
System.out.println("|---------------------------------------------------------------------------------|");
           System.out.println("|\t\t\t\t\tD.A.V.V\t\t\t\t          |");  
           System.out.println("|\t\t\t\t\t sem"+sem+"\t\t\t\t          |"); 

           System.out.println("|---------------------------------------------------------------------------------|");
           System.out.println("|Name : Cheeku Singh                                                              |");
    
           System.out.println("|Roll no : "+roll+  "                                                            \t  |"); 
           System.out.println("|---------------------------------------------------------------------------------|"); 
  
       System.out.println("\n");
      for(int i=0;i<6;i++)
       {
         if(x5[i]<=17)
           {
            cut4++;
            atkt5[i]=1;
            at2[i]=sub5[i];
           }
         
        }
           for(int i=6;i<8;i++)
       {
         if(x5[i]<=8)
           {
            cut2++;
            atkt5[i]=1;
           at2[i]=sub5[i];
           }
         
        }   
       for(int i=0;i<6;i++)
       {
         if(atkt5[i]==1)
         {
         System.out.println(sub5[i]+":\t"+x5[i]+"/50"+"\t\tATKT");
         }
       else
       {
       System.out.println(sub5[i]+":\t"+x5[i]+"/50"+"\t\t");
       }      
       }
              
       for(int i=6;i<8;i++)
       {
         if(atkt5[i]==1)
         {
         System.out.println(sub5[i]+":\t"+x5[i]+"/25"+"\t\tATKT");
         }
       else
       {
       System.out.println(sub5[i]+":\t"+x5[i]+"/25"+"\t\t\t");
       }      
       }
       
               for(int i=0; i<8;i++)
               total2+= x5[i];
      if(cut4==2||cut4==1)
       {
       status="ATKT";
       sem4++;
       }
       else if(cut4>=3) 
       {
       status="Sem back";
       sem4++;
       }
       else{
       status="Pass";
       sem4++;
       }
  //---------------------------------------------------------------------------------------------     
        System.out.println("--------------------------------------------------------------------"); 
       System.out.println("Total\t\t\t\t\t"+total2+"/350"+"\t\t\t"+status);
       System.out.println("--------------------------------------------------------------------");
       if(cut4>=3) 
       {
       System.out.println("\t\t You have ATKT in "+cut4+ " subject \t\t"); 
       System.out.println("\t\t Not Promoted to "+sem4+ " sem due to ATKT\t"); }
       else 
    {      
       System.out.println("\t\t You have ATKT in "+cut4+ " subject \t\t");
       System.out.println("\t\t Congrats Promoted to "+sem4+ " sem\t\t"); 
      
    }
System.out.println("*************************************************************************");















      
       int x6[]=new int[8+cut4];
      int atkt6[]=new int[8];
        
        
        String sub6[]=new String[8];
System.out.println(" SIX SEM SUBJECT IS ->");
        sub6[0]=" Web Designing(T)                                   ";
        sub6[1]=" Data Structures(T)                                 ";
        sub6[2]=" Introduction to Linux(T)                           ";
        sub6[3]=" C Language Advanced Concepts(T)                    ";
        sub6[4]=" Elective(T)                                        ";
        sub6[5]=" Advanced C Programming Lab(T)                      ";
        sub6[6]=" 1 Pratical (p)                                     ";
        sub6[7]=" 2 Pratical (P)                                     ";
        //sub1[]=" 2 Pratical (P)                         ";
   System.out.println("Please Enter marks(P)"); 
     
           System.out.println("1)Web Designing\n 2)Data Structures\n3) Introduction to Linux\n4)Object-Oriented Programming\n5) Elective \n6) Advanced C Programming Lab \n7) 1 Practical\n 8) 2 Practical");
 System.out.println();
 System.out.println("Please Enter marks of 5 sem");
 System.out.println();
 for(int i=0;i<x6.length;i++)
  {
   System.out.println("Please Enter marks of : "+(i+1)+" sub"); 
   x6[i]=sc.nextInt();
  }
System.out.println("|---------------------------------------------------------------------------------|");
           System.out.println("|\t\t\t\t\tD.A.V.V\t\t\t\t          |");  
           System.out.println("|\t\t\t\t\t sem"+sem+"\t\t\t\t          |"); 

           System.out.println("|---------------------------------------------------------------------------------|");
           System.out.println("|Name : Cheeku Singh                                                              |");
    
           System.out.println("|Roll no : "+roll+  "                                                            \t  |"); 
           System.out.println("|---------------------------------------------------------------------------------|"); 
  
       System.out.println("\n");
      for(int i=0;i<6;i++)
       {
         if(x6[i]<=17)
           {
            cut5++;
            atkt6[i]=1;
           }
         
        }
           for(int i=6;i<8;i++)
       {
         if(x6[i]<=8)
           {
            cut5++;
            atkt6[i]=1;
           }
         
        }   
       for(int i=0;i<6;i++)
       {
         if(atkt6[i]==1)
         {
         System.out.println(sub6[i]+":\t"+x6[i]+"/50"+"\t\tATKT");
         }
       else
       {
       System.out.println(sub6[i]+":\t"+x6[i]+"/50"+"\t\t");
       }      
       }
              
       for(int i=6;i<8;i++)
       {
         if(atkt6[i]==1)
         {
         System.out.println(sub6[i]+":\t"+x6[i]+"/25"+"\t\tATKT");
         }
       else
       {
       System.out.println(sub6[i]+":\t"+x6[i]+"/25"+"\t\t\t");
       }      
       }
 for(int i=0;i<8;i++)
       {
         if(atkt5[i]==1)
         {
         System.out.println(at2[i]+":\t"+x6[i]+"/50"+"\t\t");
         }
       
       }
      
       total2=0;
      
               for(int i=0; i<x6.length;i++)

               total2+= x6[i];
      if(cut5==2||cut5==1)
       {
       status="ATKT";
       sem4++;
      
       year2++;
       }
       else if(cut1>=3) 
       {
       status="Sem back";
       sem4++;
       
      year2++;
       }
       else{
       status="Pass";
       sem4++;
      
  year2++;
       }
  //--------------------------------------------------------------------------------------------    
        System.out.println("--------------------------------------------------------------------"); 
       System.out.println("Total\t\t\t\t\t"+total2+"/350"+"\t\t\t"+status);
       System.out.println("--------------------------------------------------------------------");
       if(cut>3) 
       {
       System.out.println("\t\t You have ATKT in "+cut5+ " subject \t\t"); 
       System.out.println("\t\t Not Promoted to "+year2+ " year due to ATKT\t"); 
       }
       else 
       {      
       System.out.println("\t\t You have ATKT in "+cut5+ " subject \t\t");
       //System.out.println("\t\t Congrats Promoted to "+sem+ " Sem\t\t"); 
       System.out.println("\t\t Congrats Promoted to "+year2+ " year\t\t"); 
      
       }
               System.out.println("*************************************************************************");
    
}while(cut5>3);
}
}

