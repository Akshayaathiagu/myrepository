//Question 5: Write a prohram to check if elements of an array is same or not when it read from front to back and vice versa.
import java.util.Scanner; 
class ArrayPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n = sc.nextInt(); //reading input
		if(n !=0 && n>0)
		{
		int[] a = new int[n];// declaring and creating array objects
		System.out.println("Enter the numbers:");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();  
		}
		int count=0;
		for(int i=0;i<n;i++) //Logic to find whether the elements are same when read it back.
			{ 
			if(a[i]==a[n-i-1])
			{
			count++;
				}

		}
		if(count==n)
		{
			System.out.println("Given array elements are same");//printing the output
		}
		else
		{
			System.out.println("Given array elements are not same");
		}
		}
		else{
			System.out.println("Please enter a valid input");
		}

	}
}
