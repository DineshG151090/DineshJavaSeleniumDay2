package org.sample.chr;

public class InstanceVariable1 extends InstanceVariable {
	
	public void empNum()
	{
		System.out.println("To refer the instance variable to outside class method " + id);
	}
	public InstanceVariable1()
	{
		System.out.println("To refer the instance variable to outside class constructor " + id);
	}
	
	public static void main(String[] args)
	{
		InstanceVariable1 l1 = new InstanceVariable1();
		//l1.empNum();
	}

}
