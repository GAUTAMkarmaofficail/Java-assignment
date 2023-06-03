/*Q.18) Find largest sum contigeous sub array
Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.
Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Example 2:
Input:
N = 4
Arr[] = {-1,-2,-3,-4}
Output:
-1
*/
class Main
{
    public static void main(String[] args){
        int[] a={1,2,3,-2,5};
        int i,j,sum=0;
        int max = a[0]; ;
        for(i=0; i<a.length; i++)
        {
                sum =sum +a[i];
                if(sum>max)
                    max=sum;
        }
        if(sum>max)
            System.out.println(" "+sum);
        else
            System.out.println(" "+max);
    }
} 
