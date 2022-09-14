package objectClass;

public class Employee {
	// Correct code to count number
	// of employees excluding interns.
	    private int ID;
		private String name;
		private int age;
		private static int nextId = 1;
		// it is made static because it
		// is keep common among all and
		// shared by all objects
		public Employee(String name, int age,int ID)
		{
			this.name = name;
			this.age = age;
			this.ID = nextId++;
		}
		
		public Employee(String string, int i) {
			// TODO Auto-generated constructor stub
		}
		{
			System.out.println("Id=" + ID + "\nName=" + name
							+ "\nAge=" + age);
		}
		public void showNextId1()
		{
			System.out.println("Next employee id will be="
							+ nextId);
		}
		protected void finalize()
		{
			--nextId;
			// In this case,
			// gc will call finalize()
			// for 2 times for 2 objects.
		}
	

	
		public static void main(String[] args)
		{
			Employee E = new Employee("ram",1, 56);
			Employee F = new Employee("rushi",2,5);
			Employee G = new Employee("shyam",3, 25);
			E.show1();
			F.show1();
			System.gc();
			E.showNextId1();
			F.showNextId1();
			G.showNextId1();

			{
				// It is sub block to keep
				// all those interns.
				Employee X = new Employee("GFG4",23);
				Employee Y = new Employee("GFG5",21);
				//X.();
				//Y.();
				X.showNextId1();
				Y.showNextId1();
				X = Y = null;
				System.gc();
				System.runFinalization();
			}
			E.showNextId1();
		}

		private void show1() {
			// TODO Auto-generated method stub
			
		}
		private void showNextId() {
			// TODO Auto-generated method stub
			
		}

		private void show() {
			// TODO Auto-generated method stub
			
		}
	}


