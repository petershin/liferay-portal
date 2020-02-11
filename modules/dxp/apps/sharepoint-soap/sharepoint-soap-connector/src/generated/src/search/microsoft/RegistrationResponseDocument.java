/*
 * An XML document type.
 * Localname: RegistrationResponse
 * Namespace: urn:Microsoft.Search
 * Java type: search.microsoft.RegistrationResponseDocument
 *
 * Automatically generated - do not modify.
 */
package search.microsoft;


/**
 * A document containing one RegistrationResponse(@urn:Microsoft.Search) element.
 *
 * This is a complex type.
 */
public interface RegistrationResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RegistrationResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFABE69962E6AE63A63DABF4B2EBA271E").resolveHandle("registrationresponse29bedoctype");
    
    /**
     * Gets the "RegistrationResponse" element
     */
    search.microsoft.RegistrationResponseDocument.RegistrationResponse getRegistrationResponse();
    
    /**
     * Sets the "RegistrationResponse" element
     */
    void setRegistrationResponse(search.microsoft.RegistrationResponseDocument.RegistrationResponse registrationResponse);
    
    /**
     * Appends and returns a new empty "RegistrationResponse" element
     */
    search.microsoft.RegistrationResponseDocument.RegistrationResponse addNewRegistrationResponse();
    
    /**
     * An XML RegistrationResponse(@urn:Microsoft.Search).
     *
     * This is a complex type.
     */
    public interface RegistrationResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RegistrationResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFABE69962E6AE63A63DABF4B2EBA271E").resolveHandle("registrationresponse5994elemtype");
        
        /**
         * Gets the "RegistrationResult" element
         */
        java.lang.String getRegistrationResult();
        
        /**
         * Gets (as xml) the "RegistrationResult" element
         */
        org.apache.xmlbeans.XmlString xgetRegistrationResult();
        
        /**
         * True if has "RegistrationResult" element
         */
        boolean isSetRegistrationResult();
        
        /**
         * Sets the "RegistrationResult" element
         */
        void setRegistrationResult(java.lang.String registrationResult);
        
        /**
         * Sets (as xml) the "RegistrationResult" element
         */
        void xsetRegistrationResult(org.apache.xmlbeans.XmlString registrationResult);
        
        /**
         * Unsets the "RegistrationResult" element
         */
        void unsetRegistrationResult();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static search.microsoft.RegistrationResponseDocument.RegistrationResponse newInstance() {
              return (search.microsoft.RegistrationResponseDocument.RegistrationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static search.microsoft.RegistrationResponseDocument.RegistrationResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (search.microsoft.RegistrationResponseDocument.RegistrationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static search.microsoft.RegistrationResponseDocument newInstance() {
          return (search.microsoft.RegistrationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static search.microsoft.RegistrationResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (search.microsoft.RegistrationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static search.microsoft.RegistrationResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (search.microsoft.RegistrationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static search.microsoft.RegistrationResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (search.microsoft.RegistrationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static search.microsoft.RegistrationResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.RegistrationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static search.microsoft.RegistrationResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.RegistrationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static search.microsoft.RegistrationResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.RegistrationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static search.microsoft.RegistrationResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.RegistrationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static search.microsoft.RegistrationResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.RegistrationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static search.microsoft.RegistrationResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.RegistrationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static search.microsoft.RegistrationResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.RegistrationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static search.microsoft.RegistrationResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.RegistrationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static search.microsoft.RegistrationResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (search.microsoft.RegistrationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static search.microsoft.RegistrationResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (search.microsoft.RegistrationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static search.microsoft.RegistrationResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (search.microsoft.RegistrationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static search.microsoft.RegistrationResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (search.microsoft.RegistrationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static search.microsoft.RegistrationResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (search.microsoft.RegistrationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static search.microsoft.RegistrationResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (search.microsoft.RegistrationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
