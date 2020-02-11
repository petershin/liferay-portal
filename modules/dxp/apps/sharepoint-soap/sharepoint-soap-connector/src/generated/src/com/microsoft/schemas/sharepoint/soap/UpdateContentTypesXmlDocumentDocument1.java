/*
 * An XML document type.
 * Localname: UpdateContentTypesXmlDocument
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap;


/**
 * A document containing one UpdateContentTypesXmlDocument(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public interface UpdateContentTypesXmlDocumentDocument1 extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateContentTypesXmlDocumentDocument1.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("updatecontenttypesxmldocument1bd2doctype");
    
    /**
     * Gets the "UpdateContentTypesXmlDocument" element
     */
    com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.UpdateContentTypesXmlDocument getUpdateContentTypesXmlDocument();
    
    /**
     * Sets the "UpdateContentTypesXmlDocument" element
     */
    void setUpdateContentTypesXmlDocument(com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.UpdateContentTypesXmlDocument updateContentTypesXmlDocument);
    
    /**
     * Appends and returns a new empty "UpdateContentTypesXmlDocument" element
     */
    com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.UpdateContentTypesXmlDocument addNewUpdateContentTypesXmlDocument();
    
    /**
     * An XML UpdateContentTypesXmlDocument(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public interface UpdateContentTypesXmlDocument extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateContentTypesXmlDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("updatecontenttypesxmldocumentdd07elemtype");
        
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
         * Gets the "newDocument" element
         */
        com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.UpdateContentTypesXmlDocument.NewDocument getNewDocument();
        
        /**
         * True if has "newDocument" element
         */
        boolean isSetNewDocument();
        
        /**
         * Sets the "newDocument" element
         */
        void setNewDocument(com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.UpdateContentTypesXmlDocument.NewDocument newDocument);
        
        /**
         * Appends and returns a new empty "newDocument" element
         */
        com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.UpdateContentTypesXmlDocument.NewDocument addNewNewDocument();
        
        /**
         * Unsets the "newDocument" element
         */
        void unsetNewDocument();
        
        /**
         * An XML newDocument(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public interface NewDocument extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NewDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("newdocumente80eelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.UpdateContentTypesXmlDocument.NewDocument newInstance() {
                  return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.UpdateContentTypesXmlDocument.NewDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.UpdateContentTypesXmlDocument.NewDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.UpdateContentTypesXmlDocument.NewDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.UpdateContentTypesXmlDocument newInstance() {
              return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.UpdateContentTypesXmlDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.UpdateContentTypesXmlDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.UpdateContentTypesXmlDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1 newInstance() {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1 newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1 parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1 parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1 parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1 parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1 parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1 parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1 parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1 parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1 parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1 parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1 parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1 parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1 parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1 parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
