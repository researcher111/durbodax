package Sample;

public class Main {

	public int A()
	{
		int a=0, b=0, c=0, d=0, e=0;
		//for(int i=0; i< 10; i++)
		//{
			b = Increment(a);
			c = Increment(b);
			v();
		//}
		if(c>=5)
			e = Multiply(b,c);
		else
			e =	Divide(b,c);
		return e;
	}
	
	private int Divide(int b, int c) {
		// TODO Auto-generated method stub
		return c/b;
	}

	private int Multiply(int b, int c) {
		// TODO Auto-generated method stub
		return b*c;
	}

	public int Increment(int var)
	{
		return var++;
	}
	
	public void v()
	{
		
	}
}
