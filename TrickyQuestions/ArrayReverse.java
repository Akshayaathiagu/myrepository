//Question 4: Get integer inputs from the user and copy it in another array. 
import java.util.Scanner;  
class  ArrayReverse
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n = sc.nextInt(); //reading input
		if(n !=0 && n>0)  //checking for valid input
		{
		int[] a = new int[n]; // declaring and creating array objects
		int[] r = new int[a.length];
		System.out.println("Enter "+n+" numbers:");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();  //reading array elements
		}
		System.out.println("Reversed Array elements are: ");  
        for (int i=0; i<n; i++)   
        {  
        r[i]=a[i]; //Copying elements from one array to another array
        }
		for (int i=a.length-1; i>=0; i--)   
        {  
		System.out.print(r[i]+"\t");  //Printing reversed array
        }
		}
		else
		{
			System.out.println("Enter a valid input "); 
		}

	}
}
