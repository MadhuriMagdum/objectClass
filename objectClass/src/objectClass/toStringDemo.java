package objectClass;

public class toStringDemo {

	String nm;
	int rn;

	toStringDemo(String nm, int rn) {
		this.nm = nm;
		this.rn = rn;
	}
	@Override
	public String toString() {
		return (nm + rn) ;
	}
	public static void main(String[] args) {
		toStringDemo s1=new toStringDemo("ram",10);
		toStringDemo s2=new toStringDemo("shyam",20);
		
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
	}
}
