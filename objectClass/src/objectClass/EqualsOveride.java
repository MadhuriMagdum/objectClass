package objectClass;

import java.util.Objects;

public class EqualsOveride {
	String nm;
	 int rn;
	public EqualsOveride(String nm,int rn)
	{
		this.nm=nm;
		this.rn=rn;
		}

	@Override
	public int hashCode() {
		return Objects.hash(nm, rn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsOveride other = (EqualsOveride) obj;
		return Objects.equals(nm, other.nm) && rn == other.rn;
	}

	public static void main(String[] args) {
		EqualsOveride e1=new EqualsOveride("ram",10);
		EqualsOveride e2=new EqualsOveride("shyam",20);
		EqualsOveride e3=new EqualsOveride("ram",10);
		EqualsOveride e4=e1;
	System.out.println(e1.equals(e2));	//f   bz of equal method override so based on cantain eqauality
	System.out.println(e1.equals(e3));	//t
	System.out.println(e1.equals(e4));	//t
	System.out.println(e2.equals(e3));	//f
	System.out.println(e2.equals(e4));	//f
	System.out.println(e3.equals(e4));	//t

	}
}
