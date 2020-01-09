package org.sample.chr;

public class InstanceVariable {
	
	//It's assigned within inside the class and outside all the methods and constructor.
	//It will allocate default value(We are not initialize the variables value.
	//It is stored the value in the heap memory.
	//It is activated when the object is created.
	//It is deactivated when the object is destroyed.
	//We can change the value once we declared.
	//We can give any access specifier to the instance variable.
	
	int id=10;
	
	public void empId()
	{
		System.out.println("Method refer to the instance variable " + id);
	}
	public InstanceVariable()
	{
		System.out.println("Constructor refer to the instance variable " + id);
	}
	public static void main(String[] args)
	{
		InstanceVariable i = new InstanceVariable();
		i.empId();
	}

}
