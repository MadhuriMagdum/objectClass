package objectClass;
import java.util.Objects;
public class Equals {
	   String s;
	   int id;
	   
		public Equals(String s, int id) {
		super();
		this.s = s;
		this.id = id;
	}
		
		@Override
		public int hashCode() {
			return Objects.hash(id, s);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Equals other = (Equals) obj;
			return id == other.id && Objects.equals(s, other.s);
		}

		public static void main(String[] args)
		{
			Equals e1 = new Equals("ram", 101);
			Equals e2 = new Equals("ram", 101);
			Equals e3 = new Equals("raju", 101);
			Equals e4 = new Equals("ram", 101);
			Equals e5 = new Equals("sham", 101);
			e2=e5;
			e3 = e2;
			e5=e3;
			System.out.println(e1==e2);
			System.out.println(e1.equals(e2));
			System.out.println(e1.equals(e4));
			System.out.println(e1.equals(e3));
			System.out.println(e2.equals(e3));
			System.out.println(e3.equals(e5));
			System.out.println(e3.equals(e4));
			System.out.println(e5.equals(e2));
			System.out.println(e1.equals(e5));		
		}

	}

