/*
 * An XML document type.
 * Localname: DeleteContentTypeXmlDocument
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap;


/**
 * A document containing one DeleteContentTypeXmlDocument(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public interface DeleteContentTypeXmlDocumentDocument1 extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DeleteContentTypeXmlDocumentDocument1.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("deletecontenttypexmldocumentf685doctype");
    
    /**
     * Gets the "DeleteContentTypeXmlDocument" element
     */
    com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1.DeleteContentTypeXmlDocument getDeleteContentTypeXmlDocument();
    
    /**
     * Sets the "DeleteContentTypeXmlDocument" element
     */
    void setDeleteContentTypeXmlDocument(com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1.DeleteContentTypeXmlDocument deleteContentTypeXmlDocument);
    
    /**
     * Appends and returns a new empty "DeleteContentTypeXmlDocument" element
     */
    com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1.DeleteContentTypeXmlDocument addNewDeleteContentTypeXmlDocument();
    
    /**
     * An XML DeleteContentTypeXmlDocument(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public interface DeleteContentTypeXmlDocument extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DeleteContentTypeXmlDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("deletecontenttypexmldocument3effelemtype");
        
        /**
         * Gets the "listName" element
         */
        java.lang.String getListName();
        
        /**
         * Gets (as xml) the "listName" element
         */
        org.apache.xmlbeans.XmlString xgetListName();
        
        /**
         * True if has "listName" element
         */
        boolean isSetListName();
        
        /**
         * Sets the "listName" element
         */
        void setListName(java.lang.String listName);
        
        /**
         * Sets (as xml) the "listName" element
         */
        void xsetListName(org.apache.xmlbeans.XmlString listName);
        
        /**
         * Unsets the "listName" element
         */
        void unsetListName();
        
        /**
         * Gets the "contentTypeId" element
         */
        java.lang.String getContentTypeId();
        
        /**
         * Gets (as xml) the "contentTypeId" element
         */
        org.apache.xmlbeans.XmlString xgetContentTypeId();
        
        /**
         * True if has "contentTypeId" element
         */
        boolean isSetContentTypeId();
        
        /**
         * Sets the "contentTypeId" element
         */
        void setContentTypeId(java.lang.String contentTypeId);
        
        /**
         * Sets (as xml) the "contentTypeId" element
         */
        void xsetContentTypeId(org.apache.xmlbeans.XmlString contentTypeId);
        
        /**
         * Unsets the "contentTypeId" element
         */
        void unsetContentTypeId();
        
        /**
         * Gets the "documentUri" element
         */
        java.lang.String getDocumentUri();
        
        /**
         * Gets (as xml) the "documentUri" element
         */
        org.apache.xmlbeans.XmlString xgetDocumentUri();
        
        /**
         * True if has "documentUri" element
         */
        boolean isSetDocumentUri();
        
        /**
         * Sets the "documentUri" element
         */
        void setDocumentUri(java.lang.String documentUri);
        
        /**
         * Sets (as xml) the "documentUri" element
         */
        void xsetDocumentUri(org.apache.xmlbeans.XmlString documentUri);
        
        /**
         * Unsets the "documentUri" element
         */
        void unsetDocumentUri();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1.DeleteContentTypeXmlDocument newInstance() {
              return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1.DeleteContentTypeXmlDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1.DeleteContentTypeXmlDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1.DeleteContentTypeXmlDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1 newInstance() {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1 newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1 parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1 parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1 parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1 parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1 parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1 parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1 parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1 parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1 parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1 parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1 parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1 parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1 parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1 parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
