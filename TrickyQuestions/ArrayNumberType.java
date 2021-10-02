//Question 3: Get integer inputs from the user and store it in an array then print the No.of positive numbers, No.of negative numbers, No.of odd numbers, No.of even numbers and No.of zeros.
import java.util.Scanner;  
class  ArrayNumberType
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n = sc.nextInt();   //reading input
		if(n !=0 && n>0) //checking for valid input
		{
		int[] a = new int[n];  //declaring and creating array objects
		int positive=0;
		int	negative=0;
		int even=0;
		int odd=0;
		int zeros=0;
		System.out.println("Enter "+n+" numbers:");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();  //reading array elements
		}
		System.out.println("Array elements are: ");  
        for (int i=0; i<n; i++)   
        {  
        System.out.print(a[i]+"\t");  
        } 
		for(int i = 0; i <n; i++)
        {
        if(a[i] > 0)   //Condition to find whether the number is positive or negative
        {
		positive++;
		}
        else if(a[i]<0)
        {
        negative++;
        }
		if(a[i]%2==0) //Condition to find whether the number is odd or even
			{
            even++;
			}
        else{
            odd++;
		}
		if(a[i]==0) //Condition to find whether the number is zero or not
			{
            zeros++;
			}
		}
		System.out.println("\n---------------------------------------------"); //Printing the output
        System.out.println("No.of Positive elements are: "+positive);
		System.out.println("No.of Negative elements are: "+negative);
		System.out.println("No.of even elements are: "+even);
		System.out.println("No.of odd elements are: "+odd);
		System.out.println("No.of zero elements are: "+zeros);
		}
		else
		{
			System.out.println("Please enter a valid input"); 
		}
	}
}
