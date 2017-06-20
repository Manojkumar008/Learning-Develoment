
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Hello world!
 *
 *
 */
public class AppClean
{
    public static void main( String[] args ) throws IOException
    {
        /*
         * URL url = new URL( "http://localhost:9200/reimbursementcalculation" ); HttpURLConnection conn = (
         * HttpURLConnection ) url.openConnection(); conn.setRequestMethod( "DELETE" ); // conn.setRequestProperty(
         * "Accept", "application/json" );
         */
        String[] indexes =
        {
                /*
                 * "tcdimportrequest", "transportoperator", "transportoperatorservice",
                 */
                "reportdatasetrequestindex ",
                "reportdatapointindex ",/*
                                         * "financialadvancesauthorisationindex", "financialadvanceindex",
                                         * "financialadvancesauthorisationrequestindex",
                                         * "financialadvancessettlementrequestindex",
                                         */

                /*
                 * "reimbursementcalculation", "reimbursementcalculationrequest", "reimbursementruleauthrequest",
                 * "reimbursementrule", "reimbursementcalculationauthrequest", "servicereimbursementcalculation",
                 * "interimpaymentcalculationrequest", "interimpaymentruletemplate", "interimpaymentcontract",
                 * "reimbursementstatement", "interimpaymentcontractauthrequestdatastore", "reimbursementstmt_request",
                 * "reimbursementstmt_auth", "reimbursementstmt_authrequest", "reimbursementauthorisation",
                 */

                /*
                 * "nonsmartjourneys_authrequest", "nonsmartjourneys_settlement", "nonsmartjourneys_authorisation",
                 * "nonsmartjourneys",
                 */
                /*
                 * /* "interimpaymentcontract", "tcdimportrequest", "interimpaymentcontractauthrequestdatastore",
                 * "nonsmartjourneys_authrequest", "servicecalculationauthrequest", "financialperiod",
                 * "nonsmartjourneys_settlement", "nonsmartjourneys_authorisation", "nonsmartjourneys",
                 * "financialadvances_settlement", "interimpaymentcalculationrequest",
                 * "financialadjustment_authorisation", "financialadjustment", "transportoperator",
                 * "transportoperatorservice", "financialadvances_authrequest", "financialadvances_authorisation",
                 * "financialadvances", "journey", "financialadjustment_settlement",
                 * "interimpaymentcontractauthdatastore", "financialadjustment_authrequest",
                 * "interimpaymentcontractruletemplates",
                 */

        };

        for ( String index : indexes )
        {
            URL url = new URL( "http://10.106.83.12:9200/" + index );
            HttpURLConnection httpCon = ( HttpURLConnection ) url.openConnection();
            httpCon.setDoOutput( true );
            httpCon.setRequestProperty( "Content-Type", "application/x-www-form-urlencoded" );
            httpCon.setRequestMethod( "DELETE" );
            httpCon.connect();
            System.out.println( index + ": " + httpCon.getResponseCode() );
        }

    }
}
