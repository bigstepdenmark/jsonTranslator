package dk.cphsoftdev.app.controller;

public class Translator
{
    private String data;

    public Translator( String data )
    {
        this.data = data;
    }

    /**
     * Convert request data to XML formatted string.
     *
     * @return String
     */
    public String toJSON()
    {
        return build( data.split( "," ) ).toString();
    }

    /**
     * Build request data to XML format
     *
     * @param data String[]
     * @return StringBuilder
     */
    private StringBuilder build( String[] data )
    {
        StringBuilder builder = new StringBuilder();
        // Build XML format
        builder.append( "{" );
        builder.append( "\"ssn\":" ).append( data[ 0 ] ).append( "," );
        builder.append( "\"creditScore\":" ).append( data[ 1 ] ).append( "," );
        builder.append( "\"loanAmount\":" ).append( data[ 2 ] ).append( "," );
        builder.append( "\"loanDuration\":" ).append( data[ 3 ] ).append( "" );
        builder.append( "}" );

        return builder;
    }
}
