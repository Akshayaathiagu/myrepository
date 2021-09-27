class NegPosElements 
{
	public static void main(String[] args) 
	{
		int a[] = { -1,8,-4,2,-3,7,5,-90};//declaring and initializing an array 
        int j = 0, temp;
        for (int i = 0; i < a.length; i++)//logic
        {
            if (a[i] > 0)
            {
                if (i != j)
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j++;
            } 
		}
		
    
	for (int i = 0; i < a.length; i++)
	{
       System.out.print(a[i] + " "); //printing the output    
	}
}
}
