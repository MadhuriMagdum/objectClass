package objectClass;
class Car
{int i;
public  Car(int i)//constructor
 {
 this.i=i;
 }
}
 class Vehicle implements Cloneable
 {  Car c;
	int a;
	public Vehicle(Car c,int a)//constructor
	{
	this.c=c;
	this.a=a;
	}
 
 @Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
 }
 public class ShallowDemo
 {public static void main(String[] args) throws CloneNotSupportedException {
	 Car c=new Car(10);
		Vehicle v1= new Vehicle(c,30);
		System.out.println(v1.a+" "+v1.c.i);
		Vehicle v2=(Vehicle)v1.clone();
		v2.a=88;
		v2.c.i=99;
		System.out.println(v1.a+" "+v1.c.i);	
}
 }
 

