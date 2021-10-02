class ArraySorting 
{
	public static void main(String[] args) 
	{
		int [] a ={52,45,32,64,12,87,78,98,23,7}; //declaring and initializing an array  
        int temp = 0;    
 
        //print original array    
       System.out.println("Original Array: ");    
       for (int i = 0; i <a.length; i++) {     
           System.out.print(a[i] + " ");    
        }    
        //Sort the array in ascending order using two for loops    
        for (int i = 0; i <a.length; i++) {     
          for (int j = i+1; j <a.length; j++) {     
              if(a[i] >a[j]) {      //swap elements if not in order
                 temp = a[i];    
                 a[i] = a[j];    
                 a[j] = temp;    
               }     
            }     
        }    
        //print sorted array    
        System.out.println("\nSorted Array: ");    
        for (int i = 0; i <a.length; i++) {     
            System.out.print(a[i] + " ");    
        }    
	}
}
