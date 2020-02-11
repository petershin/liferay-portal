/*
 * An XML document type.
 * Localname: StatusResponse
 * Namespace: urn:Microsoft.Search
 * Java type: search.microsoft.StatusResponseDocument
 *
 * Automatically generated - do not modify.
 */
package search.microsoft;


/**
 * A document containing one StatusResponse(@urn:Microsoft.Search) element.
 *
 * This is a complex type.
 */
public interface StatusResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StatusResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFABE69962E6AE63A63DABF4B2EBA271E").resolveHandle("statusresponseca65doctype");
    
    /**
     * Gets the "StatusResponse" element
     */
    search.microsoft.StatusResponseDocument.StatusResponse getStatusResponse();
    
    /**
     * Sets the "StatusResponse" element
     */
    void setStatusResponse(search.microsoft.StatusResponseDocument.StatusResponse statusResponse);
    
    /**
     * Appends and returns a new empty "StatusResponse" element
     */
    search.microsoft.StatusResponseDocument.StatusResponse addNewStatusResponse();
    
    /**
     * An XML StatusResponse(@urn:Microsoft.Search).
     *
     * This is a complex type.
     */
    public interface StatusResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StatusResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFABE69962E6AE63A63DABF4B2EBA271E").resolveHandle("statusresponsea834elemtype");
        
        /**
         * Gets the "StatusResult" element
         */
        java.lang.String getStatusResult();
        
        /**
         * Gets (as xml) the "StatusResult" element
         */
        org.apache.xmlbeans.XmlString xgetStatusResult();
        
        /**
         * True if has "StatusResult" element
         */
        boolean isSetStatusResult();
        
        /**
         * Sets the "StatusResult" element
         */
        void setStatusResult(java.lang.String statusResult);
        
        /**
         * Sets (as xml) the "StatusResult" element
         */
        void xsetStatusResult(org.apache.xmlbeans.XmlString statusResult);
        
        /**
         * Unsets the "StatusResult" element
         */
        void unsetStatusResult();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static search.microsoft.StatusResponseDocument.StatusResponse newInstance() {
              return (search.microsoft.StatusResponseDocument.StatusResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static search.microsoft.StatusResponseDocument.StatusResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (search.microsoft.StatusResponseDocument.StatusResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static search.microsoft.StatusResponseDocument newInstance() {
          return (search.microsoft.StatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static search.microsoft.StatusResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (search.microsoft.StatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static search.microsoft.StatusResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (search.microsoft.StatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static search.microsoft.StatusResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (search.microsoft.StatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static search.microsoft.StatusResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.StatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static search.microsoft.StatusResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.StatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static search.microsoft.StatusResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.StatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static search.microsoft.StatusResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.StatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static search.microsoft.StatusResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.StatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static search.microsoft.StatusResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.StatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static search.microsoft.StatusResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.StatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static search.microsoft.StatusResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.StatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static search.microsoft.StatusResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (search.microsoft.StatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static search.microsoft.StatusResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (search.microsoft.StatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static search.microsoft.StatusResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (search.microsoft.StatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static search.microsoft.StatusResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (search.microsoft.StatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static search.microsoft.StatusResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (search.microsoft.StatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static search.microsoft.StatusResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (search.microsoft.StatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
