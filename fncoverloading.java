class fncoverloading
{
	public int sum(int x,int y)
	{
		return x+y;
	}
	public float sum(float x,float y)
	{
		return x+y;
	}
	public String sum(String x,String y)
	{
		return x.concat(y);
	}
	public static void main (String ar[])
	{
		fncoverloading d = new fncoverloading();
		int si=d.sum(10,20);
		float sf=d.sum(2.1F,4.32F);
		String ss=d.sum("IUST","CSE");
		byte a=10,b=50;
		byte c=(byte)d.sum(a,b);
		System.out.println("Int Sum="+si+"   Float Sum="+sf+"   String Sum="+ss+"   Byte Sum="+c);
	}
}