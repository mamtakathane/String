package com.length;

public class B {
public B() {
	System.out.println("I am in constrctor");
}
{
	System.out.println("non static block");
}
// public void m2()
  public  void m1(){
	  System.out.println(" static block");
  }
	
	public static void main(String[] args) {
	
		B b=new B();
	
	      b.m1();
		
		
		
		
	}
	
}
