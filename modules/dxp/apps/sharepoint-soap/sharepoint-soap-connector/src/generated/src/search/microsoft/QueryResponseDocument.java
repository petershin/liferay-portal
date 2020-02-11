/*
 * An XML document type.
 * Localname: QueryResponse
 * Namespace: urn:Microsoft.Search
 * Java type: search.microsoft.QueryResponseDocument
 *
 * Automatically generated - do not modify.
 */
package search.microsoft;


/**
 * A document containing one QueryResponse(@urn:Microsoft.Search) element.
 *
 * This is a complex type.
 */
public interface QueryResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QueryResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFABE69962E6AE63A63DABF4B2EBA271E").resolveHandle("queryresponse7ae1doctype");
    
    /**
     * Gets the "QueryResponse" element
     */
    search.microsoft.QueryResponseDocument.QueryResponse getQueryResponse();
    
    /**
     * Sets the "QueryResponse" element
     */
    void setQueryResponse(search.microsoft.QueryResponseDocument.QueryResponse queryResponse);
    
    /**
     * Appends and returns a new empty "QueryResponse" element
     */
    search.microsoft.QueryResponseDocument.QueryResponse addNewQueryResponse();
    
    /**
     * An XML QueryResponse(@urn:Microsoft.Search).
     *
     * This is a complex type.
     */
    public interface QueryResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QueryResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFABE69962E6AE63A63DABF4B2EBA271E").resolveHandle("queryresponse488celemtype");
        
        /**
         * Gets the "QueryResult" element
         */
        java.lang.String getQueryResult();
        
        /**
         * Gets (as xml) the "QueryResult" element
         */
        org.apache.xmlbeans.XmlString xgetQueryResult();
        
        /**
         * True if has "QueryResult" element
         */
        boolean isSetQueryResult();
        
        /**
         * Sets the "QueryResult" element
         */
        void setQueryResult(java.lang.String queryResult);
        
        /**
         * Sets (as xml) the "QueryResult" element
         */
        void xsetQueryResult(org.apache.xmlbeans.XmlString queryResult);
        
        /**
         * Unsets the "QueryResult" element
         */
        void unsetQueryResult();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static search.microsoft.QueryResponseDocument.QueryResponse newInstance() {
              return (search.microsoft.QueryResponseDocument.QueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static search.microsoft.QueryResponseDocument.QueryResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (search.microsoft.QueryResponseDocument.QueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static search.microsoft.QueryResponseDocument newInstance() {
          return (search.microsoft.QueryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static search.microsoft.QueryResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (search.microsoft.QueryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static search.microsoft.QueryResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (search.microsoft.QueryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static search.microsoft.QueryResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (search.microsoft.QueryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static search.microsoft.QueryResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.QueryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static search.microsoft.QueryResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.QueryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static search.microsoft.QueryResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.QueryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static search.microsoft.QueryResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.QueryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static search.microsoft.QueryResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.QueryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static search.microsoft.QueryResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.QueryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static search.microsoft.QueryResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.QueryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static search.microsoft.QueryResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.QueryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static search.microsoft.QueryResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (search.microsoft.QueryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static search.microsoft.QueryResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (search.microsoft.QueryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static search.microsoft.QueryResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (search.microsoft.QueryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static search.microsoft.QueryResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (search.microsoft.QueryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static search.microsoft.QueryResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (search.microsoft.QueryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static search.microsoft.QueryResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (search.microsoft.QueryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
