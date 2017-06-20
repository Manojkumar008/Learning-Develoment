import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 *
 */
public class Maps
{

    public static void main( String[] args )
    {
        Maps maps = new Maps();
        Map map = new HashMap<>();
        maps.mapData( map );
        System.out.println( "          " + map );
    }

    private void mapData( Map map )
    {
        map.put( 1, "hi" );
    }

}
