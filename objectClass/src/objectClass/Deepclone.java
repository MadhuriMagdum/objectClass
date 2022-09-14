package objectClass;
class Car1
{int i;
public  Car1(int i)//constructor
 {
 this.i=i;
 }
}
 class Vehicle1 implements Cloneable
 {  Car1 c;
	int a;
	public Vehicle1(Car1 c,int a)//constructor
	{
	this.c=c;
	this.a=a;
	}
 
 @Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//return super.clone();
	 Car1 c1=new Car1(c.i);
	 Vehicle1 v3=new Vehicle1(c1,a);
	 return v3;
	}
 }
 public class Deepclone
 {public static void main(String[] args) throws CloneNotSupportedException {
	 Car1 c=new Car1(10);
		Vehicle1 v1= new Vehicle1(c,30);
		System.out.println(v1.a+" "+v1.c.i);
		Vehicle1 v2=(Vehicle1)v1.clone();
		v2.a=88;
		v2.c.i=99;
		System.out.println(v1.a+" "+v1.c.i);	
		System.out.println(v2.a+" "+v2.c.i);	
 }
}
 
 


