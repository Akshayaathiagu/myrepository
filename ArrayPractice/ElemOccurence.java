class ElemOccurence 
{
	public static void main(String[] args) 
	{
		
		 int [] a = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};  
        //Array occ will store frequencies of element  
        int [] occ = new int [a.length];  
        int visited = -1;  
        for(int i = 0; i < a.length; i++){  
            int count = 1;  
            for(int j = i+1; j < a.length; j++){  
                if(a[i] == a[j]){  
                    count++;  
                    //To avoid counting same element again  
                    occ[j] = visited;  
                }  
            }  
            if(occ[i] != visited)  
                occ[i] = count;  
        }  
		for(int i = 0; i < occ.length; i++){  
            if(occ[i] != visited)  
				//Printing the Output
                System.out.println("Occurences of " +" "+ a[i] + " is : "+ occ[i]);  
        }  
	}
}
