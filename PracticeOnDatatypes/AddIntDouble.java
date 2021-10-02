//Write a program to add an integer variable of value 5 and double variable of  value 6.2 and print upto 3 decimal.
class AddIntDouble 
{
	public static void main(String[] args) 
	{
		int i = 5;
		double d = 6.2;
		System.out.println(String.format("%.3f", i+d));
	}
}
