class patternyounis
{
	public static void main (String ar[])
	{
		int row=10;
		for(int i=0;i<row;i++)
		{
			for (int j=row-i; j>1; j--)   
			{
			System.out.print(" ");   
			} 
			nab:
			for(int j=0;j<=i;j++)
			{
				if(i==6 && j==3)
				{
					System.out.print("YOUNIS*");
					continue nab;
				}
				System.out.print("*");
			}
			lab:
			for(int j=row;j<row+i;j++)
			{
			if(i==6)
				{
					continue lab;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}