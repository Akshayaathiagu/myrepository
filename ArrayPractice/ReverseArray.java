class ReverseArray 
{
	public static void main(String[] args) 
	{
		int a[] = {8,6,3,9,2,5}; //declaring and initializing an array 
		System.out.println("Original Array: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
		System.out.println("\nReversed Array: ");//logic to print in Reverse order
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+"\t");
		}

	}
}
