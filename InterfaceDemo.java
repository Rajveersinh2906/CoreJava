package com.basic;

interface Ifs1
{
	static void meth1()
	{
		System.out.println("meth1 Defined in Ifs1");
	}
	void meth2();
}
interface Ifs2 extends Ifs1
{
	void meth3();
	void meth4();
}
class Interfaceimpl implements Ifs2
{
	public void meth2() {
		System.out.println("meth2");
	}
	public void meth3() {
		System.out.println("meth3");
	}
	public void meth4() {
		System.out.println("meth4");
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		Interfaceimpl i=new Interfaceimpl();
		Ifs1.meth1();
		i.meth2();
		i.meth3();
		i.meth4();
	}

}
