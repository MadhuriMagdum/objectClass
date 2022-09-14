package objectClass;

import java.util.Objects;

public class Hashcode {
int i;
Hashcode(int i)
{
this.i=i;
}

//@Override
//public int hashCode() {
//	return Objects.hash(i);
//}
@Override
public String toString() {
	return "Hashcode [i=" + i + "]";
}

public static void main(String[] args) {
	Hashcode h1=new Hashcode(10);
	Hashcode h2=new Hashcode(20);
			System.out.println(h1);
	        System.out.println(h2);
}
}
