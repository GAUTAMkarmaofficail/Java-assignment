/*13.
1
2*3
4*5*6
7*8*9*10
7*8*9*10
4*5*6
2*3
1



*/
class Main{
    public static void main(String args[]){     
     
int j,n=4,i,k=1,seq;
    
    for(i=1;i<=n;i++)
     {
         for(j=1;j<=2*i-1;j++)
        
             { 
               if(j%2==0) 
               System.out.print("*");
                 else
                System.out.print(k++);
             }
            System.out.println();
    }
         k=k-i+1;
    for(j=1;j<=2*n-1;j++)
         { 
          if(j%2==0) 
           System.out.print("*");
             else
           System.out.print(k++);
        
         }
        System.out.println();
        seq=2*n-1;
        for(i=1;i<=n;i++)
     {

       k=k-seq;
        
         for(j=1;j<=2*(n-i)-1;j++)
        
               { 
               if(j%2==0) 
               System.out.print("*");
                 else
             
             System.out.print(k++);
               }
    
           System.out.println();
          seq=seq-2;
       
       
       
       }
  }
}
