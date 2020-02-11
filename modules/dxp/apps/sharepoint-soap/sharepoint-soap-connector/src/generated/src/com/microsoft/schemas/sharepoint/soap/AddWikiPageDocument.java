/*
 * An XML document type.
 * Localname: AddWikiPage
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap;


/**
 * A document containing one AddWikiPage(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public interface AddWikiPageDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddWikiPageDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("addwikipage45c9doctype");
    
    /**
     * Gets the "AddWikiPage" element
     */
    com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument.AddWikiPage getAddWikiPage();
    
    /**
     * Sets the "AddWikiPage" element
     */
    void setAddWikiPage(com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument.AddWikiPage addWikiPage);
    
    /**
     * Appends and returns a new empty "AddWikiPage" element
     */
    com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument.AddWikiPage addNewAddWikiPage();
    
    /**
     * An XML AddWikiPage(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public interface AddWikiPage extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddWikiPage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("addwikipagea635elemtype");
        
        /**
         * Gets the "strListName" element
         */
        java.lang.String getStrListName();
        
        /**
         * Gets (as xml) the "strListName" element
         */
        org.apache.xmlbeans.XmlString xgetStrListName();
        
        /**
         * True if has "strListName" element
         */
        boolean isSetStrListName();
        
        /**
         * Sets the "strListName" element
         */
        void setStrListName(java.lang.String strListName);
        
        /**
         * Sets (as xml) the "strListName" element
         */
        void xsetStrListName(org.apache.xmlbeans.XmlString strListName);
        
        /**
         * Unsets the "strListName" element
         */
        void unsetStrListName();
        
        /**
         * Gets the "listRelPageUrl" element
         */
        java.lang.String getListRelPageUrl();
        
        /**
         * Gets (as xml) the "listRelPageUrl" element
         */
        org.apache.xmlbeans.XmlString xgetListRelPageUrl();
        
        /**
         * True if has "listRelPageUrl" element
         */
        boolean isSetListRelPageUrl();
        
        /**
         * Sets the "listRelPageUrl" element
         */
        void setListRelPageUrl(java.lang.String listRelPageUrl);
        
        /**
         * Sets (as xml) the "listRelPageUrl" element
         */
        void xsetListRelPageUrl(org.apache.xmlbeans.XmlString listRelPageUrl);
        
        /**
         * Unsets the "listRelPageUrl" element
         */
        void unsetListRelPageUrl();
        
        /**
         * Gets the "wikiContent" element
         */
        java.lang.String getWikiContent();
        
        /**
         * Gets (as xml) the "wikiContent" element
         */
        org.apache.xmlbeans.XmlString xgetWikiContent();
        
        /**
         * True if has "wikiContent" element
         */
        boolean isSetWikiContent();
        
        /**
         * Sets the "wikiContent" element
         */
        void setWikiContent(java.lang.String wikiContent);
        
        /**
         * Sets (as xml) the "wikiContent" element
         */
        void xsetWikiContent(org.apache.xmlbeans.XmlString wikiContent);
        
        /**
         * Unsets the "wikiContent" element
         */
        void unsetWikiContent();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument.AddWikiPage newInstance() {
              return (com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument.AddWikiPage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument.AddWikiPage newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument.AddWikiPage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument newInstance() {
          return (com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
