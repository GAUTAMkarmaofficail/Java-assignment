/*12.
1
2*2
3*3*3
4*4*4*4
4*4*4*4
3*3*3
2*2
1

*/
class Main{
    public static void main(String args[]){     
     
int j,i;
    
    for(i=1;i<=4;i++)
     {

       
        
         for(j=1;j<=2*i-1;j++)
        
               { 
               if(j%2==1) 
             System.out.print(i);
                 else
             System.out.print("*");
               }
            System.out.println();
       
       }
      
     for(i=4;i>=1;i--)
     

       
        {
         for(j=1;j<=2*i-1;j++)
        
               { 
               if(j%2==1) 
             System.out.print(i);
                 else
             System.out.print("*");
               }
            System.out.println();
       
       
       }
  }
}
