
package es.oracle.invenes.ws;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.3.1-patch-01
 * Mon Apr 25 17:26:44 CEST 2016
 * Generated source version: 2.3.1-patch-01
 * 
 */

public final class InvenesSearch_InvenesSearchService_Client {

    private static final QName SERVICE_NAME = new QName("http://ws.invenes.oracle.es/", "InvenesSearchService");

    private InvenesSearch_InvenesSearchService_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = InvenesSearchService.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        InvenesSearchService ss = new InvenesSearchService(wsdlURL, SERVICE_NAME);
        InvenesSearch port = ss.getInvenesSearchService();  
        
        {
        System.out.println("Invoking getSearchFields...");
        java.lang.String _getSearchFields_arg0 = "_getSearchFields_arg0-1829342938";
        java.lang.Integer _getSearchFields_arg1 = Integer.valueOf(-1375861411);
        es.oracle.invenes.ws.InvenesProperties _getSearchFields__return = port.getSearchFields(_getSearchFields_arg0, _getSearchFields_arg1);
        System.out.println("getSearchFields.result=" + _getSearchFields__return);


        }
        {
        System.out.println("Invoking getSummary...");
        java.lang.String _getSummary_arg0 = "_getSummary_arg0-904766925";
        java.lang.String _getSummary_arg1 = "_getSummary_arg1-686548801";
        java.lang.String _getSummary_arg2 = "_getSummary_arg2-1741302228";
        java.lang.String _getSummary_arg3 = "_getSummary_arg31604610369";
        es.oracle.invenes.ws.InvenesResult _getSummary__return = port.getSummary(_getSummary_arg0, _getSummary_arg1, _getSummary_arg2, _getSummary_arg3);
        System.out.println("getSummary.result=" + _getSummary__return);


        }
        {
        System.out.println("Invoking getAllTypes...");
        java.lang.String _getAllTypes_arg0 = "_getAllTypes_arg0690319048";
        java.lang.Integer _getAllTypes_arg1 = Integer.valueOf(-76983753);
        es.oracle.invenes.ws.InvenesProperties _getAllTypes__return = port.getAllTypes(_getAllTypes_arg0, _getAllTypes_arg1);
        System.out.println("getAllTypes.result=" + _getAllTypes__return);


        }
        {
        System.out.println("Invoking getBases...");
        java.lang.String _getBases_arg0 = "_getBases_arg0-452794923";
        es.oracle.invenes.ws.InvenesProperties _getBases__return = port.getBases(_getBases_arg0);
        System.out.println("getBases.result=" + _getBases__return);


        }
        {
        System.out.println("Invoking getImages...");
        java.lang.String _getImages_arg0 = "_getImages_arg0921436171";
        java.lang.String _getImages_arg1 = "_getImages_arg1-353334496";
        es.oracle.invenes.ws.InvenesResult _getImages__return = port.getImages(_getImages_arg0, _getImages_arg1);
        System.out.println("getImages.result=" + _getImages__return);


        }
        {
        System.out.println("Invoking getClaims...");
        java.lang.String _getClaims_arg0 = "_getClaims_arg01937884121";
        java.lang.String _getClaims_arg1 = "_getClaims_arg11045840135";
        java.lang.String _getClaims_arg2 = "_getClaims_arg2972253211";
        es.oracle.invenes.ws.InvenesResult _getClaims__return = port.getClaims(_getClaims_arg0, _getClaims_arg1, _getClaims_arg2);
        System.out.println("getClaims.result=" + _getClaims__return);


        }
        {
        System.out.println("Invoking doSearch...");
        java.lang.String _doSearch_arg0 = "_doSearch_arg01361722189";
        java.lang.Integer _doSearch_arg1 = Integer.valueOf(390700873);
        java.lang.String _doSearch_arg2 = "_doSearch_arg2-1796766990";
        java.lang.String _doSearch_arg3 = "_doSearch_arg31731515303";
        java.lang.String _doSearch_arg4 = "_doSearch_arg4-128156904";
        java.lang.String _doSearch_arg5 = "_doSearch_arg51163597705";
        java.lang.Integer _doSearch_arg6 = Integer.valueOf(-2097392065);
        java.lang.Integer _doSearch_arg7 = Integer.valueOf(-139540514);
        try {
            es.oracle.invenes.ws.SearchResult _doSearch__return = port.doSearch(_doSearch_arg0, _doSearch_arg1, _doSearch_arg2, _doSearch_arg3, _doSearch_arg4, _doSearch_arg5, _doSearch_arg6, _doSearch_arg7);
            System.out.println("doSearch.result=" + _doSearch__return);

        } catch (SesionExpiradaException_Exception e) { 
            System.out.println("Expected exception: SesionExpiradaException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getWrittenOpinion...");
        java.lang.String _getWrittenOpinion_arg0 = "_getWrittenOpinion_arg0203976793";
        java.lang.String _getWrittenOpinion_arg1 = "_getWrittenOpinion_arg1-1699991872";
        java.lang.String _getWrittenOpinion_arg2 = "_getWrittenOpinion_arg21358375305";
        es.oracle.invenes.ws.InvenesResult _getWrittenOpinion__return = port.getWrittenOpinion(_getWrittenOpinion_arg0, _getWrittenOpinion_arg1, _getWrittenOpinion_arg2);
        System.out.println("getWrittenOpinion.result=" + _getWrittenOpinion__return);


        }
        {
        System.out.println("Invoking getSearchReport...");
        java.lang.String _getSearchReport_arg0 = "_getSearchReport_arg02025269841";
        java.lang.String _getSearchReport_arg1 = "_getSearchReport_arg1-195365239";
        java.lang.String _getSearchReport_arg2 = "_getSearchReport_arg2505748541";
        es.oracle.invenes.ws.InvenesResult _getSearchReport__return = port.getSearchReport(_getSearchReport_arg0, _getSearchReport_arg1, _getSearchReport_arg2);
        System.out.println("getSearchReport.result=" + _getSearchReport__return);


        }
        {
        System.out.println("Invoking getResultFields...");
        java.lang.String _getResultFields_arg0 = "_getResultFields_arg0666384140";
        java.lang.Integer _getResultFields_arg1 = Integer.valueOf(-1641594738);
        es.oracle.invenes.ws.InvenesProperties _getResultFields__return = port.getResultFields(_getResultFields_arg0, _getResultFields_arg1);
        System.out.println("getResultFields.result=" + _getResultFields__return);


        }
        {
        System.out.println("Invoking getDesc...");
        java.lang.String _getDesc_arg0 = "_getDesc_arg01015402389";
        java.lang.String _getDesc_arg1 = "_getDesc_arg11512607418";
        java.lang.String _getDesc_arg2 = "_getDesc_arg21775948699";
        es.oracle.invenes.ws.InvenesResult _getDesc__return = port.getDesc(_getDesc_arg0, _getDesc_arg1, _getDesc_arg2);
        System.out.println("getDesc.result=" + _getDesc__return);


        }
        {
        System.out.println("Invoking getPDF...");
        java.lang.String _getPDF_arg0 = "_getPDF_arg0-1219131890";
        java.lang.String _getPDF_arg1 = "_getPDF_arg1-1095070220";
        java.lang.String _getPDF_arg2 = "_getPDF_arg2-1629008156";
        es.oracle.invenes.ws.InvenesResult _getPDF__return = port.getPDF(_getPDF_arg0, _getPDF_arg1, _getPDF_arg2);
        System.out.println("getPDF.result=" + _getPDF__return);


        }
        {
        System.out.println("Invoking getXMLInfo...");
        java.lang.String _getXMLInfo_arg0 = "_getXMLInfo_arg01594112215";
        java.lang.String _getXMLInfo_arg1 = "_getXMLInfo_arg1-381911984";
        java.lang.String _getXMLInfo__return = port.getXMLInfo(_getXMLInfo_arg0, _getXMLInfo_arg1);
        System.out.println("getXMLInfo.result=" + _getXMLInfo__return);


        }
        {
        System.out.println("Invoking getPublicationTypes...");
        java.lang.String _getPublicationTypes_arg0 = "_getPublicationTypes_arg01581353979";
        java.lang.String _getPublicationTypes_arg1 = "_getPublicationTypes_arg1-1108539878";
        es.oracle.invenes.ws.InvenesProperties _getPublicationTypes__return = port.getPublicationTypes(_getPublicationTypes_arg0, _getPublicationTypes_arg1);
        System.out.println("getPublicationTypes.result=" + _getPublicationTypes__return);


        }
        {
        System.out.println("Invoking getResumen...");
        java.lang.String _getResumen_arg0 = "_getResumen_arg0-1105707363";
        java.lang.String _getResumen_arg1 = "_getResumen_arg1-193210043";
        java.lang.String _getResumen__return = port.getResumen(_getResumen_arg0, _getResumen_arg1);
        System.out.println("getResumen.result=" + _getResumen__return);


        }
        {
        System.out.println("Invoking doLogin...");
        java.lang.String _doLogin_arg0 = "_doLogin_arg0-503806865";
        java.lang.String _doLogin_arg1 = "_doLogin_arg132255349";
        try {
            java.lang.String _doLogin__return = port.doLogin(_doLogin_arg0, _doLogin_arg1);
            System.out.println("doLogin.result=" + _doLogin__return);

        } catch (InvenesWebException_Exception e) { 
            System.out.println("Expected exception: InvenesWebException has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
