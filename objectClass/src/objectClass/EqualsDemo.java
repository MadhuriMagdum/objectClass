package objectClass;

public class EqualsDemo {
 String nm;
 int rn;
public EqualsDemo(String nm,int rn)
{
	this.nm=nm;
	this.rn=rn;
	}

public static void main(String[] args) {
	EqualsDemo e1=new EqualsDemo("ram",10);
	EqualsDemo e2=new EqualsDemo("shyam",20);
	EqualsDemo e3=new EqualsDemo("ram",10);
	EqualsDemo e4=e1;
System.out.println(e1.equals(e2));	//f    bz of equal method override so based on ref eqauality
System.out.println(e1.equals(e3));	//f
System.out.println(e1.equals(e4));	//t
System.out.println(e2.equals(e3));	//f
System.out.println(e2.equals(e4));	//f
System.out.println(e3.equals(e4));	//f

}
}
