package objectClass;
 import java.lang.Runtime;

public class FinalizeMethod {

	public static void main(String[] args) throws Throwable 
	{
		
		FinalizeMethod f = new FinalizeMethod();
		String s = "ram";
		f = null;	
			System.gc();
			System.out.println(" GC called");

			f.finalize();
			System.gc();
			System.out.println(" Garbage collector is called");
			Runtime.getRuntime();
			System.out.println("Runtime gc");
	}

@Override
  protected void finalize()
 {
	System.out.println(" finalize method is called");
 }
}