package dk.cphsoftdev.app;

import dk.cphsoftdev.app.controller.ReceiveController;
import dk.cphsoftdev.app.controller.SenderController;
import dk.cphsoftdev.app.controller.Translator;

public class RunTranslator
{
    public static void main( String[] args )
    {
//        ReceiveController receive = new ReceiveController( "group3.bank.normalizator" );
//        SenderController sender = new SenderController( "cphbusiness.bankJSON", "", "group3.bank.normalizator" );
//
//        sender.sendMessage( new Translator( "1209855372,500,12000.0,48" ).toJSON() );
//        receive.printMessages();
//
//        sender.close();
//        receive.close();

        ReceiveController receive = new ReceiveController( "group3.reciplist.jsontranslator" );
        receive.printMessages();
       // receive.close();

        // Start Translator (On production use this)
        // -----------------------------------------------------------------------------------------------
/*        ReceiveController receive = new ReceiveController( "group3.reciplist.xmltranslator" );
        SenderController sender = new SenderController( "cphbusiness.bankXML", "", "group3.bank.normalizator" );

        for( String message : receive.getMessages() )
        {
            sender.sendMessage( new Translator( message ).toJSON() );
        }

        sender.close();
        receive.close();*/
    }
}
