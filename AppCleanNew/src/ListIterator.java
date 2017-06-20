import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 *
 */
public class ListIterator
{
    public static void main( String[] args )
    {
        List<String> mapList = new ArrayList<>();
        mapList.add( "/transport-operators/AVkr1z_wEjuQK6UJnUr-" );
        mapList.add( "/transport-operator-services/AVkr1z_wEjuQK6UJnUr-" );
        mapList.add( "/transport-operators/AVkr1z_wEjuQK6UJnUr-" );
        mapList.add( "/financial-periods/AVkr1z_wEjuQK6UJnUr-" );

        List<String> fpPerioad = new ArrayList<>();
        List<String> toService = new ArrayList<>();
        List<String> tosService = new ArrayList<>();

        for ( String list : mapList )
        {
            if ( list.contains( "/financial-periods" ) )
            {
                fpPerioad.add( list );
            }

            if ( list.contains( "/transport-operators" ) )
            {
                toService.add( list );
            }

            if ( list.contains( "/transport-operator-services" ) )
            {
                tosService.add( list );
            }

        }

        System.out.println( "" );
    }
}
