/*11


3
44
555
6666
555
44
3

*/
class Main{
    public static void main(String args[]){     
     
int j,i,k=2;
    
    for(i=1;i<=4;i++)
     {

       k++;
        
         for(j=1;j<=2*i-1;j++)
        
               { 
               if(j%2==1) 
             System.out.print(k);
               
               }
            System.out.println();
       
       }
      
     for(i=4;i>1;i--)
     

       
        {k--;
         for(j=1;j<2*i-1;j++)
        
               { 

               if(j%2==1) 
             System.out.print(k);
                
               }
            System.out.println();
       
       
       }
  }
}
