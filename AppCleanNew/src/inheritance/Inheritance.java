package inheritance;

class ClassA
{
    public void get( int i )
    {
        System.out.println( "PArent" );
    }
}

class ClassB extends ClassA
{
    private void get( int i )
    {
        System.out.println( "PArent" );
    }
}

public class Inheritance
{

    public static void main( String[] args )
    {
        System.out.println( "PArent" );

    }

}
