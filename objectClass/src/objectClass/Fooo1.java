package objectClass;


public class Fooo1
{
    public Fooo1() {
        m1();
    }

    void m1()
    {
        System.out.println("Foo");
    }
}

 class Barr extends Fooo1{
    int x = 5;

    void m1()
    {
        System.out.println("x = "+x);
    }

    public static void main(String[] args) {
        Fooo1 f = new Barr();
        f.m1();
    }
}