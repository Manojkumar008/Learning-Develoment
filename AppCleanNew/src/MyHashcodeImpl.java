
import java.util.HashMap;

/**
 * Hello world!
 *
 *
 */
public class MyHashcodeImpl
{

    public static void main( String a[] )
    {

        HashMap<Price, String> hm = new HashMap<Price, String>();
        hm.put( new Price( "Banana", 20 ), "Banana" );
        hm.put( new Price( "Banana", 20 ), "Banana" );

        hm.put( new Price( "Apple", 40 ), "Apple" );
        hm.put( new Price( "Orange", 30 ), "Orange" );

        Price key = new Price( "Banana", 20 );
        System.out.println( "Hashcode of the key: " + key.hashCode() );
        System.out.println( "Value from map: " + hm.get( key ) );

        System.out.println( "Output ................." + hm.size() + "------------" + hm.toString() );
    }
}

class Price
{

    private String item;
    private int    price;

    public Price( String itm, int pr )
    {
        this.item = itm;
        this.price = pr;
    }

    public int hashCode()
    {
        return 12;
    }

    public boolean equals( Object obj )
    {
        if ( obj instanceof Price )
        {
            Price pp = ( Price ) obj;
            return ( pp.item.equals( this.item ) && pp.price == this.price );
        }
        else
        {
            return false;
        }
    }

    public String getItem()
    {
        return item;
    }

    public void setItem( String item )
    {
        this.item = item;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice( int price )
    {
        this.price = price;
    }

    public String toString()
    {
        return "item: " + item + "  price: " + price;
    }
}
