package org.sample.chr;

public class StatVar1 extends StatVar {
	public void empId(int a)
	{
		this.id = a;
		System.out.println("Static variable is used to Outside the class methods " + id);
	}
	public StatVar1()
	{
		System.out.println("Static variable is used to Outside the class Constructor " + id);
	}
	
	public static void main(String[] args)
	{
		StatVar1 s1 = new StatVar1();
		s1.empId(10);
		
	}

}
