class imstates
{
	static int count;
	public imstates()
	{
		count++;
	}
	public int getcount()
	{
		return count;
	}
	static
	{
		count=0;
	}
	public static void main (String ar[])
	{
		imstates s1 = new imstates();
		imstates s2 = new imstates();
		imstates s3 = new imstates();
		System.out.println(+imstates.count);
	}
}

//static variable is part of class not of object. Doesn't belong to object and belongs to class.saves memory as it is created with object