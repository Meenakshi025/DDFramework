
public class Test {

	public int a;
	String Name;
	String lastName;
	
	 Test()
	{
		a=10;
		Name="Meena";
	}
	
	 Test(int s,String b)
	{
		a=s;
		Name=b;
	}
	 
	 Test(Test b)
		{
		 lastName=b.lastName;
			Name=b.Name;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t = new Test();
			System.out.println(t.a);
			System.out.println(t.Name);	
			
			Test t1 = new Test(2,"Kandurke");
			System.out.println(t1.a);
			System.out.println(t1.Name);
			
			Test t2 = new Test(t1);
			System.out.println(t2.lastName);
			System.out.println(t1.Name);
		

	}

}
