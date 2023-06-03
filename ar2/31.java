/*31. Suppose X. Y, Z are arrays of integers of size M, N, and M + N respectively. The numbers in array X and Y appear in descending order. Write a java program to produce third array Z by merging arrays X and Y in descending order. 
*/
import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array length");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		int i,j=0;
		
		for(i=0;i<n;i++){
			System.out.println("Enter an element...");
		    a[i]=sc.nextInt();
		}
		for(j=i+1;j<n;j++){
				if(a[i]>a[j]){
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		System.out.println("Enter length for 2nd Array..");
		int n1=sc.nextInt();
		int b[]=new int[n1];
		for(i=0;i<n1;i++){
			System.out.println("Enter element..");
			b[i]=sc.nextInt();
		}

		int c[]=new int[n+n1];
		
		int k=0;
		c[0]=a[0];
		
		for(i=0;i<n;i++){
			for(j=0;j<k;j++)
				if(a[i]==c[j])
					break;
				if(j==k)
					c[k++]=a[i];
			
		}
		
		for(i=0;i<k;i++)
			System.out.print(c[i]);
		System.out.println();
		
		for(i=n1-1;i>=0;i--){
			for(j=0;j<k;j++)
				if(b[i]==c[j])
					break;
				if(j==k)
					c[k++]=b[i];
			
		}
		for(i=0;i<k;i++)
			System.out.print(c[i]);
		System.out.println();
		
		for(i=0;i<c.length-1;i++){
			for(j=i+1;j<c.length;j++){
				if(c[i]<c[j]){
					c[i]=c[i]+c[j];
					c[j]=c[i]-c[j];
					c[i]=c[i]-c[j];
				}
			}
		}
		
		for(i=0;i<k;i++)
			System.out.print(c[i]);
		
	}
}
