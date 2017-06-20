package com.org;

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
import java.util.Objects;
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
    public static void main( String[] arg )
    {
        BufferedWriter out = null;
        BufferedReader in = null;

        boolean append = false;
        String args[] =
        { "C:/Users/sharmaMano/Desktop/20032017/abc.txt", "C:/Users/sharmaMano/Desktop/20032017/def.txt" };
        // get filename from args

        String inputFilename = args[ 0 ];
        String outputFilename = args[ 1 ];

        // check usage
        if ( args.length != 2 )
        {
            System.out.println( "Incorrect number of args" );
            System.out.println( "Correct usage is:" );
            System.out.println( " java TestClass <input_filename> <output_filename> " );
            System.exit( -1 );
        }

        // read in file into collection
        try
        {
            in = new BufferedReader( new FileReader( inputFilename ) );
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

            out = new BufferedWriter( new FileWriter( outputFilename, append ) );
            for ( int i = 0; i < fileContents.size(); i++ )
            {
                out.write( String.valueOf( fileContents.get( i ) ) + "\n" );
            }

            // close output file
        }
        catch ( IOException e )
        {
            System.out.println( "Error while performing IO" );
        }
        finally
        {
            try
            {
                if ( Objects.nonNull( out ) )
                {
                    out.close();
                }
                if ( Objects.nonNull( out ) )
                {
                    in.close();
                }
            }
            catch ( IOException e )
            {
                System.out.println( "Exeception occured while closing the file" );
            }
        }

    }
}
