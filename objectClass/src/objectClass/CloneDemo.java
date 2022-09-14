package objectClass;

public class CloneDemo implements Cloneable {
	int i=20;
	int j=30;
	
	public static void main(String[] args)throws CloneNotSupportedException
	{
		CloneDemo d1=new CloneDemo();
		CloneDemo d2=(CloneDemo)d1.clone();//without using new keyword
		
	d2.i=40;
	d2.j=50;
	System.out.println(d1.i+"  "+d1.j);
		
	System.out.println(d2.i+"  "+d2.j);}
}