/*
 * An XML document type.
 * Localname: CreateContentType
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap;


/**
 * A document containing one CreateContentType(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public interface CreateContentTypeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreateContentTypeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("createcontenttype1ee0doctype");
    
    /**
     * Gets the "CreateContentType" element
     */
    com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType getCreateContentType();
    
    /**
     * Sets the "CreateContentType" element
     */
    void setCreateContentType(com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType createContentType);
    
    /**
     * Appends and returns a new empty "CreateContentType" element
     */
    com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType addNewCreateContentType();
    
    /**
     * An XML CreateContentType(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public interface CreateContentType extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreateContentType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("createcontenttype7123elemtype");
        
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
         * Gets the "displayName" element
         */
        java.lang.String getDisplayName();
        
        /**
         * Gets (as xml) the "displayName" element
         */
        org.apache.xmlbeans.XmlString xgetDisplayName();
        
        /**
         * True if has "displayName" element
         */
        boolean isSetDisplayName();
        
        /**
         * Sets the "displayName" element
         */
        void setDisplayName(java.lang.String displayName);
        
        /**
         * Sets (as xml) the "displayName" element
         */
        void xsetDisplayName(org.apache.xmlbeans.XmlString displayName);
        
        /**
         * Unsets the "displayName" element
         */
        void unsetDisplayName();
        
        /**
         * Gets the "parentType" element
         */
        java.lang.String getParentType();
        
        /**
         * Gets (as xml) the "parentType" element
         */
        org.apache.xmlbeans.XmlString xgetParentType();
        
        /**
         * True if has "parentType" element
         */
        boolean isSetParentType();
        
        /**
         * Sets the "parentType" element
         */
        void setParentType(java.lang.String parentType);
        
        /**
         * Sets (as xml) the "parentType" element
         */
        void xsetParentType(org.apache.xmlbeans.XmlString parentType);
        
        /**
         * Unsets the "parentType" element
         */
        void unsetParentType();
        
        /**
         * Gets the "fields" element
         */
        com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType.Fields getFields();
        
        /**
         * True if has "fields" element
         */
        boolean isSetFields();
        
        /**
         * Sets the "fields" element
         */
        void setFields(com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType.Fields fields);
        
        /**
         * Appends and returns a new empty "fields" element
         */
        com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType.Fields addNewFields();
        
        /**
         * Unsets the "fields" element
         */
        void unsetFields();
        
        /**
         * Gets the "contentTypeProperties" element
         */
        com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType.ContentTypeProperties getContentTypeProperties();
        
        /**
         * True if has "contentTypeProperties" element
         */
        boolean isSetContentTypeProperties();
        
        /**
         * Sets the "contentTypeProperties" element
         */
        void setContentTypeProperties(com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType.ContentTypeProperties contentTypeProperties);
        
        /**
         * Appends and returns a new empty "contentTypeProperties" element
         */
        com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType.ContentTypeProperties addNewContentTypeProperties();
        
        /**
         * Unsets the "contentTypeProperties" element
         */
        void unsetContentTypeProperties();
        
        /**
         * Gets the "addToView" element
         */
        java.lang.String getAddToView();
        
        /**
         * Gets (as xml) the "addToView" element
         */
        org.apache.xmlbeans.XmlString xgetAddToView();
        
        /**
         * True if has "addToView" element
         */
        boolean isSetAddToView();
        
        /**
         * Sets the "addToView" element
         */
        void setAddToView(java.lang.String addToView);
        
        /**
         * Sets (as xml) the "addToView" element
         */
        void xsetAddToView(org.apache.xmlbeans.XmlString addToView);
        
        /**
         * Unsets the "addToView" element
         */
        void unsetAddToView();
        
        /**
         * An XML fields(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public interface Fields extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Fields.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("fields20b8elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType.Fields newInstance() {
                  return (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType.Fields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType.Fields newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType.Fields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML contentTypeProperties(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public interface ContentTypeProperties extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContentTypeProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("contenttypeproperties6ef5elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType.ContentTypeProperties newInstance() {
                  return (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType.ContentTypeProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType.ContentTypeProperties newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType.ContentTypeProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType newInstance() {
              return (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument newInstance() {
          return (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
