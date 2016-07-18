
package es.oracle.invenes.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.oracle.invenes.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetSummary_QNAME = new QName("http://ws.invenes.oracle.es/", "getSummary");
    private final static QName _GetSearchReportResponse_QNAME = new QName("http://ws.invenes.oracle.es/", "getSearchReportResponse");
    private final static QName _GetImages_QNAME = new QName("http://ws.invenes.oracle.es/", "getImages");
    private final static QName _GetResultFieldsResponse_QNAME = new QName("http://ws.invenes.oracle.es/", "getResultFieldsResponse");
    private final static QName _GetWrittenOpinionResponse_QNAME = new QName("http://ws.invenes.oracle.es/", "getWrittenOpinionResponse");
    private final static QName _GetXMLInfo_QNAME = new QName("http://ws.invenes.oracle.es/", "getXMLInfo");
    private final static QName _GetAllTypes_QNAME = new QName("http://ws.invenes.oracle.es/", "getAllTypes");
    private final static QName _GetXMLInfoResponse_QNAME = new QName("http://ws.invenes.oracle.es/", "getXMLInfoResponse");
    private final static QName _GetImagesResponse_QNAME = new QName("http://ws.invenes.oracle.es/", "getImagesResponse");
    private final static QName _GetClaimsResponse_QNAME = new QName("http://ws.invenes.oracle.es/", "getClaimsResponse");
    private final static QName _GetDescResponse_QNAME = new QName("http://ws.invenes.oracle.es/", "getDescResponse");
    private final static QName _InvenesWebException_QNAME = new QName("http://ws.invenes.oracle.es/", "InvenesWebException");
    private final static QName _GetPublicationTypesResponse_QNAME = new QName("http://ws.invenes.oracle.es/", "getPublicationTypesResponse");
    private final static QName _GetSearchFields_QNAME = new QName("http://ws.invenes.oracle.es/", "getSearchFields");
    private final static QName _GetSearchReport_QNAME = new QName("http://ws.invenes.oracle.es/", "getSearchReport");
    private final static QName _DoLogin_QNAME = new QName("http://ws.invenes.oracle.es/", "doLogin");
    private final static QName _GetPublicationTypes_QNAME = new QName("http://ws.invenes.oracle.es/", "getPublicationTypes");
    private final static QName _GetAllTypesResponse_QNAME = new QName("http://ws.invenes.oracle.es/", "getAllTypesResponse");
    private final static QName _DoLoginResponse_QNAME = new QName("http://ws.invenes.oracle.es/", "doLoginResponse");
    private final static QName _GetSummaryResponse_QNAME = new QName("http://ws.invenes.oracle.es/", "getSummaryResponse");
    private final static QName _GetSearchFieldsResponse_QNAME = new QName("http://ws.invenes.oracle.es/", "getSearchFieldsResponse");
    private final static QName _SesionExpiradaException_QNAME = new QName("http://ws.invenes.oracle.es/", "SesionExpiradaException");
    private final static QName _DoSearch_QNAME = new QName("http://ws.invenes.oracle.es/", "doSearch");
    private final static QName _GetResumen_QNAME = new QName("http://ws.invenes.oracle.es/", "getResumen");
    private final static QName _GetPDF_QNAME = new QName("http://ws.invenes.oracle.es/", "getPDF");
    private final static QName _GetClaims_QNAME = new QName("http://ws.invenes.oracle.es/", "getClaims");
    private final static QName _GetPDFResponse_QNAME = new QName("http://ws.invenes.oracle.es/", "getPDFResponse");
    private final static QName _GetDesc_QNAME = new QName("http://ws.invenes.oracle.es/", "getDesc");
    private final static QName _GetResultFields_QNAME = new QName("http://ws.invenes.oracle.es/", "getResultFields");
    private final static QName _GetResumenResponse_QNAME = new QName("http://ws.invenes.oracle.es/", "getResumenResponse");
    private final static QName _DoSearchResponse_QNAME = new QName("http://ws.invenes.oracle.es/", "doSearchResponse");
    private final static QName _GetBases_QNAME = new QName("http://ws.invenes.oracle.es/", "getBases");
    private final static QName _GetWrittenOpinion_QNAME = new QName("http://ws.invenes.oracle.es/", "getWrittenOpinion");
    private final static QName _GetBasesResponse_QNAME = new QName("http://ws.invenes.oracle.es/", "getBasesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.oracle.invenes.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetImages }
     * 
     */
    public GetImages createGetImages() {
        return new GetImages();
    }

    /**
     * Create an instance of {@link Reference }
     * 
     */
    public Reference createReference() {
        return new Reference();
    }

    /**
     * Create an instance of {@link GetBases }
     * 
     */
    public GetBases createGetBases() {
        return new GetBases();
    }

    /**
     * Create an instance of {@link GetXMLInfo }
     * 
     */
    public GetXMLInfo createGetXMLInfo() {
        return new GetXMLInfo();
    }

    /**
     * Create an instance of {@link GetResumen }
     * 
     */
    public GetResumen createGetResumen() {
        return new GetResumen();
    }

    /**
     * Create an instance of {@link GetSummary }
     * 
     */
    public GetSummary createGetSummary() {
        return new GetSummary();
    }

    /**
     * Create an instance of {@link SearchResult }
     * 
     */
    public SearchResult createSearchResult() {
        return new SearchResult();
    }

    /**
     * Create an instance of {@link DoSearchResponse }
     * 
     */
    public DoSearchResponse createDoSearchResponse() {
        return new DoSearchResponse();
    }

    /**
     * Create an instance of {@link GetSearchReport }
     * 
     */
    public GetSearchReport createGetSearchReport() {
        return new GetSearchReport();
    }

    /**
     * Create an instance of {@link GetResultFields }
     * 
     */
    public GetResultFields createGetResultFields() {
        return new GetResultFields();
    }

    /**
     * Create an instance of {@link GetDesc }
     * 
     */
    public GetDesc createGetDesc() {
        return new GetDesc();
    }

    /**
     * Create an instance of {@link DoSearch }
     * 
     */
    public DoSearch createDoSearch() {
        return new DoSearch();
    }

    /**
     * Create an instance of {@link GetResultFieldsResponse }
     * 
     */
    public GetResultFieldsResponse createGetResultFieldsResponse() {
        return new GetResultFieldsResponse();
    }

    /**
     * Create an instance of {@link GetBasesResponse }
     * 
     */
    public GetBasesResponse createGetBasesResponse() {
        return new GetBasesResponse();
    }

    /**
     * Create an instance of {@link GetSearchFieldsResponse }
     * 
     */
    public GetSearchFieldsResponse createGetSearchFieldsResponse() {
        return new GetSearchFieldsResponse();
    }

    /**
     * Create an instance of {@link GetPublicationTypes }
     * 
     */
    public GetPublicationTypes createGetPublicationTypes() {
        return new GetPublicationTypes();
    }

    /**
     * Create an instance of {@link GetClaims }
     * 
     */
    public GetClaims createGetClaims() {
        return new GetClaims();
    }

    /**
     * Create an instance of {@link InvenesWebException }
     * 
     */
    public InvenesWebException createInvenesWebException() {
        return new InvenesWebException();
    }

    /**
     * Create an instance of {@link GetPDF }
     * 
     */
    public GetPDF createGetPDF() {
        return new GetPDF();
    }

    /**
     * Create an instance of {@link SesionExpiradaException }
     * 
     */
    public SesionExpiradaException createSesionExpiradaException() {
        return new SesionExpiradaException();
    }

    /**
     * Create an instance of {@link GetSearchReportResponse }
     * 
     */
    public GetSearchReportResponse createGetSearchReportResponse() {
        return new GetSearchReportResponse();
    }

    /**
     * Create an instance of {@link GetXMLInfoResponse }
     * 
     */
    public GetXMLInfoResponse createGetXMLInfoResponse() {
        return new GetXMLInfoResponse();
    }

    /**
     * Create an instance of {@link DoLoginResponse }
     * 
     */
    public DoLoginResponse createDoLoginResponse() {
        return new DoLoginResponse();
    }

    /**
     * Create an instance of {@link LabelValueBean }
     * 
     */
    public LabelValueBean createLabelValueBean() {
        return new LabelValueBean();
    }

    /**
     * Create an instance of {@link GetAllTypesResponse }
     * 
     */
    public GetAllTypesResponse createGetAllTypesResponse() {
        return new GetAllTypesResponse();
    }

    /**
     * Create an instance of {@link GetResumenResponse }
     * 
     */
    public GetResumenResponse createGetResumenResponse() {
        return new GetResumenResponse();
    }

    /**
     * Create an instance of {@link GetAllTypes }
     * 
     */
    public GetAllTypes createGetAllTypes() {
        return new GetAllTypes();
    }

    /**
     * Create an instance of {@link GetWrittenOpinionResponse }
     * 
     */
    public GetWrittenOpinionResponse createGetWrittenOpinionResponse() {
        return new GetWrittenOpinionResponse();
    }

    /**
     * Create an instance of {@link GetPDFResponse }
     * 
     */
    public GetPDFResponse createGetPDFResponse() {
        return new GetPDFResponse();
    }

    /**
     * Create an instance of {@link GetSearchFields }
     * 
     */
    public GetSearchFields createGetSearchFields() {
        return new GetSearchFields();
    }

    /**
     * Create an instance of {@link InvenesResult }
     * 
     */
    public InvenesResult createInvenesResult() {
        return new InvenesResult();
    }

    /**
     * Create an instance of {@link GetDescResponse }
     * 
     */
    public GetDescResponse createGetDescResponse() {
        return new GetDescResponse();
    }

    /**
     * Create an instance of {@link InvenesProperties }
     * 
     */
    public InvenesProperties createInvenesProperties() {
        return new InvenesProperties();
    }

    /**
     * Create an instance of {@link GetClaimsResponse }
     * 
     */
    public GetClaimsResponse createGetClaimsResponse() {
        return new GetClaimsResponse();
    }

    /**
     * Create an instance of {@link DoLogin }
     * 
     */
    public DoLogin createDoLogin() {
        return new DoLogin();
    }

    /**
     * Create an instance of {@link GetImagesResponse }
     * 
     */
    public GetImagesResponse createGetImagesResponse() {
        return new GetImagesResponse();
    }

    /**
     * Create an instance of {@link GetWrittenOpinion }
     * 
     */
    public GetWrittenOpinion createGetWrittenOpinion() {
        return new GetWrittenOpinion();
    }

    /**
     * Create an instance of {@link GetSummaryResponse }
     * 
     */
    public GetSummaryResponse createGetSummaryResponse() {
        return new GetSummaryResponse();
    }

    /**
     * Create an instance of {@link GetPublicationTypesResponse }
     * 
     */
    public GetPublicationTypesResponse createGetPublicationTypesResponse() {
        return new GetPublicationTypesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "getSummary")
    public JAXBElement<GetSummary> createGetSummary(GetSummary value) {
        return new JAXBElement<GetSummary>(_GetSummary_QNAME, GetSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSearchReportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "getSearchReportResponse")
    public JAXBElement<GetSearchReportResponse> createGetSearchReportResponse(GetSearchReportResponse value) {
        return new JAXBElement<GetSearchReportResponse>(_GetSearchReportResponse_QNAME, GetSearchReportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetImages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "getImages")
    public JAXBElement<GetImages> createGetImages(GetImages value) {
        return new JAXBElement<GetImages>(_GetImages_QNAME, GetImages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultFieldsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "getResultFieldsResponse")
    public JAXBElement<GetResultFieldsResponse> createGetResultFieldsResponse(GetResultFieldsResponse value) {
        return new JAXBElement<GetResultFieldsResponse>(_GetResultFieldsResponse_QNAME, GetResultFieldsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWrittenOpinionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "getWrittenOpinionResponse")
    public JAXBElement<GetWrittenOpinionResponse> createGetWrittenOpinionResponse(GetWrittenOpinionResponse value) {
        return new JAXBElement<GetWrittenOpinionResponse>(_GetWrittenOpinionResponse_QNAME, GetWrittenOpinionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetXMLInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "getXMLInfo")
    public JAXBElement<GetXMLInfo> createGetXMLInfo(GetXMLInfo value) {
        return new JAXBElement<GetXMLInfo>(_GetXMLInfo_QNAME, GetXMLInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "getAllTypes")
    public JAXBElement<GetAllTypes> createGetAllTypes(GetAllTypes value) {
        return new JAXBElement<GetAllTypes>(_GetAllTypes_QNAME, GetAllTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetXMLInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "getXMLInfoResponse")
    public JAXBElement<GetXMLInfoResponse> createGetXMLInfoResponse(GetXMLInfoResponse value) {
        return new JAXBElement<GetXMLInfoResponse>(_GetXMLInfoResponse_QNAME, GetXMLInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetImagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "getImagesResponse")
    public JAXBElement<GetImagesResponse> createGetImagesResponse(GetImagesResponse value) {
        return new JAXBElement<GetImagesResponse>(_GetImagesResponse_QNAME, GetImagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClaimsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "getClaimsResponse")
    public JAXBElement<GetClaimsResponse> createGetClaimsResponse(GetClaimsResponse value) {
        return new JAXBElement<GetClaimsResponse>(_GetClaimsResponse_QNAME, GetClaimsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDescResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "getDescResponse")
    public JAXBElement<GetDescResponse> createGetDescResponse(GetDescResponse value) {
        return new JAXBElement<GetDescResponse>(_GetDescResponse_QNAME, GetDescResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvenesWebException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "InvenesWebException")
    public JAXBElement<InvenesWebException> createInvenesWebException(InvenesWebException value) {
        return new JAXBElement<InvenesWebException>(_InvenesWebException_QNAME, InvenesWebException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPublicationTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "getPublicationTypesResponse")
    public JAXBElement<GetPublicationTypesResponse> createGetPublicationTypesResponse(GetPublicationTypesResponse value) {
        return new JAXBElement<GetPublicationTypesResponse>(_GetPublicationTypesResponse_QNAME, GetPublicationTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSearchFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "getSearchFields")
    public JAXBElement<GetSearchFields> createGetSearchFields(GetSearchFields value) {
        return new JAXBElement<GetSearchFields>(_GetSearchFields_QNAME, GetSearchFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSearchReport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "getSearchReport")
    public JAXBElement<GetSearchReport> createGetSearchReport(GetSearchReport value) {
        return new JAXBElement<GetSearchReport>(_GetSearchReport_QNAME, GetSearchReport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "doLogin")
    public JAXBElement<DoLogin> createDoLogin(DoLogin value) {
        return new JAXBElement<DoLogin>(_DoLogin_QNAME, DoLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPublicationTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "getPublicationTypes")
    public JAXBElement<GetPublicationTypes> createGetPublicationTypes(GetPublicationTypes value) {
        return new JAXBElement<GetPublicationTypes>(_GetPublicationTypes_QNAME, GetPublicationTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "getAllTypesResponse")
    public JAXBElement<GetAllTypesResponse> createGetAllTypesResponse(GetAllTypesResponse value) {
        return new JAXBElement<GetAllTypesResponse>(_GetAllTypesResponse_QNAME, GetAllTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "doLoginResponse")
    public JAXBElement<DoLoginResponse> createDoLoginResponse(DoLoginResponse value) {
        return new JAXBElement<DoLoginResponse>(_DoLoginResponse_QNAME, DoLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSummaryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "getSummaryResponse")
    public JAXBElement<GetSummaryResponse> createGetSummaryResponse(GetSummaryResponse value) {
        return new JAXBElement<GetSummaryResponse>(_GetSummaryResponse_QNAME, GetSummaryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSearchFieldsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "getSearchFieldsResponse")
    public JAXBElement<GetSearchFieldsResponse> createGetSearchFieldsResponse(GetSearchFieldsResponse value) {
        return new JAXBElement<GetSearchFieldsResponse>(_GetSearchFieldsResponse_QNAME, GetSearchFieldsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SesionExpiradaException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "SesionExpiradaException")
    public JAXBElement<SesionExpiradaException> createSesionExpiradaException(SesionExpiradaException value) {
        return new JAXBElement<SesionExpiradaException>(_SesionExpiradaException_QNAME, SesionExpiradaException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "doSearch")
    public JAXBElement<DoSearch> createDoSearch(DoSearch value) {
        return new JAXBElement<DoSearch>(_DoSearch_QNAME, DoSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResumen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "getResumen")
    public JAXBElement<GetResumen> createGetResumen(GetResumen value) {
        return new JAXBElement<GetResumen>(_GetResumen_QNAME, GetResumen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPDF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "getPDF")
    public JAXBElement<GetPDF> createGetPDF(GetPDF value) {
        return new JAXBElement<GetPDF>(_GetPDF_QNAME, GetPDF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClaims }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "getClaims")
    public JAXBElement<GetClaims> createGetClaims(GetClaims value) {
        return new JAXBElement<GetClaims>(_GetClaims_QNAME, GetClaims.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPDFResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "getPDFResponse")
    public JAXBElement<GetPDFResponse> createGetPDFResponse(GetPDFResponse value) {
        return new JAXBElement<GetPDFResponse>(_GetPDFResponse_QNAME, GetPDFResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDesc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "getDesc")
    public JAXBElement<GetDesc> createGetDesc(GetDesc value) {
        return new JAXBElement<GetDesc>(_GetDesc_QNAME, GetDesc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "getResultFields")
    public JAXBElement<GetResultFields> createGetResultFields(GetResultFields value) {
        return new JAXBElement<GetResultFields>(_GetResultFields_QNAME, GetResultFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResumenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "getResumenResponse")
    public JAXBElement<GetResumenResponse> createGetResumenResponse(GetResumenResponse value) {
        return new JAXBElement<GetResumenResponse>(_GetResumenResponse_QNAME, GetResumenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "doSearchResponse")
    public JAXBElement<DoSearchResponse> createDoSearchResponse(DoSearchResponse value) {
        return new JAXBElement<DoSearchResponse>(_DoSearchResponse_QNAME, DoSearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBases }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "getBases")
    public JAXBElement<GetBases> createGetBases(GetBases value) {
        return new JAXBElement<GetBases>(_GetBases_QNAME, GetBases.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWrittenOpinion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "getWrittenOpinion")
    public JAXBElement<GetWrittenOpinion> createGetWrittenOpinion(GetWrittenOpinion value) {
        return new JAXBElement<GetWrittenOpinion>(_GetWrittenOpinion_QNAME, GetWrittenOpinion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBasesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.invenes.oracle.es/", name = "getBasesResponse")
    public JAXBElement<GetBasesResponse> createGetBasesResponse(GetBasesResponse value) {
        return new JAXBElement<GetBasesResponse>(_GetBasesResponse_QNAME, GetBasesResponse.class, null, value);
    }

}
