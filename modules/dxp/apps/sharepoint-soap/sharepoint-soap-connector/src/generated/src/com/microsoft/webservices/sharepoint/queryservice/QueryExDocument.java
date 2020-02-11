/*
 * An XML document type.
 * Localname: QueryEx
 * Namespace: http://microsoft.com/webservices/SharePoint/QueryService
 * Java type: com.microsoft.webservices.sharepoint.queryservice.QueryExDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.webservices.sharepoint.queryservice;


/**
 * A document containing one QueryEx(@http://microsoft.com/webservices/SharePoint/QueryService) element.
 *
 * This is a complex type.
 */
public interface QueryExDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QueryExDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFABE69962E6AE63A63DABF4B2EBA271E").resolveHandle("queryex610cdoctype");
    
    /**
     * Gets the "QueryEx" element
     */
    com.microsoft.webservices.sharepoint.queryservice.QueryExDocument.QueryEx getQueryEx();
    
    /**
     * Sets the "QueryEx" element
     */
    void setQueryEx(com.microsoft.webservices.sharepoint.queryservice.QueryExDocument.QueryEx queryEx);
    
    /**
     * Appends and returns a new empty "QueryEx" element
     */
    com.microsoft.webservices.sharepoint.queryservice.QueryExDocument.QueryEx addNewQueryEx();
    
    /**
     * An XML QueryEx(@http://microsoft.com/webservices/SharePoint/QueryService).
     *
     * This is a complex type.
     */
    public interface QueryEx extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QueryEx.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFABE69962E6AE63A63DABF4B2EBA271E").resolveHandle("queryexf7c5elemtype");
        
        /**
         * Gets the "queryXml" element
         */
        java.lang.String getQueryXml();
        
        /**
         * Gets (as xml) the "queryXml" element
         */
        org.apache.xmlbeans.XmlString xgetQueryXml();
        
        /**
         * True if has "queryXml" element
         */
        boolean isSetQueryXml();
        
        /**
         * Sets the "queryXml" element
         */
        void setQueryXml(java.lang.String queryXml);
        
        /**
         * Sets (as xml) the "queryXml" element
         */
        void xsetQueryXml(org.apache.xmlbeans.XmlString queryXml);
        
        /**
         * Unsets the "queryXml" element
         */
        void unsetQueryXml();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.microsoft.webservices.sharepoint.queryservice.QueryExDocument.QueryEx newInstance() {
              return (com.microsoft.webservices.sharepoint.queryservice.QueryExDocument.QueryEx) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.microsoft.webservices.sharepoint.queryservice.QueryExDocument.QueryEx newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.microsoft.webservices.sharepoint.queryservice.QueryExDocument.QueryEx) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExDocument newInstance() {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.webservices.sharepoint.queryservice.QueryExDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.webservices.sharepoint.queryservice.QueryExDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
