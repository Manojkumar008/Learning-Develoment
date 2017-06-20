package inheritance;

class B
{
    /**
     * 
     */
    int a = 10;

    public void print()
    {
        System.out.println( "inside B super class" );
    }

    public void printNew()
    {
        System.out.println( "inside B super class" );
    }
}

class C extends B
{
    int a = 20;

    public void print()
    {
        System.out.println( "inside C sub class" );
    }

}

public class A
{
    public static void main( String[] args )
    {
        B b = new C();
        b.print();// it will print inside c sub class
        System.out.println( b.a );// it will print super class variable value=10

    }

}