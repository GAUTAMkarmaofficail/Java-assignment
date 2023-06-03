/*#include <stdio.h>

int main()
{
    int rows, i, j, k;
    printf("Enter the Number of Rows : ");
    scanf("%d", &rows);
    for (i = rows; i >= 1; i--)
    {
        i % 2 == 0 ? (k = 1) : (k = i);
        for (j = 1; j <= i; j++)
        {
            printf("%d ", k);
            i % 2 == 0 ? k++ : k--;
        }
        printf("\n");
    }
    return 0;
}*/


class Main{
    public static void main(String args[]){     
     
int i,j,r=8,k;
    for (i = r; i >= 1; i--)
    {
                                                   //( i % 2 == 0 )?(k = 1) : (k = i);
         if(i % 2 == 0)
          k=1;
         else
          k=i;        
         for (j = 1; j <= i; j++)
        {
           System.out.print(k);
                                                   //(i % 2 == 0)?k++ : k--;
         if(i % 2 == 0)
          k++;
         else
          k--;
        }
        System.out.println();
    }
   
}
}
