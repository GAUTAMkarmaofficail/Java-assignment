/*6.

1 2 3 4 5
2      5
3   5
4 5
5

|| j == (7-i)|| j==1
*/
class Main{
    public static void main(String arsgs[])
    {     
     
int i,j,k=5;;
    
    for(i=1;i<=5;i++){
         for(j=1;j<=5;j++)
          {         
            if(i+j>5+1||(i==2&&j==2)||(i==2&&j==3)||(i==3&&j==2))
             System.out.print(" ");
            
              
            
            else
             System.out.print(i+j-1);
          }
      System.out.println();
    }

}
}
