class ThrowTest4 
{
	static void sample()
	{
		try
		{
			throw new NullPointerException("Sample My Own");
		}
		catch(NullPointerException e)
		{ System.out.println(1);
			System.out.println("Caught Inside Sample");
		    throw e;
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			sample();

		}

		catch(NullPointerException e)
		{
			System.out.println("Recaught"+e);
		}
	}
}
