package org.sample.chr;

public class LocalVariable {
	
	//It is assigned within method, constructor or block
	//It wont allocate any default value(We have to initialize the local variable before use)
	//Local variables are stored in the stack memory.
	
	//Local variable is Method level
	public void empId(int id)
	{
		System.out.println("Method level variable is " + id);
	}
	
	//Local variable is block level
	public void empName()
	{
		String s = "Dinesh";
		System.out.println("Block level variable is " + s);
	}
	
	//Local variable is Constructor level
	public LocalVariable(long phno)
	{
		System.out.println("Constructor level " + phno);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Constructor, Method & Block level variable");
		LocalVariable l = new LocalVariable(9952872301l);
		l.empId(20);
		l.empName();
		
	}
	

}
