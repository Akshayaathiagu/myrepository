class SumProdArray 
{
	public static void main(String[] args) 
	{
		 int [] a = new int [] {1, 2, 3, 4, 5};//Declaring and initializing an array    
         int sum = 0;
		 int prod = 1;
          
        //Loop through the array to calculate sum of elements  
        for (int i = 0; i < a.length; i++) {   
           sum = sum + a[i];  
        }  
		//printing the result of sum
        System.out.println("Sum of all the elements of an array: " + sum);  
		//Loop through the array to calculate product of elements 
		for (int j = 0; j < a.length; j++) {   
           prod = prod * a[j];  
        } 
		//printing the result of product
        System.out.println("Product of all the elements of an array: " + prod);  
	}
}
