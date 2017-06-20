/**
 * Hello world!
 *
 *
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Vector;

/**
 * 
 * Simple class that reads in a file - sorts its lines in natural order, writes it back out to the given filename and
 * adds a timestamp of when it was sorted
 * 
 * Program will be called with:
 * 
 * java TestClass <input_filename> <output_filename>
 *
 */
public class TestClass
{

    boolean OVERWRITE_FILE = true;
    String  args[]         =
    { "C:/Users/sharmaMano/Desktop/20032017/abc.txt", "C:/Users/sharmaMano/Desktop/20032017/def.txt" };
    // get filename from args

    String  inputFilename  = args[ 0 ];

    // check usage
    if(args.length!=2)
    {
        System.out.println( "Incorrect number of args" );
        System.out.println( "Correct usage is:" );
        System.out.println( " java TestClass <input_filename> <output_filename> " );
        System.exit( -1 );
    }

    // read in file into collection
    try
    {
        BufferedReader in = new BufferedReader( new FileReader( inputFilename ) );
        Vector fileContents = new Vector<Object>();
        while ( in.ready() )
        {
            fileContents.add( in.readLine() );
        }

        // sort the collection in natural order
        Collections.sort( fileContents );

        // add timestamp
        fileContents.add( "File Sorted on: " );
        fileContents.add( new Date() );

        BufferedWriter out = new BufferedWriter( new FileWriter( outputFilename, OVERWRITE_FILE ) );
        for ( int i = 0; i < fileContents.size(); i++ )
        {
            out.write( ( String ) fileContents.get( i ) + "\n" );
        }

        // close output file
        out.close();

    }catch(
    IOException e)
    {
        System.out.println( "Error while performing IO" );
    }

}}
