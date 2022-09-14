package objectClass;

import java.lang.reflect.Method;

public class ClassMethod {
public static void main(String[] args) {
	int n=0;
	Object o=new String("ram");
	Class c=o.getClass();
	System.out.println("name of Class"+c.getName());
	Method []m=c.getDeclaredMethods();
	System.out.println("method info");
	for(Method m1:m)
	{
		n++;
		System.out.println(m1.getName());
	}
	System.out.println("method no.="+n);
}
}
