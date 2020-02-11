/*
 * An XML document type.
 * Localname: Registration
 * Namespace: urn:Microsoft.Search
 * Java type: search.microsoft.RegistrationDocument
 *
 * Automatically generated - do not modify.
 */
package search.microsoft;


/**
 * A document containing one Registration(@urn:Microsoft.Search) element.
 *
 * This is a complex type.
 */
public interface RegistrationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RegistrationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFABE69962E6AE63A63DABF4B2EBA271E").resolveHandle("registration397fdoctype");
    
    /**
     * Gets the "Registration" element
     */
    search.microsoft.RegistrationDocument.Registration getRegistration();
    
    /**
     * Sets the "Registration" element
     */
    void setRegistration(search.microsoft.RegistrationDocument.Registration registration);
    
    /**
     * Appends and returns a new empty "Registration" element
     */
    search.microsoft.RegistrationDocument.Registration addNewRegistration();
    
    /**
     * An XML Registration(@urn:Microsoft.Search).
     *
     * This is a complex type.
     */
    public interface Registration extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Registration.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFABE69962E6AE63A63DABF4B2EBA271E").resolveHandle("registration8474elemtype");
        
        /**
         * Gets the "registrationXml" element
         */
        java.lang.String getRegistrationXml();
        
        /**
         * Gets (as xml) the "registrationXml" element
         */
        org.apache.xmlbeans.XmlString xgetRegistrationXml();
        
        /**
         * True if has "registrationXml" element
         */
        boolean isSetRegistrationXml();
        
        /**
         * Sets the "registrationXml" element
         */
        void setRegistrationXml(java.lang.String registrationXml);
        
        /**
         * Sets (as xml) the "registrationXml" element
         */
        void xsetRegistrationXml(org.apache.xmlbeans.XmlString registrationXml);
        
        /**
         * Unsets the "registrationXml" element
         */
        void unsetRegistrationXml();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static search.microsoft.RegistrationDocument.Registration newInstance() {
              return (search.microsoft.RegistrationDocument.Registration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static search.microsoft.RegistrationDocument.Registration newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (search.microsoft.RegistrationDocument.Registration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static search.microsoft.RegistrationDocument newInstance() {
          return (search.microsoft.RegistrationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static search.microsoft.RegistrationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (search.microsoft.RegistrationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static search.microsoft.RegistrationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (search.microsoft.RegistrationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static search.microsoft.RegistrationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (search.microsoft.RegistrationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static search.microsoft.RegistrationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.RegistrationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static search.microsoft.RegistrationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.RegistrationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static search.microsoft.RegistrationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.RegistrationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static search.microsoft.RegistrationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.RegistrationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static search.microsoft.RegistrationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.RegistrationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static search.microsoft.RegistrationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.RegistrationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static search.microsoft.RegistrationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.RegistrationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static search.microsoft.RegistrationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (search.microsoft.RegistrationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static search.microsoft.RegistrationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (search.microsoft.RegistrationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static search.microsoft.RegistrationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (search.microsoft.RegistrationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static search.microsoft.RegistrationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (search.microsoft.RegistrationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static search.microsoft.RegistrationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (search.microsoft.RegistrationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static search.microsoft.RegistrationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (search.microsoft.RegistrationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static search.microsoft.RegistrationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (search.microsoft.RegistrationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
