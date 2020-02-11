/*
 * An XML document type.
 * Localname: CheckOutFile
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap;


/**
 * A document containing one CheckOutFile(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public interface CheckOutFileDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CheckOutFileDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("checkoutfile41bddoctype");
    
    /**
     * Gets the "CheckOutFile" element
     */
    com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument.CheckOutFile getCheckOutFile();
    
    /**
     * Sets the "CheckOutFile" element
     */
    void setCheckOutFile(com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument.CheckOutFile checkOutFile);
    
    /**
     * Appends and returns a new empty "CheckOutFile" element
     */
    com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument.CheckOutFile addNewCheckOutFile();
    
    /**
     * An XML CheckOutFile(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public interface CheckOutFile extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CheckOutFile.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("checkoutfile3dffelemtype");
        
        /**
         * Gets the "pageUrl" element
         */
        java.lang.String getPageUrl();
        
        /**
         * Gets (as xml) the "pageUrl" element
         */
        org.apache.xmlbeans.XmlString xgetPageUrl();
        
        /**
         * True if has "pageUrl" element
         */
        boolean isSetPageUrl();
        
        /**
         * Sets the "pageUrl" element
         */
        void setPageUrl(java.lang.String pageUrl);
        
        /**
         * Sets (as xml) the "pageUrl" element
         */
        void xsetPageUrl(org.apache.xmlbeans.XmlString pageUrl);
        
        /**
         * Unsets the "pageUrl" element
         */
        void unsetPageUrl();
        
        /**
         * Gets the "checkoutToLocal" element
         */
        java.lang.String getCheckoutToLocal();
        
        /**
         * Gets (as xml) the "checkoutToLocal" element
         */
        org.apache.xmlbeans.XmlString xgetCheckoutToLocal();
        
        /**
         * True if has "checkoutToLocal" element
         */
        boolean isSetCheckoutToLocal();
        
        /**
         * Sets the "checkoutToLocal" element
         */
        void setCheckoutToLocal(java.lang.String checkoutToLocal);
        
        /**
         * Sets (as xml) the "checkoutToLocal" element
         */
        void xsetCheckoutToLocal(org.apache.xmlbeans.XmlString checkoutToLocal);
        
        /**
         * Unsets the "checkoutToLocal" element
         */
        void unsetCheckoutToLocal();
        
        /**
         * Gets the "lastmodified" element
         */
        java.lang.String getLastmodified();
        
        /**
         * Gets (as xml) the "lastmodified" element
         */
        org.apache.xmlbeans.XmlString xgetLastmodified();
        
        /**
         * True if has "lastmodified" element
         */
        boolean isSetLastmodified();
        
        /**
         * Sets the "lastmodified" element
         */
        void setLastmodified(java.lang.String lastmodified);
        
        /**
         * Sets (as xml) the "lastmodified" element
         */
        void xsetLastmodified(org.apache.xmlbeans.XmlString lastmodified);
        
        /**
         * Unsets the "lastmodified" element
         */
        void unsetLastmodified();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument.CheckOutFile newInstance() {
              return (com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument.CheckOutFile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument.CheckOutFile newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument.CheckOutFile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument newInstance() {
          return (com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
