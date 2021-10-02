//Question 1: Get integer inputs from the user and store them in an array and print them.
import java.util.Scanner;
class ArrayElements 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n = sc.nextInt();  //reading input
		if(n>0 && n!=0) //checking for valid input
		{
		int[] a = new int[n];  // declaring and creating array objects
		System.out.println("Enter the numbers:");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();  //reading array elements
		}
		System.out.print("Array elements are: ");  
        for (int i=0; i<n; i++)   
        {  
        System.out.print(a[i]+"\t");  //printing array elements
        }
		}
		else
		
         System.out.println("Enter valid size");
	}
}
