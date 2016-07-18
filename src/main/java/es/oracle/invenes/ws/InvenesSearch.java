package es.oracle.invenes.ws;

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
 
@WebService(targetNamespace = "http://ws.invenes.oracle.es/", name = "InvenesSearch")
@XmlSeeAlso({ObjectFactory.class})
public interface InvenesSearch {

    @WebResult(name = "getSearchFieldsResponse", targetNamespace = "")
    @Action(input = "http://ws.invenes.oracle.es/InvenesSearch/getSearchFieldsRequest", output = "http://ws.invenes.oracle.es/InvenesSearch/getSearchFieldsResponse")
    @RequestWrapper(localName = "getSearchFields", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.GetSearchFields")
    @WebMethod
    @ResponseWrapper(localName = "getSearchFieldsResponse", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.GetSearchFieldsResponse")
    public es.oracle.invenes.ws.InvenesProperties getSearchFields(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.Integer arg1
    );

    @WebResult(name = "return", targetNamespace = "")
    @Action(input = "http://ws.invenes.oracle.es/InvenesSearch/getSummaryRequest", output = "http://ws.invenes.oracle.es/InvenesSearch/getSummaryResponse")
    @RequestWrapper(localName = "getSummary", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.GetSummary")
    @WebMethod
    @ResponseWrapper(localName = "getSummaryResponse", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.GetSummaryResponse")
    public es.oracle.invenes.ws.InvenesResult getSummary(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        java.lang.String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        java.lang.String arg3
    );

    @WebResult(name = "return", targetNamespace = "")
    @Action(input = "http://ws.invenes.oracle.es/InvenesSearch/getAllTypesRequest", output = "http://ws.invenes.oracle.es/InvenesSearch/getAllTypesResponse")
    @RequestWrapper(localName = "getAllTypes", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.GetAllTypes")
    @WebMethod
    @ResponseWrapper(localName = "getAllTypesResponse", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.GetAllTypesResponse")
    public es.oracle.invenes.ws.InvenesProperties getAllTypes(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.Integer arg1
    );

    @WebResult(name = "getBasesResponse", targetNamespace = "")
    @Action(input = "http://ws.invenes.oracle.es/InvenesSearch/getBasesRequest", output = "http://ws.invenes.oracle.es/InvenesSearch/getBasesResponse")
    @RequestWrapper(localName = "getBases", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.GetBases")
    @WebMethod
    @ResponseWrapper(localName = "getBasesResponse", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.GetBasesResponse")
    public es.oracle.invenes.ws.InvenesProperties getBases(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @Action(input = "http://ws.invenes.oracle.es/InvenesSearch/getImagesRequest", output = "http://ws.invenes.oracle.es/InvenesSearch/getImagesResponse")
    @RequestWrapper(localName = "getImages", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.GetImages")
    @WebMethod
    @ResponseWrapper(localName = "getImagesResponse", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.GetImagesResponse")
    public es.oracle.invenes.ws.InvenesResult getImages(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );

    @WebResult(name = "return", targetNamespace = "")
    @Action(input = "http://ws.invenes.oracle.es/InvenesSearch/getClaimsRequest", output = "http://ws.invenes.oracle.es/InvenesSearch/getClaimsResponse")
    @RequestWrapper(localName = "getClaims", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.GetClaims")
    @WebMethod
    @ResponseWrapper(localName = "getClaimsResponse", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.GetClaimsResponse")
    public es.oracle.invenes.ws.InvenesResult getClaims(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        java.lang.String arg2
    );

    @WebResult(name = "doSearchResponse", targetNamespace = "")
    @Action(input = "http://ws.invenes.oracle.es/InvenesSearch/doSearchRequest", output = "http://ws.invenes.oracle.es/InvenesSearch/doSearchResponse", fault = {@FaultAction(className = SesionExpiradaException_Exception.class, value = "http://ws.invenes.oracle.es/InvenesSearch/doSearch/Fault/SesionExpiradaException")})
    @RequestWrapper(localName = "doSearch", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.DoSearch")
    @WebMethod
    @ResponseWrapper(localName = "doSearchResponse", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.DoSearchResponse")
    public es.oracle.invenes.ws.SearchResult doSearch(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.Integer arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        java.lang.String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        java.lang.String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        java.lang.String arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        java.lang.String arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        java.lang.Integer arg6,
        @WebParam(name = "arg7", targetNamespace = "")
        java.lang.Integer arg7
    ) throws SesionExpiradaException_Exception;

    @WebResult(name = "return", targetNamespace = "")
    @Action(input = "http://ws.invenes.oracle.es/InvenesSearch/getWrittenOpinionRequest", output = "http://ws.invenes.oracle.es/InvenesSearch/getWrittenOpinionResponse")
    @RequestWrapper(localName = "getWrittenOpinion", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.GetWrittenOpinion")
    @WebMethod
    @ResponseWrapper(localName = "getWrittenOpinionResponse", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.GetWrittenOpinionResponse")
    public es.oracle.invenes.ws.InvenesResult getWrittenOpinion(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        java.lang.String arg2
    );

    @WebResult(name = "return", targetNamespace = "")
    @Action(input = "http://ws.invenes.oracle.es/InvenesSearch/getSearchReportRequest", output = "http://ws.invenes.oracle.es/InvenesSearch/getSearchReportResponse")
    @RequestWrapper(localName = "getSearchReport", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.GetSearchReport")
    @WebMethod
    @ResponseWrapper(localName = "getSearchReportResponse", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.GetSearchReportResponse")
    public es.oracle.invenes.ws.InvenesResult getSearchReport(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        java.lang.String arg2
    );

    @WebResult(name = "return", targetNamespace = "")
    @Action(input = "http://ws.invenes.oracle.es/InvenesSearch/getResultFieldsRequest", output = "http://ws.invenes.oracle.es/InvenesSearch/getResultFieldsResponse")
    @RequestWrapper(localName = "getResultFields", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.GetResultFields")
    @WebMethod
    @ResponseWrapper(localName = "getResultFieldsResponse", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.GetResultFieldsResponse")
    public es.oracle.invenes.ws.InvenesProperties getResultFields(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.Integer arg1
    );

    @WebResult(name = "return", targetNamespace = "")
    @Action(input = "http://ws.invenes.oracle.es/InvenesSearch/getDescRequest", output = "http://ws.invenes.oracle.es/InvenesSearch/getDescResponse")
    @RequestWrapper(localName = "getDesc", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.GetDesc")
    @WebMethod
    @ResponseWrapper(localName = "getDescResponse", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.GetDescResponse")
    public es.oracle.invenes.ws.InvenesResult getDesc(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        java.lang.String arg2
    );

    @WebResult(name = "return", targetNamespace = "")
    @Action(input = "http://ws.invenes.oracle.es/InvenesSearch/getPDFRequest", output = "http://ws.invenes.oracle.es/InvenesSearch/getPDFResponse")
    @RequestWrapper(localName = "getPDF", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.GetPDF")
    @WebMethod
    @ResponseWrapper(localName = "getPDFResponse", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.GetPDFResponse")
    public es.oracle.invenes.ws.InvenesResult getPDF(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        java.lang.String arg2
    );

    @WebResult(name = "return", targetNamespace = "")
    @Action(input = "http://ws.invenes.oracle.es/InvenesSearch/getXMLInfoRequest", output = "http://ws.invenes.oracle.es/InvenesSearch/getXMLInfoResponse")
    @RequestWrapper(localName = "getXMLInfo", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.GetXMLInfo")
    @WebMethod
    @ResponseWrapper(localName = "getXMLInfoResponse", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.GetXMLInfoResponse")
    public java.lang.String getXMLInfo(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );

    @WebResult(name = "return", targetNamespace = "")
    @Action(input = "http://ws.invenes.oracle.es/InvenesSearch/getPublicationTypesRequest", output = "http://ws.invenes.oracle.es/InvenesSearch/getPublicationTypesResponse")
    @RequestWrapper(localName = "getPublicationTypes", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.GetPublicationTypes")
    @WebMethod
    @ResponseWrapper(localName = "getPublicationTypesResponse", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.GetPublicationTypesResponse")
    public es.oracle.invenes.ws.InvenesProperties getPublicationTypes(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );

    @WebResult(name = "return", targetNamespace = "")
    @Action(input = "http://ws.invenes.oracle.es/InvenesSearch/getResumenRequest", output = "http://ws.invenes.oracle.es/InvenesSearch/getResumenResponse")
    @RequestWrapper(localName = "getResumen", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.GetResumen")
    @WebMethod
    @ResponseWrapper(localName = "getResumenResponse", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.GetResumenResponse")
    public java.lang.String getResumen(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );

    @WebResult(name = "doLoginResponse", targetNamespace = "")
    @Action(input = "http://ws.invenes.oracle.es/InvenesSearch/doLoginRequest", output = "http://ws.invenes.oracle.es/InvenesSearch/doLoginResponse", fault = {@FaultAction(className = InvenesWebException_Exception.class, value = "http://ws.invenes.oracle.es/InvenesSearch/doLogin/Fault/InvenesWebException")})
    @RequestWrapper(localName = "doLogin", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.DoLogin")
    @WebMethod
    @ResponseWrapper(localName = "doLoginResponse", targetNamespace = "http://ws.invenes.oracle.es/", className = "es.oracle.invenes.ws.DoLoginResponse")
    public java.lang.String doLogin(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    ) throws InvenesWebException_Exception;
}