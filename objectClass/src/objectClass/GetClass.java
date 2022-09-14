package objectClass;

public class GetClass {
	
	  public GetClass(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)   
	    {   
	       GetClass obj1 = new GetClass("madhuri"); 
	        Object o= obj1.getClass();
	        Class a = obj1.getClass();   
	        System.out.println("Class of Object obj is : " + a.getName()); 
	        System.out.println(o);
	        System.out.println(a);

	        
	    }   
}
