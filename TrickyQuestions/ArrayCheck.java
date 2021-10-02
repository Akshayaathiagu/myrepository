//question 2: Get integer inputs from user and store it in an array. Ask the user to enter one integer to check whether the number is present or not.
import java.util.Scanner;  
class  ArrayCheck
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n = sc.nextInt();  //reading input
		if(n !=0 && n>0)  //checking for valid input
		{
		int[] a = new int[n]; // declaring and creating array objects
		int count=0;
		System.out.println("Enter the  numbers:");
		for(int i=0;i<n;i++)
			{
			a[i]=sc.nextInt();  //reading array elements
		}
		System.out.println("Array elements are: ");  
        for (int i=0; i<n; i++)   
        {  
        System.out.print(a[i]+"\t");  
        } 
		System.out.println("\nEnter the number to check:");
		int num = sc.nextInt();
		for (int i=0; i<n; i++)   //Logic to find whether the number present or not in array.
        { 
			if(num==a[i]){
                count++;
        } 
		}
		if(count>0)
			{
			System.out.println("Number is Present");//Printing output
		    }
		else{
          System.out.println("Number is Not Present");
		}
		}
		else{
			System.out.println("Not valid");
		}
		

		}
	}