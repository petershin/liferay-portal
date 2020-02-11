/*
 * An XML document type.
 * Localname: QueryExResponse
 * Namespace: http://microsoft.com/webservices/SharePoint/QueryService
 * Java type: com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.webservices.sharepoint.queryservice;


/**
 * A document containing one QueryExResponse(@http://microsoft.com/webservices/SharePoint/QueryService) element.
 *
 * This is a complex type.
 */
public interface QueryExResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QueryExResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFABE69962E6AE63A63DABF4B2EBA271E").resolveHandle("queryexresponse6dcbdoctype");
    
    /**
     * Gets the "QueryExResponse" element
     */
    com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.QueryExResponse getQueryExResponse();
    
    /**
     * Sets the "QueryExResponse" element
     */
    void setQueryExResponse(com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.QueryExResponse queryExResponse);
    
    /**
     * Appends and returns a new empty "QueryExResponse" element
     */
    com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.QueryExResponse addNewQueryExResponse();
    
    /**
     * An XML QueryExResponse(@http://microsoft.com/webservices/SharePoint/QueryService).
     *
     * This is a complex type.
     */
    public interface QueryExResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QueryExResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFABE69962E6AE63A63DABF4B2EBA271E").resolveHandle("queryexresponse6783elemtype");
        
        /**
         * Gets the "QueryExResult" element
         */
        com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.QueryExResponse.QueryExResult getQueryExResult();
        
        /**
         * True if has "QueryExResult" element
         */
        boolean isSetQueryExResult();
        
        /**
         * Sets the "QueryExResult" element
         */
        void setQueryExResult(com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.QueryExResponse.QueryExResult queryExResult);
        
        /**
         * Appends and returns a new empty "QueryExResult" element
         */
        com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.QueryExResponse.QueryExResult addNewQueryExResult();
        
        /**
         * Unsets the "QueryExResult" element
         */
        void unsetQueryExResult();
        
        /**
         * An XML QueryExResult(@http://microsoft.com/webservices/SharePoint/QueryService).
         *
         * This is a complex type.
         */
        public interface QueryExResult extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QueryExResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFABE69962E6AE63A63DABF4B2EBA271E").resolveHandle("queryexresultc01felemtype");
            
            /**
             * Gets the "schema" element
             */
            org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema getSchema();
            
            /**
             * Sets the "schema" element
             */
            void setSchema(org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema schema);
            
            /**
             * Appends and returns a new empty "schema" element
             */
            org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema addNewSchema();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.QueryExResponse.QueryExResult newInstance() {
                  return (com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.QueryExResponse.QueryExResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.QueryExResponse.QueryExResult newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.QueryExResponse.QueryExResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.QueryExResponse newInstance() {
              return (com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.QueryExResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.QueryExResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.QueryExResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument newInstance() {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
