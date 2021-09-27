class CommonElem 
{
	public static void main(String[] args) 
	{
		int arr1[] = {1,8,10,15,18,20,24,26}; //declaring and initializing an array 
        int arr2[] = {2,15,18,20,26,38,88,100};
        int arr3[] = {4,10,12,15,18,20,52,58,60};
        int i = 0, j = 0, k = 0, x = 0;
        System.out.print("The Common Elements are: ");
       while (i < arr1.length && j < arr2.length && k < arr3.length)//logic to find common elements
		   {
           if (arr1[i] == arr2[j] && arr2[j] == arr3[k])
			   {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
                k++;
                }
           else if (arr1[i] < arr2[j])
			{
            i++;
            }
           else if (arr2[j] < arr3[k]) {
            j++;
            }else {
            k++;
            }
            }
	}
}
