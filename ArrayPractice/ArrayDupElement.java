class ArrayDupElement 
{
	public static void main(String[] args) 
	{
		//Declaring and initializing an array 
        int [] a = {1,5,7,4,5,3,8,2,9,1,7};   
          
        System.out.print("Duplicate Elements in Given Array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < a.length; i++) {  
            for(int j = i + 1; j < a.length; j++) {  
                if(a[i] == a[j])  
					//Printing the output
                    System.out.print(a[j]+"\t");  
            }  
        }  
	}
}
