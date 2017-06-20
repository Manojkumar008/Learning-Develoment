/**
 * Hello world!
 *
 *
 */
interface Interface1
{

    void method1( String str );

    default void log( String str )
    {
        System.out.println( "I1 logging::" + str );
    }
}

interface Interface2
{

    void method2();

    default void log( String str )
    {
        System.out.println( "I2 logging::" + str );
    }

}

public class DefaultInterface implements Interface1, Interface2
{

    public static void main( String[] args )
    {
        Interface1 defaultInterface = new DefaultInterface();
        defaultInterface.log( "" );
    }

    @Override
    public void method2()
    {
    }

    @Override
    public void method1( String str )
    {
    }

    @Override
    public void log( String str )
    {
        System.out.println( "DefaultInterface" );
    }

}