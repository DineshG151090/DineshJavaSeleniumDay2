package org.sample.chr;

public class StatVar {
	//It is assigned inside the class and outside all the methods and constructor and the static keyword must be use
	//It will allocate the default value(We are not initialize the variable value)
	//It is stored the value in static memory.
	//When the program execution starts it will allocate the memory and it gets activated.
	//When the program execution ends it will deallocate the memory.
	//We can give any access specifier to the static variable.
	static int id=20;
	
	public void empNum()
	{
		System.out.println("Static variable is used to inside the class methods " + id);
	}
	public StatVar()
	{
		System.out.println("Static variable is used to inside the class Constructor " + id);
	}
	public static void main(String[] args)
	{
		StatVar s = new StatVar();
		s.empNum();
		
	}

}
