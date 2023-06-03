/*17.
10101
01010
10101
01010
10101

#include<stdio.h>

int main()
{  int i,j,c,k,n;
//printf("enter n value\n");
//scanf("%d",&n);
    for(i=1; i<=5; i++) {
        for(k=1,c=0,j=1; j<=5; j++){
            //if(i>2||(j>1&&j<6)
            if((j+i)%2==0)
                    printf("%d",k);
            else
            printf("%d",c);
            }
                    printf("\n");
        }
return 0;
}*/
class Main{
    public static void main(String args[]){     
     
int j,i,k=1,c=0;
    
    for(i=1;i<=5;i++)
     {

       
        {
         for(j=1;j<=5;j++)
        
               { 
                 if((j+i)%2==0)
             System.out.print(" "+k);
                 else
             System.out.print(" "+c);
               }
            System.out.println();
       
       }
      
     
    }
  }
}
