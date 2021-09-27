class MinMaxElement 
{
	public static void main(String[] args) 
	{
		int a[] = {21,8,32,5,9};//declaring and initializing an array 
		int min,max;
		min=max=a[0];
    for(int i=1; i<a.length; i++)//Logic to find min and max element
    {
         if(min>a[i])
		  min=a[i];   
		   if(max<a[i])
		    max=a[i];       
    }
     System.out.println("Minimum element of array is : "+min); //Printing the output for min
     System.out.println("Maximum element of array is : "+max); //Printing the output for mam
 
	}
}
