/*21*/
import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array length");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		int i,count=0,j=0;
		
		for(i=0;i<n;i++){
			System.out.println("Enter an element...");
		    a[i]=sc.nextInt();
		}
		int k;
		int temp=0;
		int sum=0,pro=1;
		
			int x=a[0];
		for(i=0;i<n-1;i++){
			sum=0;
			for(j=0;j<n;j++){
				x=a[0];
				pro=a[j];
				pro=pro*j;
				sum=sum+pro;
					if(sum>temp)
						temp=sum;
               System.out.println(" : "+temp);					
			}	
            for(k=0;k<a.length-1;k++){
                			
			    a[k]=a[k+1];
		    }
			a[n-1]=x;
			
		for(int z:a)
			System.out.print(z+" ");
		System.out.println();
		}
		
		System.out.print(temp);
	}
}
